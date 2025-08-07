package com.google.android.gms.internal.measurement;

final class W2<T> extends U2<T> {

    private final T f15067d;

    W2(T t7) {
        this.f15067d = t7;
    }

    @Override
    public final T a() {
        return this.f15067d;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W2) {
            return this.f15067d.equals(((W2) obj).f15067d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15067d.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f15067d.toString();
        StringBuilder sb = new StringBuilder(string.length() + 13);
        sb.append("Optional.of(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
