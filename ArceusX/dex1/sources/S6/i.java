package S6;

import Q6.r;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    private String f7425a;

    private String f7426b;

    private JSONObject f7427c;

    private boolean f7428d;

    public i(JSONObject jSONObject) throws JSONException, Q6.g {
        this.f7425a = jSONObject.isNull("notificationId") ? null : jSONObject.getString("notificationId");
        this.f7426b = jSONObject.isNull("type") ? null : jSONObject.getString("type");
        this.f7427c = jSONObject.isNull("detail") ? null : jSONObject.getJSONObject("detail");
        this.f7428d = jSONObject.getBoolean("fallbackDelivered");
        a();
    }

    private void a() throws Q6.g {
        if (this.f7427c == null) {
            throw new Q6.g("PushNotificationMetadata details object is null");
        }
        String str = this.f7426b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new Q6.g("PushNotificationMetadata notificationType is null or empty");
        }
        if (!r.a(this.f7425a)) {
            throw new Q6.g("PushNotificationMetadata notificationId is invalid");
        }
    }

    public JSONObject b() {
        return this.f7427c;
    }

    public String c() {
        return this.f7425a;
    }

    public String d() {
        return this.f7426b;
    }
}
