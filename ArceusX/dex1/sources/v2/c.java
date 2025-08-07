package v2;

public final class c {

    private static final c f24109c = new a().a();

    private final long f24110a;

    private final b f24111b;

    public static final class a {

        private long f24112a = 0;

        private b f24113b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f24112a, this.f24113b);
        }

        public a b(long j7) {
            this.f24112a = j7;
            return this;
        }

        public a c(b bVar) {
            this.f24113b = bVar;
            return this;
        }
    }

    public enum b implements X4.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        private final int f24122d;

        b(int i7) {
            this.f24122d = i7;
        }

        @Override
        public int c() {
            return this.f24122d;
        }
    }

    c(long j7, b bVar) {
        this.f24110a = j7;
        this.f24111b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f24110a;
    }

    public b b() {
        return this.f24111b;
    }
}
