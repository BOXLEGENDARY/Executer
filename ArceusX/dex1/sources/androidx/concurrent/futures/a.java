package androidx.concurrent.futures;

import W0.JWp.kNUgEaOjcPdX;
import com.google.common.util.concurrent.p;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import e2.vb.oyfFwvPUKctyaG;
import java.util.Locale;
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
import w7.Jld.EZYiRMRTxKdo;

public abstract class a<V> implements p<V> {

    static final boolean f9757v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    private static final Logger f9758w = Logger.getLogger(a.class.getName());

    static final b f9759y;

    private static final Object f9760z;

    volatile Object f9761d;

    volatile e f9762e;

    volatile i f9763i;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        static final c f9764c;

        static final c f9765d;

        final boolean f9766a;

        final Throwable f9767b;

        static {
            if (a.f9757v) {
                f9765d = null;
                f9764c = null;
            } else {
                f9765d = new c(false, null);
                f9764c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f9766a = z7;
            this.f9767b = th;
        }
    }

    private static final class d {

        static final d f9768b = new d(new C0077a("Failure occurred while trying to finish a future."));

        final Throwable f9769a;

        class C0077a extends Throwable {
            C0077a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f9769a = (Throwable) a.e(th);
        }
    }

    private static final class e {

        static final e f9770d = new e(null, null);

        final Runnable f9771a;

        final Executor f9772b;

        e f9773c;

        e(Runnable runnable, Executor executor) {
            this.f9771a = runnable;
            this.f9772b = executor;
        }
    }

    private static final class f extends b {

        final AtomicReferenceFieldUpdater<i, Thread> f9774a;

        final AtomicReferenceFieldUpdater<i, i> f9775b;

        final AtomicReferenceFieldUpdater<a, i> f9776c;

        final AtomicReferenceFieldUpdater<a, e> f9777d;

        final AtomicReferenceFieldUpdater<a, Object> f9778e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f9774a = atomicReferenceFieldUpdater;
            this.f9775b = atomicReferenceFieldUpdater2;
            this.f9776c = atomicReferenceFieldUpdater3;
            this.f9777d = atomicReferenceFieldUpdater4;
            this.f9778e = atomicReferenceFieldUpdater5;
        }

