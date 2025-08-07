package B;

import B.f0;
import android.util.Log;
import androidx.camera.core.e;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x0.C2986c;
import z.C3043d0;

public class Z implements e.a, f0.a {

    final InterfaceC0287x f191b;

    C0288y f192c;

    private T f193d;

    private final List<T> f194e;

    final Deque<f0> f190a = new ArrayDeque();

    boolean f195f = false;

    class a implements G.c<Void> {

        final C0276l f196a;

        a(C0276l c0276l) {
            this.f196a = c0276l;
        }

        @Override
        public void onSuccess(Void r1) {
            Z.this.f191b.c();
        }

        @Override
        public void onFailure(Throwable th) {
            if (this.f196a.b()) {
                return;
            }
            int iF = this.f196a.a().get(0).f();
            if (th instanceof z.U) {
                Z.this.f192c.j(b.c(iF, (z.U) th));
            } else {
                Z.this.f192c.j(b.c(iF, new z.U(2, "Failed to submit capture request", th)));
            }
            Z.this.f191b.c();
        }
    }

    static abstract class b {
        b() {
        }

        static b c(int i7, z.U u7) {
            return new C0271g(i7, u7);
        }

        abstract z.U a();

        abstract int b();
    }

    public Z(InterfaceC0287x interfaceC0287x) {
        E.p.a();
        this.f191b = interfaceC0287x;
        this.f194e = new ArrayList();
    }

    public void h() {
        this.f193d = null;
        g();
    }

    public void i(T t7) {
        this.f194e.remove(t7);
    }

    private com.google.common.util.concurrent.p<Void> n(C0276l c0276l) {
        E.p.a();
        this.f191b.b();
        com.google.common.util.concurrent.p<Void> pVarA = this.f191b.a(c0276l.a());
        G.n.j(pVarA, new a(c0276l), F.a.d());
        return pVarA;
    }

    private void o(final T t7) {
        x0.g.i(!f());
        this.f193d = t7;
        t7.p().c(new Runnable() {
            @Override
            public final void run() {
                this.f186d.h();
            }
        }, F.a.a());
        this.f194e.add(t7);
        t7.q().c(new Runnable() {
            @Override
            public final void run() {
                this.f187d.i(t7);
            }
        }, F.a.a());
    }

    @Override
    public void a(f0 f0Var) {
        E.p.a();
        C3043d0.a("TakePictureManager", "Add a new request for retrying.");
        this.f190a.addFirst(f0Var);
        g();
    }

    @Override
    public void b(androidx.camera.core.n nVar) {
        F.a.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f189d.g();
            }
        });
    }

    public void e() {
        E.p.a();
        z.U u7 = new z.U(3, sMlEMqrxoGI.bJjHxCV, null);
        Iterator<f0> it = this.f190a.iterator();
        while (it.hasNext()) {
            it.next().x(u7);
        }
        this.f190a.clear();
        Iterator it2 = new ArrayList(this.f194e).iterator();
        while (it2.hasNext()) {
            ((T) it2.next()).m(u7);
        }
    }

    boolean f() {
        return this.f193d != null;
    }

    void g() {
        E.p.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f195f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f192c.h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        f0 f0VarPoll = this.f190a.poll();
        if (f0VarPoll == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        T t7 = new T(f0VarPoll, this);
        o(t7);
        C2986c<C0276l, P> c2986cE = this.f192c.e(f0VarPoll, t7, t7.p());
        C0276l c0276l = c2986cE.f24317a;
        Objects.requireNonNull(c0276l);
        P p7 = c2986cE.f24318b;
        Objects.requireNonNull(p7);
        this.f192c.m(p7);
        t7.v(n(c0276l));
    }

    public void j(f0 f0Var) {
        E.p.a();
        this.f190a.offer(f0Var);
        g();
    }

    public void k() {
        E.p.a();
        this.f195f = true;
        T t7 = this.f193d;
        if (t7 != null) {
            t7.n();
        }
    }

    public void l() {
        E.p.a();
        this.f195f = false;
        g();
    }

    public void m(C0288y c0288y) {
        E.p.a();
        this.f192c = c0288y;
        c0288y.k(this);
    }
}
