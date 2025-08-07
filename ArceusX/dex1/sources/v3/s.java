package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1824i;
import x3.C2989c;

public final class s {
    public static boolean a(Context context, int i7) throws PackageManager.NameNotFoundException {
        if (!b(context, i7, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1824i.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i7, String str) {
        return C2989c.a(context).h(i7, str);
    }
}
