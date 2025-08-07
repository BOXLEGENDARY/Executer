package H1;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import ha.C0361l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LH1/f;", "LH1/d;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "b", "(Landroid/net/Uri;)Z", "LJ1/l;", "options", "c", "(Landroid/net/Uri;LJ1/l;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements d<Uri, Uri> {
    private final boolean b(Uri data) {
        String authority;
        return Intrinsics.b(data.getScheme(), "android.resource") && (authority = data.getAuthority()) != null && !StringsKt.Y(authority) && data.getPathSegments().size() == 2;
    }

    @Override
    public Uri a(@NotNull Uri data, @NotNull C0361l options) throws PackageManager.NameNotFoundException {
        if (!b(data)) {
            return null;
        }
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + data).toString());
        }
        return Uri.parse("android.resource://" + authority + '/' + identifier);
    }
}
