package com.google.common.util.concurrent;

import com.google.android.gms.internal.play_billing.C2052d1;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import k0.BAKp.xAQOwX;
import sun.misc.Unsafe;

public abstract class a<V> extends P4.a implements p<V> {

    static final boolean f18906v;

    private static final Logger f18907w;

    private static final b f18908y;

    private static final Object f18909z;

    private volatile Object f18910d;

    private volatile e f18911e;

    private volatile l f18912i;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract e d(a<?> aVar, e eVar);

        abstract l e(a<?> aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    private static final class c {

        static final c f18913c;

        static final c f18914d;

        final boolean f18915a;

        final Throwable f18916b;

        static {
            if (a.f18906v) {
                f18914d = null;
                f18913c = null;
            } else {
                f18914d = new c(false, null);
                f18913c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f18915a = z7;
            this.f18916b = th;
        }
    }

    private static final class d {

        static final d f18917b = new d(new C0168a("Failure occurred while trying to finish a future."));

        final Throwable f18918a;

        class C0168a extends Throwable {
            C0168a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f18918a = (Throwable) K4.g.g(th);
        }
    }

    private static final class f extends b {

        final AtomicReferenceFieldUpdater<l, Thread> f18923a;

        final AtomicReferenceFieldUpdater<l, l> f18924b;

        final AtomicReferenceFieldUpdater<a, l> f18925c;

        final AtomicReferenceFieldUpdater<a, e> f18926d;

        final AtomicReferenceFieldUpdater<a, Object> f18927e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f18923a = atomicReferenceFieldUpdater;
            this.f18924b = atomicReferenceFieldUpdater2;
            this.f18925c = atomicReferenceFieldUpdater3;
            this.f18926d = atomicReferenceFieldUpdater4;
            this.f18927e = atomicReferenceFieldUpdater5;
        }

        @Override
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f18926d, aVar, eVar, eVar2);
        }

