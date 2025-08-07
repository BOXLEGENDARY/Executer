package e2;

public final class j {

    private final String f20395a;

    public static class a {

        private String f20396a;

        a(E e7) {
        }

        public j a() {
            if (this.f20396a != null) {
                return new j(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f20396a = str;
            return this;
        }
    }

    j(a aVar, E e7) {
        this.f20395a = aVar.f20396a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f20395a;
    }
}
