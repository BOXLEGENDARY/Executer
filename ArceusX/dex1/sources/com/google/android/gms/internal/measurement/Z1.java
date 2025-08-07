package com.google.android.gms.internal.measurement;

import java.util.List;

public final class Z1 extends T3<Z1, Y1> implements InterfaceC2029z4 {
    private static final Z1 zza;
    private int zze;
    private int zzf;
    private Z3 zzg = T3.t();

    static {
        Z1 z1 = new Z1();
        zza = z1;
        T3.o(Z1.class, z1);
    }

    private Z1() {
    }

    static void D(Z1 z1, int i7) {
        z1.zze |= 1;
        z1.zzf = i7;
    }

    static void E(Z1 z1, Iterable iterable) {
        Z3 z32 = z1.zzg;
        if (!z32.a()) {
            z1.zzg = T3.u(z32);
        }
        AbstractC1853d3.h(iterable, z1.zzg);
    }

    public static Y1 z() {
        return zza.p();
    }

    public final List<Long> C() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new Z1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new Y1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzg.size();
    }

    public final int x() {
        return this.zzf;
    }

    public final long y(int i7) {
        return this.zzg.y(i7);
    }
}
