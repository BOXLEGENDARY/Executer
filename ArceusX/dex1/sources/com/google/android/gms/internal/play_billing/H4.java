package com.google.android.gms.internal.play_billing;

public final class H4 extends R2 implements InterfaceC2161v3 {
    private static final H4 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        H4 h42 = new H4();
        zzb = h42;
        R2.z(H4.class, h42);
    }

    private H4() {
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new H4();
        }
        G4 g42 = null;
        if (i8 == 4) {
            return new F4(g42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
