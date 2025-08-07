package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import e2.vb.oyfFwvPUKctyaG;

public final class C1891i1 extends T3<C1891i1, C1859e1> implements InterfaceC2029z4 {
    private static final C1891i1 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        C1891i1 c1891i1 = new C1891i1();
        zza = c1891i1;
        T3.o(C1891i1.class, c1891i1);
    }

    private C1891i1() {
    }

    public static C1891i1 x() {
        return zza;
    }

    public final String B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    public final boolean F() {
        return (this.zze & 2) != 0;
    }

    public final boolean G() {
        return (this.zze & 16) != 0;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final int I() {
        int iA = C1883h1.a(this.zzf);
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
            return T3.n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", oyfFwvPUKctyaG.HUrbLk, C1875g1.f15162a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new C1891i1();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new C1859e1(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final String y() {
        return this.zzh;
    }

    public final String z() {
        return this.zzj;
    }
}
