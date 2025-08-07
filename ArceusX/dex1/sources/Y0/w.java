package Y0;

import android.content.Context;
import android.util.Log;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"LY0/w;", "Lc1/h;", "LY0/i;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", BuildConfig.FLAVOR, "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILc1/h;)V", BuildConfig.FLAVOR, "writable", BuildConfig.FLAVOR, "m", "(Z)V", "destinationFile", "e", "(Ljava/io/File;Z)V", "databaseFile", "f", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "LY0/h;", "databaseConfiguration", "j", "(LY0/h;)V", "d", "Landroid/content/Context;", "Ljava/lang/String;", "i", "Ljava/io/File;", "v", "Ljava/util/concurrent/Callable;", "w", "I", "y", "Lc1/h;", "b", "()Lc1/h;", "z", "LY0/h;", "A", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lc1/g;", "o0", "()Lc1/g;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w implements c1.h, i {

    private boolean verified;

    private final Context context;

    private final String copyFromAssetPath;

    private final File copyFromFile;

    private final Callable<InputStream> copyFromInputStream;

    private final int databaseVersion;

    private final c1.h delegate;

    private h databaseConfiguration;

    public w(Context context, String str, File file, Callable<InputStream> callable, int i7, c1.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hVar, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i7;
        this.delegate = hVar;
    }

    private final void e(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e7) {
                throw new IOException("inputStreamCallable exception on call", e7);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "output");
        a1.c.a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "intermediateFile");
        f(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void f(File databaseFile, boolean writable) {
        h hVar = this.databaseConfiguration;
        if (hVar == null) {
            Intrinsics.v("databaseConfiguration");
            hVar = null;
        }
        hVar.getClass();
    }

    private final void m(boolean writable) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        h hVar = this.databaseConfiguration;
        h hVar2 = null;
        if (hVar == null) {
            Intrinsics.v("databaseConfiguration");
            hVar = null;
        }
        e1.a aVar = new e1.a(databaseName, this.context.getFilesDir(), hVar.multiInstanceInvalidation);
        try {
            e1.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databasePath, "databaseFile");
                    e(databasePath, writable);
                    aVar.d();
                    return;
                } catch (IOException e7) {
                    throw new RuntimeException("Unable to copy database file.", e7);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databasePath, "databaseFile");
                int iD = a1.b.d(databasePath);
                if (iD == this.databaseVersion) {
                    aVar.d();
                    return;
                }
                h hVar3 = this.databaseConfiguration;
                if (hVar3 == null) {
                    Intrinsics.v("databaseConfiguration");
                } else {
                    hVar2 = hVar3;
                }
                if (hVar2.a(iD, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        e(databasePath, writable);
                    } catch (IOException e8) {
                        Log.w("ROOM", "Unable to copy database file.", e8);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + vxbbqXNtzfMxs.qllNwEI);
                }
                aVar.d();
                return;
            } catch (IOException e9) {
                Log.w("ROOM", "Unable to read database version.", e9);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    @Override
    public c1.h getDelegate() {
        return this.delegate;
    }

    @Override
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    public final void j(h databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override
    public c1.g o0() throws IOException {
        if (!this.verified) {
            m(true);
            this.verified = true;
        }
        return getDelegate().o0();
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
