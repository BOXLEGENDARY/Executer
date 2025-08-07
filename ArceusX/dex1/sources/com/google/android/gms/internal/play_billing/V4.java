package com.google.android.gms.internal.play_billing;

import y0.xyyu.hkVlaTTCDY;

public final class V4 extends R2 implements InterfaceC2161v3 {
    private static final V4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private E4 zzg;
    private H4 zzh;

    static {
        V4 v42 = new V4();
        zzb = v42;
        R2.z(V4.class, v42);
    }

    private V4() {
    }

    static void D(V4 v42, C2085i4 c2085i4) {
        v42.zzf = c2085i4;
        v42.zze = 2;
    }

    static void E(V4 v42, C2115n4 c2115n4) {
        v42.zzf = c2115n4;
        v42.zze = 3;
    }

    static void G(V4 v42, C2162v4 c2162v4) {
        c2162v4.getClass();
        v42.zzf = c2162v4;
        v42.zze = 7;
    }

    static void H(V4 v42, E4 e42) {
        e42.getClass();
        v42.zzg = e42;
        v42.zzd |= 1;
    }

    static void I(V4 v42, b5 b5Var) {
        b5Var.getClass();
        v42.zzf = b5Var;
        v42.zze = 8;
    }

    static void J(V4 v42, f5 f5Var) {
        v42.zzf = f5Var;
        v42.zze = 4;
    }

    public static T4 K() {
        return (T4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", hkVlaTTCDY.Ngk, C2085i4.class, C2115n4.class, f5.class, B4.class, "zzh", C2162v4.class, b5.class});
        }
        if (i8 == 3) {
            return new V4();
        }
        U4 u42 = null;
        if (i8 == 4) {
            return new T4(u42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
