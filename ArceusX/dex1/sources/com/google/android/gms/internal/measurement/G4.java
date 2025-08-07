package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class G4 {

    private static final G4 f14769c = new G4();

    private final ConcurrentMap<Class<?>, J4<?>> f14771b = new ConcurrentHashMap();

    private final K4 f14770a = new C1950p4();

    private G4() {
    }

    public static G4 a() {
        return f14769c;
    }

    public final <T> J4<T> b(Class<T> cls) {
        C1838b4.f(cls, "messageType");
        J4<T> j4A = (J4) this.f14771b.get(cls);
        if (j4A == null) {
            j4A = this.f14770a.a(cls);
            C1838b4.f(cls, "messageType");
            C1838b4.f(j4A, "schema");
            J4<T> j42 = (J4) this.f14771b.putIfAbsent(cls, j4A);
            if (j42 != null) {
                return j42;
            }
        }
        return j4A;
    }
}
