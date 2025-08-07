package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class C1889i {
    public static BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
