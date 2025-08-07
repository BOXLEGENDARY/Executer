package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import java.util.List;

public final class C1947p1 extends T3<C1947p1, C1915l1> implements InterfaceC2029z4 {
    private static final C1947p1 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1830a4<String> zzi = T3.k();

    static {
        C1947p1 c1947p1 = new C1947p1();
        zza = c1947p1;
        T3.o(C1947p1.class, c1947p1);
    }

    private C1947p1() {
    }

    public static C1947p1 y() {
        return zza;
    }

    public final List<String> B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    public final boolean E() {
        return (this.zze & 2) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final int G() {
        int iA = C1939o1.a(this.zzf);
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
            return T3.n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{ZJZXBWla.EyBmVUFG, "zzf", C1931n1.f15215a, "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new C1947p1();
        }
        X0 x02 = null;
        if (i8 == 4) {
            return new C1915l1(x02);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzi.size();
    }

    public final String z() {
        return this.zzg;
    }
}
