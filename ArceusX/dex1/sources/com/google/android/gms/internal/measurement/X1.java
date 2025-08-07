package com.google.android.gms.internal.measurement;

import java.util.List;

public final class X1 extends T3<X1, W1> implements InterfaceC2029z4 {
    private static final X1 zza;
    private Z3 zze = T3.t();
    private Z3 zzf = T3.t();
    private InterfaceC1830a4<F1> zzg = T3.k();
    private InterfaceC1830a4<Z1> zzh = T3.k();

    static {
        X1 x1 = new X1();
        zza = x1;
        T3.o(X1.class, x1);
    }

    private X1() {
    }

    public static W1 C() {
        return zza.p();
    }

    public static X1 E() {
        return zza;
    }

    static void L(X1 x1, Iterable iterable) {
        Z3 z32 = x1.zze;
        if (!z32.a()) {
            x1.zze = T3.u(z32);
        }
        AbstractC1853d3.h(iterable, x1.zze);
    }

    static void O(X1 x1, Iterable iterable) {
        Z3 z32 = x1.zzf;
        if (!z32.a()) {
            x1.zzf = T3.u(z32);
        }
        AbstractC1853d3.h(iterable, x1.zzf);
    }

    static void Q(X1 x1, Iterable iterable) {
        x1.V();
        AbstractC1853d3.h(iterable, x1.zzg);
    }

    static void R(X1 x1, int i7) {
        x1.V();
        x1.zzg.remove(i7);
    }

    static void S(X1 x1, Iterable iterable) {
        x1.W();
        AbstractC1853d3.h(iterable, x1.zzh);
    }

    static void T(X1 x1, int i7) {
        x1.W();
        x1.zzh.remove(i7);
    }

    private final void V() {
        InterfaceC1830a4<F1> interfaceC1830a4 = this.zzg;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzg = T3.l(interfaceC1830a4);
    }

    private final void W() {
        InterfaceC1830a4<Z1> interfaceC1830a4 = this.zzh;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzh = T3.l(interfaceC1830a4);
    }

    public final F1 B(int i7) {
        return this.zzg.get(i7);
    }

    public final Z1 F(int i7) {
        return this.zzh.get(i7);
    }

    public final List<F1> G() {
        return this.zzg;
    }

    public final List<Long> H() {
        return this.zzf;
    }

    public final List<Z1> I() {
        return this.zzh;
    }

    public final List<Long> J() {
        return this.zze;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", F1.class, "zzh", Z1.class});
        }
        if (i8 == 3) {
            return new X1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new W1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zza;
    }

    public final int w() {
        return this.zzg.size();
    }

    public final int x() {
        return this.zzf.size();
    }

    public final int y() {
        return this.zzh.size();
    }

    public final int z() {
        return this.zze.size();
    }
}
