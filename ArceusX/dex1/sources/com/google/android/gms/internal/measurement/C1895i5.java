package com.google.android.gms.internal.measurement;

import Za.qhkq.dHkZSUxHu;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class C1895i5 {

    private static final Unsafe f15182a;

    private static final Class<?> f15183b;

    private static final boolean f15184c;

    private static final boolean f15185d;

    private static final AbstractC1887h5 f15186e;

    private static final boolean f15187f;

    private static final boolean f15188g;

    static final long f15189h;

    static final boolean f15190i;

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1895i5.<clinit>():void");
    }

    private C1895i5() {
    }

    static boolean A(Class<?> cls) {
        int i7 = C1869f3.f15154a;
        try {
            Class<?> cls2 = f15183b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod(dHkZSUxHu.NnFooU, cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j7) {
        return f15186e.g(obj, j7);
    }

    static boolean C() {
        return f15188g;
    }

    static boolean D() {
        return f15187f;
    }

    private static int E(Class<?> cls) {
        if (f15188g) {
            return f15186e.h(cls);
        }
        return -1;
    }

    private static int a(Class<?> cls) {
        if (f15188g) {
            return f15186e.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i7 = C1869f3.f15154a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j7, byte b2) {
        long j8 = (-4) & j7;
        AbstractC1887h5 abstractC1887h5 = f15186e;
        int iJ = abstractC1887h5.j(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        abstractC1887h5.n(obj, j8, ((255 & b2) << i7) | (iJ & (~(255 << i7))));
    }

    public static void e(Object obj, long j7, byte b2) {
        long j8 = (-4) & j7;
        AbstractC1887h5 abstractC1887h5 = f15186e;
        int i7 = (((int) j7) & 3) << 3;
        abstractC1887h5.n(obj, j8, ((255 & b2) << i7) | (abstractC1887h5.j(obj, j8) & (~(255 << i7))));
    }

    static double f(Object obj, long j7) {
        return f15186e.a(obj, j7);
    }

    static float g(Object obj, long j7) {
        return f15186e.b(obj, j7);
    }

    static int h(Object obj, long j7) {
        return f15186e.j(obj, j7);
    }

    static long i(Object obj, long j7) {
        return f15186e.k(obj, j7);
    }

    static <T> T j(Class<T> cls) {
        try {
            return (T) f15182a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object k(Object obj, long j7) {
        return f15186e.m(obj, j7);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1863e5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void m(Throwable th) {
        Logger.getLogger(C1895i5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j7, boolean z7) {
        f15186e.c(obj, j7, z7);
    }

    static void s(byte[] bArr, long j7, byte b2) {
        f15186e.d(bArr, f15189h + j7, b2);
    }

    static void t(Object obj, long j7, double d7) {
        f15186e.e(obj, j7, d7);
    }

    static void u(Object obj, long j7, float f7) {
        f15186e.f(obj, j7, f7);
    }

    static void v(Object obj, long j7, int i7) {
        f15186e.n(obj, j7, i7);
    }

    static void w(Object obj, long j7, long j8) {
        f15186e.o(obj, j7, j8);
    }

    static void x(Object obj, long j7, Object obj2) {
        f15186e.p(obj, j7, obj2);
    }

    static boolean y(Object obj, long j7) {
        return ((byte) ((f15186e.j(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static boolean z(Object obj, long j7) {
        return ((byte) ((f15186e.j(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }
}
