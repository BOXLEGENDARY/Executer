package com.google.android.gms.internal.play_billing;

import t2.Dbl.hgESaf;

public final class b5 extends R2 implements InterfaceC2161v3 {
    private static final b5 zzb;
    private int zzd;
    private C2144s4 zze;

    static {
        b5 b5Var = new b5();
        zzb = b5Var;
        R2.z(b5.class, b5Var);
    }

    private b5() {
    }

    static void D(b5 b5Var, C2144s4 c2144s4) {
        c2144s4.getClass();
        b5Var.zze = c2144s4;
        b5Var.zzd |= 1;
    }

    public static Z4 E() {
        return (Z4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{hgESaf.CnuzncTrF, "zze"});
        }
        if (i8 == 3) {
            return new b5();
        }
        a5 a5Var = null;
        if (i8 == 4) {
            return new Z4(a5Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
