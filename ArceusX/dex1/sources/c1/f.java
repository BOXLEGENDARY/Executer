package c1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc1/f;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", BuildConfig.FLAVOR, "Landroid/net/Uri;", "uris", BuildConfig.FLAVOR, "b", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "a", "(Landroid/database/Cursor;)Ljava/util/List;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    public static final f f12687a = new f();

    private f() {
    }

    public static final List<Uri> a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        Intrinsics.d(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(cr, "cr");
        Intrinsics.checkNotNullParameter(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
