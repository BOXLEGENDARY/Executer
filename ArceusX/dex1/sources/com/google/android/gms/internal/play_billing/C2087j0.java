package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

public final class C2087j0 extends AbstractC2169x implements Serializable {

    private static final C2087j0 f16070e;

    private static final C2087j0 f16071i;

    private final transient AbstractC2057e0 f16072d;

    static {
        int i7 = AbstractC2057e0.f16029i;
        f16070e = new C2087j0(B0.f15769y);
        f16071i = new C2087j0(AbstractC2057e0.s(C2176y0.a()));
    }

    C2087j0(AbstractC2057e0 abstractC2057e0) {
        this.f16072d = abstractC2057e0;
    }

    static C2087j0 b() {
        return f16071i;
    }

    public static C2087j0 c() {
        return f16070e;
    }

    @Override
    public final Set a() {
        return this.f16072d.isEmpty() ? H0.f15808B : new I0(this.f16072d, C2170x0.f16161d);
    }
}
