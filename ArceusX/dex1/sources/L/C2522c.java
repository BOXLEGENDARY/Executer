package l;

import java.util.concurrent.Executor;

public class C2522c extends AbstractC2524e {

    private static volatile C2522c f21529c;

    private static final Executor f21530d = new Executor() {
        @Override
        public final void execute(Runnable runnable) {
            C2522c.h(runnable);
        }
    };

    private static final Executor f21531e = new Executor() {
        @Override
        public final void execute(Runnable runnable) {
            C2522c.i(runnable);
        }
    };

    private AbstractC2524e f21532a;

    private final AbstractC2524e f21533b;

    private C2522c() {
        C2523d c2523d = new C2523d();
        this.f21533b = c2523d;
        this.f21532a = c2523d;
    }

    public static Executor f() {
        return f21531e;
    }

    public static C2522c g() {
        if (f21529c != null) {
            return f21529c;
        }
        synchronized (C2522c.class) {
            try {
                if (f21529c == null) {
                    f21529c = new C2522c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21529c;
    }

    public static void h(Runnable runnable) {
        g().c(runnable);
    }

    public static void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override
    public void a(Runnable runnable) {
        this.f21532a.a(runnable);
    }

    @Override
    public boolean b() {
        return this.f21532a.b();
    }

    @Override
    public void c(Runnable runnable) {
        this.f21532a.c(runnable);
    }
}
