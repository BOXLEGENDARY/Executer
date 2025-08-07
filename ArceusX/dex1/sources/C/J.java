package C;

import java.util.Collection;
import z.G0;
import z.InterfaceC3052i;
import z.InterfaceC3054j;
import z.InterfaceC3060o;

public interface J extends InterfaceC3052i, G0.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        private final boolean f398d;

        a(boolean z7) {
            this.f398d = z7;
        }

        boolean e() {
            return this.f398d;
        }
    }

    @Override
    default InterfaceC3054j a() {
        return h();
    }

    H0<a> b();

    @Override
    default InterfaceC3060o c() {
        return q();
    }

    default void f(B b2) {
    }

    default boolean g() {
        return c().h() == 0;
    }

    F h();

    default B i() {
        return E.a();
    }

    default void k(boolean z7) {
    }

    void l(Collection<z.G0> collection);

    void n(Collection<z.G0> collection);

    default boolean o() {
        return true;
    }

    default void p(boolean z7) {
    }

    I q();
}
