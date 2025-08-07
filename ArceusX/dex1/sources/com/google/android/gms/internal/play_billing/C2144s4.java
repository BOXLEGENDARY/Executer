package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class C2144s4 extends R2 implements InterfaceC2161v3 {
    private static final C2144s4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        C2144s4 c2144s4 = new C2144s4();
        zzb = c2144s4;
        R2.z(C2144s4.class, c2144s4);
    }

    private C2144s4() {
    }

    static void D(C2144s4 c2144s4, String str) {
        c2144s4.zzd |= 8;
        c2144s4.zzh = str;
    }

    static void E(C2144s4 c2144s4, String str) {
        str.getClass();
        c2144s4.zzd |= 2;
        c2144s4.zzf = str;
    }

    static void G(C2144s4 c2144s4, int i7) {
        c2144s4.zzd |= 1;
        c2144s4.zze = i7;
    }

    static void H(C2144s4 c2144s4, int i7) {
        c2144s4.zzg = i7 - 1;
        c2144s4.zzd |= 4;
    }

    public static C2121o4 I() {
        return (C2121o4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C2127p4.f16119a, "zzh"});
        }
        if (i8 == 3) {
            return new C2144s4();
        }
        C2138r4 c2138r4 = null;
        if (i8 == 4) {
            return new C2121o4(c2138r4);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
