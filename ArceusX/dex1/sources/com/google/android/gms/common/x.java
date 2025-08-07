package com.google.android.gms.common;

import java.util.Arrays;

final class x extends w {

    private final byte[] f14401e;

    x(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f14401e = bArr;
    }

    @Override
    final byte[] h3() {
        return this.f14401e;
    }
}
