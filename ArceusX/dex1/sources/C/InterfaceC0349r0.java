package C;

import C.X;
import z.C3070z;

public interface InterfaceC0349r0 extends S0 {

    public static final X.a<Integer> f706h = X.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    public static final X.a<C3070z> f707i = X.a.a("camerax.core.imageInput.inputDynamicRange", C3070z.class);

    default C3070z o() {
        return (C3070z) x0.g.g((C3070z) a(f707i, C3070z.f24772c));
    }

    default int t() {
        return ((Integer) f(f706h)).intValue();
    }

    default boolean u() {
        return b(f707i);
    }
}
