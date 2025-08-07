package X4;

import java.io.OutputStream;

final class b extends OutputStream {

    private long f7929d = 0;

    b() {
    }

    long b() {
        return this.f7929d;
    }

    @Override
    public void write(int i7) {
        this.f7929d++;
    }

    @Override
    public void write(byte[] bArr) {
        this.f7929d += bArr.length;
    }

    @Override
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 >= 0 && i7 <= bArr.length && i8 >= 0 && (i9 = i7 + i8) <= bArr.length && i9 >= 0) {
            this.f7929d += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
