package e2;

public final class C2412a {

    private String f20391a;

    public static final class C0184a {

        private String f20392a;

        C0184a(m mVar) {
        }

        public C2412a a() {
            String str = this.f20392a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C2412a c2412a = new C2412a(null);
            c2412a.f20391a = str;
            return c2412a;
        }

        public C0184a b(String str) {
            this.f20392a = str;
            return this;
        }
    }

    C2412a(m mVar) {
    }

    public static C0184a b() {
        return new C0184a(null);
    }

    public String a() {
        return this.f20391a;
    }
}
