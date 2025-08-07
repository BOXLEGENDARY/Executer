package I8;

import u8.InterfaceC0808a;

public final class f implements C9.d<InterfaceC0808a> {
    private final c a;
    private final C9.h<i> b;

    public f(c cVar, C9.h<i> hVar) {
        this.a = cVar;
        this.b = hVar;
    }

    public static f a(c cVar, C9.h<i> hVar) {
        return new f(cVar, hVar);
    }

    public static InterfaceC0808a b(c cVar, i iVar) {
        return (InterfaceC0808a) C9.g.d(cVar.c(iVar));
    }

    public InterfaceC0808a get() {
        return b(this.a, (i) this.b.get());
    }
}
