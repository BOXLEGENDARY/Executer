package n3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import x3.C2989c;

public final class C2633I {

    private static final Object f22249a = new Object();

    private static boolean f22250b;

    private static String f22251c;

    private static int f22252d;

    public static int a(Context context) {
        b(context);
        return f22252d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f22249a) {
            try {
                if (f22250b) {
                    return;
                }
                f22250b = true;
                try {
                    bundle = C2989c.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e7);
                }
                if (bundle == null) {
                    return;
                }
                f22251c = bundle.getString("com.google.app.id");
                f22252d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
