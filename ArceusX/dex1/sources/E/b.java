package E;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

class b extends FilterOutputStream {

    final OutputStream f1006d;

    private ByteOrder f1007e;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1006d = outputStream;
        this.f1007e = byteOrder;
    }

    public void b(ByteOrder byteOrder) {
        this.f1007e = byteOrder;
    }

    public void e(int i7) throws IOException {
        this.f1006d.write(i7);
    }

    public void f(int i7) throws IOException {
        ByteOrder byteOrder = this.f1007e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1006d.write(i7 & 255);
            this.f1006d.write((i7 >>> 8) & 255);
            this.f1006d.write((i7 >>> 16) & 255);
            this.f1006d.write((i7 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1006d.write((i7 >>> 24) & 255);
            this.f1006d.write((i7 >>> 16) & 255);
            this.f1006d.write((i7 >>> 8) & 255);
            this.f1006d.write(i7 & 255);
        }
    }

    public void j(short s7) throws IOException {
        ByteOrder byteOrder = this.f1007e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1006d.write(s7 & 255);
            this.f1006d.write((s7 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1006d.write((s7 >>> 8) & 255);
            this.f1006d.write(s7 & 255);
        }
    }

    public void m(long j7) throws IOException {
        f((int) j7);
    }

    public void u(int i7) throws IOException {
        j((short) i7);
    }

    @Override
    public void write(byte[] bArr) throws IOException {
        this.f1006d.write(bArr);
    }

    @Override
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        this.f1006d.write(bArr, i7, i8);
    }
}
