package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class AbstractC1887h5 {

    final Unsafe f15174a;

    AbstractC1887h5(Unsafe unsafe) {
        this.f15174a = unsafe;
    }

    public abstract double a(Object obj, long j7);

    public abstract float b(Object obj, long j7);

    public abstract void c(Object obj, long j7, boolean z7);

    public abstract void d(Object obj, long j7, byte b2);

    public abstract void e(Object obj, long j7, double d7);

    public abstract void f(Object obj, long j7, float f7);

    public abstract boolean g(Object obj, long j7);

    public final int h(Class<?> cls) {
        return this.f15174a.arrayBaseOffset(cls);
    }

    public final int i(Class<?> cls) {
        return this.f15174a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j7) {
        return this.f15174a.getInt(obj, j7);
    }

    public final long k(Object obj, long j7) {
        return this.f15174a.getLong(obj, j7);
    }

    public final long l(Field field) {
        return this.f15174a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j7) {
        return this.f15174a.getObject(obj, j7);
    }

    public final void n(Object obj, long j7, int i7) {
        this.f15174a.putInt(obj, j7, i7);
    }

    public final void o(Object obj, long j7, long j8) {
        this.f15174a.putLong(obj, j7, j8);
    }

    public final void p(Object obj, long j7, Object obj2) {
        this.f15174a.putObject(obj, j7, obj2);
    }
}
