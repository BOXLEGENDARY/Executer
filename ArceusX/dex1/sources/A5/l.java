package a5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

public final class l {

    private static final long f8364a = TimeUnit.MINUTES.toMillis(1);

    private static final Object f8365b = new Object();

    private static Z3.a f8366c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f8365b) {
            try {
                if (f8366c == null) {
                    Z3.a aVar = new Z3.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f8366c = aVar;
                    aVar.c(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                c(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f8366c.a(f8364a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f8365b) {
            try {
                if (f8366c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    c(intent, false);
                    f8366c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(Intent intent, boolean z7) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z7);
    }
}
