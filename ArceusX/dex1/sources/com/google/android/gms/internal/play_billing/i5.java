package com.google.android.gms.internal.play_billing;

import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;

public final class i5 extends R2 implements InterfaceC2161v3 {
    private static final i5 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        R2.z(i5.class, i5Var);
    }

    private i5() {
    }

    static void D(i5 i5Var, boolean z7) {
        i5Var.zzd |= 2;
        i5Var.zzf = true;
    }

    public static g5 E() {
        return (g5) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", tAjeAKSIqDqzNP.WChEbaCJNYP, "zzf"});
        }
        if (i8 == 3) {
            return new i5();
        }
        h5 h5Var = null;
        if (i8 == 4) {
            return new g5(h5Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
