package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class C1992v implements Iterable<r>, r {

    private final String f15344d;

    public C1992v(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f15344d = str;
    }

    @Override
    public final r d() {
        return new C1992v(this.f15344d);
    }

    @Override
    public final String e() {
        return this.f15344d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1992v) {
            return this.f15344d.equals(((C1992v) obj).f15344d);
        }
        return false;
    }

    @Override
    public final Double f() {
        if (this.f15344d.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f15344d);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override
    public final Boolean g() {
        return Boolean.valueOf(!this.f15344d.isEmpty());
    }

    public final int hashCode() {
        return this.f15344d.hashCode();
    }

    @Override
    public final Iterator<r> iterator() {
        return new C1984u(this);
    }

    @Override
    public final Iterator<r> j() {
        return new C1976t(this);
    }

    @Override
    public final com.google.android.gms.internal.measurement.r l(java.lang.String r22, com.google.android.gms.internal.measurement.T1 r23, java.util.List<com.google.android.gms.internal.measurement.r> r24) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1992v.l(java.lang.String, com.google.android.gms.internal.measurement.T1, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    public final String toString() {
        String str = this.f15344d;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
