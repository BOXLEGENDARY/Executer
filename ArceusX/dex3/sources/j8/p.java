package J8;

import bb.InterfaceC0895a;
import bb.u;

public final class p implements C9.d<InterfaceC0895a> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public p(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new p(bVar, hVar);
    }

    public static InterfaceC0895a c(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (InterfaceC0895a) C9.g.d(bVar.m(uVar));
    }

    public InterfaceC0895a get() {
        return c(this.a, (u) this.b.get());
    }
}
