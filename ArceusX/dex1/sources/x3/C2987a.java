package x3;

import android.content.Context;
import v3.m;

public class C2987a {

    private static Context f24322a;

    private static Boolean f24323b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f24322a;
        if (context2 != null && (bool = f24323b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f24323b = null;
        if (m.i()) {
            f24323b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f24323b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f24323b = Boolean.FALSE;
            }
        }
        f24322a = applicationContext;
        return f24323b.booleanValue();
    }
}
