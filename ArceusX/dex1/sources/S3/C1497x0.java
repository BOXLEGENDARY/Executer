package S3;

import java.io.OutputStream;

final class C1497x0 extends OutputStream {

    private long f7291d = 0;

    C1497x0() {
    }

    final long b() {
        return this.f7291d;
    }

    @Override
    public final void write(int i7) {
        this.f7291d++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f7291d += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i7, int i8) {
        int length;
        int i9;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i8 >= 0 && (i9 = i7 + i8) <= length && i9 >= 0) {
            this.f7291d += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
