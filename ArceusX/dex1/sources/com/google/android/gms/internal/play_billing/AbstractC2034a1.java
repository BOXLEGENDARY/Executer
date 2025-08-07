package com.google.android.gms.internal.play_billing;

import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.oik.UJEa;

public abstract class AbstractC2034a1<V> extends N1 implements InterfaceFutureC2177y1<V> {

    static final boolean f15987v;

    static final C2171x1 f15988w;

    private static final P0 f15989y;

    private static final Object f15990z;

    private volatile Object f15991d;

    private volatile S0 f15992e;

    private volatile Z0 f15993i;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        P0 v02;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f15987v = z7;
        f15988w = new C2171x1(AbstractC2034a1.class);
        C2064f1 c2064f1 = null;
        try {
            v02 = new Y0(c2064f1);
            th2 = null;
            th = null;
        } catch (Error | Exception e7) {
            try {
                th = null;
                th2 = e7;
                v02 = new T0(AtomicReferenceFieldUpdater.newUpdater(Z0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Z0.class, Z0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2034a1.class, Z0.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2034a1.class, S0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2034a1.class, Object.class, "d"));
            } catch (Error | Exception e8) {
                th = e8;
                th2 = e7;
                v02 = new V0(c2064f1);
            }
        }
        f15989y = v02;
        if (th != null) {
            C2171x1 c2171x1 = f15988w;
            Logger loggerA = c2171x1.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, tAjeAKSIqDqzNP.kOTrj, "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c2171x1.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f15990z = new Object();
    }

    protected AbstractC2034a1() {
    }

    private static final Object A(Object obj) throws ExecutionException {
        if (obj instanceof Q0) {
            Throwable th = ((Q0) obj).f15923b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof R0) {
            throw new ExecutionException(((R0) obj).f15925a);
        }
        if (obj == f15990z) {
            return null;
        }
        return obj;
    }

