package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class C1873g implements r {

    private final boolean f15161d;

    public C1873g(Boolean bool) {
        this.f15161d = bool == null ? false : bool.booleanValue();
    }

    @Override
    public final r d() {
        return new C1873g(Boolean.valueOf(this.f15161d));
    }

    @Override
    public final String e() {
        return Boolean.toString(this.f15161d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1873g) && this.f15161d == ((C1873g) obj).f15161d;
    }

    @Override
    public final Double f() {
        return Double.valueOf(true != this.f15161d ? 0.0d : 1.0d);
    }

    @Override
    public final Boolean g() {
        return Boolean.valueOf(this.f15161d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15161d).hashCode();
    }

    @Override
    public final Iterator<r> j() {
        return null;
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        if ("toString".equals(str)) {
            return new C1992v(Boolean.toString(this.f15161d));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f15161d), str));
    }

    public final String toString() {
        return String.valueOf(this.f15161d);
    }
}
