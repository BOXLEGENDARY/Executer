package com.google.android.gms.internal.measurement;

import java.util.List;

public final class Z0 extends T3<Z0, Y0> implements InterfaceC2029z4 {
    private static final Z0 zza;
    private int zze;
    private int zzf;
    private InterfaceC1830a4<C1907k1> zzg = T3.k();
    private InterfaceC1830a4<C1835b1> zzh = T3.k();
    private boolean zzi;
    private boolean zzj;

    static {
        Z0 z02 = new Z0();
        zza = z02;
        T3.o(Z0.class, z02);
    }

    private Z0() {
    }

    static void F(Z0 z02, int i7, C1907k1 c1907k1) {
        c1907k1.getClass();
        InterfaceC1830a4<C1907k1> interfaceC1830a4 = z02.zzg;
        if (!interfaceC1830a4.a()) {
            z02.zzg = T3.l(interfaceC1830a4);
        }
        z02.zzg.set(i7, c1907k1);
    }

    static void G(Z0 z02, int i7, C1835b1 c1835b1) {
        c1835b1.getClass();
        InterfaceC1830a4<C1835b1> interfaceC1830a4 = z02.zzh;
        if (!interfaceC1830a4.a()) {
            z02.zzh = T3.l(interfaceC1830a4);
        }
        z02.zzh.set(i7, c1835b1);
    }

    public final C1835b1 B(int i7) {
        return this.zzh.get(i7);
    }

    public final C1907k1 C(int i7) {
        return this.zzg.get(i7);
    }

    public final List<C1835b1> D() {
        return this.zzh;
    }

    public final List<C1907k1> E() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1907k1.class, "zzh", C1835b1.class, "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new Z0();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new Y0(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzh.size();
    }

    public final int y() {
        return this.zzg.size();
    }
}
