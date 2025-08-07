package U6;

import K4.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.I;
import com.roblox.client.a0;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import h7.k;
import h7.l;
import j6.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements c {

    private String f7519a;

    private String f7520b;

    private String f7521c;

    private String f7522d;

    private String f7523e;

    private String f7524f;

    private String f7525g;

    private String f7526h;

    private int f7527i;

    private String f7528j;

    private boolean f7529k;

    @Deprecated
    private long f7530l;

    private String f7531m;

    private String f7532n;

    private String f7533o;

    private int f7534p;

    private String f7535q;

    private boolean f7536r;

    private final Map<String, c> f7537s;

    private b f7538t;

    private long f7539u;

    private String f7540v;

    private boolean f7541w;

    private List<NameValuePair> f7542x = new ArrayList();

    public a(Map<String, String> map) {
        this.f7519a = map.get("version");
        this.f7520b = map.get("notificationType");
        this.f7521c = map.get("notificationId");
        this.f7522d = map.get("body");
        this.f7523e = map.get("title");
        this.f7524f = map.get("iconUrl");
        this.f7525g = map.get("tag");
        this.f7526h = map.get("sound");
        this.f7527i = k.a(map.get("badge"), 1);
        this.f7528j = map.get("linkOnInteraction");
        this.f7533o = map.get("importanceChannel");
        this.f7534p = k.a(map.get("visibility"), 1);
        for (String str : map.keySet()) {
            if (str.startsWith("ClientEventField.")) {
                this.f7542x.add(new NameValuePair(str, map.get(str)));
            }
        }
        this.f7535q = map.get("notificationTypeData");
        this.f7536r = "CallReceived".equals(this.f7520b);
        if (a0.k0() || !d.a().R()) {
            this.f7537s = new HashMap();
        } else {
            this.f7537s = A(map.get("states"));
        }
        if (d.a().e()) {
            try {
                Map<String, String> mapZ = z(map.get("parameters"));
                if (mapZ.containsKey("IsChatReplyEnabled")) {
                    this.f7529k = Boolean.parseBoolean(mapZ.get("IsChatReplyEnabled"));
                }
                if (mapZ.containsKey("ConversationId")) {
                    if (d.a().D()) {
                        this.f7531m = mapZ.get("ConversationId");
                    } else {
                        this.f7530l = Long.parseLong(mapZ.get("ConversationId"));
                    }
                }
                if (mapZ.containsKey("MessageId")) {
                    this.f7532n = mapZ.get("MessageId");
                }
            } catch (Exception unused) {
                this.f7529k = false;
                l.g("PushNotification", "Could not build notification reply payload");
            }
        }
        if (d.a().f0()) {
            try {
                this.f7538t = b.valueOf(map.get("thumbnailType"));
                this.f7539u = Long.parseLong(map.get("thumbnailId"));
                this.f7540v = map.get("thumbnailDefaultUrl");
            } catch (Exception e7) {
                this.f7538t = b.none;
                this.f7539u = 0L;
                l.g("PushNotification", "Could not build thumbnail data from payload. Exception : " + e7);
            }
        }
        if (d.a().Q1()) {
            try {
                Map<String, String> mapZ2 = z(map.get("parameters"));
                if (mapZ2.containsKey("IsForegroundDisabled")) {
                    this.f7541w = Boolean.parseBoolean(mapZ2.get("IsForegroundDisabled"));
                } else {
                    this.f7541w = false;
                }
            } catch (Exception unused2) {
                this.f7541w = false;
                l.g("PushNotification", "Could not build notification isForegroundPushDisabled payload");
            }
        }
    }

    private Map<String, c> A(String str) throws JSONException {
        HashMap map = new HashMap();
        if (!i.b(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    HashMap map2 = new HashMap();
                    String next = itKeys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        String string = jSONObject2.getString(next2);
                        if ("notificationId".equals(next2) || "tag".equals(next2) || "notificationType".equals(next2)) {
                            string = String.format("%s-%s", string, next);
                        }
                        map2.put(next2, string);
                    }
                    map.put(next, new a(map2));
                }
            } catch (JSONException e7) {
                l.e("PushNotification", "Push notification states parse exception.", e7);
            }
        }
        return map;
    }

    private Map<String, String> z(String str) {
        HashMap map = new HashMap();
        if (!i.b(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e7) {
                l.e("PushNotification", "Push notification param parse exception.", e7);
            }
        }
        return map;
    }

    @Override
    public String Z() {
        return this.f7521c;
    }

    @Override
    public List<NameValuePair> a() {
        return this.f7542x;
    }

    @Override
    public String b() {
        return this.f7520b;
    }

    @Override
    public String c() {
        return "CallReceived".equals(this.f7520b) ? "channel_calls" : x();
    }

    @Override
    public int d() {
        throw new UnsupportedOperationException("Method not decompiled: U6.a.d():int");
    }

    @Override
    public int e() {
        if (!d.a().e() || i.b(this.f7532n)) {
            return 3;
        }
        return this.f7532n.hashCode();
    }

    @Override
    public boolean f() {
        return this.f7536r;
    }

    @Override
    public Uri g(Context context) {
        if (TextUtils.isEmpty(this.f7526h)) {
            return f() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f7526h.hashCode();
        return null;
    }

    @Override
    public String getBody() {
        return this.f7522d;
    }

    @Override
    public String getTitle() {
        return this.f7523e;
    }

    @Override
    public int getVisibility() {
        return this.f7534p;
    }

    @Override
    public int h() {
        return this.f7527i;
    }

    @Override
    public Map<String, c> i() {
        return this.f7537s;
    }

    @Override
    public PendingIntent j(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", (Serializable) StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", Z());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", b());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", y());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", s());
        return PendingIntent.getActivity(context, e(), intent, 301989888);
    }

    @Override
    public String k() {
        return this.f7525g;
    }

    @Override
    public int l(Context context) {
        String str = this.f7524f;
        if (str == null) {
            return I.f19467j;
        }
        str.hashCode();
        return I.f19467j;
    }

    @Override
    public boolean m() {
        return this.f7529k;
    }

    @Override
    public String n() {
        return this.f7531m;
    }

    @Override
    public String o() {
        return this.f7532n;
    }

    @Override
    public boolean p() {
        return this.f7541w;
    }

    @Override
    public String q() {
        return this.f7540v;
    }

    @Override
    public PendingIntent r(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", b());
        if (d.a().F3()) {
            intent.putExtra("EXTRA_NOTIFICATION_ID", Z());
        }
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", y());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", s());
        return PendingIntent.getBroadcast(context, e(), intent, 301989888);
    }

    @Override
    public String s() {
        return this.f7519a;
    }

    @Override
    @Deprecated
    public long t() {
        return this.f7530l;
    }

    @Override
    public long u() {
        return this.f7539u;
    }

    @Override
    public b v() {
        return this.f7538t;
    }

    @Override
    public String w() {
        return this.f7535q;
    }

    public String x() {
        return this.f7533o;
    }

    public String y() {
        return this.f7528j;
    }
}
