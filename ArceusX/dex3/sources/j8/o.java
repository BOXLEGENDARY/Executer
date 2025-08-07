package J8;

import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C;
import java.util.Set;

public final class o implements C9.d<C> {
    private final C9.h<Set<A<?>>> a;

    public o(C9.h<Set<A<?>>> hVar) {
        this.a = hVar;
    }

    public static o a(C9.h<Set<A<?>>> hVar) {
        return new o(hVar);
    }

    public static C c(Set<A<?>> set) {
        return (C) C9.g.d(com.withpersona.sdk2.inquiry.internal.network.b.l(set));
    }

    public C get() {
        return c((Set) this.a.get());
    }
}
