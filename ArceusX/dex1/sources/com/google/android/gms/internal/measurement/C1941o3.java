package com.google.android.gms.internal.measurement;

import g1.kQwt.YGBtcyQ;

final class C1941o3 extends C1964r3 {

    private final int f15220y;

    C1941o3(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC1980t3.o(0, i8, bArr.length);
        this.f15220y = i8;
    }

    @Override
    public final byte d(int i7) {
        int i8 = this.f15220y;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f15296w[i7];
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(YGBtcyQ.LDnt);
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(i8);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override
    final byte e(int i7) {
        return this.f15296w[i7];
    }

    @Override
    public final int g() {
        return this.f15220y;
    }

    @Override
    protected final int t() {
        return 0;
    }
}
