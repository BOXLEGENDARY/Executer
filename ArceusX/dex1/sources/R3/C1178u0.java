package R3;

import java.io.OutputStream;

final class C1178u0 extends OutputStream {

    private long f5868d = 0;

    C1178u0() {
    }

    final long b() {
        return this.f5868d;
    }

    @Override
    public final void write(int i7) {
        this.f5868d++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f5868d += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i7, int i8) {
        int length;
        int i9;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i8 >= 0 && (i9 = i7 + i8) <= length && i9 >= 0) {
            this.f5868d += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
