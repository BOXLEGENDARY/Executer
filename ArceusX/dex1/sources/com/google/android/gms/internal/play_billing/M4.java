package com.google.android.gms.internal.play_billing;

public final class M4 extends R2 implements InterfaceC2161v3 {
    private static final M4 zzb;
    private int zzd;
    private int zze;

    static {
        M4 m42 = new M4();
        zzb = m42;
        R2.z(M4.class, m42);
    }

    private M4() {
    }

    static void D(M4 m42, int i7) {
        m42.zze = i7 - 1;
        m42.zzd |= 1;
    }

    public static I4 E() {
        return (I4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", J4.f15881a});
        }
        if (i8 == 3) {
            return new M4();
        }
        L4 l42 = null;
        if (i8 == 4) {
            return new I4(l42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
