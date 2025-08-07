package com.google.android.gms.internal.play_billing;

public final class S4 extends R2 implements InterfaceC2161v3 {
    private static final S4 zzb;
    private V2 zzd = R2.u();

    static {
        S4 s42 = new S4();
        zzb = s42;
        R2.z(S4.class, s42);
    }

    private S4() {
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", Q4.class});
        }
        if (i8 == 3) {
            return new S4();
        }
        R4 r42 = null;
        if (i8 == 4) {
            return new N4(r42);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
