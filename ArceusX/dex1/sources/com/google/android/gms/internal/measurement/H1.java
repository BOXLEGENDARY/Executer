package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class H1 extends T3<H1, G1> implements InterfaceC2029z4 {
    private static final H1 zza;
    private int zze;
    private InterfaceC1830a4<L1> zzf = T3.k();
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        H1 h12 = new H1();
        zza = h12;
        T3.o(H1.class, h12);
    }

    private H1() {
    }

    public static G1 B() {
        return zza.p();
    }

    static void G(H1 h12, int i7, L1 l1) {
        l1.getClass();
        h12.T();
        h12.zzf.set(i7, l1);
    }

    static void H(H1 h12, L1 l1) {
        l1.getClass();
        h12.T();
        h12.zzf.add(l1);
    }

    static void I(H1 h12, Iterable iterable) {
        h12.T();
        AbstractC1853d3.h(iterable, h12.zzf);
    }

    static void L(H1 h12, int i7) {
        h12.T();
        h12.zzf.remove(i7);
    }

    static void M(H1 h12, String str) {
        str.getClass();
        h12.zze |= 1;
        h12.zzg = str;
    }

    static void O(H1 h12, long j7) {
        h12.zze |= 2;
        h12.zzh = j7;
    }

    static void P(H1 h12, long j7) {
        h12.zze |= 4;
        h12.zzi = j7;
    }

    private final void T() {
        InterfaceC1830a4<L1> interfaceC1830a4 = this.zzf;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzf = T3.l(interfaceC1830a4);
    }

    public final L1 D(int i7) {
        return this.zzf.get(i7);
    }

    public final String E() {
        return this.zzg;
    }

    public final List<L1> F() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", L1.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new H1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new G1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzj;
    }

    public final int x() {
        return this.zzf.size();
    }

    public final long y() {
        return this.zzi;
    }

    public final long z() {
        return this.zzh;
    }
}
