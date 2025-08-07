package C6;

import org.json.JSONException;
import org.json.JSONObject;

public class a {

    private String f853a;

    private String f854b;

    private String f855c;

    public a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.isNull("signupAndLogin") ? null : jSONObject.getJSONObject("signupAndLogin");
        if (jSONObject2 != null) {
            e(jSONObject2.isNull("locale") ? null : jSONObject2.getString("locale"));
        }
        JSONObject jSONObject3 = jSONObject.isNull("generalExperience") ? null : jSONObject.getJSONObject("generalExperience");
        if (jSONObject3 != null) {
            d(jSONObject3.isNull("locale") ? null : jSONObject3.getString("locale"));
        }
        JSONObject jSONObject4 = jSONObject.isNull("ugc") ? null : jSONObject.getJSONObject("ugc");
        if (jSONObject4 != null) {
            f(jSONObject4.isNull("locale") ? null : jSONObject4.getString("locale"));
        }
    }

    private void d(String str) {
        this.f854b = str;
    }

    private void e(String str) {
        this.f853a = str;
    }

    public String a() {
        return this.f854b;
    }

    public String b() {
        return this.f853a;
    }

    public String c() {
        return this.f855c;
    }

    public void f(String str) {
        this.f855c = str;
    }
}
