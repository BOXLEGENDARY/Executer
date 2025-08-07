package z;

import C.M;
import C.W0;
import C.i1;
import z.r0;

public interface r0 {

    public static final r0 f24698a = new r0() {
        @Override
        public final r0.c f(r0.b bVar) {
            return r0.d(bVar);
        }
    };

    public static final r0 f24699b = new M.b(a());

    public static final r0 f24700c = new C.M(a());

    public static final class a {

        private final r0 f24701a;

        private long f24702b;

        public a(r0 r0Var) {
            this.f24701a = r0Var;
            this.f24702b = r0Var.b();
        }

        public r0 a() {
            r0 r0Var = this.f24701a;
            return r0Var instanceof W0 ? ((W0) r0Var).e(this.f24702b) : new i1(this.f24702b, this.f24701a);
        }
    }

    public interface b {
        Throwable a();

        long b();

        int d();
    }

    public static final class c {

        public static final c f24703d = new c(false, 0);

        public static final c f24704e = new c(true);

        public static final c f24705f = new c(true, 100);

        public static c f24706g = new c(false, 0, true);

        private final long f24707a;

        private final boolean f24708b;

        private final boolean f24709c;

        private c(boolean z7) {
            this(z7, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f24707a;
        }

        public boolean c() {
            return this.f24709c;
        }

        public boolean d() {
            return this.f24708b;
        }

        private c(boolean z7, long j7) {
            this(z7, j7, false);
        }

        private c(boolean z7, long j7, boolean z8) {
            this.f24708b = z7;
            this.f24707a = j7;
            if (z8) {
                x0.g.b(!z7, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f24709c = z8;
        }
    }

    static long a() {
        return 6000L;
    }

    static c d(b bVar) {
        return c.f24703d;
    }

    default long b() {
        return 0L;
    }

    c f(b bVar);
}
