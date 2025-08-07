package okio;

import java.io.Closeable;
import kotlin.Metadata;
import okio.B;
import okio.C0412j;
import okio.g;
import okio.l;
import okio.o;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"LB1/n;", "LB1/o;", "Lokio/B;", "file", "Lokio/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "LB1/o$a;", "metadata", "<init>", "(Lokio/B;Lokio/l;Ljava/lang/String;Ljava/io/Closeable;LB1/o$a;)V", "", "f", "()V", "Lokio/g;", "e", "()Lokio/g;", "close", "d", "Lokio/B;", "getFile$coil_base_release", "()Lokio/B;", "Lokio/l;", "m", "()Lokio/l;", "i", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "v", "Ljava/io/Closeable;", "w", "LB1/o$a;", "b", "()LB1/o$a;", "", "y", "Z", "isClosed", "z", "Lokio/g;", "source", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends o {

    @NotNull
    private final B file;

    @NotNull
    private final l fileSystem;

    private final String diskCacheKey;

    private final Closeable closeable;

    private final o.a metadata;

    private boolean isClosed;

    private g source;

    public n(@NotNull B b, @NotNull l lVar, String str, Closeable closeable, o.a aVar) {
        super(null);
        this.file = b;
        this.fileSystem = lVar;
        this.diskCacheKey = str;
        this.closeable = closeable;
        this.metadata = aVar;
    }

    private final void f() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override
    public o.a getMetadata() {
        return this.metadata;
    }

    @Override
    public synchronized void close() {
        try {
            this.isClosed = true;
            g gVar = this.source;
            if (gVar != null) {
                C0412j.d(gVar);
            }
            Closeable closeable = this.closeable;
            if (closeable != null) {
                C0412j.d(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    @NotNull
    public synchronized g e() {
        f();
        g gVar = this.source;
        if (gVar != null) {
            return gVar;
        }
        g gVarD = w.d(getFileSystem().q(this.file));
        this.source = gVarD;
        return gVarD;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    public l getFileSystem() {
        return this.fileSystem;
    }
}
