package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LB1/j;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "", "bytesRead", "b", "(I)I", "read", "()I", "", "([B)I", "off", "len", "([BII)I", "", "n", "skip", "(J)J", "available", "", "close", "()V", "d", "Ljava/io/InputStream;", "e", "I", "availableBytes", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class j extends InputStream {

    @NotNull
    private final InputStream delegate;

    private int availableBytes = 1073741824;

    public j(@NotNull InputStream inputStream) {
        this.delegate = inputStream;
    }

    private final int b(int bytesRead) {
        if (bytesRead == -1) {
            this.availableBytes = 0;
        }
        return bytesRead;
    }

    @Override
    public int available() {
        return this.availableBytes;
    }

    @Override
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override
    public int read() {
        return b(this.delegate.read());
    }

    @Override
    public long skip(long n) {
        return this.delegate.skip(n);
    }

    @Override
    public int read(@NotNull byte[] b) {
        return b(this.delegate.read(b));
    }

    @Override
    public int read(@NotNull byte[] b, int off, int len) {
        return b(this.delegate.read(b, off, len));
    }
}
