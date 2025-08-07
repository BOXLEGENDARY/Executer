package com.google.android.gms.internal.play_billing;

import androidx.room.kU.HguUe;

final class C2101l2 extends C2119o2 {

    private final int f16084v;

    C2101l2(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC2131q2.m(0, i8, bArr.length);
        this.f16084v = i8;
    }

    @Override
    public final byte d(int i7) {
        int i8 = this.f16084v;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f16107i[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException(HguUe.AJAQQTJhm + i7 + ", " + i8);
    }

    @Override
    final byte e(int i7) {
        return this.f16107i[i7];
    }

    @Override
    public final int g() {
        return this.f16084v;
    }

    @Override
    protected final int p() {
        return 0;
    }
}
