package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

public final class r extends Service {

    private static class a {
        static int a() {
            return 512;
        }
    }

    public static ServiceInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) r.class), a.a() | 128);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
