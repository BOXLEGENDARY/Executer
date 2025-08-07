package d6;

import android.content.Context;
import org.json.JSONObject;

public class C2399a {

    private final String f20340a = "configure_dev_settings";

    private final String f20341b = "config_json";

    private X5.d f20342c;

    private JSONObject f20343d;

    private Context f20344e;

    public C2399a(Context context) {
        this.f20344e = context;
        X5.d dVar = new X5.d(context);
        this.f20342c = dVar;
        X5.c cVarA = dVar.a(context);
        this.f20343d = cVarA != null ? cVarA.g() : new JSONObject();
    }

    public static JSONObject b(Context context) {
        if (context != null) {
            return new C2399a(context).a();
        }
        return null;
    }

    public JSONObject a() {
        return this.f20343d;
    }
}
