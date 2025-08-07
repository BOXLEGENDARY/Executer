package t6;

import android.os.Bundle;
import m6.C2591H;
import org.json.JSONObject;
import q7.b;

public class C2917e extends q7.b {

    private class a implements b.b {
        public void a(q7.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("request");
                if ("RequestGame".equals(jSONObjectOptJSONObject.optString("requestType"))) {
                    try {
                        C2591H c2591hA = C2591H.a(Long.valueOf(Long.parseLong(jSONObjectOptJSONObject.optString("placeId"))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", C2591H.M(c2591hA));
                        E6.f.c().f(101, bundle);
                        aVar.a(true, (JSONObject) null);
                        return;
                    } catch (NumberFormatException unused) {
                        h7.l.k("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            h7.l.k("rbx.hybrid", "launchGame request failed");
            aVar.a(false, (JSONObject) null);
        }

        private a() {
        }
    }

    public C2917e() {
        super("Game");
        d("launchGame", new a());
    }
}
