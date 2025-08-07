package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class C1932n2 extends T3<C1932n2, C1900j2> implements InterfaceC2029z4 {
    private static final C1932n2 zza;
    private int zze;
    private int zzf;
    private InterfaceC1830a4<C1932n2> zzg = T3.k();
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzj;
    private double zzk;

    static {
        C1932n2 c1932n2 = new C1932n2();
        zza = c1932n2;
        T3.o(C1932n2.class, c1932n2);
    }

    private C1932n2() {
    }

    public final List<C1932n2> B() {
        return this.zzg;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 16) != 0;
    }

    public final boolean F() {
        return (this.zze & 4) != 0;
    }

    public final int G() {
        int iA = C1924m2.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C1916l2.f15203a, "zzg", C1932n2.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new C1932n2();
        }
        C1844c2 c1844c2 = null;
        if (i8 == 4) {
            return new C1900j2(c1844c2);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final double w() {
        return this.zzk;
    }

    public final String y() {
        return this.zzh;
    }

    public final String z() {
        return this.zzi;
    }
}
