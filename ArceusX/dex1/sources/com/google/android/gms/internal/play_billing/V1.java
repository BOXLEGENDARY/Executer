package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class V1 extends R2 implements InterfaceC2161v3 {
    private static final V1 zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;

    static {
        V1 v1 = new V1();
        zzb = v1;
        R2.z(V1.class, v1);
    }

    private V1() {
    }

    public static U1 C() {
        return (U1) zzb.o();
    }

    static void E(V1 v1, String str) {
        v1.zzd |= 1;
        v1.zze = str;
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new V1();
        }
        W1 w1 = null;
        if (i8 == 4) {
            return new U1(w1);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
