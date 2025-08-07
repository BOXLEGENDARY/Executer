package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class C1897j implements r {

    private final Double f15195d;

    public C1897j(Double d7) {
        if (d7 == null) {
            this.f15195d = Double.valueOf(Double.NaN);
        } else {
            this.f15195d = d7;
        }
    }

    @Override
    public final r d() {
        return new C1897j(this.f15195d);
    }

    @Override
    public final String e() throws NumberFormatException {
        if (Double.isNaN(this.f15195d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f15195d.doubleValue())) {
            return this.f15195d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = C1889i.a(BigDecimal.valueOf(this.f15195d.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i7 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i7 >= 0 || i7 <= -7) && (i7 < 0 || i7 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalA.toPlainString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1897j) {
            return this.f15195d.equals(((C1897j) obj).f15195d);
        }
        return false;
    }

    @Override
    public final Double f() {
        return this.f15195d;
    }

    @Override
    public final Boolean g() {
        boolean z7 = false;
        if (!Double.isNaN(this.f15195d.doubleValue()) && this.f15195d.doubleValue() != 0.0d) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    public final int hashCode() {
        return this.f15195d.hashCode();
    }

    @Override
    public final Iterator<r> j() {
        return null;
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        if ("toString".equals(str)) {
            return new C1992v(e());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", e(), str));
    }

    public final String toString() {
        return e();
    }
}
