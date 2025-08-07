package I1;

import I1.g;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;
import okio.C0406d;
import okio.C0409g;
import okio.InterfaceC0420s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "LI1/g$a;", "listener", "LO1/s;", "logger", "LI1/g;", "a", "(Landroid/content/Context;LI1/g$a;LO1/s;)LI1/g;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    @NotNull
    public static final g a(@NotNull Context context, @NotNull g.a aVar, InterfaceC0420s interfaceC0420s) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !C0406d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (interfaceC0420s != null && interfaceC0420s.a() <= 5) {
                interfaceC0420s.b("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new e();
        }
        try {
            return new i(connectivityManager, aVar);
        } catch (Exception e) {
            if (interfaceC0420s != null) {
                C0409g.a(interfaceC0420s, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
            }
            return new e();
        }
    }
}
