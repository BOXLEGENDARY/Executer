package com.google.android.gms.internal.measurement;

import java.io.Serializable;

final class Y2<T> implements Serializable, X2 {

    final X2<T> f15075d;

    volatile transient boolean f15076e;

    transient T f15077i;

    Y2(X2<T> x22) {
        x22.getClass();
        this.f15075d = x22;
    }

    public final String toString() {
        Object string;
        if (this.f15076e) {
            String strValueOf = String.valueOf(this.f15077i);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f15075d;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public final T zza() {
        if (!this.f15076e) {
            synchronized (this) {
                try {
                    if (!this.f15076e) {
                        T tZza = this.f15075d.zza();
                        this.f15077i = tZza;
                        this.f15076e = true;
                        return tZza;
                    }
                } finally {
                }
            }
        }
        return this.f15077i;
    }
}