    public static Object s(InterfaceFutureC2177y1 interfaceFutureC2177y1) {
        Throwable thA;
        if (interfaceFutureC2177y1 instanceof W0) {
            Object q02 = ((AbstractC2034a1) interfaceFutureC2177y1).f15991d;
            if (q02 instanceof Q0) {
                Q0 q03 = (Q0) q02;
                if (q03.f15922a) {
                    Throwable th = q03.f15923b;
                    q02 = th != null ? new Q0(false, th) : Q0.f15921d;
                }
            }
            Objects.requireNonNull(q02);
            return q02;
        }
        if ((interfaceFutureC2177y1 instanceof N1) && (thA = ((N1) interfaceFutureC2177y1).a()) != null) {
            return new R0(thA);
        }
        boolean zIsCancelled = interfaceFutureC2177y1.isCancelled();
        if ((!f15987v) && zIsCancelled) {
            Q0 q04 = Q0.f15921d;
            Objects.requireNonNull(q04);
            return q04;
        }
        try {
            Object objT = t(interfaceFutureC2177y1);
            if (!zIsCancelled) {
                return objT == null ? f15990z : objT;
            }
            return new Q0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC2177y1)));
        } catch (Error e7) {
            e = e7;
            return new R0(e);
        } catch (CancellationException e8) {
            return !zIsCancelled ? new R0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC2177y1)), e8)) : new Q0(false, e8);
        } catch (ExecutionException e9) {
            return zIsCancelled ? new Q0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC2177y1)), e9)) : new R0(e9.getCause());
        } catch (Exception e10) {
            e = e10;
            return new R0(e);
        }
    }

    private static Object t(Future future) throws ExecutionException {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void u(StringBuilder sb) {
        try {
            Object objT = t(this);
            sb.append("SUCCESS, result=[");
            if (objT == null) {
                sb.append("null");
            } else if (objT == this) {
                sb.append("this future");
            } else {
                sb.append(objT.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objT)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb.append(sMlEMqrxoGI.vyX);
            sb.append(e7.getCause());
            sb.append("]");
        } catch (Exception e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void v(java.lang.StringBuilder r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC2034a1.v(java.lang.StringBuilder):void");
    }

    private final void w(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e7) {
            e = e7;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public static void x(AbstractC2034a1 abstractC2034a1, boolean z7) {
        S0 s02;
        S0 s03 = null;
        while (true) {
            for (Z0 z0B = f15989y.b(abstractC2034a1, Z0.f15964c); z0B != null; z0B = z0B.f15966b) {
                Thread thread = z0B.f15965a;
                if (thread != null) {
                    z0B.f15965a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC2034a1.n();
            S0 s04 = s03;
            S0 s0A = f15989y.a(abstractC2034a1, S0.f15927d);
            S0 s05 = s04;
            while (s0A != null) {
                S0 s06 = s0A.f15930c;
                s0A.f15930c = s05;
                s05 = s0A;
                s0A = s06;
            }
            while (s05 != null) {
                Runnable runnable = s05.f15928a;
                s02 = s05.f15930c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof U0) {
                    U0 u02 = (U0) runnable2;
                    abstractC2034a1 = u02.f15948d;
                    if (abstractC2034a1.f15991d == u02) {
                        if (f15989y.f(abstractC2034a1, u02, s(u02.f15949e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = s05.f15929b;
                    Objects.requireNonNull(executor);
                    y(runnable2, executor);
                }
                s05 = s02;
            }
            return;
            s03 = s02;
        }
    }

    private static void y(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f15988w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e7);
        }
    }

    private final void z(Z0 z02) {
        z02.f15965a = null;
        while (true) {
            Z0 z03 = this.f15993i;
            if (z03 != Z0.f15964c) {
                Z0 z04 = null;
                while (z03 != null) {
                    Z0 z05 = z03.f15966b;
                    if (z03.f15965a != null) {
                        z04 = z03;
                    } else if (z04 != null) {
                        z04.f15966b = z05;
                        if (z04.f15965a == null) {
                            break;
                        }
                    } else if (!f15989y.g(this, z03, z05)) {
                        break;
                    }
                    z03 = z05;
                }
                return;
            }
            return;
        }
    }

    @Override
    protected final Throwable a() {
        if (!(this instanceof W0)) {
            return null;
        }
        Object obj = this.f15991d;
        if (obj instanceof R0) {
            return ((R0) obj).f15925a;
        }
        return null;
    }

    @Override
    public final boolean cancel(boolean z7) {
        Q0 q02;
        Object obj = this.f15991d;
        if (!(obj instanceof U0) && !(obj == null)) {
            return false;
        }
        if (f15987v) {
            q02 = new Q0(z7, new CancellationException("Future.cancel() was called."));
        } else {
            q02 = z7 ? Q0.f15920c : Q0.f15921d;
            Objects.requireNonNull(q02);
        }
        AbstractC2034a1<V> abstractC2034a1 = this;
        boolean z8 = false;
        while (true) {
            if (f15989y.f(abstractC2034a1, obj, q02)) {
                x(abstractC2034a1, z7);
                if (!(obj instanceof U0)) {
                    break;
                }
                InterfaceFutureC2177y1<? extends V> interfaceFutureC2177y1 = ((U0) obj).f15949e;
                if (!(interfaceFutureC2177y1 instanceof W0)) {
                    interfaceFutureC2177y1.cancel(z7);
                    break;
                }
                abstractC2034a1 = (AbstractC2034a1) interfaceFutureC2177y1;
                obj = abstractC2034a1.f15991d;
                if (!(obj == null) && !(obj instanceof U0)) {
                    break;
                }
                z8 = true;
            } else {
                obj = abstractC2034a1.f15991d;
                if (!(obj instanceof U0)) {
                    return z8;
                }
            }
        }
        return true;
    }

    @Override
    public final void f(Runnable runnable, Executor executor) {
        S0 s02;
        C2145t.c(executor, "Executor was null.");
        if (!isDone() && (s02 = this.f15992e) != S0.f15927d) {
            S0 s03 = new S0(runnable, executor);
            do {
                s03.f15930c = s02;
                if (f15989y.e(this, s02, s03)) {
                    return;
                } else {
                    s02 = this.f15992e;
                }
            } while (s02 != S0.f15927d);
        }
        y(runnable, executor);
    }

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f15991d;
        if ((obj2 != null) && (!(obj2 instanceof U0))) {
            return A(obj2);
        }
        Z0 z02 = this.f15993i;
        if (z02 != Z0.f15964c) {
            Z0 z03 = new Z0();
            do {
                P0 p02 = f15989y;
                p02.c(z03, z02);
                if (p02.g(this, z02, z03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(z03);
                            throw new InterruptedException();
                        }
                        obj = this.f15991d;
                    } while (!((obj != null) & (!(obj instanceof U0))));
                    return A(obj);
                }
                z02 = this.f15993i;
            } while (z02 != Z0.f15964c);
        }
        Object obj3 = this.f15991d;
        Objects.requireNonNull(obj3);
        return A(obj3);
    }

    protected String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override
    public final boolean isCancelled() {
        return this.f15991d instanceof Q0;
    }

    @Override
    public final boolean isDone() {
        return (this.f15991d != null) & (!(r0 instanceof U0));
    }

    protected void n() {
    }

    protected final boolean o(Object obj) {
        if (obj == null) {
            obj = f15990z;
        }
        if (!f15989y.f(this, null, obj)) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean p(Throwable th) {
        if (!f15989y.f(this, null, new R0(th))) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean q(InterfaceFutureC2177y1 interfaceFutureC2177y1) {
        R0 r02;
        Object obj = this.f15991d;
        if (obj == null) {
            if (interfaceFutureC2177y1.isDone()) {
                if (!f15989y.f(this, null, s(interfaceFutureC2177y1))) {
                    return false;
                }
                x(this, false);
                return true;
            }
            U0 u02 = new U0(this, interfaceFutureC2177y1);
            if (f15989y.f(this, null, u02)) {
                try {
                    interfaceFutureC2177y1.f(u02, EnumC2076h1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        r02 = new R0(th);
                    } catch (Error | Exception unused) {
                        r02 = R0.f15924b;
                    }
                    f15989y.f(this, u02, r02);
                }
                return true;
            }
            obj = this.f15991d;
        }
        if (obj instanceof Q0) {
            interfaceFutureC2177y1.cancel(((Q0) obj).f15922a);
        }
        return false;
    }

    protected final boolean r() {
        Object obj = this.f15991d;
        return (obj instanceof Q0) && ((Q0) obj).f15922a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f15991d instanceof Q0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            u(sb);
        } else {
            v(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f15991d;
            boolean z7 = true;
            if ((obj != null) & (!(obj instanceof U0))) {
                return A(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                Z0 z02 = this.f15993i;
                if (z02 != Z0.f15964c) {
                    Z0 z03 = new Z0();
                    do {
                        P0 p02 = f15989y;
                        p02.c(z03, z02);
                        if (p02.g(this, z02, z03)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f15991d;
                                    if ((obj2 != null) & (!(obj2 instanceof U0))) {
                                        return A(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    z(z03);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(z03);
                        } else {
                            z02 = this.f15993i;
                        }
                    } while (z02 != Z0.f15964c);
                }
                Object obj3 = this.f15991d;
                Objects.requireNonNull(obj3);
                return A(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f15991d;
                if ((obj4 != null) & (!(obj4 instanceof U0))) {
                    return A(obj4);
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
                        strConcat3 = strConcat3.concat(UJEa.cYsNb);
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z7) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
