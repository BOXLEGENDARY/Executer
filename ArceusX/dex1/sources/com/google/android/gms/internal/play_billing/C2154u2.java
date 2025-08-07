package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

final class C2154u2 extends AbstractC2172x2 {

    private final byte[] f16152d;

    private final int f16153e;

    private int f16154f;

    C2154u2(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f16152d = bArr;
        this.f16154f = 0;
        this.f16153e = i8;
    }

    public final void C(byte[] bArr, int i7, int i8) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f16152d, this.f16154f, i8);
            this.f16154f += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new C2160v2(this.f16154f, this.f16153e, i8, e7);
        }
    }

    public final void D(String str) throws IOException {
        int i7 = this.f16154f;
        try {
            int iB = AbstractC2172x2.B(str.length() * 3);
            int iB2 = AbstractC2172x2.B(str.length());
            if (iB2 != iB) {
                v(C2049c4.c(str));
                byte[] bArr = this.f16152d;
                int i8 = this.f16154f;
                this.f16154f = C2049c4.b(str, bArr, i8, this.f16153e - i8);
                return;
            }
            int i9 = i7 + iB2;
            this.f16154f = i9;
            int iB3 = C2049c4.b(str, this.f16152d, i9, this.f16153e - i9);
            this.f16154f = i7;
            v((iB3 - i7) - iB2);
            this.f16154f = iB3;
        } catch (C2043b4 e7) {
            this.f16154f = i7;
            c(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new C2160v2(e8);
        }
    }

    @Override
    public final int e() {
        return this.f16153e - this.f16154f;
    }

    @Override
    public final void f(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.f16154f;
        try {
            int i8 = i7 + 1;
            try {
                this.f16152d[i7] = b2;
                this.f16154f = i8;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i7 = i8;
                throw new C2160v2(i7, this.f16153e, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    @Override
    public final void g(int i7, boolean z7) throws IOException {
        v(i7 << 3);
        f(z7 ? (byte) 1 : (byte) 0);
    }

    @Override
    public final void h(int i7, AbstractC2131q2 abstractC2131q2) throws IOException {
        v((i7 << 3) | 2);
        v(abstractC2131q2.g());
        abstractC2131q2.l(this);
    }

    @Override
    public final void i(int i7, int i8) throws IOException {
        v((i7 << 3) | 5);
        j(i8);
    }

    @Override
    public final void j(int i7) throws IOException {
        int i8 = this.f16154f;
        try {
            byte[] bArr = this.f16152d;
            bArr[i8] = (byte) (i7 & 255);
            bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
            bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
            this.f16154f = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new C2160v2(i8, this.f16153e, 4, e7);
        }
    }

    @Override
    public final void k(int i7, long j7) throws IOException {
        v((i7 << 3) | 1);
        l(j7);
    }

    @Override
    public final void l(long j7) throws IOException {
        int i7 = this.f16154f;
        try {
            byte[] bArr = this.f16152d;
            bArr[i7] = (byte) (((int) j7) & 255);
            bArr[i7 + 1] = (byte) (((int) (j7 >> 8)) & 255);
            bArr[i7 + 2] = (byte) (((int) (j7 >> 16)) & 255);
            bArr[i7 + 3] = (byte) (((int) (j7 >> 24)) & 255);
            bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
            bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
            bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
            bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
            this.f16154f = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new C2160v2(i7, this.f16153e, 8, e7);
        }
    }

    @Override
    public final void m(int i7, int i8) throws IOException {
        v(i7 << 3);
        n(i8);
    }

    @Override
    public final void n(int i7) throws IOException {
        if (i7 >= 0) {
            v(i7);
        } else {
            x(i7);
        }
    }

    @Override
    public final void o(byte[] bArr, int i7, int i8) throws IOException {
        C(bArr, 0, i8);
    }

    @Override
    final void p(int i7, InterfaceC2155u3 interfaceC2155u3, F3 f32) throws IOException {
        v((i7 << 3) | 2);
        v(((AbstractC2035a2) interfaceC2155u3).b(f32));
        f32.h(interfaceC2155u3, this.f16167a);
    }

    @Override
    public final void q(int i7, InterfaceC2155u3 interfaceC2155u3) throws IOException {
        v(11);
        u(2, i7);
        v(26);
        v(interfaceC2155u3.h());
        interfaceC2155u3.a(this);
        v(12);
    }

    @Override
    public final void r(int i7, AbstractC2131q2 abstractC2131q2) throws IOException {
        v(11);
        u(2, i7);
        h(3, abstractC2131q2);
        v(12);
    }

    @Override
    public final void s(int i7, String str) throws IOException {
        v((i7 << 3) | 2);
        D(str);
    }

    @Override
    public final void t(int i7, int i8) throws IOException {
        v((i7 << 3) | i8);
    }

    @Override
    public final void u(int i7, int i8) throws IOException {
        v(i7 << 3);
        v(i8);
    }

    @Override
    public final void v(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.f16152d;
                int i8 = this.f16154f;
                this.f16154f = i8 + 1;
                bArr[i8] = (byte) ((i7 | 128) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new C2160v2(this.f16154f, this.f16153e, 1, e7);
            }
        }
        byte[] bArr2 = this.f16152d;
        int i9 = this.f16154f;
        this.f16154f = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override
    public final void w(int i7, long j7) throws IOException {
        v(i7 << 3);
        x(j7);
    }

    @Override
    public final void x(long j7) throws IOException {
        if (!AbstractC2172x2.f16166c || this.f16153e - this.f16154f < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f16152d;
                    int i7 = this.f16154f;
                    this.f16154f = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) | 128) & 255);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new C2160v2(this.f16154f, this.f16153e, 1, e7);
                }
            }
            byte[] bArr2 = this.f16152d;
            int i8 = this.f16154f;
            this.f16154f = i8 + 1;
            bArr2[i8] = (byte) j7;
            return;
        }
        while (true) {
            int i9 = (int) j7;
            if ((j7 & (-128)) == 0) {
                byte[] bArr3 = this.f16152d;
                int i10 = this.f16154f;
                this.f16154f = i10 + 1;
                Z3.s(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.f16152d;
            int i11 = this.f16154f;
            this.f16154f = i11 + 1;
            Z3.s(bArr4, i11, (byte) ((i9 | 128) & 255));
            j7 >>>= 7;
        }
    }
}
