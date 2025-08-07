package Q3;

import java.io.OutputStream;

final class C0882g extends OutputStream {

    private long f4362d = 0;

    C0882g() {
    }

    final long b() {
        return this.f4362d;
    }

    @Override
    public final void write(int i7) {
        this.f4362d++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f4362d += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i7, int i8) {
        int length;
        int i9;
        if (i7 >= 0 && i7 <= (length = bArr.length) && i8 >= 0 && (i9 = i7 + i8) <= length && i9 >= 0) {
            this.f4362d += i8;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
