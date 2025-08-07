package com.roblox.client.pushnotification.notificationreceivers;

import E6.i;
import Q6.h;
import Q6.p;
import android.content.Context;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import h7.l;
import j6.d;
import y6.C3030a;
import y6.b;

public class ChatMessageNotificationReceiver extends com.roblox.client.pushnotification.notificationreceivers.a {

    class a implements b.c {

        final Context f20186a;

        final String f20187b;

        final long f20188c;

        final String f20189d;

        a(Context context, String str, long j7, String str2) {
            this.f20186a = context;
            this.f20187b = str;
            this.f20188c = j7;
            this.f20189d = str2;
        }

        @Override
        public void a(String str, String str2) {
            new h().e(this.f20186a, this.f20187b, this.f20188c, this.f20189d, "moderated".equals(str));
        }

        @Override
        public void b(String str) {
        }
    }

    class b implements b.c {

        final Context f20191a;

        final String f20192b;

        final String f20193c;

        final String f20194d;

        b(Context context, String str, String str2, String str3) {
            this.f20191a = context;
            this.f20192b = str;
            this.f20193c = str2;
            this.f20194d = str3;
        }

        @Override
        public void a(String str, String str2) {
            new h().f(this.f20191a, this.f20192b, this.f20193c, this.f20194d, "moderated".equals(str));
        }

        @Override
        public void b(String str) {
        }
    }

    private void o(long j7, String str) {
        l.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + j7 + " ,messageId: " + str);
        i.b().c(new C3030a(j7, str, (C3030a.InterfaceC0239a) null));
    }

    @Deprecated
    private void p(long j7, String str, Context context, String str2, String str3) {
        i.b().c(new y6.b(j7, str, new a(context, str2, j7, str3)));
    }

    private void q(String str, String str2, Context context, String str3, String str4) {
        i.b().c(new y6.b(str, str2, new b(context, str3, str, str4)));
    }

    @Override
    protected void l(Context context, Intent intent) {
        p.c().i(intent.getStringExtra("EXTRA_CATEGORY"));
        g(context, intent);
        e("clicked", context, intent, true, "ChatNewMessage");
    }

    @Override
    protected void m(Context context, Intent intent) {
        p.c().i(intent.getStringExtra("EXTRA_CATEGORY"));
        e("dismissed", context, intent, false, "ChatNewMessage");
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
        long longExtra = -1;
        if (d.a().D()) {
            stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        } else {
            longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
            stringExtra = BuildConfig.FLAVOR;
        }
        String str = stringExtra;
        long j7 = longExtra;
        a(context, (int) j7);
        CharSequence charSequenceZ = Q6.b.z(intent);
        if (charSequenceZ != null) {
            String stringExtra2 = intent.getStringExtra("EXTRA_CATEGORY");
            String stringExtra3 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
            String stringExtra4 = intent.getStringExtra("EXTRA_MESSAGE_ID");
            if (d.a().D()) {
                q(str, charSequenceZ.toString(), context, stringExtra2, stringExtra3);
            } else {
                p(j7, charSequenceZ.toString(), context, stringExtra2, stringExtra3);
            }
            p.c().i(stringExtra2);
            o(j7, stringExtra4);
            e("chat message replied", context, intent, true, "ChatNewMessage");
        }
    }
}
