package com.google.android.gms.internal.play_billing;

import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import f6.ck.ZJZXBWla;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import t4.gYZ.uCYQMIHsy;

public class n5 implements InterfaceFutureC2177y1 {

    static final boolean f16095v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    private static final Logger f16096w = Logger.getLogger(n5.class.getName());

    static final E1 f16097y;

    private static final Object f16098z;

    volatile Object f16099d;

    volatile I3 f16100e;

    volatile l5 f16101i;

    static {
        E1 k5Var;
        try {
            k5Var = new K4(AtomicReferenceFieldUpdater.newUpdater(l5.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l5.class, l5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n5.class, l5.class, "i"), AtomicReferenceFieldUpdater.newUpdater(n5.class, I3.class, "e"), AtomicReferenceFieldUpdater.newUpdater(n5.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            k5Var = new k5();
        }
        Throwable th2 = th;
        f16097y = k5Var;
        if (th2 != null) {
            f16096w.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f16098z = new Object();
    }

    protected n5() {
    }

    static void b(n5 n5Var) {
        l5 l5Var;
        I3 i32;
        do {
            l5Var = n5Var.f16101i;
        } while (!f16097y.e(n5Var, l5Var, l5.f16086c));
        while (l5Var != null) {
            Thread thread = l5Var.f16087a;
            if (thread != null) {
                l5Var.f16087a = null;
                LockSupport.unpark(thread);
            }
            l5Var = l5Var.f16088b;
        }
        do {
            i32 = n5Var.f16100e;
        } while (!f16097y.c(n5Var, i32, I3.f15823d));
        I3 i33 = null;
        while (i32 != null) {
            I3 i34 = i32.f15826c;
            i32.f15826c = i33;
            i33 = i32;
            i32 = i34;
        }
        while (i33 != null) {
            Runnable runnable = i33.f15824a;
            I3 i35 = i33.f15826c;
            if (runnable instanceof j5) {
                n5 n5Var2 = ((j5) runnable).f16079d;
                throw null;
            }
            g(runnable, i33.f15825b);
            i33 = i35;
        }
    }

    private final void e(StringBuilder sb) {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                try {
                    v7 = get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e8) {
                sb.append("FAILURE, cause=[");
                sb.append(e8.getCause());
                sb.append("]");
                return;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v7 == this ? "this future" : String.valueOf(v7));
        sb.append("]");
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f16096w.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", ZJZXBWla.rwdhTzJBkOJS, "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e7);
        }
    }

    private final void h(l5 l5Var) {
        l5Var.f16087a = null;
        while (true) {
            l5 l5Var2 = this.f16101i;
            if (l5Var2 != l5.f16086c) {
                l5 l5Var3 = null;
                while (l5Var2 != null) {
                    l5 l5Var4 = l5Var2.f16088b;
                    if (l5Var2.f16087a != null) {
                        l5Var3 = l5Var2;
                    } else if (l5Var3 != null) {
                        l5Var3.f16088b = l5Var4;
                        if (l5Var3.f16087a == null) {
                            break;
                        }
                    } else if (!f16097y.e(this, l5Var2, l5Var4)) {
                        break;
                    }
                    l5Var2 = l5Var4;
                }
                return;
            }
            return;
        }
    }

    private static final Object i(Object obj) throws ExecutionException {
        if (obj instanceof C2065f2) {
            Throwable th = ((C2065f2) obj).f16052a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2078h3) {
            throw new ExecutionException(((C2078h3) obj).f16067a);
        }
        if (obj == f16098z) {
            return null;
        }
        return obj;
    }

    protected String a() {
        Object obj = this.f16099d;
        if (obj instanceof j5) {
            InterfaceFutureC2177y1 interfaceFutureC2177y1 = ((j5) obj).f16080e;
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + KwdswzaUHE.HYWnfdYr;
    }

    @Override
    public final boolean cancel(boolean z7) {
        Object obj = this.f16099d;
        if ((obj instanceof j5) | (obj == null)) {
            C2065f2 c2065f2 = f16095v ? new C2065f2(z7, new CancellationException("Future.cancel() was called.")) : z7 ? C2065f2.f16050b : C2065f2.f16051c;
            while (!f16097y.d(this, obj, c2065f2)) {
                obj = this.f16099d;
                if (!(obj instanceof j5)) {
                }
            }
            b(this);
            if (!(obj instanceof j5)) {
                return true;
            }
            InterfaceFutureC2177y1 interfaceFutureC2177y1 = ((j5) obj).f16080e;
            throw null;
        }
        return false;
    }

    protected boolean d(Object obj) {
        if (obj == null) {
            obj = f16098z;
        }
        if (!f16097y.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        I3 i32 = this.f16100e;
        if (i32 != I3.f15823d) {
            I3 i33 = new I3(runnable, executor);
            do {
                i33.f15826c = i32;
                if (f16097y.c(this, i32, i33)) {
                    return;
                } else {
                    i32 = this.f16100e;
                }
            } while (i32 != I3.f15823d);
        }
        g(runnable, executor);
    }

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f16099d;
        if ((obj2 != null) && (!(obj2 instanceof j5))) {
            return i(obj2);
        }
        l5 l5Var = this.f16101i;
        if (l5Var != l5.f16086c) {
            l5 l5Var2 = new l5();
            do {
                E1 e12 = f16097y;
                e12.a(l5Var2, l5Var);
                if (e12.e(this, l5Var, l5Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(l5Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f16099d;
                    } while (!((obj != null) & (!(obj instanceof j5))));
                    return i(obj);
                }
                l5Var = this.f16101i;
            } while (l5Var != l5.f16086c);
        }
        return i(this.f16099d);
    }

    @Override
    public final boolean isCancelled() {
        return this.f16099d instanceof C2065f2;
    }

    @Override
    public final boolean isDone() {
        return (this.f16099d != null) & (!(r0 instanceof j5));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f16099d instanceof C2065f2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e7) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f16099d;
            boolean z7 = true;
            if ((obj != null) & (!(obj instanceof j5))) {
                return i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l5 l5Var = this.f16101i;
                if (l5Var != l5.f16086c) {
                    l5 l5Var2 = new l5();
                    do {
                        E1 e12 = f16097y;
                        e12.a(l5Var2, l5Var);
                        if (e12.e(this, l5Var, l5Var2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f16099d;
                                    if ((obj2 != null) & (!(obj2 instanceof j5))) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    h(l5Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(l5Var2);
                        } else {
                            l5Var = this.f16101i;
                        }
                    } while (l5Var != l5.f16086c);
                }
                return i(this.f16099d);
            }
            while (nanos > 0) {
                Object obj3 = this.f16099d;
                if ((obj3 != null) & (!(obj3 instanceof j5))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j8 = -nanos;
                long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z7 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z7) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z7) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(uCYQMIHsy.QxfmZTJuRzwlshT));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
