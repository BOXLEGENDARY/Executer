package okio;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.B;
import okio.C0412j;
import okio.g;
import okio.l;
import okio.o;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LB1/t;", "LB1/o;", "Lokio/g;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "LB1/o$a;", "metadata", "<init>", "(Lokio/g;Lkotlin/jvm/functions/Function0;LB1/o$a;)V", "", "f", "()V", "e", "()Lokio/g;", "close", "d", "LB1/o$a;", "b", "()LB1/o$a;", "", "Z", "isClosed", "i", "Lokio/g;", "v", "Lkotlin/jvm/functions/Function0;", "Lokio/B;", "w", "Lokio/B;", "file", "Lokio/l;", "j", "()Lokio/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t extends o {

    private final o.a metadata;

    private boolean isClosed;

    private g source;

    private Function0<? extends File> cacheDirectoryFactory;

    private B file;

    public t(@NotNull g gVar, @NotNull Function0<? extends File> function0, o.a aVar) {
        super(null);
        this.metadata = aVar;
        this.source = gVar;
        this.cacheDirectoryFactory = function0;
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
            B b = this.file;
            if (b != null) {
                j().h(b);
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
        l lVarJ = j();
        B b = this.file;
        Intrinsics.d(b);
        g gVarD = w.d(lVarJ.q(b));
        this.source = gVarD;
        return gVarD;
    }

    @NotNull
    public l j() {
        return l.b;
    }
}
