package com.google.android.gms.internal.measurement;

import java.util.List;

public final class C1892i2 extends T3<C1892i2, C1884h2> implements InterfaceC2029z4 {
    private static final C1892i2 zza;
    private int zze;
    private InterfaceC1830a4<C1932n2> zzf = T3.k();
    private C1860e2 zzg;

    static {
        C1892i2 c1892i2 = new C1892i2();
        zza = c1892i2;
        T3.o(C1892i2.class, c1892i2);
    }

    private C1892i2() {
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C1932n2.class, "zzg"});
        }
        if (i8 == 3) {
            return new C1892i2();
        }
        C1844c2 c1844c2 = null;
        if (i8 == 4) {
            return new C1884h2(c1844c2);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final C1860e2 w() {
        C1860e2 c1860e2 = this.zzg;
        return c1860e2 == null ? C1860e2.y() : c1860e2;
    }

    public final List<C1932n2> y() {
        return this.zzf;
    }
}
