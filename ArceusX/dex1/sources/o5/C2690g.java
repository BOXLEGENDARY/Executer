package o5;

import N3.HandlerC0530a;
import a4.C1574k;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k5.C2518a;
import t4.gYZ.uCYQMIHsy;

public class C2690g {

    private static final Object f22438b = new Object();

    private static C2690g f22439c;

    private final Handler f22440a;

    private C2690g(Looper looper) {
        this.f22440a = new HandlerC0530a(looper);
    }

    public static C2690g a() {
        C2690g c2690g;
        synchronized (f22438b) {
            try {
                if (f22439c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f22439c = new C2690g(handlerThread.getLooper());
                }
                c2690g = f22439c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2690g;
    }

    public static Executor d() {
        return u.f22499d;
    }

    public <ResultT> Task<ResultT> b(final Callable<ResultT> callable) {
        final C1574k c1574k = new C1574k();
        c(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                C1574k c1574k2 = c1574k;
                try {
                    c1574k2.c(callable2.call());
                } catch (C2518a e7) {
                    c1574k2.b(e7);
                } catch (Exception e8) {
                    c1574k2.b(new C2518a(uCYQMIHsy.hFFiCq, 13, e8));
                }
            }
        });
        return c1574k.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
