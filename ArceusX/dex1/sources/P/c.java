package P;

public final class c {

    private final P.a f3711a;

    private final d f3712b;

    private final b f3713c;

    private final int f3714d;

    c(P.a aVar, d dVar, b bVar, int i7) {
        this.f3711a = aVar;
        this.f3712b = dVar;
        this.f3713c = bVar;
        this.f3714d = i7;
    }

    public int a() {
        return this.f3714d;
    }

    public P.a b() {
        return this.f3711a;
    }

    public b c() {
        return this.f3713c;
    }

    public d d() {
        return this.f3712b;
    }

    public static final class a {

        private P.a f3715a;

        private d f3716b;

        private b f3717c;

        private int f3718d;

        public a() {
            this.f3715a = P.a.f3707c;
            this.f3716b = null;
            this.f3717c = null;
            this.f3718d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f3715a, this.f3716b, this.f3717c, this.f3718d);
        }

        public a c(int i7) {
            this.f3718d = i7;
            return this;
        }

        public a d(P.a aVar) {
            this.f3715a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f3717c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f3716b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f3715a = P.a.f3707c;
            this.f3716b = null;
            this.f3717c = null;
            this.f3718d = 0;
            this.f3715a = cVar.b();
            this.f3716b = cVar.d();
            this.f3717c = cVar.c();
            this.f3718d = cVar.a();
        }
    }
}
