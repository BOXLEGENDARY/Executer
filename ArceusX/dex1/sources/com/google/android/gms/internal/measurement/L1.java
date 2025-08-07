package com.google.android.gms.internal.measurement;

import androidx.appcompat.app.FN.krlBPZZeK;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.util.List;

public final class L1 extends T3<L1, K1> implements InterfaceC2029z4 {
    private static final L1 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private InterfaceC1830a4<L1> zzk;

    static {
        L1 l1 = new L1();
        zza = l1;
        T3.o(L1.class, l1);
    }

    private L1() {
        String str = wtzgsqRsIZB.UrgGZWqnp;
        this.zzf = str;
        this.zzg = str;
        this.zzk = T3.k();
    }

    public static K1 B() {
        return zza.p();
    }

    static void G(L1 l1, String str) {
        str.getClass();
        l1.zze |= 1;
        l1.zzf = str;
    }

    static void H(L1 l1, String str) {
        str.getClass();
        l1.zze |= 2;
        l1.zzg = str;
    }

    static void I(L1 l1) {
        l1.zze &= -3;
        l1.zzg = zza.zzg;
    }

    static void J(L1 l1, long j7) {
        l1.zze |= 4;
        l1.zzh = j7;
    }

    static void L(L1 l1) {
        l1.zze &= -5;
        l1.zzh = 0L;
    }

    static void M(L1 l1, double d7) {
        l1.zze |= 16;
        l1.zzj = d7;
    }

    static void O(L1 l1) {
        l1.zze &= -17;
        l1.zzj = 0.0d;
    }

    static void P(L1 l1, L1 l12) {
        l12.getClass();
        l1.Y();
        l1.zzk.add(l12);
    }

    static void Q(L1 l1, Iterable iterable) {
        l1.Y();
        AbstractC1853d3.h(iterable, l1.zzk);
    }

    private final void Y() {
        InterfaceC1830a4<L1> interfaceC1830a4 = this.zzk;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzk = T3.l(interfaceC1830a4);
    }

    public final String D() {
        return this.zzf;
    }

    public final String E() {
        return this.zzg;
    }

    public final List<L1> F() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zze & 16) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final boolean W() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{krlBPZZeK.yJi, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", L1.class});
        }
        if (i8 == 3) {
            return new L1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new K1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final double w() {
        return this.zzj;
    }

    public final float x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzk.size();
    }

    public final long z() {
        return this.zzh;
    }
}
