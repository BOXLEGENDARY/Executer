package L3;

import java.io.OutputStream;

final class h extends OutputStream {
    h() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i7) {
    }

    @Override
    public final void write(byte[] bArr) {
        g.a(bArr);
    }

    @Override
    public final void write(byte[] bArr, int i7, int i8) {
        g.a(bArr);
    }
}
