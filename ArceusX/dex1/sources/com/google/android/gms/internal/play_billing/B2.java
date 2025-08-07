package com.google.android.gms.internal.play_billing;

final class B2 {

    private final Object f15773a;

    private final int f15774b;

    B2(Object obj, int i7) {
        this.f15773a = obj;
        this.f15774b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B2)) {
            return false;
        }
        B2 b2 = (B2) obj;
        return this.f15773a == b2.f15773a && this.f15774b == b2.f15774b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15773a) * 65535) + this.f15774b;
    }
}
