package com.google.android.gms.internal.play_billing;

public final class S1 extends R2 implements InterfaceC2161v3 {
    private static final S1 zzb;
    private V2 zzd = R2.u();

    static {
        S1 s1 = new S1();
        zzb = s1;
        R2.z(S1.class, s1);
    }

    private S1() {
    }

    public static R1 C() {
        return (R1) zzb.o();
    }

    static void E(S1 s1, Iterable iterable) {
        V2 v22 = s1.zzd;
        if (!v22.a()) {
            int size = v22.size();
            s1.zzd = v22.h(size + size);
        }
        AbstractC2035a2.d(iterable, s1.zzd);
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", Q1.class});
        }
        if (i8 == 3) {
            return new S1();
        }
        T1 t1 = null;
        if (i8 == 4) {
            return new R1(t1);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
