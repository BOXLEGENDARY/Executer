package e2;

public final class k {

    private final String f20397a;

    public static class a {

        private String f20398a;

        a(F f7) {
        }

        public k a() {
            if (this.f20398a != null) {
                return new k(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f20398a = str;
            return this;
        }
    }

    k(a aVar, F f7) {
        this.f20397a = aVar.f20398a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f20397a;
    }
}
