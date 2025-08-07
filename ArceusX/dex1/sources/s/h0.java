package S;

import C.H0;
import C.h1;
import z.F0;
import z.InterfaceC3060o;

public interface h0 {

    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(F0 f02);

    default void b(F0 f02, h1 h1Var) {
        a(f02);
    }

    default void c(a aVar) {
    }

    default I d(InterfaceC3060o interfaceC3060o) {
        return I.f6203a;
    }

    default H0<AbstractC1229k> e() {
        return C.Z.f(null);
    }

    default H0<H> f() {
        return H.f6199c;
    }

    default H0<Boolean> g() {
        return C.Z.f(Boolean.FALSE);
    }
}
