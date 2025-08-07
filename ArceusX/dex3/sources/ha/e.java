package ha;

import ha.H;
import ha.a;
import ha.c;
import kotlin.Metadata;
import okio.B;
import okio.h;
import okio.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0003\u001c\u0011\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"LC1/e;", "LC1/a;", "", "maxSize", "Lokio/B;", "directory", "Lokio/l;", "fileSystem", "Lha/H;", "cleanupDispatcher", "<init>", "(JLokio/B;Lokio/l;Lha/H;)V", "", "f", "(Ljava/lang/String;)Ljava/lang/String;", "key", "LC1/a$c;", "b", "(Ljava/lang/String;)LC1/a$c;", "LC1/a$b;", "a", "(Ljava/lang/String;)LC1/a$b;", "J", "e", "()J", "Lokio/B;", "d", "()Lokio/B;", "c", "Lokio/l;", "()Lokio/l;", "LC1/c;", "LC1/c;", "cache", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements a {

    private final long maxSize;

    @NotNull
    private final B directory;

    @NotNull
    private final l fileSystem;

    @NotNull
    private final ha.c cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"LC1/e$b;", "LC1/a$b;", "LC1/c$b;", "LC1/c;", "editor", "<init>", "(LC1/c$b;)V", "LC1/e$c;", "a", "()LC1/e$c;", "", "abort", "()V", "LC1/c$b;", "Lokio/B;", "k", "()Lokio/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b implements a.b {

        @NotNull
        private final c.b editor;

        public b(@NotNull c.b bVar) {
            this.editor = bVar;
        }

        @Override
        public c l() {
            c.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override
        public void abort() {
            this.editor.a();
        }

        @Override
        @NotNull
        public B getData() {
            return this.editor.f(1);
        }

        @Override
        @NotNull
        public B k() {
            return this.editor.f(0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"LC1/e$c;", "LC1/a$c;", "LC1/c$d;", "LC1/c;", "snapshot", "<init>", "(LC1/c$d;)V", "", "close", "()V", "LC1/e$b;", "b", "()LC1/e$b;", "d", "LC1/c$d;", "Lokio/B;", "k", "()Lokio/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c implements a.c {

        @NotNull
        private final c.d snapshot;

        public c(@NotNull c.d dVar) {
            this.snapshot = dVar;
        }

        @Override
        public b i0() {
            c.b bVarB = this.snapshot.b();
            if (bVarB != null) {
                return new b(bVarB);
            }
            return null;
        }

        @Override
        public void close() {
            this.snapshot.close();
        }

        @Override
        @NotNull
        public B getData() {
            return this.snapshot.e(1);
        }

        @Override
        @NotNull
        public B k() {
            return this.snapshot.e(0);
        }
    }

    public e(long j, @NotNull B b3, @NotNull l lVar, @NotNull H h) {
        this.maxSize = j;
        this.directory = b3;
        this.fileSystem = lVar;
        this.cache = new ha.c(getFileSystem(), getDirectory(), h, getMaxSize(), 1, 2);
    }

    private final String f(String str) {
        return h.v.d(str).D().o();
    }

    @Override
    public a.b a(@NotNull String key) {
        c.b bVarI0 = this.cache.I0(f(key));
        if (bVarI0 != null) {
            return new b(bVarI0);
        }
        return null;
    }

    @Override
    public a.c b(@NotNull String key) {
        c.d dVarJ0 = this.cache.J0(f(key));
        if (dVarJ0 != null) {
            return new c(dVarJ0);
        }
        return null;
    }

    @Override
    @NotNull
    public l getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    public B getDirectory() {
        return this.directory;
    }

    public long getMaxSize() {
        return this.maxSize;
    }
}
