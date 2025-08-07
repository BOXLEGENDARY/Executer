package O3;

import java.io.OutputStream;

final class L0 extends OutputStream {

    private long f2916d = 0;

    L0() {
    }

    final long b() {
        return this.f2916d;
    }

    @Override
    public final void write(int i7) {
        this.f2916d++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f2916d += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i7, int i8) {
        int length;
        int i9;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i8 >= 0 && (i9 = i7 + i8) <= length && i9 >= 0) {
            this.f2916d += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
