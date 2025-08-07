package ha;

import android.os.StatFs;
import ha.H;
import ha.c0;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import okio.B;
import okio.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u000b\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LC1/a;", "", "", "key", "LC1/a$c;", "b", "(Ljava/lang/String;)LC1/a$c;", "LC1/a$b;", "a", "(Ljava/lang/String;)LC1/a$b;", "Lokio/l;", "c", "()Lokio/l;", "getFileSystem$annotations", "()V", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LC1/a$a;", "", "<init>", "()V", "Ljava/io/File;", "directory", "b", "(Ljava/io/File;)LC1/a$a;", "Lokio/B;", "c", "(Lokio/B;)LC1/a$a;", "LC1/a;", "a", "()LC1/a;", "Lokio/B;", "Lokio/l;", "Lokio/l;", "fileSystem", "", "D", "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lha/H;", "g", "Lha/H;", "cleanupDispatcher", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0009a {

        private B directory;

        private long maxSizeBytes;

        @NotNull
        private l fileSystem = l.b;

        private double maxSizePercent = 0.02d;

        private long minimumMaxSizeBytes = 10485760;

        private long maximumMaxSizeBytes = 262144000;

        @NotNull
        private H cleanupDispatcher = c0.b();

        @NotNull
        public final a a() {
            long j;
            B b = this.directory;
            if (b == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    File fileP = b.p();
                    fileP.mkdir();
                    StatFs statFs = new StatFs(fileP.getAbsolutePath());
                    j = kotlin.ranges.b.j((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    j = this.minimumMaxSizeBytes;
                }
            } else {
                j = this.maxSizeBytes;
            }
            return new e(j, b, this.fileSystem, this.cleanupDispatcher);
        }

        @NotNull
        public final C0009a b(@NotNull File directory) {
            return c(B.a.d(B.e, directory, false, 1, (Object) null));
        }

        @NotNull
        public final C0009a c(@NotNull B directory) {
            this.directory = directory;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LC1/a$b;", "", "LC1/a$c;", "l", "()LC1/a$c;", "", "abort", "()V", "Lokio/B;", "k", "()Lokio/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void abort();

        @NotNull
        B getData();

        @NotNull
        B k();

        c l();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LC1/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LC1/a$b;", "i0", "()LC1/a$b;", "Lokio/B;", "k", "()Lokio/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c extends Closeable {
        @NotNull
        B getData();

        b i0();

        @NotNull
        B k();
    }

    b a(@NotNull String key);

    c b(@NotNull String key);

    @NotNull
    l getFileSystem();
}
