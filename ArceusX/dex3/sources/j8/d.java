package J8;

import bb.InterfaceC0759b;
import bb.u;

public final class d implements C9.d<InterfaceC0759b> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public d(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static d a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new d(bVar, hVar);
    }

    public static InterfaceC0759b b(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (InterfaceC0759b) C9.g.d(bVar.a(uVar));
    }

    public InterfaceC0759b get() {
        return b(this.a, (u) this.b.get());
    }
}
