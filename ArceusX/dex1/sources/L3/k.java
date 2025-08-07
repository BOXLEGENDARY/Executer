package L3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class k extends FilterInputStream {

    private long f2047d;

    private long f2048e;

    k(InputStream inputStream, long j7) {
        super(inputStream);
        this.f2048e = -1L;
        g.a(inputStream);
        this.f2047d = 1048577L;
    }

    @Override
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f2047d);
    }

    @Override
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f2048e = this.f2047d;
    }

    @Override
    public final int read() throws IOException {
        if (this.f2047d == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.f2047d--;
        }
        return i7;
    }

    @Override
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f2048e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f2047d = this.f2048e;
    }

    @Override
    public final long skip(long j7) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f2047d));
        this.f2047d -= jSkip;
        return jSkip;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        long j7 = this.f2047d;
        if (j7 == 0) {
            return -1;
        }
        int i9 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
        if (i9 != -1) {
            this.f2047d -= i9;
        }
        return i9;
    }
}
