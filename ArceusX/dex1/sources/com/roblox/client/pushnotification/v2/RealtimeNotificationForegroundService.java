package com.roblox.client.pushnotification.v2;

import J7.g;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.appcompat.app.FN.krlBPZZeK;
import androidx.core.app.l;
import androidx.core.app.s;
import androidx.core.app.v;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.I;
import com.roblox.client.M;
import j6.d;

public class RealtimeNotificationForegroundService extends Service implements g.a {

    private final IBinder f20203d = new a();

    private String f20204e;

    private int f20205i;

    public class a extends Binder {
        public a() {
        }
    }

    public static Intent a(Context context, String str) {
        return e(context, str, "ACTION_STOP_SERVICE_AND_FINISH_CALL");
    }

    public static Intent b(Context context, String str, String str2, String str3) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) ActivityNativeMain.class), 201326592);
        l.e eVar = new l.e(context, krlBPZZeK.ToojJDreNKo);
        Resources resources = context.getResources();
        int i7 = M.f19685w0;
        l.e eVarV = eVar.m(resources.getString(i7)).l(str2).x(I.f19467j).k(activity).v(true);
        if (d.a().K2()) {
            eVarV.l(context.getResources().getString(i7)).z(l.f.i(new s.b().b(str2).a(), PendingIntent.getService(context, 0, a(context, str3), 201326592)));
        }
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).putExtra("EXTRA_NOTIFICATION_ID", str).putExtra("EXTRA_NOTIFICATION", eVarV.c());
    }

    public static Intent c(Context context, String str) {
        return e(context, str, "ACTION_STOP_SERVICE_AND_REJECT_CALL");
    }

    public static Intent d(Context context, String str, Notification notification) {
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).putExtra("EXTRA_NOTIFICATION_ID", str).putExtra("EXTRA_NOTIFICATION", notification);
    }

    private static Intent e(Context context, String str, String str2) {
        return new Intent(context, (Class<?>) RealtimeNotificationForegroundService.class).setAction(str2).putExtra("EXTRA_CALL_ID", str);
    }

    public static Intent f(Context context, String str) {
        return e(context, str, "ACTION_STOP_SERVICE_AND_SUPPRESS_CALL");
    }

    private void g() {
        v.a(this, 1);
        stopSelf(this.f20205i);
        this.f20204e = null;
    }

    public void B(String str, boolean z7) {
    }

    public void M(String str) {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return this.f20203d;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        g.y().g(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        g.y().x(this);
    }

    @Override
    public int onStartCommand(Intent intent, int i7, int i8) {
        this.f20205i = i8;
        if ("ACTION_STOP_SERVICE_AND_REJECT_CALL".equals(intent.getAction())) {
            g.y().w(intent.getStringExtra("EXTRA_CALL_ID"));
            g();
            return 2;
        }
        if ("ACTION_STOP_SERVICE_AND_SUPPRESS_CALL".equals(intent.getAction())) {
            g.y().z(intent.getStringExtra("EXTRA_CALL_ID"));
            g();
            return 2;
        }
        if (d.a().K2() && jUbDmI.OuzwLifkqz.equals(intent.getAction())) {
            g.y().h(intent.getStringExtra("EXTRA_CALL_ID"));
            g();
            return 2;
        }
        this.f20204e = intent.getStringExtra("EXTRA_NOTIFICATION_ID");
        Notification notification = (Notification) intent.getParcelableExtra("EXTRA_NOTIFICATION");
        if (Build.VERSION.SDK_INT >= 31) {
            startForeground(this.f20204e.hashCode(), notification, -1);
            return 2;
        }
        startForeground(this.f20204e.hashCode(), notification);
        return 2;
    }

    public void q(String str) {
        String str2 = this.f20204e;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        g();
    }

    public void u(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void v(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void x(String str, String str2) {
        String str3 = this.f20204e;
        if (str3 == null || !str3.equals(str)) {
            return;
        }
        g();
    }
}
