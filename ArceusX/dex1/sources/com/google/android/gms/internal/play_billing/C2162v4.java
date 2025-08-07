package com.google.android.gms.internal.play_billing;

public final class C2162v4 extends R2 implements InterfaceC2161v3 {
    private static final C2162v4 zzb;

    static {
        C2162v4 c2162v4 = new C2162v4();
        zzb = c2162v4;
        R2.z(C2162v4.class, c2162v4);
    }

    private C2162v4() {
    }

    public static C2162v4 C() {
        return zzb;
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        C2156u4 c2156u4 = null;
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0000", null);
        }
        if (i8 == 3) {
            return new C2162v4();
        }
        if (i8 == 4) {
            return new C2150t4(c2156u4);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
