package v2;

public final class b {

    private static final b f24106b = new a().a();

    private final e f24107a;

    public static final class a {

        private e f24108a = null;

        a() {
        }

        public b a() {
            return new b(this.f24108a);
        }

        public a b(e eVar) {
            this.f24108a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f24107a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f24107a;
    }
}