        @Override
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f9777d, aVar, eVar, eVar2);
        }

        @Override
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f9778e, aVar, obj, obj2);
        }

        @Override
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f9776c, aVar, iVar, iVar2);
        }

        @Override
        void d(i iVar, i iVar2) {
            this.f9775b.lazySet(iVar, iVar2);
        }

        @Override
        void e(i iVar, Thread thread) {
            this.f9774a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        final a<V> f9779d;

        final p<? extends V> f9780e;

        @Override
        public void run() {
            if (this.f9779d.f9761d != this) {
                return;
            }
            if (a.f9759y.b(this.f9779d, this, a.k(this.f9780e))) {
                a.h(this.f9779d);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f9762e != eVar) {
                        return false;
                    }
                    aVar.f9762e = eVar2;
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
                    if (aVar.f9761d != obj) {
                        return false;
                    }
                    aVar.f9761d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f9763i != iVar) {
                        return false;
                    }
                    aVar.f9763i = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        void d(i iVar, i iVar2) {
            iVar.f9783b = iVar2;
        }

        @Override
        void e(i iVar, Thread thread) {
            iVar.f9782a = thread;
        }
    }

    private static final class i {

        static final i f9781c = new i(false);

        volatile Thread f9782a;

        volatile i f9783b;

        i(boolean z7) {
        }

        void a(i iVar) {
            a.f9759y.d(this, iVar);
        }

        void b() {
            Thread thread = this.f9782a;
            if (thread != null) {
                this.f9782a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f9759y.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, wtzgsqRsIZB.seRxOkv), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "i"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "e"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, EZYiRMRTxKdo.PuOnVVIbGXjX));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f9759y = hVar;
        if (th != null) {
            f9758w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9760z = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object objL = l(this);
            sb.append(kNUgEaOjcPdX.rEBGjDstu);
            sb.append(s(objL));
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

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t7) {
        t7.getClass();
        return t7;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f9762e;
        } while (!f9759y.a(this, eVar2, e.f9770d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f9773c;
            eVar4.f9773c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e eVarG = aVar.g(eVar);
            while (eVarG != null) {
                eVar = eVarG.f9773c;
                Runnable runnable = eVarG.f9771a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f9779d;
                    if (aVar.f9761d == gVar) {
                        if (f9759y.b(aVar, gVar, k(gVar.f9780e))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, eVarG.f9772b);
                }
                eVarG = eVar;
            }
            return;
        }
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f9758w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    private V j(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f9767b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f9769a);
        }
        if (obj == f9760z) {
            return null;
        }
        return obj;
    }

    static Object k(p<?> pVar) {
        if (pVar instanceof a) {
            Object obj = ((a) pVar).f9761d;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f9766a ? cVar.f9767b != null ? new c(false, cVar.f9767b) : c.f9765d : obj;
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!f9757v) && zIsCancelled) {
            return c.f9765d;
        }
        try {
            Object objL = l(pVar);
            return objL == null ? f9760z : objL;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new c(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V l(Future<V> future) throws ExecutionException {
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

    private void o() {
        i iVar;
        do {
            iVar = this.f9763i;
        } while (!f9759y.c(this, iVar, i.f9781c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f9783b;
        }
    }

    private void p(i iVar) {
        iVar.f9782a = null;
        while (true) {
            i iVar2 = this.f9763i;
            if (iVar2 == i.f9781c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f9783b;
                if (iVar2.f9782a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f9783b = iVar4;
                    if (iVar3.f9782a == null) {
                        break;
                    }
                } else if (!f9759y.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f9762e;
        if (eVar != e.f9770d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f9773c = eVar;
                if (f9759y.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f9762e;
                }
            } while (eVar != e.f9770d);
        }
        i(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z7) {
        Object obj = this.f9761d;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f9757v ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f9764c : c.f9765d;
        a<V> aVar = this;
        boolean z8 = false;
        while (true) {
            if (f9759y.b(aVar, obj, cVar)) {
                if (z7) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                p<? extends V> pVar = ((g) obj).f9780e;
                if (!(pVar instanceof a)) {
                    pVar.cancel(z7);
                    return true;
                }
                aVar = (a) pVar;
                obj = aVar.f9761d;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = aVar.f9761d;
                if (!(obj instanceof g)) {
                    return z8;
                }
            }
        }
    }

    @Override
    public final V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9761d;
        if ((obj != null) && (!(obj instanceof g))) {
            return j(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f9763i;
            if (iVar != i.f9781c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f9759y.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9761d;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.f9763i;
                    }
                } while (iVar != i.f9781c);
            }
            return j(this.f9761d);
        }
        while (nanos > 0) {
            Object obj3 = this.f9761d;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return j(obj3);
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
        String str = oyfFwvPUKctyaG.xiKNwifxgPV + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override
    public final boolean isCancelled() {
        return this.f9761d instanceof c;
    }

    @Override
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f9761d != null);
    }

    protected void m() {
    }

    protected String n() {
        Object obj = this.f9761d;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f9780e) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(V v7) {
        if (v7 == null) {
            v7 = (V) f9760z;
        }
        if (!f9759y.b(this, null, v7)) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f9759y.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    public String toString() {
        String strN;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strN = n();
            } catch (RuntimeException e7) {
                strN = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strN != null && !strN.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strN);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9761d;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return j(obj2);
            }
            i iVar = this.f9763i;
            if (iVar != i.f9781c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f9759y.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9761d;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return j(obj);
                    }
                    iVar = this.f9763i;
                } while (iVar != i.f9781c);
            }
            return j(this.f9761d);
        }
        throw new InterruptedException();
    }
}
