package J8;

import bb.InterfaceC0424a;
import bb.u;

public final class l implements C9.d<InterfaceC0424a> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public l(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static l a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new l(bVar, hVar);
    }

    public static InterfaceC0424a c(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (InterfaceC0424a) C9.g.d(bVar.i(uVar));
    }

    public InterfaceC0424a get() {
        return c(this.a, (u) this.b.get());
    }
}
