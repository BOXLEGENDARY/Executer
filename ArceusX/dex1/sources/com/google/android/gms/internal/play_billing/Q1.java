package com.google.android.gms.internal.play_billing;

public final class Q1 extends R2 implements InterfaceC2161v3 {
    private static final Q1 zzb;
    private int zzd;
    private V1 zze;
    private V1 zzf;
    private int zzg;

    static {
        Q1 q1 = new Q1();
        zzb = q1;
        R2.z(Q1.class, q1);
    }

    private Q1() {
    }

    public static P1 C() {
        return (P1) zzb.o();
    }

    static void E(Q1 q1, V1 v1) {
        v1.getClass();
        q1.zze = v1;
        q1.zzd |= 1;
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", Y1.a()});
        }
        if (i8 == 3) {
            return new Q1();
        }
        T1 t1 = null;
        if (i8 == 4) {
            return new P1(t1);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
