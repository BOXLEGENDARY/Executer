package P0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class a extends BroadcastReceiver {

    private static final SparseArray<PowerManager.WakeLock> f3722d = new SparseArray<>();

    private static int f3723e = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f3722d;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f3722d;
        synchronized (sparseArray) {
            try {
                int i7 = f3723e;
                int i8 = i7 + 1;
                f3723e = i8;
                if (i8 <= 0) {
                    f3723e = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i7);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i7, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
