package com.google.android.gms.internal.measurement;

final class F3 {

    private final Object f14719a;

    private final int f14720b;

    F3(Object obj, int i7) {
        this.f14719a = obj;
        this.f14720b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F3)) {
            return false;
        }
        F3 f32 = (F3) obj;
        return this.f14719a == f32.f14719a && this.f14720b == f32.f14720b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14719a) * 65535) + this.f14720b;
    }
}
