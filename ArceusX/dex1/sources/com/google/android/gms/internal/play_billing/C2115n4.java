package com.google.android.gms.internal.play_billing;

public final class C2115n4 extends R2 implements InterfaceC2161v3 {
    private static final C2115n4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C2115n4 c2115n4 = new C2115n4();
        zzb = c2115n4;
        R2.z(C2115n4.class, c2115n4);
    }

    private C2115n4() {
    }

    static void D(C2115n4 c2115n4, M4 m42) {
        m42.getClass();
        c2115n4.zzf = m42;
        c2115n4.zze = 2;
    }

    static void E(C2115n4 c2115n4, i5 i5Var) {
        i5Var.getClass();
        c2115n4.zzf = i5Var;
        c2115n4.zze = 3;
    }

    static void G(C2115n4 c2115n4, int i7) {
        c2115n4.zzg = i7 - 1;
        c2115n4.zzd |= 1;
    }

    public static C2103l4 H() {
        return (C2103l4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2097k4.f16081a, M4.class, i5.class, S4.class});
        }
        if (i8 == 3) {
            return new C2115n4();
        }
        C2109m4 c2109m4 = null;
        if (i8 == 4) {
            return new C2103l4(c2109m4);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
