package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class U2<T> implements Serializable {
    U2() {
    }

    public static <T> U2<T> c() {
        return S2.f15024d;
    }

    public static <T> U2<T> d(T t7) {
        return new W2(t7);
    }

    public abstract T a();

    public abstract boolean b();
}