        @Override
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f18927e, aVar, obj, obj2);
        }

        @Override
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f18925c, aVar, lVar, lVar2);
        }

        @Override
        e d(a<?> aVar, e eVar) {
            return this.f18926d.getAndSet(aVar, eVar);
        }

        @Override
        l e(a<?> aVar, l lVar) {
            return this.f18925c.getAndSet(aVar, lVar);
        }

        @Override
        void f(l lVar, l lVar2) {
            this.f18924b.lazySet(lVar, lVar2);
        }

        @Override
        void g(l lVar, Thread thread) {
            this.f18923a.lazySet(lVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        final a<V> f18928d;

        final p<? extends V> f18929e;

        g(a<V> aVar, p<? extends V> pVar) {
            this.f18928d = aVar;
            this.f18929e = pVar;
        }

        @Override
        public void run() {
            if (((a) this.f18928d).f18910d != this) {
                return;
            }
            if (a.f18908y.b(this.f18928d, this, a.w(this.f18929e))) {
                a.t(this.f18928d);
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        @Override
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f18911e != eVar) {
                        return false;
                    }
                    ((a) aVar).f18911e = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f18910d != obj) {
                        return false;
                    }
                    ((a) aVar).f18910d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                try {
                    if (((a) aVar).f18912i != lVar) {
                        return false;
                    }
                    ((a) aVar).f18912i = lVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                try {
                    eVar2 = ((a) aVar).f18911e;
                    if (eVar2 != eVar) {
                        ((a) aVar).f18911e = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override
        l e(a<?> aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                try {
                    lVar2 = ((a) aVar).f18912i;
                    if (lVar2 != lVar) {
                        ((a) aVar).f18912i = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar2;
        }

        @Override
        void f(l lVar, l lVar2) {
            lVar.f18938b = lVar2;
        }

        @Override
        void g(l lVar, Thread thread) {
            lVar.f18937a = thread;
        }
    }

    interface i<V> extends p<V> {
    }

    public static abstract class j<V> extends a<V> implements i<V> {
        j() {
        }

        @Override
        public void c(Runnable runnable, Executor executor) {
            super.c(runnable, executor);
        }

        @Override
        public final boolean cancel(boolean z7) {
            return super.cancel(z7);
        }

        @Override
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override
        public boolean isDone() {
            return super.isDone();
        }

        @Override
        public V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j7, timeUnit);
        }
    }

    private static final class k extends b {

        static final Unsafe f18930a;

        static final long f18931b;

        static final long f18932c;

        static final long f18933d;

        static final long f18934e;

        static final long f18935f;

        class C0169a implements PrivilegedExceptionAction<Unsafe> {
            C0169a() {
            }

            @Override
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e7) {
                    throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0169a());
            }
            try {
                f18932c = unsafe.objectFieldOffset(a.class.getDeclaredField("i"));
                f18931b = unsafe.objectFieldOffset(a.class.getDeclaredField("e"));
                f18933d = unsafe.objectFieldOffset(a.class.getDeclaredField("d"));
                f18934e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f18935f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f18930a = unsafe;
            } catch (Exception e8) {
                K4.j.e(e8);
                throw new RuntimeException(e8);
            }
        }

        private k() {
            super();
        }

        @Override
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return C2052d1.a(f18930a, aVar, f18931b, eVar, eVar2);
        }

        @Override
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return C2052d1.a(f18930a, aVar, f18933d, obj, obj2);
        }

        @Override
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return C2052d1.a(f18930a, aVar, f18932c, lVar, lVar2);
        }

        @Override
        e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f18911e;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override
        l e(a<?> aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((a) aVar).f18912i;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override
        void f(l lVar, l lVar2) {
            f18930a.putObject(lVar, f18935f, lVar2);
        }

        @Override
        void g(l lVar, Thread thread) {
            f18930a.putObject(lVar, f18934e, thread);
        }
    }

    private static final class l {

        static final l f18936c = new l(false);

        volatile Thread f18937a;

        volatile l f18938b;

        l(boolean z7) {
        }

        void a(l lVar) {
            a.f18908y.f(this, lVar);
        }

        void b() {
            Thread thread = this.f18937a;
            if (thread != null) {
                this.f18937a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f18908y.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z7;
        h hVar;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f18906v = z7;
        f18907w = Logger.getLogger(a.class.getName());
        ?? r22 = 0;
        r22 = 0;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "i"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "e"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "d"));
            } catch (Throwable th2) {
                hVar = new h();
                r22 = th2;
            }
        }
        f18908y = hVar;
        if (r22 != 0) {
            ?? r02 = f18907w;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", th);
            r02.log(level, "SafeAtomicHelper is broken!", r22);
        }
        f18909z = new Object();
    }

    protected a() {
    }

    private void B() {
        for (l lVarE = f18908y.e(this, l.f18936c); lVarE != null; lVarE = lVarE.f18938b) {
            lVarE.b();
        }
    }

    private void C(l lVar) {
        lVar.f18937a = null;
        while (true) {
            l lVar2 = this.f18912i;
            if (lVar2 == l.f18936c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f18938b;
                if (lVar2.f18937a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f18938b = lVar4;
                    if (lVar3.f18937a == null) {
                        break;
                    }
                } else if (!f18908y.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void m(StringBuilder sb) {
        try {
            Object objX = x(this);
            sb.append("SUCCESS, result=[");
            p(sb, objX);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    private void n(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f18910d;
        boolean z7 = obj instanceof g;
        String str = xAQOwX.TTqjS;
        if (z7) {
            sb.append(", setFuture=[");
            q(sb, ((g) obj).f18929e);
            sb.append(str);
        } else {
            try {
                string = K4.i.a(A());
            } catch (RuntimeException | StackOverflowError e7) {
                String strValueOf = String.valueOf(e7.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append(str);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m(sb);
        }
    }

    private void p(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void q(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e7) {
            e = e7;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static CancellationException r(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e s(e eVar) {
        e eVar2 = eVar;
        e eVarD = f18908y.d(this, e.f18919d);
        while (eVarD != null) {
            e eVar3 = eVarD.f18922c;
            eVarD.f18922c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    public static void t(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.B();
            aVar.o();
            e eVarS = aVar.s(eVar);
            while (eVarS != null) {
                eVar = eVarS.f18922c;
                Runnable runnable = eVarS.f18920a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f18928d;
                    if (((a) aVar).f18910d == gVar) {
                        if (f18908y.b(aVar, gVar, w(gVar.f18929e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarS.f18921b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                eVarS = eVar;
            }
            return;
        }
    }

    private static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            Logger logger = f18907w;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e7);
        }
    }

    private V v(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw r("Task was cancelled.", ((c) obj).f18916b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f18918a);
        }
        return obj == f18909z ? (V) r.b() : obj;
    }

    public static Object w(p<?> pVar) {
        Throwable thA;
        if (pVar instanceof i) {
            Object cVar = ((a) pVar).f18910d;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f18915a) {
                    cVar = cVar2.f18916b != null ? new c(false, cVar2.f18916b) : c.f18914d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((pVar instanceof P4.a) && (thA = P4.b.a((P4.a) pVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f18906v) && zIsCancelled) {
            c cVar3 = c.f18914d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objX = x(pVar);
            if (!zIsCancelled) {
                return objX == null ? f18909z : objX;
            }
            String strValueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new c(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new c(false, e7);
            }
            String strValueOf2 = String.valueOf(pVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new d(new IllegalArgumentException(sb2.toString(), e7));
        } catch (ExecutionException e8) {
            if (!zIsCancelled) {
                return new d(e8.getCause());
            }
            String strValueOf3 = String.valueOf(pVar);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new c(false, new IllegalArgumentException(sb3.toString(), e8));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V x(Future<V> future) throws ExecutionException {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                v7 = future.get();
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
        return v7;
    }

    protected String A() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected boolean D(V v7) {
        if (v7 == null) {
            v7 = (V) f18909z;
        }
        if (!f18908y.b(this, null, v7)) {
            return false;
        }
        t(this);
        return true;
    }

    protected boolean E(Throwable th) {
        if (!f18908y.b(this, null, new d((Throwable) K4.g.g(th)))) {
            return false;
        }
        t(this);
        return true;
    }

    protected boolean F(p<? extends V> pVar) {
        d dVar;
        K4.g.g(pVar);
        Object obj = this.f18910d;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!f18908y.b(this, null, w(pVar))) {
                    return false;
                }
                t(this);
                return true;
            }
            g gVar = new g(this, pVar);
            if (f18908y.b(this, null, gVar)) {
                try {
                    pVar.c(gVar, com.google.common.util.concurrent.i.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f18917b;
                    }
                    f18908y.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f18910d;
        }
        if (obj instanceof c) {
            pVar.cancel(((c) obj).f18915a);
        }
        return false;
    }

    protected final boolean G() {
        Object obj = this.f18910d;
        return (obj instanceof c) && ((c) obj).f18915a;
    }

    @Override
    protected final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f18910d;
        if (obj instanceof d) {
            return ((d) obj).f18918a;
        }
        return null;
    }

    @Override
    public void c(Runnable runnable, Executor executor) {
        e eVar;
        K4.g.h(runnable, "Runnable was null.");
        K4.g.h(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f18911e) != e.f18919d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f18922c = eVar;
                if (f18908y.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f18911e;
                }
            } while (eVar != e.f18919d);
        }
        u(runnable, executor);
    }

    @Override
    public boolean cancel(boolean z7) {
        c cVar;
        Object obj = this.f18910d;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f18906v) {
            cVar = new c(z7, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z7 ? c.f18913c : c.f18914d;
            Objects.requireNonNull(cVar);
        }
        a<V> aVar = this;
        boolean z8 = false;
        while (true) {
            if (f18908y.b(aVar, obj, cVar)) {
                if (z7) {
                    aVar.y();
                }
                t(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                p<? extends V> pVar = ((g) obj).f18929e;
                if (!(pVar instanceof i)) {
                    pVar.cancel(z7);
                    return true;
                }
                aVar = (a) pVar;
                obj = aVar.f18910d;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = aVar.f18910d;
                if (!(obj instanceof g)) {
                    return z8;
                }
            }
        }
    }

    @Override
    public V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f18910d;
        if ((obj != null) && (!(obj instanceof g))) {
            return v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f18912i;
            if (lVar != l.f18936c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f18908y.c(this, lVar, lVar2)) {
                        do {
                            s.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18910d;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(lVar2);
                    } else {
                        lVar = this.f18912i;
                    }
                } while (lVar != l.f18936c);
            }
            Object obj3 = this.f18910d;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f18910d;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return v(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j7);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z7) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z7) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    @Override
    public boolean isCancelled() {
        return this.f18910d instanceof c;
    }

    @Override
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f18910d != null);
    }

    protected void o() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m(sb);
        } else {
            n(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void y() {
    }

    final void z(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(G());
        }
    }

    private static final class e {

        static final e f18919d = new e();

        final Runnable f18920a;

        final Executor f18921b;

        e f18922c;

        e(Runnable runnable, Executor executor) {
            this.f18920a = runnable;
            this.f18921b = executor;
        }

        e() {
            this.f18920a = null;
            this.f18921b = null;
        }
    }

    @Override
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18910d;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f18912i;
            if (lVar != l.f18936c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f18908y.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18910d;
                            } else {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f18912i;
                } while (lVar != l.f18936c);
            }
            Object obj3 = this.f18910d;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
