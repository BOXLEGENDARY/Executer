package W6;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    private final boolean f7698a;

    private Map<String, Long> f7699b;

    private static class a {

        public static final b f7700a = new b();
    }

    public static b a() {
        return a.f7700a;
    }

    public synchronized JSONObject b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (String str : this.f7699b.keySet()) {
            try {
                jSONObject.put(str, this.f7699b.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private b() {
        this.f7698a = false;
        this.f7699b = new HashMap();
    }
}
