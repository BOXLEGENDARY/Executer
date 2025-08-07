package s2;

import java.util.concurrent.Executor;

public final class k implements u2.b<Executor> {

    private static final class a {

        private static final k f23638a = new k();
    }

    public static k a() {
        return a.f23638a;
    }

    public static Executor b() {
        return (Executor) u2.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor get() {
        return b();
    }
}
