package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class C1994v1 extends T3<C1994v1, C1986u1> implements InterfaceC2029z4 {
    private static final C1994v1 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1830a4<C2010x1> zzi = T3.k();
    private InterfaceC1830a4<C1978t1> zzj = T3.k();
    private InterfaceC1830a4<Z0> zzk = T3.k();
    private String zzl = BuildConfig.FLAVOR;
    private InterfaceC1830a4<C1892i2> zzn = T3.k();

    static {
        C1994v1 c1994v1 = new C1994v1();
        zza = c1994v1;
        T3.o(C1994v1.class, c1994v1);
    }

    private C1994v1() {
    }

    public static C1986u1 B() {
        return zza.p();
    }

    public static C1994v1 D() {
        return zza;
    }

    static void I(C1994v1 c1994v1, int i7, C1978t1 c1978t1) {
        c1978t1.getClass();
        InterfaceC1830a4<C1978t1> interfaceC1830a4 = c1994v1.zzj;
        if (!interfaceC1830a4.a()) {
            c1994v1.zzj = T3.l(interfaceC1830a4);
        }
        c1994v1.zzj.set(i7, c1978t1);
    }

    public final String E() {
        return this.zzg;
    }

    public final List<Z0> F() {
        return this.zzk;
    }

    public final List<C1892i2> G() {
        return this.zzn;
    }

    public final List<C2010x1> H() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzm;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2010x1.class, "zzj", C1978t1.class, "zzk", Z0.class, "zzl", "zzm", "zzn", C1892i2.class});
        }
        if (i8 == 3) {
            return new C1994v1();
        }
        C1955q1 c1955q1 = null;
        if (i8 == 4) {
            return new C1986u1(c1955q1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzn.size();
    }

    public final int x() {
        return this.zzj.size();
    }

    public final long y() {
        return this.zzf;
    }

    public final C1978t1 z(int i7) {
        return this.zzj.get(i7);
    }
}
