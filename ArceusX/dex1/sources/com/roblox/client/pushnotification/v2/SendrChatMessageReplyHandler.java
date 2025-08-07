package com.roblox.client.pushnotification.v2;

import E6.i;
import Q6.h;
import Y3.qE.KpBmp;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import h7.l;
import j6.d;
import y6.C3030a;
import y6.b;

public class SendrChatMessageReplyHandler extends com.roblox.client.pushnotification.notificationreceivers.a {

    class a implements b.c {

        final Context f20207a;

        final long f20208b;

        final long f20209c;

        final String f20210d;

        a(Context context, long j7, long j8, String str) {
            this.f20207a = context;
            this.f20208b = j7;
            this.f20209c = j8;
            this.f20210d = str;
        }

        @Override
        public void a(String str, String str2) {
            boolean zEquals = "moderated".equals(str);
            new h().e(this.f20207a, "ChatNewMessage_" + this.f20208b, this.f20209c, this.f20210d, zEquals);
            l.d("rbx.push", "Failed to send Chat Message");
        }

        @Override
        public void b(String str) {
        }
    }

    class b implements b.c {

        final Context f20212a;

        final String f20213b;

        final String f20214c;

        final String f20215d;

        b(Context context, String str, String str2, String str3) {
            this.f20212a = context;
            this.f20213b = str;
            this.f20214c = str2;
            this.f20215d = str3;
        }

        @Override
        public void a(String str, String str2) {
            boolean zEquals = "moderated".equals(str);
            new h().f(this.f20212a, "ChatNewMessage_" + this.f20213b, this.f20214c, this.f20215d, zEquals);
            l.d("rbx.push", "Failed to send Chat Message");
        }

        @Override
        public void b(String str) {
        }
    }

    @Deprecated
    private void o(long j7, String str) {
        l.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j7 + " ,messageId: " + str);
        i.b().c(new C3030a(j7, str, (C3030a.InterfaceC0239a) null));
    }

    private void p(String str, String str2) {
        l.i("rbx.push", "In markChatNotificationAsRead(), conversationGuid: " + str + " ,messageId: " + str2);
        i.b().c(new C3030a(str, str2, (C3030a.InterfaceC0239a) null));
    }

    @Deprecated
    private void q(long j7, String str, Context context, long j8, String str2) {
        i.b().c(new y6.b(j7, str, new a(context, j8, j7, str2)));
    }

    private void r(String str, String str2, Context context, String str3, String str4) {
        i.b().c(new y6.b(str, str2, new b(context, str3, str, str4)));
    }

    @Override
    protected Intent n(Context context, Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", intent2.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        super.onReceive(context, intent);
        if (intent == null || !"chat_message_replied".equals(intent.getAction())) {
            return;
        }
        l.i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        long longExtra = -1;
        if (d.a().D()) {
            stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        } else {
            longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
            stringExtra = BuildConfig.FLAVOR;
        }
        String str = stringExtra;
        long j7 = longExtra;
        String stringExtra3 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra4 = intent.getStringExtra("tag");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(stringExtra4, stringExtra2.hashCode());
        }
        CharSequence charSequenceZ = Q6.b.z(intent);
        if (charSequenceZ != null) {
            if (d.a().D()) {
                r(str, charSequenceZ.toString(), context, str, stringExtra3);
                p(str, stringExtra2);
            } else {
                q(j7, charSequenceZ.toString(), context, j7, stringExtra3);
                o(j7, stringExtra2);
            }
            e("chat message replied", context, intent, true, KpBmp.fjb);
        }
    }
}
