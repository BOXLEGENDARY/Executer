package com.google.android.gms.internal.measurement;

import java.io.IOException;
import t2.Dbl.hgESaf;

final class C2028z3 extends B3 {

    private final byte[] f15384d;

    private final int f15385e;

    private int f15386f;

    C2028z3(byte[] bArr, int i7, int i8) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f15384d = bArr;
        this.f15386f = 0;
        this.f15385e = i8;
    }

    public final void E(byte[] bArr, int i7, int i8) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f15384d, this.f15386f, i8);
            this.f15386f += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new A3(String.format(hgESaf.oMJ, Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), Integer.valueOf(i8)), e7);
        }
    }

    public final void F(String str) throws IOException {
        int i7 = this.f15386f;
        try {
            int iA = B3.a(str.length() * 3);
            int iA2 = B3.a(str.length());
            if (iA2 != iA) {
                u(C1935n5.c(str));
                byte[] bArr = this.f15384d;
                int i8 = this.f15386f;
                this.f15386f = C1935n5.b(str, bArr, i8, this.f15385e - i8);
                return;
            }
            int i9 = i7 + iA2;
            this.f15386f = i9;
            int iB = C1935n5.b(str, this.f15384d, i9, this.f15385e - i9);
            this.f15386f = i7;
            u((iB - i7) - iA2);
            this.f15386f = iB;
        } catch (C1927m5 e7) {
            this.f15386f = i7;
            e(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new A3(e8);
        }
    }

    @Override
    public final int g() {
        return this.f15385e - this.f15386f;
    }

    @Override
    public final void h(byte b2) throws IOException {
        try {
            byte[] bArr = this.f15384d;
            int i7 = this.f15386f;
            this.f15386f = i7 + 1;
            bArr[i7] = b2;
        } catch (IndexOutOfBoundsException e7) {
            throw new A3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), 1), e7);
        }
    }

    @Override
    public final void i(int i7, boolean z7) throws IOException {
        u(i7 << 3);
        h(z7 ? (byte) 1 : (byte) 0);
    }

    @Override
    public final void j(int i7, AbstractC1980t3 abstractC1980t3) throws IOException {
        u((i7 << 3) | 2);
        u(abstractC1980t3.g());
        abstractC1980t3.m(this);
    }

    @Override
    public final void k(int i7, int i8) throws IOException {
        u((i7 << 3) | 5);
        l(i8);
    }

    @Override
    public final void l(int i7) throws IOException {
        try {
            byte[] bArr = this.f15384d;
            int i8 = this.f15386f;
            int i9 = i8 + 1;
            this.f15386f = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f15386f = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f15386f = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f15386f = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new A3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), 1), e7);
        }
    }

    @Override
    public final void m(int i7, long j7) throws IOException {
        u((i7 << 3) | 1);
        n(j7);
    }

    @Override
    public final void n(long j7) throws IOException {
        try {
            byte[] bArr = this.f15384d;
            int i7 = this.f15386f;
            int i8 = i7 + 1;
            this.f15386f = i8;
            bArr[i7] = (byte) (((int) j7) & 255);
            int i9 = i7 + 2;
            this.f15386f = i9;
            bArr[i8] = (byte) (((int) (j7 >> 8)) & 255);
            int i10 = i7 + 3;
            this.f15386f = i10;
            bArr[i9] = (byte) (((int) (j7 >> 16)) & 255);
            int i11 = i7 + 4;
            this.f15386f = i11;
            bArr[i10] = (byte) (((int) (j7 >> 24)) & 255);
            int i12 = i7 + 5;
            this.f15386f = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.f15386f = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.f15386f = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f15386f = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new A3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), 1), e7);
        }
    }

    @Override
    public final void o(int i7, int i8) throws IOException {
        u(i7 << 3);
        p(i8);
    }

    @Override
    public final void p(int i7) throws IOException {
        if (i7 >= 0) {
            u(i7);
        } else {
            w(i7);
        }
    }

    @Override
    public final void q(byte[] bArr, int i7, int i8) throws IOException {
        E(bArr, 0, i8);
    }

    @Override
    public final void r(int i7, String str) throws IOException {
        u((i7 << 3) | 2);
        F(str);
    }

    @Override
    public final void s(int i7, int i8) throws IOException {
        u((i7 << 3) | i8);
    }

    @Override
    public final void t(int i7, int i8) throws IOException {
        u(i7 << 3);
        u(i8);
    }

    @Override
    public final void u(int i7) throws IOException {
        if (B3.f14656c) {
            int i8 = C1869f3.f15154a;
        }
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.f15384d;
                int i9 = this.f15386f;
                this.f15386f = i9 + 1;
                bArr[i9] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new A3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), 1), e7);
            }
        }
        byte[] bArr2 = this.f15384d;
        int i10 = this.f15386f;
        this.f15386f = i10 + 1;
        bArr2[i10] = (byte) i7;
    }

    @Override
    public final void v(int i7, long j7) throws IOException {
        u(i7 << 3);
        w(j7);
    }

    @Override
    public final void w(long j7) throws IOException {
        if (B3.f14656c && this.f15385e - this.f15386f >= 10) {
            while ((j7 & (-128)) != 0) {
                byte[] bArr = this.f15384d;
                int i7 = this.f15386f;
                this.f15386f = i7 + 1;
                C1895i5.s(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            byte[] bArr2 = this.f15384d;
            int i8 = this.f15386f;
            this.f15386f = i8 + 1;
            C1895i5.s(bArr2, i8, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f15384d;
                int i9 = this.f15386f;
                this.f15386f = i9 + 1;
                bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new A3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15386f), Integer.valueOf(this.f15385e), 1), e7);
            }
        }
        byte[] bArr4 = this.f15384d;
        int i10 = this.f15386f;
        this.f15386f = i10 + 1;
        bArr4[i10] = (byte) j7;
    }
}
