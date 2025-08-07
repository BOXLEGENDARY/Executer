package Y0;

import c1.h;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LY0/x;", "Lc1/h$c;", BuildConfig.FLAVOR, "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lc1/h$c;)V", "Lc1/h$b;", "configuration", "Lc1/h;", "a", "(Lc1/h$b;)Lc1/h;", "Ljava/lang/String;", "b", "Ljava/io/File;", "c", "Ljava/util/concurrent/Callable;", "d", "Lc1/h$c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements h.c {

    private final String mCopyFromAssetPath;

    private final File mCopyFromFile;

    private final Callable<InputStream> mCopyFromInputStream;

    private final h.c mDelegate;

    public x(String str, File file, Callable<InputStream> callable, h.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "mDelegate");
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = cVar;
    }

    @Override
    public c1.h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new w(configuration.context, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.callback.version, this.mDelegate.a(configuration));
    }
}
