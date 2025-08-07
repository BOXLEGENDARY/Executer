package com.google.firebase.messaging;

import a4.C1576m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

final class g {

    private final Executor f19132a;

    private final Context f19133b;

    private final n f19134c;

    public g(Context context, n nVar, Executor executor) {
        this.f19132a = executor;
        this.f19133b = context;
        this.f19134c = nVar;
    }

    final boolean a() throws JSONException, PackageManager.NameNotFoundException {
        if (this.f19134c.g("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f19133b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!v3.m.f()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f19133b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        m mVarE = m.e(this.f19134c.c("gcm.n.image"));
        if (mVarE != null) {
            mVarE.f(this.f19132a);
        }
        d dVarD = e.d(this.f19133b, this.f19134c);
        l.e eVar = dVarD.f19128a;
        if (mVarE != null) {
            try {
                Bitmap bitmap = (Bitmap) C1576m.b(mVarE.b(), 5L, TimeUnit.SECONDS);
                eVar.r(bitmap);
                eVar.z(new l.b().i(bitmap).h(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                mVarE.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e7) {
                String strValueOf = String.valueOf(e7.getCause());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
                sb.append("Failed to download image: ");
                sb.append(strValueOf);
                Log.w("FirebaseMessaging", sb.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                mVarE.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f19133b.getSystemService("notification")).notify(dVarD.f19129b, 0, dVarD.f19128a.c());
        return true;
    }
}
