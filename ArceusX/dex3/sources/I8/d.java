package I8;

import ha.EnumC0342d;

public final class d implements C9.d<EnumC0342d> {
    private final c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static EnumC0342d b(c cVar) {
        return (EnumC0342d) C9.g.d(cVar.getEnvironment());
    }

    public EnumC0342d get() {
        return b(this.a);
    }
}
