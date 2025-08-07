package J8;

import bb.u;

public final class f implements C9.d<com.withpersona.sdk2.inquiry.governmentid.network.a> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public f(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new f(bVar, hVar);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.network.a c(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (com.withpersona.sdk2.inquiry.governmentid.network.a) C9.g.d(bVar.c(uVar));
    }

    public com.withpersona.sdk2.inquiry.governmentid.network.a get() {
        return c(this.a, (u) this.b.get());
    }
}
