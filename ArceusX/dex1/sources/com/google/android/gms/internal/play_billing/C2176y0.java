package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

public final class C2176y0 extends C2182z0 implements Serializable {

    private static final C2176y0 f16187i = new C2176y0(T.f15935e, S.f15926e);

    public static final int f16188v = 0;

    final U f16189d;

    final U f16190e;

    private C2176y0(U u7, U u8) {
        this.f16189d = u7;
        this.f16190e = u8;
        if (u7.compareTo(u8) > 0 || u7 == S.f15926e || u8 == T.f15935e) {
            throw new IllegalArgumentException("Invalid range: ".concat(e(u7, u8)));
        }
    }

    public static C2176y0 a() {
        return f16187i;
    }

    private static String e(U u7, U u8) {
        StringBuilder sb = new StringBuilder(16);
        u7.e(sb);
        sb.append("..");
        u8.f(sb);
        return sb.toString();
    }

    public final C2176y0 b(C2176y0 c2176y0) {
        int iCompareTo = this.f16189d.compareTo(c2176y0.f16189d);
        int iCompareTo2 = this.f16190e.compareTo(c2176y0.f16190e);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return c2176y0;
        }
        U u7 = iCompareTo >= 0 ? this.f16189d : c2176y0.f16189d;
        U u8 = iCompareTo2 <= 0 ? this.f16190e : c2176y0.f16190e;
        C2145t.d(u7.compareTo(u8) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c2176y0);
        return new C2176y0(u7, u8);
    }

    public final C2176y0 c(C2176y0 c2176y0) {
        int iCompareTo = this.f16189d.compareTo(c2176y0.f16189d);
        int iCompareTo2 = this.f16190e.compareTo(c2176y0.f16190e);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return c2176y0;
        }
        U u7 = iCompareTo <= 0 ? this.f16189d : c2176y0.f16189d;
        if (iCompareTo2 >= 0) {
            c2176y0 = this;
        }
        return new C2176y0(u7, c2176y0.f16190e);
    }

    public final boolean d() {
        return this.f16189d.equals(this.f16190e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2176y0) {
            C2176y0 c2176y0 = (C2176y0) obj;
            if (this.f16189d.equals(c2176y0.f16189d) && this.f16190e.equals(c2176y0.f16190e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16189d.hashCode() * 31) + this.f16190e.hashCode();
    }

    public final String toString() {
        return e(this.f16189d, this.f16190e);
    }
}
