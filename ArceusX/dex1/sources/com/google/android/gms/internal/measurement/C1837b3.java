package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class C1837b3 {
    public static <T> X2<T> a(X2<T> x22) {
        return ((x22 instanceof Z2) || (x22 instanceof Y2)) ? x22 : x22 instanceof Serializable ? new Y2(x22) : new Z2(x22);
    }

    public static <T> X2<T> b(T t7) {
        return new C1829a3(t7);
    }
}
