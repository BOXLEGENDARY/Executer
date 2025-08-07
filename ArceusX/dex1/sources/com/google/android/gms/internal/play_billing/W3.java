package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

final class W3 extends Y3 {
    W3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final double a(Object obj, long j7) {
        return Double.longBitsToDouble(this.f15962a.getLong(obj, j7));
    }

    @Override
    public final float b(Object obj, long j7) {
        return Float.intBitsToFloat(this.f15962a.getInt(obj, j7));
    }

    @Override
    public final void c(Object obj, long j7, boolean z7) {
        if (Z3.f15986h) {
            Z3.d(obj, j7, z7 ? (byte) 1 : (byte) 0);
        } else {
            Z3.e(obj, j7, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override
    public final void d(Object obj, long j7, byte b2) {
        if (Z3.f15986h) {
            Z3.d(obj, j7, b2);
        } else {
            Z3.e(obj, j7, b2);
        }
    }

    @Override
    public final void e(Object obj, long j7, double d7) {
        this.f15962a.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override
    public final void f(Object obj, long j7, float f7) {
        this.f15962a.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override
    public final boolean g(Object obj, long j7) {
        return Z3.f15986h ? Z3.y(obj, j7) : Z3.z(obj, j7);
    }
}
