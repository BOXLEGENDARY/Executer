package V8;

import com.squareup.workflow1.ui.A;
import java.util.Set;

public final class p implements C9.d<Set<A<?>>> {
    private final C9.h<com.withpersona.sdk2.inquiry.selfie.f> a;

    public p(C9.h<com.withpersona.sdk2.inquiry.selfie.f> hVar) {
        this.a = hVar;
    }

    public static p a(C9.h<com.withpersona.sdk2.inquiry.selfie.f> hVar) {
        return new p(hVar);
    }

    public static Set<A<?>> c(com.withpersona.sdk2.inquiry.selfie.f fVar) {
        return (Set) C9.g.d(com.withpersona.sdk2.inquiry.selfie.j.a(fVar));
    }

    public Set<A<?>> get() {
        return c((com.withpersona.sdk2.inquiry.selfie.f) this.a.get());
    }
}
