package com.google.android.gms.internal.measurement;

import java.util.List;

public final class P1 extends T3<P1, O1> implements InterfaceC2029z4 {
    private static final P1 zza;
    private InterfaceC1830a4<R1> zze = T3.k();

    static {
        P1 p1 = new P1();
        zza = p1;
        T3.o(P1.class, p1);
    }

    private P1() {
    }

    static void B(P1 p1, R1 r1) {
        r1.getClass();
        InterfaceC1830a4<R1> interfaceC1830a4 = p1.zze;
        if (!interfaceC1830a4.a()) {
            p1.zze = T3.l(interfaceC1830a4);
        }
        p1.zze.add(r1);
    }

    public static O1 w() {
        return zza.p();
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", R1.class});
        }
        if (i8 == 3) {
            return new P1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new O1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final R1 y(int i7) {
        return this.zze.get(0);
    }

    public final List<R1> z() {
        return this.zze;
    }
}
