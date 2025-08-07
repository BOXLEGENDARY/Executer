package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

class y {

    private static y f8751d;

    private final Context f8752a;

    private final LocationManager f8753b;

    private final a f8754c = new a();

    private static class a {

        boolean f8755a;

        long f8756b;

        a() {
        }
    }

    y(Context context, LocationManager locationManager) {
        this.f8752a = context;
        this.f8753b = locationManager;
    }

    static y a(Context context) {
        if (f8751d == null) {
            Context applicationContext = context.getApplicationContext();
            f8751d = new y(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f8751d;
    }

    private Location b() {
        Location locationC = androidx.core.content.d.b(this.f8752a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.d.b(this.f8752a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f8753b.isProviderEnabled(str)) {
                return this.f8753b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e7) {
            Log.d("TwilightManager", "Failed to get last known location", e7);
            return null;
        }
    }

    private boolean e() {
        return this.f8754c.f8756b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j7;
        a aVar = this.f8754c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        x xVarB = x.b();
        xVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        xVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z7 = xVarB.f8750c == 1;
        long j8 = xVarB.f8749b;
        long j9 = xVarB.f8748a;
        xVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j10 = xVarB.f8749b;
        if (j8 == -1 || j9 == -1) {
            j7 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j9) {
                j10 = jCurrentTimeMillis > j8 ? j9 : j8;
            }
            j7 = j10 + 60000;
        }
        aVar.f8755a = z7;
        aVar.f8756b = j7;
    }

    boolean d() {
        a aVar = this.f8754c;
        if (e()) {
            return aVar.f8755a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f8755a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i7 = Calendar.getInstance().get(11);
        return i7 < 6 || i7 >= 22;
    }
}
