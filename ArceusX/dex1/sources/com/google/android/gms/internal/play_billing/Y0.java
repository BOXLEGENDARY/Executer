package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
import ya.HnSi.PLHvHoayk;

final class Y0 extends P0 {

    static final Unsafe f15956a;

    static final long f15957b;

    static final long f15958c;

    static final long f15959d;

    static final long f15960e;

    static final long f15961f;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override
        public final Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f15958c = unsafe.objectFieldOffset(AbstractC2034a1.class.getDeclaredField("i"));
                f15957b = unsafe.objectFieldOffset(AbstractC2034a1.class.getDeclaredField("e"));
                f15959d = unsafe.objectFieldOffset(AbstractC2034a1.class.getDeclaredField(PLHvHoayk.KmBrO));
                f15960e = unsafe.objectFieldOffset(Z0.class.getDeclaredField("a"));
                f15961f = unsafe.objectFieldOffset(Z0.class.getDeclaredField("b"));
                f15956a = unsafe;
            } catch (NoSuchFieldException e7) {
                throw new RuntimeException(e7);
            }
        } catch (PrivilegedActionException e8) {
            throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
        }
    }

    Y0(C2064f1 c2064f1) {
        super(null);
    }

    @Override
    final S0 a(AbstractC2034a1 abstractC2034a1, S0 s02) {
        S0 s03;
        do {
            s03 = abstractC2034a1.f15992e;
            if (s02 == s03) {
                break;
            }
        } while (!e(abstractC2034a1, s03, s02));
        return s03;
    }

    @Override
    final Z0 b(AbstractC2034a1 abstractC2034a1, Z0 z02) {
        Z0 z03;
        do {
            z03 = abstractC2034a1.f15993i;
            if (z02 == z03) {
                break;
            }
        } while (!g(abstractC2034a1, z03, z02));
        return z03;
    }

    @Override
    final void c(Z0 z02, Z0 z03) {
        f15956a.putObject(z02, f15961f, z03);
    }

    @Override
    final void d(Z0 z02, Thread thread) {
        f15956a.putObject(z02, f15960e, thread);
    }

    @Override
    final boolean e(AbstractC2034a1 abstractC2034a1, S0 s02, S0 s03) {
        return C2058e1.a(f15956a, abstractC2034a1, f15957b, s02, s03);
    }

    @Override
    final boolean f(AbstractC2034a1 abstractC2034a1, Object obj, Object obj2) {
        return C2058e1.a(f15956a, abstractC2034a1, f15959d, obj, obj2);
    }

    @Override
    final boolean g(AbstractC2034a1 abstractC2034a1, Z0 z02, Z0 z03) {
        return C2058e1.a(f15956a, abstractC2034a1, f15958c, z02, z03);
    }
}
