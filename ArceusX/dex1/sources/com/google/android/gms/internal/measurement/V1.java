package com.google.android.gms.internal.measurement;

public final class V1 extends T3<V1, S1> implements InterfaceC2029z4 {
    private static final V1 zza;
    private int zze;
    private int zzf = 1;
    private InterfaceC1830a4<J1> zzg = T3.k();

    static {
        V1 v1 = new V1();
        zza = v1;
        T3.o(V1.class, v1);
    }

    private V1() {
    }

    public static S1 w() {
        return zza.p();
    }

    static void y(V1 v1, J1 j12) {
        j12.getClass();
        InterfaceC1830a4<J1> interfaceC1830a4 = v1.zzg;
        if (!interfaceC1830a4.a()) {
            v1.zzg = T3.l(interfaceC1830a4);
        }
        v1.zzg.add(j12);
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", U1.f15046a, "zzg", J1.class});
        }
        if (i8 == 3) {
            return new V1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new S1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }
}
