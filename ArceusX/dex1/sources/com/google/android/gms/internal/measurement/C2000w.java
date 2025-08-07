package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class C2000w implements r {
    @Override
    public final r d() {
        return r.f15282g;
    }

    @Override
    public final String e() {
        return "undefined";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2000w;
    }

    @Override
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override
    public final Boolean g() {
        return Boolean.FALSE;
    }

    @Override
    public final Iterator<r> j() {
        return null;
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
