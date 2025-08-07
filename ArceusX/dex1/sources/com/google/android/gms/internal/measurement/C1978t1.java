package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

public final class C1978t1 extends T3<C1978t1, C1962r1> implements InterfaceC2029z4 {
    private static final C1978t1 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1978t1 c1978t1 = new C1978t1();
        zza = c1978t1;
        T3.o(C1978t1.class, c1978t1);
    }

    private C1978t1() {
    }

    static void z(C1978t1 c1978t1, String str) {
        str.getClass();
        c1978t1.zze |= 1;
        c1978t1.zzf = str;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final boolean C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new C1978t1();
        }
        C1955q1 c1955q1 = null;
        if (i8 == 4) {
            return new C1962r1(c1955q1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzi;
    }

    public final String y() {
        return this.zzf;
    }
}
