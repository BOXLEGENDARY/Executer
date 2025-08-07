package com.google.android.gms.internal.measurement;

import z3.AdxZ.bpTQi;

final class Z2<T> implements X2<T> {

    volatile X2<T> f15079d;

    volatile boolean f15080e;

    T f15081i;

    Z2(X2<T> x22) {
        x22.getClass();
        this.f15079d = x22;
    }

    public final String toString() {
        Object string = this.f15079d;
        if (string == null) {
            String strValueOf = String.valueOf(this.f15081i);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(bpTQi.RqunTcRGARGsD);
            string = sb.toString();
        }
        String string2 = string.toString();
        StringBuilder sb2 = new StringBuilder(string2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public final T zza() {
        if (!this.f15080e) {
            synchronized (this) {
                try {
                    if (!this.f15080e) {
                        X2<T> x22 = this.f15079d;
                        x22.getClass();
                        T tZza = x22.zza();
                        this.f15081i = tZza;
                        this.f15080e = true;
                        this.f15079d = null;
                        return tZza;
                    }
                } finally {
                }
            }
        }
        return this.f15081i;
    }
}
