package T6;

import J7.g;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.core.app.l;
import androidx.core.app.p;
import androidx.core.app.s;
import androidx.core.app.u;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import c7.A;
import com.roblox.client.G;
import com.roblox.client.I;
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.M;
import com.roblox.client.a0;
import com.roblox.client.pushnotification.v2.RealtimeNotificationForegroundService;
import com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements T6.b {

    class a implements A {

        final Context f7458a;

        final l.e f7459b;

        final U6.c f7460c;

        final com.roblox.client.startup.d f7461d;

        a(Context context, l.e eVar, U6.c cVar, com.roblox.client.startup.d dVar) {
            this.f7458a = context;
            this.f7459b = eVar;
            this.f7460c = cVar;
            this.f7461d = dVar;
        }

        public void a() throws JSONException {
            e.this.g(this.f7458a, this.f7459b, this.f7460c);
            this.f7461d.U(this);
        }

        public void b() {
            this.f7461d.U(this);
        }
    }

    class b extends d {

        final l.e f7463f;

        final Context f7464g;

        final U6.c f7465h;

        b(Context context, long j7, U6.b bVar, String str, l.e eVar, Context context2, U6.c cVar) {
            super(context, j7, bVar, str);
            this.f7463f = eVar;
            this.f7464g = context2;
            this.f7465h = cVar;
        }

        @Override
        public void d(Bitmap bitmap) {
            if (bitmap != null) {
                this.f7463f.r(bitmap);
            }
            p.b(this.f7464g).e(this.f7465h.k(), this.f7465h.e(), this.f7463f.c());
        }
    }

    class c implements g.a {

        final String f7467d;

        final Context f7468e;

        final Notification f7469i;

        final boolean f7470v;

        final U6.c f7471w;

        c(String str, Context context, Notification notification, boolean z7, U6.c cVar) {
            this.f7467d = str;
            this.f7468e = context;
            this.f7469i = notification;
            this.f7470v = z7;
            this.f7471w = cVar;
        }

        public void B(String str, boolean z7) {
            if (this.f7467d.equals(str) && z7) {
                androidx.core.content.a.m(this.f7468e, RealtimeNotificationForegroundService.d(this.f7468e, this.f7467d, this.f7469i));
            }
        }

        public void M(String str) {
            if (this.f7467d.equals(str)) {
                J7.g.y().x(this);
            }
        }

        public void q(String str) {
            if (this.f7467d.equals(str)) {
                J7.g.y().x(this);
            }
        }

        public void u(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        public void v(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        public void x(String str, String str2) {
            if (this.f7467d.equals(str)) {
                U6.c cVar = this.f7471w.i().get("Miss".equals(str2) ? "missed" : (!"Suppress".equals(str2) || this.f7470v) ? null : "voice not enabled");
                if (cVar != null) {
                    p.b(this.f7468e).e(cVar.k(), cVar.e(), e.this.d(this.f7468e, cVar).c());
                }
                J7.g.y().x(this);
            }
        }
    }

    public l.e d(Context context, U6.c cVar) {
        l.e eVar = new l.e(context, cVar.c());
        eVar.k(cVar.j(context));
        eVar.o(cVar.r(context));
        eVar.w(cVar.d());
        eVar.C(cVar.getVisibility());
        eVar.x(cVar.l(context));
        eVar.m(cVar.getTitle());
        eVar.l(cVar.getBody());
        eVar.f(true);
        eVar.u(cVar.h());
        eVar.y(cVar.g(context));
        eVar.v(cVar.f());
        if (j6.d.a().e() && cVar.m()) {
            String string = context.getString(M.f19691z0);
            eVar.b(new l.a.C0083a(I.f19459b, string, f(context, cVar)).a(new u.d("key_reply_message").b(string).a()).d(true).b());
        }
        eVar.z(new l.c().h(cVar.getBody()));
        return eVar;
    }

    private Intent e(Context context, U6.c cVar, long j7, String str, String str2, String str3) {
        String str4 = str2 != null ? String.format(Locale.ROOT, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s", Long.valueOf(j7), str2, str3) : str != null ? String.format(Locale.ROOT, "roblox://placeId=%d&gameInstanceId=%s&callId=%s", Long.valueOf(j7), str, str3) : String.format(Locale.ROOT, "roblox://placeId=%d&callId=%s", Long.valueOf(j7), str3);
        Intent intent = new Intent("push_notification_action");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(str4));
        intent.putExtra("STARTED_FOR_INTENT_KEY", (Serializable) StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", cVar.Z());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", cVar.b());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", str4);
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", cVar.s());
        return intent;
    }

    private PendingIntent f(Context context, U6.c cVar) {
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        if (j6.d.a().D()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", cVar.n());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", cVar.t());
        }
        intent.putExtra("tag", cVar.k());
        intent.putExtra("EXTRA_MESSAGE_ID", cVar.o());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", cVar.getTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", cVar.Z());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", cVar.s());
        return PendingIntent.getBroadcast(context, cVar.e(), intent, 301989888);
    }

    public void g(Context context, l.e eVar, U6.c cVar) throws JSONException {
        PendingIntent pendingIntent;
        int i7;
        Intent intent;
        String str;
        int i8;
        Intent intentF;
        PendingIntent service;
        l.e eVar2;
        try {
            JSONObject jSONObject = new JSONObject(cVar.w());
            String string = jSONObject.getString("CallId");
            String string2 = jSONObject.getString("InstanceId");
            String string3 = jSONObject.getString("ReservedServerAccessCode");
            long j7 = jSONObject.getLong("CallerId");
            String string4 = jSONObject.getString("CallerCombinedName");
            long j8 = jSONObject.getLong(vxbbqXNtzfMxs.zDLIkWwPH);
            String string5 = jSONObject.getString("CalleeCombinedName");
            long j9 = jSONObject.getLong("PlaceId");
            long j10 = jSONObject.getLong("CreatedUtc");
            boolean z7 = jSONObject.getBoolean("IsCalleeMicEnabled");
            Intent intentC = RealtimeNotificationForegroundService.c(context, string);
            PendingIntent service2 = PendingIntent.getService(context, 0, intentC, 201326592);
            if (z7) {
                pendingIntent = service2;
                i7 = 201326592;
                str = string2;
                i8 = 0;
                intent = intentC;
                intentF = e(context, cVar, j9, string2, string3, string);
                service = PendingIntent.getActivity(context, 0, intentF, 201326592);
            } else {
                pendingIntent = service2;
                i7 = 201326592;
                intent = intentC;
                str = string2;
                i8 = 0;
                intentF = RealtimeNotificationForegroundService.f(context, string);
                service = PendingIntent.getService(context, 0, intentF, 201326592);
            }
            PendingIntent pendingIntent2 = service;
            PendingIntent activity = PendingIntent.getActivity(context, i8, IncomingCallActivity.f0(context, intentF, intent, j7, string4), i7);
            if (j6.d.a().K2()) {
                eVar2 = eVar;
                eVar2.z(l.f.h(new s.b().b(string4).a(), pendingIntent, pendingIntent2).p(context.getResources().getColor(G.f19436c)).q(context.getResources().getColor(G.f19437d)));
            } else {
                eVar2 = eVar;
                eVar2.a(i8, context.getString(M.f19689y0), pendingIntent);
                eVar2.a(i8, context.getString(M.f19687x0), pendingIntent2);
                eVar2.g("call");
            }
            eVar2.k(activity);
            eVar2.q(activity, true);
            eVar2.B(Q6.l.f4880b);
            Notification notificationC = eVar.c();
            if (cVar.f()) {
                notificationC.flags |= 36;
            }
            J7.g.y().g(new c(cVar.k(), context, notificationC, z7, cVar));
            J7.g.y().v(string, j7, string4, j8, string5, j9, str, string3, j10, z7, cVar.Z());
        } catch (JSONException e7) {
            h7.l.e("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e7);
        }
    }

    @Override
    public void a(Context context, U6.c cVar) throws JSONException {
        if (context == null || cVar == null) {
            return;
        }
        if (j6.d.a().B2() && "Heartbeat".equals(cVar.b())) {
            return;
        }
        l.e eVarD = d(context, cVar);
        if (a0.k0() || !j6.d.a().R() || !"CallReceived".equals(cVar.b())) {
            if (j6.d.a().f0()) {
                new b(context, cVar.u(), cVar.v(), cVar.q(), eVarD, context, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else {
                p.b(context).e(cVar.k(), cVar.e(), eVarD.c());
                return;
            }
        }
        if (com.roblox.client.startup.a.k()) {
            g(context, eVarD, cVar);
            return;
        }
        com.roblox.client.startup.d dVarS = com.roblox.client.startup.d.s(context.getApplicationContext());
        dVarS.L(new a(context, eVarD, cVar, dVarS));
        dVarS.R();
    }
}
