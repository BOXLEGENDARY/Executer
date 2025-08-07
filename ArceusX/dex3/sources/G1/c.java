package G1;

import android.net.Uri;
import ha.C0361l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C0412j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LG1/c;", "LG1/b;", "Landroid/net/Uri;", "<init>", "()V", "data", "LJ1/l;", "options", "", "b", "(Landroid/net/Uri;LJ1/l;)Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements b<Uri> {
    @Override
    @NotNull
    public String a(@NotNull Uri data, @NotNull C0361l options) {
        if (!Intrinsics.b(data.getScheme(), "android.resource")) {
            return data.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append('-');
        sb.append(C0412j.k(options.getContext().getResources().getConfiguration()));
        return sb.toString();
    }
}
