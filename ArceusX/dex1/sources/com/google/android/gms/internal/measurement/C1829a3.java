package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

final class C1829a3<T> implements Serializable, X2 {

    final T f15093d;

    C1829a3(T t7) {
        this.f15093d = t7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1829a3)) {
            return false;
        }
        T t7 = this.f15093d;
        T t8 = ((C1829a3) obj).f15093d;
        return t7 == t8 || t7.equals(t8);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15093d});
    }

    public final String toString() {
        String string = this.f15093d.toString();
        StringBuilder sb = new StringBuilder(string.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public final T zza() {
        return this.f15093d;
    }
}
