package androidx.concurrent.futures;

import com.google.common.util.concurrent.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class c {

    public static final class a<T> {

        Object f9784a;

        d<T> f9785b;

        private androidx.concurrent.futures.d<Void> f9786c = androidx.concurrent.futures.d.t();

        private boolean f9787d;

        a() {
        }

        private void e() {
            this.f9784a = null;
            this.f9785b = null;
            this.f9786c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d<Void> dVar = this.f9786c;
            if (dVar != null) {
                dVar.c(runnable, executor);
            }
        }

        void b() {
            this.f9784a = null;
            this.f9785b = null;
            this.f9786c.q(null);
        }

        public boolean c(T t7) {
            this.f9787d = true;
            d<T> dVar = this.f9785b;
            boolean z7 = dVar != null && dVar.b(t7);
            if (z7) {
                e();
            }
            return z7;
        }

        public boolean d() {
            this.f9787d = true;
            d<T> dVar = this.f9785b;
            boolean z7 = dVar != null && dVar.a(true);
            if (z7) {
                e();
            }
            return z7;
        }

        public boolean f(Throwable th) {
            this.f9787d = true;
            d<T> dVar = this.f9785b;
            boolean z7 = dVar != null && dVar.d(th);
            if (z7) {
                e();
            }
            return z7;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f9785b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f9784a));
            }
            if (this.f9787d || (dVar = this.f9786c) == null) {
                return;
            }
            dVar.q(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface InterfaceC0078c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    private static final class d<T> implements p<T> {

        final WeakReference<a<T>> f9788d;

        private final androidx.concurrent.futures.a<T> f9789e = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override
            protected String n() {
                a<T> aVar = d.this.f9788d.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f9784a + "]";
            }
        }

        d(a<T> aVar) {
            this.f9788d = new WeakReference<>(aVar);
        }

        boolean a(boolean z7) {
            return this.f9789e.cancel(z7);
        }

        boolean b(T t7) {
            return this.f9789e.q(t7);
        }

        @Override
        public void c(Runnable runnable, Executor executor) {
            this.f9789e.c(runnable, executor);
        }

        @Override
        public boolean cancel(boolean z7) {
            a<T> aVar = this.f9788d.get();
            boolean zCancel = this.f9789e.cancel(z7);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        boolean d(Throwable th) {
            return this.f9789e.r(th);
        }

        @Override
        public T get() throws ExecutionException, InterruptedException {
            return this.f9789e.get();
        }

        @Override
        public boolean isCancelled() {
            return this.f9789e.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.f9789e.isDone();
        }

        public String toString() {
            return this.f9789e.toString();
        }

        @Override
        public T get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f9789e.get(j7, timeUnit);
        }
    }

    public static <T> p<T> a(InterfaceC0078c<T> interfaceC0078c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f9785b = dVar;
        aVar.f9784a = interfaceC0078c.getClass();
        try {
            Object objA = interfaceC0078c.a(aVar);
            if (objA != null) {
                aVar.f9784a = objA;
            }
        } catch (Exception e7) {
            dVar.d(e7);
        }
        return dVar;
    }
}
