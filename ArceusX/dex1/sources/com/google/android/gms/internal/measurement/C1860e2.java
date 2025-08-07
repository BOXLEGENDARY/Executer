package com.google.android.gms.internal.measurement;

import java.util.List;

public final class C1860e2 extends T3<C1860e2, C1852d2> implements InterfaceC2029z4 {
    private static final C1860e2 zza;
    private InterfaceC1830a4<C1876g2> zze = T3.k();

    static {
        C1860e2 c1860e2 = new C1860e2();
        zza = c1860e2;
        T3.o(C1860e2.class, c1860e2);
    }

    private C1860e2() {
    }

    public static C1860e2 y() {
        return zza;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1876g2.class});
        }
        if (i8 == 3) {
            return new C1860e2();
        }
        C1844c2 c1844c2 = null;
        if (i8 == 4) {
            return new C1852d2(c1844c2);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zze.size();
    }

    public final List<C1876g2> z() {
        return this.zze;
    }
}
