package com.google.android.gms.internal.measurement;

import android.content.Context;

final class C1963r2 extends N2 {

    private final Context f15294a;

    private final X2<U2<D2>> f15295b;

    C1963r2(Context context, X2<U2<D2>> x22) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f15294a = context;
        this.f15295b = x22;
    }

    @Override
    final Context a() {
        return this.f15294a;
    }

    @Override
    final X2<U2<D2>> b() {
        return this.f15295b;
    }

    public final boolean equals(Object obj) {
        X2<U2<D2>> x22;
        if (obj == this) {
            return true;
        }
        if (obj instanceof N2) {
            N2 n22 = (N2) obj;
            if (this.f15294a.equals(n22.a()) && ((x22 = this.f15295b) != null ? x22.equals(n22.b()) : n22.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15294a.hashCode() ^ 1000003) * 1000003;
        X2<U2<D2>> x22 = this.f15295b;
        return iHashCode ^ (x22 == null ? 0 : x22.hashCode());
    }

    public final String toString() {
        String string = this.f15294a.toString();
        String strValueOf = String.valueOf(this.f15295b);
        StringBuilder sb = new StringBuilder(string.length() + 46 + strValueOf.length());
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
