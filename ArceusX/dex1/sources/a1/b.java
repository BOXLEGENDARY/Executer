package a1;

import Y0.s;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import c1.g;
import c1.j;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LY0/s;", "db", "Lc1/j;", "sqLiteQuery", BuildConfig.FLAVOR, "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "c", "(LY0/s;Lc1/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Lc1/g;", BuildConfig.FLAVOR, "b", "(Lc1/g;)V", "Ljava/io/File;", "databaseFile", BuildConfig.FLAVOR, "d", "(Ljava/io/File;)I", "a", "()Landroid/os/CancellationSignal;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final CancellationSignal a() {
        return c1.b.b();
    }

    public static final void b(g gVar) throws SQLException {
        Intrinsics.checkNotNullParameter(gVar, "db");
        List listC = CollectionsKt.c();
        Cursor cursorQ0 = gVar.q0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQ0.moveToNext()) {
            try {
                listC.add(cursorQ0.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.a;
        X9.c.a(cursorQ0, (Throwable) null);
        for (String str : CollectionsKt.a(listC)) {
            Intrinsics.checkNotNullExpressionValue(str, "triggerName");
            if (StringsKt.F(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.z("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor c(s sVar, j jVar, boolean z7, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(sVar, "db");
        Intrinsics.checkNotNullParameter(jVar, "sqLiteQuery");
        Cursor cursorZ = sVar.z(jVar, cancellationSignal);
        if (!z7 || !(cursorZ instanceof AbstractWindowedCursor)) {
            return cursorZ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorZ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorZ) : cursorZ;
    }

    public static final int d(File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i7 = byteBufferAllocate.getInt();
            X9.c.a(channel, (Throwable) null);
            return i7;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                X9.c.a(channel, th);
                throw th2;
            }
        }
    }
}
