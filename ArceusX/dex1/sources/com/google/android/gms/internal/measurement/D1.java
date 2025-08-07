package com.google.android.gms.internal.measurement;

public final class D1 extends T3<D1, C1> implements InterfaceC2029z4 {
    private static final D1 zza;
    private int zze;
    private int zzf;
    private X1 zzg;
    private X1 zzh;
    private boolean zzi;

    static {
        D1 d12 = new D1();
        zza = d12;
        T3.o(D1.class, d12);
    }

    private D1() {
    }

    static void C(D1 d12, int i7) {
        d12.zze |= 1;
        d12.zzf = i7;
    }

    static void D(D1 d12, X1 x1) {
        x1.getClass();
        d12.zzg = x1;
        d12.zze |= 2;
    }

    static void E(D1 d12, X1 x1) {
        d12.zzh = x1;
        d12.zze |= 4;
    }

    static void F(D1 d12, boolean z7) {
        d12.zze |= 8;
        d12.zzi = z7;
    }

    public static C1 x() {
        return zza.p();
    }

    public final X1 B() {
        X1 x1 = this.zzh;
        return x1 == null ? X1.E() : x1;
    }

    public final boolean G() {
        return this.zzi;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new D1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new C1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzf;
    }

    public final X1 z() {
        X1 x1 = this.zzg;
        return x1 == null ? X1.E() : x1;
    }
}
