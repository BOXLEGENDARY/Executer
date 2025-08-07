package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class C1835b1 extends T3<C1835b1, C1827a1> implements InterfaceC2029z4 {
    private static final C1835b1 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1830a4<C1851d1> zzh = T3.k();
    private boolean zzi;
    private C1891i1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1835b1 c1835b1 = new C1835b1();
        zza = c1835b1;
        T3.o(C1835b1.class, c1835b1);
    }

    private C1835b1() {
    }

    static void F(C1835b1 c1835b1, String str) {
        c1835b1.zze |= 2;
        c1835b1.zzg = str;
    }

    static void G(C1835b1 c1835b1, int i7, C1851d1 c1851d1) {
        c1851d1.getClass();
        InterfaceC1830a4<C1851d1> interfaceC1830a4 = c1835b1.zzh;
        if (!interfaceC1830a4.a()) {
            c1835b1.zzh = T3.l(interfaceC1830a4);
        }
        c1835b1.zzh.set(i7, c1851d1);
    }

    public static C1827a1 y() {
        return zza.p();
    }

    public final C1851d1 B(int i7) {
        return this.zzh.get(i7);
    }

    public final C1891i1 C() {
        C1891i1 c1891i1 = this.zzj;
        return c1891i1 == null ? C1891i1.x() : c1891i1;
    }

    public final String D() {
        return this.zzg;
    }

    public final List<C1851d1> E() {
        return this.zzh;
    }

    public final boolean H() {
        return this.zzk;
    }

    public final boolean I() {
        return this.zzl;
    }

    public final boolean J() {
        return this.zzm;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 64) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1851d1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i8 == 3) {
            return new C1835b1();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new C1827a1(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzh.size();
    }

    public final int x() {
        return this.zzf;
    }
}
