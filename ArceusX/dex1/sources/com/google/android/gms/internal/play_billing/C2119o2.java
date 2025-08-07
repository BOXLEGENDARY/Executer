package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import k0.BAKp.xAQOwX;

class C2119o2 extends AbstractC2113n2 {

    protected final byte[] f16107i;

    C2119o2(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f16107i = bArr;
    }

    @Override
    public byte d(int i7) {
        return this.f16107i[i7];
    }

    @Override
    byte e(int i7) {
        return this.f16107i[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2131q2) || g() != ((AbstractC2131q2) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof C2119o2)) {
            return obj.equals(this);
        }
        C2119o2 c2119o2 = (C2119o2) obj;
        int iN = n();
        int iN2 = c2119o2.n();
        if (iN != 0 && iN2 != 0 && iN != iN2) {
            return false;
        }
        int iG = g();
        if (iG > c2119o2.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > c2119o2.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iG + xAQOwX.fHhlqtRYQmEXmti + c2119o2.g());
        }
        byte[] bArr = this.f16107i;
        byte[] bArr2 = c2119o2.f16107i;
        c2119o2.p();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iG) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override
    public int g() {
        return this.f16107i.length;
    }

    @Override
    protected final int j(int i7, int i8, int i9) {
        return W2.b(i7, this.f16107i, 0, i9);
    }

    @Override
    public final AbstractC2131q2 k(int i7, int i8) {
        int iM = AbstractC2131q2.m(0, i8, g());
        return iM == 0 ? AbstractC2131q2.f16138e : new C2101l2(this.f16107i, 0, iM);
    }

    @Override
    final void l(C2083i2 c2083i2) throws IOException {
        ((C2154u2) c2083i2).C(this.f16107i, 0, g());
    }

    protected int p() {
        return 0;
    }
}
