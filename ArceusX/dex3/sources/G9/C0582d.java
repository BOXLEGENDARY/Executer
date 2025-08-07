package g9;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lg9/a;", "a", "(Landroid/content/Context;)Lg9/a;", "", "b", "(Landroid/content/Context;)Z", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0582d {
    public static final GpsData a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        try {
            int iA = androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION");
            int iA2 = androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            Location lastKnownLocation = iA == 0 ? locationManager.getLastKnownLocation("gps") : iA2 == 0 ? locationManager.getLastKnownLocation("network") : null;
            EnumC0580b enumC0580b = iA == 0 ? EnumC0580b.e : iA2 == 0 ? EnumC0580b.d : null;
            if (lastKnownLocation == null || enumC0580b == null) {
                return null;
            }
            return new GpsData(lastKnownLocation, enumC0580b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}
