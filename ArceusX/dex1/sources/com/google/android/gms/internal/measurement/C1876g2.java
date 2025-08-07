package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class C1876g2 extends T3<C1876g2, C1868f2> implements InterfaceC2029z4 {
    private static final C1876g2 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC1830a4<C1932n2> zzg = T3.k();

    static {
        C1876g2 c1876g2 = new C1876g2();
        zza = c1876g2;
        T3.o(C1876g2.class, c1876g2);
    }

    private C1876g2() {
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C1932n2.class});
        }
        if (i8 == 3) {
            return new C1876g2();
        }
        C1844c2 c1844c2 = null;
        if (i8 == 4) {
            return new C1868f2(c1844c2);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final String x() {
        return this.zzf;
    }

    public final List<C1932n2> y() {
        return this.zzg;
    }
}
