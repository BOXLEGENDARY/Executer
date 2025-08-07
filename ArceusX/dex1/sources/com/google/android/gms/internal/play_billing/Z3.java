package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class Z3 {

    private static final Unsafe f15979a;

    private static final Class f15980b;

    private static final boolean f15981c;

    private static final Y3 f15982d;

    private static final boolean f15983e;

    private static final boolean f15984f;

    static final long f15985g;

    static final boolean f15986h;

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.Z3.<clinit>():void");
    }

    private Z3() {
    }

    static boolean A(Class cls) {
        int i7 = C2053d2.f16004a;
        try {
            Class cls2 = f15980b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j7) {
        return f15982d.g(obj, j7);
    }

    static boolean C() {
        return f15984f;
    }

    static boolean D() {
        return f15983e;
    }

    private static int E(Class cls) {
        if (f15984f) {
            return f15982d.f15962a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f15984f) {
            return f15982d.f15962a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i7 = C2053d2.f16004a;
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

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j7, byte b2) {
        Y3 y32 = f15982d;
        long j8 = (-4) & j7;
        int i7 = y32.f15962a.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        y32.f15962a.putInt(obj, j8, ((255 & b2) << i8) | (i7 & (~(255 << i8))));
    }

    public static void e(Object obj, long j7, byte b2) {
        Y3 y32 = f15982d;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        y32.f15962a.putInt(obj, j8, ((255 & b2) << i7) | (y32.f15962a.getInt(obj, j8) & (~(255 << i7))));
    }

    static double f(Object obj, long j7) {
        return f15982d.a(obj, j7);
    }

    static float g(Object obj, long j7) {
        return f15982d.b(obj, j7);
    }

    static int h(Object obj, long j7) {
        return f15982d.f15962a.getInt(obj, j7);
    }

    static long i(Object obj, long j7) {
        return f15982d.f15962a.getLong(obj, j7);
    }

    static Object j(Class cls) {
        try {
            return f15979a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    static Object k(Object obj, long j7) {
        return f15982d.f15962a.getObject(obj, j7);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new V3());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void m(Throwable th) {
        Logger.getLogger(Z3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j7, boolean z7) {
        f15982d.c(obj, j7, z7);
    }

    static void s(byte[] bArr, long j7, byte b2) {
        f15982d.d(bArr, f15985g + j7, b2);
    }

    static void t(Object obj, long j7, double d7) {
        f15982d.e(obj, j7, d7);
    }

    static void u(Object obj, long j7, float f7) {
        f15982d.f(obj, j7, f7);
    }

    static void v(Object obj, long j7, int i7) {
        f15982d.f15962a.putInt(obj, j7, i7);
    }

    static void w(Object obj, long j7, long j8) {
        f15982d.f15962a.putLong(obj, j7, j8);
    }

    static void x(Object obj, long j7, Object obj2) {
        f15982d.f15962a.putObject(obj, j7, obj2);
    }

    static boolean y(Object obj, long j7) {
        return ((byte) ((f15982d.f15962a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static boolean z(Object obj, long j7) {
        return ((byte) ((f15982d.f15962a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }
}
