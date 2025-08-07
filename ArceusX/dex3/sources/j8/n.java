package J8;

import bb.InterfaceC0875b;
import bb.u;

public final class n implements C9.d<InterfaceC0875b> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public n(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static n a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new n(bVar, hVar);
    }

    public static InterfaceC0875b c(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (InterfaceC0875b) C9.g.d(bVar.k(uVar));
    }

    public InterfaceC0875b get() {
        return c(this.a, (u) this.b.get());
    }
}
