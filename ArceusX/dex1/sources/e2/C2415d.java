package e2;

public final class C2415d {

    private String f20393a;

    public static final class a {

        private String f20394a;

        a(y yVar) {
        }

        public C2415d a() {
            String str = this.f20394a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C2415d c2415d = new C2415d(null);
            c2415d.f20393a = str;
            return c2415d;
        }

        public a b(String str) {
            this.f20394a = str;
            return this;
        }
    }

    C2415d(y yVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f20393a;
    }
}
