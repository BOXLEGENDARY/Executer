package S;

import S.C1222d;
import S.i0;
import x0.InterfaceC2984a;

public abstract class AbstractC1229k {

    public static abstract class a {
        a() {
        }

        public abstract AbstractC1229k a();

        public a b(InterfaceC2984a<i0.a> interfaceC2984a) {
            i0.a aVarF = c().f();
            interfaceC2984a.accept(aVarF);
            f(aVarF.a());
            return this;
        }

        abstract i0 c();

        public abstract a d(AbstractC1219a abstractC1219a);

        public abstract a e(int i7);

        public abstract a f(i0 i0Var);
    }

    AbstractC1229k() {
    }

    public static a a() {
        return new C1222d.b().e(-1).d(AbstractC1219a.a().a()).f(i0.a().a());
    }

    static int e(int i7) {
        return i7 != 1 ? 0 : 1;
    }

    public static String f(int i7) {
        return i7 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract AbstractC1219a b();

    public abstract int c();

    public abstract i0 d();

    public abstract a g();
}
