package i5;

import Y4.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class C2488a {

    private final Context f21079a;

    private final SharedPreferences f21080b;

    private final c f21081c;

    private boolean f21082d;

    public C2488a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f21079a = contextA;
        this.f21080b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f21081c = cVar;
        this.f21082d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f21080b.contains("firebase_data_collection_default_enabled") ? this.f21080b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f21079a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f21079a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f21082d;
    }
}
