package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import z3.AdxZ.bpTQi;

public final class B1 extends T3<B1, A1> implements InterfaceC2029z4 {
    private static final B1 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    private String zzl = BuildConfig.FLAVOR;

    static {
        B1 b12 = new B1();
        zza = b12;
        T3.o(B1.class, b12);
    }

    private B1() {
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", bpTQi.LChRlLBpd, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i8 == 3) {
            return new B1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new A1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }
}
