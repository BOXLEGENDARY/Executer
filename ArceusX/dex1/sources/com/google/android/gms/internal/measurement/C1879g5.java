package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class C1879g5 extends AbstractC1887h5 {
    C1879g5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final double a(Object obj, long j7) {
        return Double.longBitsToDouble(k(obj, j7));
    }

    @Override
    public final float b(Object obj, long j7) {
        return Float.intBitsToFloat(j(obj, j7));
    }

    @Override
    public final void c(Object obj, long j7, boolean z7) {
        if (C1895i5.f15190i) {
            C1895i5.d(obj, j7, z7 ? (byte) 1 : (byte) 0);
        } else {
            C1895i5.e(obj, j7, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override
    public final void d(Object obj, long j7, byte b2) {
        if (C1895i5.f15190i) {
            C1895i5.d(obj, j7, b2);
        } else {
            C1895i5.e(obj, j7, b2);
        }
    }

    @Override
    public final void e(Object obj, long j7, double d7) {
        o(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override
    public final void f(Object obj, long j7, float f7) {
        n(obj, j7, Float.floatToIntBits(f7));
    }

    @Override
    public final boolean g(Object obj, long j7) {
        return C1895i5.f15190i ? C1895i5.y(obj, j7) : C1895i5.z(obj, j7);
    }
}
