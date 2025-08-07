package J8;

import bb.u;

public final class g implements C9.d<q> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public g(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new g(bVar, hVar);
    }

    public static q c(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (q) C9.g.d(bVar.d(uVar));
    }

    public q get() {
        return c(this.a, (u) this.b.get());
    }
}
