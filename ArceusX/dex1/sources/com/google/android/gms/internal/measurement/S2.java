package com.google.android.gms.internal.measurement;

final class S2<T> extends U2<T> {

    static final S2<Object> f15024d = new S2<>();

    private S2() {
    }

    @Override
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
