package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l3.AbstractC2532g;
import l3.AbstractC2535j;
import l3.InterfaceC2537l;
import l3.InterfaceC2540o;
import l3.InterfaceC2541p;
import m3.C2567H;
import n3.C2651i;

public abstract class BasePendingResult<R extends InterfaceC2540o> extends AbstractC2535j<R> {

    static final ThreadLocal f14068n = new O();

    private final Object f14069a;

    protected final a f14070b;

    protected final WeakReference f14071c;

    private final CountDownLatch f14072d;

    private final ArrayList f14073e;

    private InterfaceC2541p f14074f;

    private final AtomicReference f14075g;

    private InterfaceC2540o f14076h;

    private Status f14077i;

    private volatile boolean f14078j;

    private boolean f14079k;

    private boolean f14080l;

    private boolean f14081m;
    private P resultGuardian;

    public static class a<R extends InterfaceC2540o> extends I3.j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(InterfaceC2541p interfaceC2541p, InterfaceC2540o interfaceC2540o) {
            ThreadLocal threadLocal = BasePendingResult.f14068n;
            sendMessage(obtainMessage(1, new Pair((InterfaceC2541p) C2651i.l(interfaceC2541p), interfaceC2540o)));
        }

        @Override
        public final void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((BasePendingResult) message.obj).d(Status.f14055B);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i7, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC2541p interfaceC2541p = (InterfaceC2541p) pair.first;
            InterfaceC2540o interfaceC2540o = (InterfaceC2540o) pair.second;
            try {
                interfaceC2541p.a(interfaceC2540o);
            } catch (RuntimeException e7) {
                BasePendingResult.k(interfaceC2540o);
                throw e7;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f14069a = new Object();
        this.f14072d = new CountDownLatch(1);
        this.f14073e = new ArrayList();
        this.f14075g = new AtomicReference();
        this.f14081m = false;
        this.f14070b = new a(Looper.getMainLooper());
        this.f14071c = new WeakReference(null);
    }

    private final InterfaceC2540o g() {
        InterfaceC2540o interfaceC2540o;
        synchronized (this.f14069a) {
            C2651i.q(!this.f14078j, "Result has already been consumed.");
            C2651i.q(e(), "Result is not ready.");
            interfaceC2540o = this.f14076h;
            this.f14076h = null;
            this.f14074f = null;
            this.f14078j = true;
        }
        if (((E) this.f14075g.getAndSet(null)) == null) {
            return (InterfaceC2540o) C2651i.l(interfaceC2540o);
        }
        throw null;
    }

    private final void h(InterfaceC2540o interfaceC2540o) {
        this.f14076h = interfaceC2540o;
        this.f14077i = interfaceC2540o.d();
        this.f14072d.countDown();
        C2567H c2567h = null;
        if (this.f14079k) {
            this.f14074f = null;
        } else {
            InterfaceC2541p interfaceC2541p = this.f14074f;
            if (interfaceC2541p != null) {
                this.f14070b.removeMessages(2);
                this.f14070b.a(interfaceC2541p, g());
            } else if (this.f14076h instanceof InterfaceC2537l) {
                this.resultGuardian = new P(this, c2567h);
            }
        }
        ArrayList arrayList = this.f14073e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2535j.a) arrayList.get(i7)).a(this.f14077i);
        }
        this.f14073e.clear();
    }

    public static void k(InterfaceC2540o interfaceC2540o) {
        if (interfaceC2540o instanceof InterfaceC2537l) {
            try {
                ((InterfaceC2537l) interfaceC2540o).a();
            } catch (RuntimeException e7) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC2540o)), e7);
            }
        }
    }

    @Override
    public final void a(AbstractC2535j.a aVar) {
        C2651i.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f14069a) {
            try {
                if (e()) {
                    aVar.a(this.f14077i);
                } else {
                    this.f14073e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    @ResultIgnorabilityUnspecified
    public final R b(long j7, TimeUnit timeUnit) {
        if (j7 > 0) {
            C2651i.k("await must not be called on the UI thread when time is greater than zero.");
        }
        C2651i.q(!this.f14078j, "Result has already been consumed.");
        C2651i.q(true, "Cannot await if then() has been called.");
        try {
            if (!this.f14072d.await(j7, timeUnit)) {
                d(Status.f14055B);
            }
        } catch (InterruptedException unused) {
            d(Status.f14061z);
        }
        C2651i.q(e(), "Result is not ready.");
        return (R) g();
    }

    protected abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f14069a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f14080l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.f14072d.getCount() == 0;
    }

    public final void f(R r7) {
        synchronized (this.f14069a) {
            try {
                if (this.f14080l || this.f14079k) {
                    k(r7);
                    return;
                }
                e();
                C2651i.q(!e(), "Results have already been set");
                C2651i.q(!this.f14078j, "Result has already been consumed");
                h(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        boolean z7 = true;
        if (!this.f14081m && !((Boolean) f14068n.get()).booleanValue()) {
            z7 = false;
        }
        this.f14081m = z7;
    }

    protected BasePendingResult(AbstractC2532g abstractC2532g) {
        this.f14069a = new Object();
        this.f14072d = new CountDownLatch(1);
        this.f14073e = new ArrayList();
        this.f14075g = new AtomicReference();
        this.f14081m = false;
        this.f14070b = new a(abstractC2532g != null ? abstractC2532g.c() : Looper.getMainLooper());
        this.f14071c = new WeakReference(abstractC2532g);
    }
}
