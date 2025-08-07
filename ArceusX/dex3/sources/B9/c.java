package b9;

import C9.g;

public final class c implements C9.d<InterfaceC0482a> {
    private final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static InterfaceC0482a b(b bVar) {
        return (InterfaceC0482a) g.d(bVar.getDataCollector());
    }

    public InterfaceC0482a get() {
        return b(this.a);
    }
}
