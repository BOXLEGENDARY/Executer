package S6;

import org.json.JSONException;
import org.json.JSONObject;

public class n {

    private String f7439a;

    private String f7440b;

    private String f7441c;

    private String f7442d;

    private String f7443e;

    private int f7444f;

    public n(JSONObject jSONObject) throws JSONException {
        this.f7441c = jSONObject.getString("statusMessage");
        JSONObject jSONObject2 = jSONObject.getJSONObject("registration");
        this.f7439a = jSONObject2.getString("platform");
        this.f7440b = jSONObject2.getString("name");
        this.f7442d = jSONObject2.getString("notificationToken");
        this.f7443e = jSONObject2.getString("application");
        this.f7444f = jSONObject2.getInt("userPushNotificationDestinationId");
    }

    public String a() {
        return this.f7439a;
    }
}
