package ha;

import P9.a;
import P9.p;
import ha.H;
import ha.M;
import ha.N;
import ha.V0;
import ha.g;
import ha.z0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.B;
import okio.C0407e;
import okio.I;
import okio.f;
import okio.l;
import okio.m;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\b\b*\u0001]\b\u0000\u0018\u0000 `2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u00048abcB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010!\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001dR\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u001f2\n\u0010&\u001a\u00060%R\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0013J\u001e\u00102\u001a\b\u0018\u000101R\u00020\u00002\u0006\u0010.\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109R$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u00060%R\u00020\u00000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010;R\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010=R\u0018\u0010S\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Z\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010UR\u0016\u0010[\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010UR\u0016\u0010\\\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010UR\u0014\u0010\u0005\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006d"}, d2 = {"LC1/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Ljava/io/Flushable;", "Lokio/l;", "fileSystem", "Lokio/B;", "directory", "Lha/H;", "cleanupDispatcher", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lokio/l;Lokio/B;Lha/H;JII)V", "", "b1", "()V", "Lokio/f;", "Q0", "()Lokio/f;", "", "line", "f1", "(Ljava/lang/String;)V", "Z0", "s1", "LC1/c$b;", "editor", "", "success", "t0", "(LC1/c$b;Z)V", "M0", "()Z", "LC1/c$c;", "entry", "i1", "(LC1/c$c;)Z", "n0", "o1", "k1", "H0", "P0", "key", "p1", "L0", "LC1/c$d;", "J0", "(Ljava/lang/String;)LC1/c$d;", "I0", "(Ljava/lang/String;)LC1/c$b;", "close", "flush", "d", "Lokio/B;", "e", "J", "i", "I", "v", "w", "journalFile", "y", "journalFileTmp", "z", "journalFileBackup", "Ljava/util/LinkedHashMap;", "A", "Ljava/util/LinkedHashMap;", "lruEntries", "Lha/L;", "B", "Lha/L;", "cleanupScope", "C", "size", "D", "operationsSinceRewrite", "E", "Lokio/f;", "journalWriter", "F", "Z", "hasJournalErrors", "G", "initialized", "H", "closed", "mostRecentTrimFailed", "mostRecentRebuildFailed", "C1/c$e", "K", "LC1/c$e;", "L", "b", "c", "a", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements Closeable, Flushable {

    @NotNull
    private static final Regex M = new Regex("[a-z0-9_-]{1,120}");

    @NotNull
    private final LinkedHashMap<String, C0010c> lruEntries;

    @NotNull
    private final ha.L cleanupScope;

    private long size;

    private int operationsSinceRewrite;

    private f journalWriter;

    private boolean hasJournalErrors;

    private boolean initialized;

    private boolean closed;

    private boolean mostRecentTrimFailed;

    private boolean mostRecentRebuildFailed;

    @NotNull
    private final e fileSystem;

    @NotNull
    private final B directory;

    private final long maxSize;

    private final int appVersion;

    private final int valueCount;

    @NotNull
    private final B journalFile;

    @NotNull
    private final B journalFileTmp;

    @NotNull
    private final B journalFileBackup;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LC1/c$b;", "", "LC1/c$c;", "LC1/c;", "entry", "<init>", "(LC1/c;LC1/c$c;)V", "", "success", "", "d", "(Z)V", "", "index", "Lokio/B;", "f", "(I)Lokio/B;", "e", "()V", "b", "LC1/c$d;", "c", "()LC1/c$d;", "a", "LC1/c$c;", "g", "()LC1/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b {

        @NotNull
        private final C0010c entry;

        private boolean closed;

        @NotNull
        private final boolean[] written;

        public b(@NotNull C0010c c0010c) {
            this.entry = c0010c;
            this.written = new boolean[c.this.valueCount];
        }

        private final void d(boolean success) {
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.b(this.entry.getCurrentEditor(), this)) {
                        cVar.t0(this, success);
                    }
                    this.closed = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarJ0;
            c cVar = c.this;
            synchronized (cVar) {
                b();
                dVarJ0 = cVar.J0(this.entry.getKey());
            }
            return dVarJ0;
        }

        public final void e() {
            if (Intrinsics.b(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        @NotNull
        public final B f(int index) {
            B b;
            c cVar = c.this;
            synchronized (cVar) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                B b3 = this.entry.c().get(index);
                C0407e.a(cVar.fileSystem, b3);
                b = b3;
            }
            return b;
        }

        @NotNull
        public final C0010c getEntry() {
            return this.entry;
        }

        @NotNull
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001f\u0010!R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R(\u00104\u001a\b\u0018\u00010/R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00100\u001a\u0004\b\u0018\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00106\u001a\u0004\b+\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"LC1/c$c;", "", "", "key", "<init>", "(LC1/c;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)V", "Lokio/f;", "writer", "o", "(Lokio/f;)V", "LC1/c$d;", "LC1/c;", "n", "()LC1/c$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lokio/B;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "LC1/c$b;", "LC1/c$b;", "()LC1/c$b;", "i", "(LC1/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class C0010c {

        @NotNull
        private final String key;

        @NotNull
        private final long[] lengths;

        @NotNull
        private final ArrayList<B> cleanFiles;

        @NotNull
        private final ArrayList<B> dirtyFiles;

        private boolean readable;

        private boolean zombie;

        private b currentEditor;

        private int lockingSnapshotCount;

        public C0010c(@NotNull String str) {
            this.key = str;
            this.lengths = new long[c.this.valueCount];
            this.cleanFiles = new ArrayList<>(c.this.valueCount);
            this.dirtyFiles = new ArrayList<>(c.this.valueCount);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = c.this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.cleanFiles.add(c.this.directory.m(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(c.this.directory.m(sb.toString()));
                sb.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<B> a() {
            return this.cleanFiles;
        }

        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final ArrayList<B> c() {
            return this.dirtyFiles;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final long[] getLengths() {
            return this.lengths;
        }

        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        public final boolean getReadable() {
            return this.readable;
        }

        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(b bVar) {
            this.currentEditor = bVar;
        }

        public final void j(@NotNull List<String> strings) throws IOException {
            if (strings.size() != c.this.valueCount) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(strings.get(i));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void k(int i) {
            this.lockingSnapshotCount = i;
        }

        public final void l(boolean z) {
            this.readable = z;
        }

        public final void m(boolean z) {
            this.zombie = z;
        }

        public final d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<B> arrayList = this.cleanFiles;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!cVar.fileSystem.j(arrayList.get(i))) {
                    try {
                        cVar.i1(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return c.this.new d(this);
        }

        public final void o(@NotNull f writer) {
            for (long j : this.lengths) {
                writer.R(32).q1(j);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"LC1/c$d;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LC1/c$c;", "LC1/c;", "entry", "<init>", "(LC1/c;LC1/c$c;)V", "", "index", "Lokio/B;", "e", "(I)Lokio/B;", "", "close", "()V", "LC1/c$b;", "b", "()LC1/c$b;", "d", "LC1/c$c;", "getEntry", "()LC1/c$c;", "", "Z", "closed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class d implements Closeable {

        @NotNull
        private final C0010c entry;

        private boolean closed;

        public d(@NotNull C0010c c0010c) {
            this.entry = c0010c;
        }

        public final b b() {
            b bVarI0;
            c cVar = c.this;
            synchronized (cVar) {
                close();
                bVarI0 = cVar.I0(this.entry.getKey());
            }
            return bVarI0;
        }

        @Override
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    this.entry.k(r1.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        cVar.i1(this.entry);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @NotNull
        public final B e(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.a().get(index);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"C1/c$e", "Lokio/m;", "Lokio/B;", "file", "", "mustCreate", "Lokio/I;", "p", "(Lokio/B;Z)Lokio/I;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends m {
        e(l lVar) {
            super(lVar);
        }

        public I p(B file, boolean mustCreate) {
            B bK = file.k();
            if (bK != null) {
                d(bK);
            }
            return super.p(file, mustCreate);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new L(continuation);
        }

        public final Object invoke(ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            c cVar = c.this;
            synchronized (cVar) {
                if (!cVar.initialized || cVar.closed) {
                    return Unit.a;
                }
                try {
                    cVar.o1();
                } catch (IOException unused) {
                    cVar.mostRecentTrimFailed = true;
                }
                try {
                    if (cVar.M0()) {
                        cVar.s1();
                    }
                } catch (IOException unused2) {
                    cVar.mostRecentRebuildFailed = true;
                    cVar.journalWriter = w.c(w.b());
                }
                return Unit.a;
            }
        }
    }

    public c(@NotNull l lVar, @NotNull B b3, @NotNull H h, long j, int i, int i2) {
        this.directory = b3;
        this.maxSize = j;
        this.appVersion = i;
        this.valueCount = i2;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = b3.m("journal");
        this.journalFileTmp = b3.m("journal.tmp");
        this.journalFileBackup = b3.m("journal.bkp");
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupScope = M.a(V0.b((z0) null, 1, (Object) null).K(h.A1(1)));
        this.fileSystem = new e(lVar);
    }

    private final void H0() throws IOException {
        close();
        C0407e.b(this.fileSystem, this.directory);
    }

    public final boolean M0() {
        return this.operationsSinceRewrite >= 2000;
    }

    private final void P0() {
        g.d(this.cleanupScope, (CoroutineContext) null, (N) null, new L(null), 3, (Object) null);
    }

    private final f Q0() {
        return w.c(new ha.d(this.fileSystem.a(this.journalFile), new Function1() {
            public final Object invoke(Object obj) {
                return c.S0(this.d, (IOException) obj);
            }
        }));
    }

    public static final Unit S0(c cVar, IOException iOException) {
        cVar.hasJournalErrors = true;
        return Unit.a;
    }

    private final void Z0() {
        Iterator<C0010c> it = this.lruEntries.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C0010c next = it.next();
            int i = 0;
            if (next.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    j += next.getLengths()[i];
                    i++;
                }
            } else {
                next.i(null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.h(next.a().get(i));
                    this.fileSystem.h(next.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.size = j;
    }

    private final void b1() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ha.c.b1():void");
    }

    private final void f1(String line) throws IOException {
        String strSubstring;
        int iV = StringsKt.V(line, ' ', 0, false, 6, (Object) null);
        if (iV == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i = iV + 1;
        int iV2 = StringsKt.V(line, ' ', i, false, 4, (Object) null);
        if (iV2 == -1) {
            strSubstring = line.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iV == 6 && StringsKt.F(line, "REMOVE", false, 2, (Object) null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i, iV2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        LinkedHashMap<String, C0010c> linkedHashMap = this.lruEntries;
        C0010c c0010c = linkedHashMap.get(strSubstring);
        if (c0010c == null) {
            c0010c = new C0010c(strSubstring);
            linkedHashMap.put(strSubstring, c0010c);
        }
        C0010c c0010c2 = c0010c;
        if (iV2 != -1 && iV == 5 && StringsKt.F(line, "CLEAN", false, 2, (Object) null)) {
            String strSubstring2 = line.substring(iV2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List<String> listW0 = StringsKt.w0(strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            c0010c2.l(true);
            c0010c2.i(null);
            c0010c2.j(listW0);
            return;
        }
        if (iV2 == -1 && iV == 5 && StringsKt.F(line, "DIRTY", false, 2, (Object) null)) {
            c0010c2.i(new b(c0010c2));
            return;
        }
        if (iV2 == -1 && iV == 4 && StringsKt.F(line, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    public final boolean i1(C0010c entry) {
        f fVar;
        if (entry.getLockingSnapshotCount() > 0 && (fVar = this.journalWriter) != null) {
            fVar.m0("DIRTY");
            fVar.R(32);
            fVar.m0(entry.getKey());
            fVar.R(10);
            fVar.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m(true);
            return true;
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.h(entry.a().get(i2));
            this.size -= entry.getLengths()[i2];
            entry.getLengths()[i2] = 0;
        }
        this.operationsSinceRewrite++;
        f fVar2 = this.journalWriter;
        if (fVar2 != null) {
            fVar2.m0("REMOVE");
            fVar2.R(32);
            fVar2.m0(entry.getKey());
            fVar2.R(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (M0()) {
            P0();
        }
        return true;
    }

    private final boolean k1() {
        for (C0010c c0010c : this.lruEntries.values()) {
            if (!c0010c.getZombie()) {
                i1(c0010c);
                return true;
            }
        }
        return false;
    }

    private final void n0() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void o1() {
        while (this.size > this.maxSize) {
            if (!k1()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final void p1(String key) {
        if (M.d(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + '\"').toString());
    }

    public final synchronized void s1() {
        Throwable th;
        try {
            f fVar = this.journalWriter;
            if (fVar != null) {
                fVar.close();
            }
            f fVarC = w.c(this.fileSystem.p(this.journalFileTmp, false));
            try {
                fVarC.m0("libcore.io.DiskLruCache").R(10);
                fVarC.m0("1").R(10);
                fVarC.q1(this.appVersion).R(10);
                fVarC.q1(this.valueCount).R(10);
                fVarC.R(10);
                for (C0010c c0010c : this.lruEntries.values()) {
                    if (c0010c.getCurrentEditor() != null) {
                        fVarC.m0("DIRTY");
                        fVarC.R(32);
                        fVarC.m0(c0010c.getKey());
                        fVarC.R(10);
                    } else {
                        fVarC.m0("CLEAN");
                        fVarC.R(32);
                        fVarC.m0(c0010c.getKey());
                        c0010c.o(fVarC);
                        fVarC.R(10);
                    }
                }
                Unit unit = Unit.a;
                if (fVarC != null) {
                    try {
                        fVarC.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (fVarC != null) {
                    try {
                        fVarC.close();
                    } catch (Throwable th4) {
                        a.a(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.fileSystem.j(this.journalFile)) {
                this.fileSystem.c(this.journalFile, this.journalFileBackup);
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
                this.fileSystem.h(this.journalFileBackup);
            } else {
                this.fileSystem.c(this.journalFileTmp, this.journalFile);
            }
            this.journalWriter = Q0();
            this.operationsSinceRewrite = 0;
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized void t0(b editor, boolean success) {
        C0010c entry = editor.getEntry();
        if (!Intrinsics.b(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (!success || entry.getZombie()) {
            int i2 = this.valueCount;
            while (i < i2) {
                this.fileSystem.h(entry.c().get(i));
                i++;
            }
        } else {
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                if (editor.getWritten()[i4] && !this.fileSystem.j(entry.c().get(i4))) {
                    editor.a();
                    return;
                }
            }
            int i5 = this.valueCount;
            while (i < i5) {
                B b3 = entry.c().get(i);
                B b4 = entry.a().get(i);
                if (this.fileSystem.j(b3)) {
                    this.fileSystem.c(b3, b4);
                } else {
                    C0407e.a(this.fileSystem, entry.a().get(i));
                }
                long j = entry.getLengths()[i];
                Long lD = this.fileSystem.l(b4).d();
                long jLongValue = lD != null ? lD.longValue() : 0L;
                entry.getLengths()[i] = jLongValue;
                this.size = (this.size - j) + jLongValue;
                i++;
            }
        }
        entry.i(null);
        if (entry.getZombie()) {
            i1(entry);
            return;
        }
        this.operationsSinceRewrite++;
        f fVar = this.journalWriter;
        Intrinsics.d(fVar);
        if (success || entry.getReadable()) {
            entry.l(true);
            fVar.m0("CLEAN");
            fVar.R(32);
            fVar.m0(entry.getKey());
            entry.o(fVar);
            fVar.R(10);
        } else {
            this.lruEntries.remove(entry.getKey());
            fVar.m0("REMOVE");
            fVar.R(32);
            fVar.m0(entry.getKey());
            fVar.R(10);
        }
        fVar.flush();
        if (this.size > this.maxSize || M0()) {
            P0();
        }
    }

    public final synchronized b I0(@NotNull String key) {
        n0();
        p1(key);
        L0();
        C0010c c0010c = this.lruEntries.get(key);
        if ((c0010c != null ? c0010c.getCurrentEditor() : null) != null) {
            return null;
        }
        if (c0010c != null && c0010c.getLockingSnapshotCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            f fVar = this.journalWriter;
            Intrinsics.d(fVar);
            fVar.m0("DIRTY");
            fVar.R(32);
            fVar.m0(key);
            fVar.R(10);
            fVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (c0010c == null) {
                c0010c = new C0010c(key);
                this.lruEntries.put(key, c0010c);
            }
            b bVar = new b(c0010c);
            c0010c.i(bVar);
            return bVar;
        }
        P0();
        return null;
    }

    public final synchronized d J0(@NotNull String key) {
        d dVarN;
        n0();
        p1(key);
        L0();
        C0010c c0010c = this.lruEntries.get(key);
        if (c0010c != null && (dVarN = c0010c.n()) != null) {
            this.operationsSinceRewrite++;
            f fVar = this.journalWriter;
            Intrinsics.d(fVar);
            fVar.m0("READ");
            fVar.R(32);
            fVar.m0(key);
            fVar.R(10);
            if (M0()) {
                P0();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void L0() {
        try {
            if (this.initialized) {
                return;
            }
            this.fileSystem.h(this.journalFileTmp);
            if (this.fileSystem.j(this.journalFileBackup)) {
                if (this.fileSystem.j(this.journalFile)) {
                    this.fileSystem.h(this.journalFileBackup);
                } else {
                    this.fileSystem.c(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.j(this.journalFile)) {
                try {
                    b1();
                    Z0();
                    this.initialized = true;
                    return;
                } catch (IOException unused) {
                    try {
                        H0();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            s1();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public synchronized void close() {
        try {
            if (this.initialized && !this.closed) {
                for (C0010c c0010c : (C0010c[]) this.lruEntries.values().toArray(new C0010c[0])) {
                    b currentEditor = c0010c.getCurrentEditor();
                    if (currentEditor != null) {
                        currentEditor.e();
                    }
                }
                o1();
                M.e(this.cleanupScope, (CancellationException) null, 1, (Object) null);
                f fVar = this.journalWriter;
                Intrinsics.d(fVar);
                fVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized void flush() {
        if (this.initialized) {
            n0();
            o1();
            f fVar = this.journalWriter;
            Intrinsics.d(fVar);
            fVar.flush();
        }
    }
}
