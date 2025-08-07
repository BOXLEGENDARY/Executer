package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class C1851d1 extends T3<C1851d1, C1843c1> implements InterfaceC2029z4 {
    private static final C1851d1 zza;
    private int zze;
    private C1947p1 zzf;
    private C1891i1 zzg;
    private boolean zzh;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C1851d1 c1851d1 = new C1851d1();
        zza = c1851d1;
        T3.o(C1851d1.class, c1851d1);
    }

    private C1851d1() {
    }

    static void C(C1851d1 c1851d1, String str) {
        c1851d1.zze |= 8;
        c1851d1.zzi = str;
    }

    public static C1851d1 x() {
        return zza;
    }

    public final String B() {
        return this.zzi;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    public final boolean F() {
        return (this.zze & 2) != 0;
    }

    public final boolean G() {
        return (this.zze & 8) != 0;
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
            return T3.n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new C1851d1();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new C1843c1(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final C1891i1 y() {
        C1891i1 c1891i1 = this.zzg;
        return c1891i1 == null ? C1891i1.x() : c1891i1;
    }

    public final C1947p1 z() {
        C1947p1 c1947p1 = this.zzf;
        return c1947p1 == null ? C1947p1.y() : c1947p1;
    }
}
