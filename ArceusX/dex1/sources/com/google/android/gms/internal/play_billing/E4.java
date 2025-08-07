package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class E4 extends R2 implements InterfaceC2161v3 {
    private static final E4 zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private long zzh;

    static {
        E4 e42 = new E4();
        zzb = e42;
        R2.z(E4.class, e42);
    }

    private E4() {
    }

    static void D(E4 e42, int i7) {
        e42.zzd |= 4;
        e42.zzg = i7;
    }

    static void E(E4 e42, long j7) {
        e42.zzd |= 8;
        e42.zzh = j7;
    }

    static void G(E4 e42, String str) {
        str.getClass();
        e42.zzd |= 2;
        e42.zzf = str;
    }

    static void H(E4 e42, String str) {
        str.getClass();
        e42.zzd |= 1;
        e42.zze = str;
    }

    public static C4 I() {
        return (C4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new E4();
        }
        D4 d42 = null;
        if (i8 == 4) {
            return new C4(d42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
