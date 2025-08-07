package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class Q4 extends R2 implements InterfaceC2161v3 {
    private static final Q4 zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        Q4 q42 = new Q4();
        zzb = q42;
        R2.z(Q4.class, q42);
    }

    private Q4() {
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", P4.f15916a, "zzf"});
        }
        if (i8 == 3) {
            return new Q4();
        }
        R4 r42 = null;
        if (i8 == 4) {
            return new O4(r42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
