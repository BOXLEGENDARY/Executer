package v2;

public final class e {

    private static final e f24128c = new a().a();

    private final long f24129a;

    private final long f24130b;

    public static final class a {

        private long f24131a = 0;

        private long f24132b = 0;

        a() {
        }

        public e a() {
            return new e(this.f24131a, this.f24132b);
        }

        public a b(long j7) {
            this.f24131a = j7;
            return this;
        }

        public a c(long j7) {
            this.f24132b = j7;
            return this;
        }
    }

    e(long j7, long j8) {
        this.f24129a = j7;
        this.f24130b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24129a;
    }

    public long b() {
        return this.f24130b;
    }
}
