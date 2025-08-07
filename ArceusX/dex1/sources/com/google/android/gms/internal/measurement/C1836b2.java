package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class C1836b2 extends T3<C1836b2, C1828a2> implements InterfaceC2029z4 {
    private static final C1836b2 zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C1836b2 c1836b2 = new C1836b2();
        zza = c1836b2;
        T3.o(C1836b2.class, c1836b2);
    }

    private C1836b2() {
    }

    static void E(C1836b2 c1836b2, long j7) {
        c1836b2.zze |= 1;
        c1836b2.zzf = j7;
    }

    static void F(C1836b2 c1836b2, String str) {
        str.getClass();
        c1836b2.zze |= 2;
        c1836b2.zzg = str;
    }

    static void G(C1836b2 c1836b2, String str) {
        str.getClass();
        c1836b2.zze |= 4;
        c1836b2.zzh = str;
    }

    static void H(C1836b2 c1836b2) {
        c1836b2.zze &= -5;
        c1836b2.zzh = zza.zzh;
    }

    static void I(C1836b2 c1836b2, long j7) {
        c1836b2.zze |= 8;
        c1836b2.zzi = j7;
    }

    static void J(C1836b2 c1836b2) {
        c1836b2.zze &= -9;
        c1836b2.zzi = 0L;
    }

    static void L(C1836b2 c1836b2, double d7) {
        c1836b2.zze |= 32;
        c1836b2.zzk = d7;
    }

    static void M(C1836b2 c1836b2) {
        c1836b2.zze &= -33;
        c1836b2.zzk = 0.0d;
    }

    public static C1828a2 z() {
        return zza.p();
    }

    public final String C() {
        return this.zzg;
    }

    public final String D() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 32) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new C1836b2();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new C1828a2(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final double w() {
        return this.zzk;
    }

    public final long x() {
        return this.zzi;
    }

    public final long y() {
        return this.zzf;
    }
}
