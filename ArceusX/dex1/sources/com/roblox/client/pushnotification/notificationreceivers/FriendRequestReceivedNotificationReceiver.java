package com.roblox.client.pushnotification.notificationreceivers;

import W0.JWp.kNUgEaOjcPdX;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.core.app.l;
import bb.d;
import bb.t;
import com.roblox.client.I;
import com.roblox.client.K;
import com.roblox.client.M;
import h7.p;
import okhttp3.ResponseBody;
import s7.g;

public class FriendRequestReceivedNotificationReceiver extends com.roblox.client.pushnotification.notificationreceivers.a {

    class a implements d<ResponseBody> {

        final Context f20196a;

        final Intent f20197b;

        a(Context context, Intent intent) {
            this.f20196a = context;
            this.f20197b = intent;
        }

        private void c(int i7, String str) {
            Toast.makeText(this.f20196a, i7, 0).show();
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Context context = this.f20196a;
            friendRequestReceivedNotificationReceiver.d(str, context, this.f20197b, "Accept", p.a(context), true, "FriendRequestReceived");
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
            c(M.f19608N0, kNUgEaOjcPdX.DestAxVZXadL);
            FriendRequestReceivedNotificationReceiver.this.g(this.f20196a, this.f20197b);
        }

        public void b(bb.b<ResponseBody> bVar, t<ResponseBody> tVar) {
            z7.b bVar2 = new z7.b(tVar);
            if (!bVar2.b()) {
                int i7 = M.f19608N0;
                String str = "code_" + bVar2.a + "error_" + bVar2.a();
                if (bVar2.a == 401) {
                    i7 = M.f19668o;
                    str = "unauthenticated";
                }
                c(i7, str);
            }
            FriendRequestReceivedNotificationReceiver.this.g(this.f20196a, this.f20197b);
        }
    }

    class b implements d<ResponseBody> {

        final Context f20199a;

        final Intent f20200b;

        class a implements Runnable {
            a() {
            }

            @Override
            public void run() {
                b.this.d();
            }
        }

        b(Context context, Intent intent) {
            this.f20199a = context;
            this.f20200b = intent;
        }

        public void d() {
            FriendRequestReceivedNotificationReceiver.this.a(this.f20199a, 0);
            FriendRequestReceivedNotificationReceiver.this.c(this.f20199a);
        }

        private void e(int i7, String str) {
            Toast.makeText(this.f20199a, i7, 0).show();
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Context context = this.f20199a;
            friendRequestReceivedNotificationReceiver.d(str, context, this.f20200b, "Decline", p.a(context), false, "FriendRequestReceived");
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
            e(M.f19608N0, "client_failure");
            d();
        }

        public void b(bb.b<ResponseBody> bVar, t<ResponseBody> tVar) {
            z7.b bVar2 = new z7.b(tVar);
            if (bVar2.b()) {
                ((NotificationManager) this.f20199a.getSystemService("notification")).notify(0, new l.e(this.f20199a, "channel_general").x(I.f19460c).j(new RemoteViews(this.f20199a.getPackageName(), K.f19570p)).f(true).c());
                new Handler().postDelayed(new a(), 6000L);
                return;
            }
            int i7 = M.f19608N0;
            String str = "code_" + bVar2.a + "error_" + bVar2.a();
            if (bVar2.a == 401) {
                i7 = M.f19668o;
                str = "unauthenticated";
            }
            e(i7, str);
            d();
        }
    }

    private void o(Intent intent, Context context) {
        long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
        if (longExtra == -1) {
            g(context, intent);
        } else {
            g.d().b().b(longExtra).u(new a(context, intent));
        }
    }

    private void p(Intent intent, Context context) {
        long longExtra = intent.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
        if (longExtra != -1) {
            g.d().b().a(longExtra).u(new b(context, intent));
        } else {
            a(context, 0);
            c(context);
        }
    }

    @Override
    protected Intent n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (!"friend_request_received_accepted".equals(action)) {
            if ("friend_request_received_ignored".equals(action)) {
                k("FriendRequestReceived", context, intent, "Decline");
                p(intent, context);
                return;
            }
            return;
        }
        h7.l.i("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
        k("FriendRequestReceived", context, intent, "Accept");
        c(context);
        a(context, 0);
        o(intent, context);
    }
}
