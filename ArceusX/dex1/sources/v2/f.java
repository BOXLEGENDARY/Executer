package v2;

public final class f {

    private static final f f24133c = new a().a();

    private final long f24134a;

    private final long f24135b;

    public static final class a {

        private long f24136a = 0;

        private long f24137b = 0;

        a() {
        }

        public f a() {
            return new f(this.f24136a, this.f24137b);
        }

        public a b(long j7) {
            this.f24137b = j7;
            return this;
        }

        public a c(long j7) {
            this.f24136a = j7;
            return this;
        }
    }

    f(long j7, long j8) {
        this.f24134a = j7;
        this.f24135b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24135b;
    }

    public long b() {
        return this.f24134a;
    }
}
