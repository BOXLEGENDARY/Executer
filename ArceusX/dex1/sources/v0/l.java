package v0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x0.InterfaceC2984a;

class l {

    private static class a implements ThreadFactory {

        private String f24087a;

        private int f24088b;

        private static class C0232a extends Thread {

            private final int f24089d;

            C0232a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f24089d = i7;
            }

            @Override
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f24089d);
                super.run();
            }
        }

        a(String str, int i7) {
            this.f24087a = str;
            this.f24088b = i7;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return new C0232a(runnable, this.f24087a, this.f24088b);
        }
    }

    private static class b implements Executor {

        private final Handler f24090d;

        b(Handler handler) {
            this.f24090d = (Handler) x0.g.g(handler);
        }

        @Override
        public void execute(Runnable runnable) {
            if (this.f24090d.post((Runnable) x0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f24090d + " is shutting down");
        }
    }

    private static class c<T> implements Runnable {

        private Callable<T> f24091d;

        private InterfaceC2984a<T> f24092e;

        private Handler f24093i;

        class a implements Runnable {

            final InterfaceC2984a f24094d;

            final Object f24095e;

            a(InterfaceC2984a interfaceC2984a, Object obj) {
                this.f24094d = interfaceC2984a;
                this.f24095e = obj;
            }

            @Override
            public void run() {
                this.f24094d.accept(this.f24095e);
            }
        }

        c(Handler handler, Callable<T> callable, InterfaceC2984a<T> interfaceC2984a) {
            this.f24091d = callable;
            this.f24092e = interfaceC2984a;
            this.f24093i = handler;
        }

        @Override
        public void run() throws Exception {
            T tCall;
            try {
                tCall = this.f24091d.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f24093i.post(new a(this.f24092e, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, InterfaceC2984a<T> interfaceC2984a) {
        executor.execute(new c(v0.b.a(), callable, interfaceC2984a));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i7) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
