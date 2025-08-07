package com.google.android.gms.internal.play_billing;

public final class f5 extends R2 implements InterfaceC2161v3 {
    private static final f5 zzb;
    private int zzd;
    private int zze;

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        R2.z(f5.class, f5Var);
    }

    private f5() {
    }

    public static f5 C() {
        return zzb;
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", d5.f16025a});
        }
        if (i8 == 3) {
            return new f5();
        }
        e5 e5Var = null;
        if (i8 == 4) {
            return new c5(e5Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
