package S6;

import org.json.JSONException;
import org.json.JSONObject;

public class j {

    private String f7429a;

    private JSONObject f7430b;

    public j(JSONObject jSONObject) throws JSONException {
        this.f7429a = jSONObject.getString("statusMessage");
        this.f7430b = jSONObject.getJSONObject("metadata");
    }

    public JSONObject a() {
        return this.f7430b;
    }
}
