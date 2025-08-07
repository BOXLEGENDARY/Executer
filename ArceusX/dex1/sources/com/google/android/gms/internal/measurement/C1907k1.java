package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class C1907k1 extends T3<C1907k1, C1899j1> implements InterfaceC2029z4 {
    private static final C1907k1 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private C1851d1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C1907k1 c1907k1 = new C1907k1();
        zza = c1907k1;
        T3.o(C1907k1.class, c1907k1);
    }

    private C1907k1() {
    }

    static void C(C1907k1 c1907k1, String str) {
        c1907k1.zze |= 2;
        c1907k1.zzg = str;
    }

    public static C1899j1 y() {
        return zza.p();
    }

    public final String B() {
        return this.zzg;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final boolean E() {
        return this.zzj;
    }

    public final boolean F() {
        return this.zzk;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 32) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new C1907k1();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new C1899j1(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzf;
    }

    public final C1851d1 x() {
        C1851d1 c1851d1 = this.zzh;
        return c1851d1 == null ? C1851d1.x() : c1851d1;
    }
}
