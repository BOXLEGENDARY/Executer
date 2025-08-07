package H1;

import android.net.Uri;
import ha.C0361l;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LH1/b;", "LH1/d;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "data", "", "b", "(Landroid/net/Uri;)Z", "LJ1/l;", "options", "c", "(Landroid/net/Uri;LJ1/l;)Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements d<Uri, File> {
    private final boolean b(Uri data) {
        if (C0412j.q(data)) {
            return false;
        }
        String scheme = data.getScheme();
        if (scheme != null && !Intrinsics.b(scheme, "file")) {
            return false;
        }
        String path = data.getPath();
        if (path == null) {
            path = "";
        }
        return StringsKt.C0(path, '/', false, 2, (Object) null) && C0412j.h(data) != null;
    }

    @Override
    public File a(@NotNull Uri data, @NotNull C0361l options) {
        if (!b(data)) {
            return null;
        }
        if (!Intrinsics.b(data.getScheme(), "file")) {
            return new File(data.toString());
        }
        String path = data.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
