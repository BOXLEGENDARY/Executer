package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class N1 extends T3<N1, M1> implements InterfaceC2029z4 {
    private static final N1 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private B1 zzh;

    static {
        N1 n1 = new N1();
        zza = n1;
        T3.o(N1.class, n1);
    }

    private N1() {
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new N1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new M1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }
}
