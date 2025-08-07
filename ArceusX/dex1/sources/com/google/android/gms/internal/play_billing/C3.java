package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class C3 {

    private static final C3 f15780c = new C3();

    public static final int f15781d = 0;

    private final ConcurrentMap f15783b = new ConcurrentHashMap();

    private final G3 f15782a = new C2108m3();

    private C3() {
    }

    public static C3 a() {
        return f15780c;
    }

    public final F3 b(Class cls) {
        W2.c(cls, "messageType");
        F3 f3A = (F3) this.f15783b.get(cls);
        if (f3A == null) {
            f3A = this.f15782a.a(cls);
            W2.c(cls, "messageType");
            F3 f32 = (F3) this.f15783b.putIfAbsent(cls, f3A);
            if (f32 != null) {
                return f32;
            }
        }
        return f3A;
    }
}
