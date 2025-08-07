package t6;

import com.roblox.client.realtime.RealtimeService;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;

public class m extends q7.b {

    private class a implements b.b {
        public void a(q7.a aVar) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isConnected", RealtimeService.e());
                jSONObject.put("sequenceNumber", RealtimeService.d());
                jSONObject.put("namespaceSequenceNumbers", W6.b.a().b());
                h7.l.i("rbx.signalr", "RBHybridModuleRealtime IsConnectedFunction.execute() command:" + aVar.f() + " callback:" + jSONObject);
                aVar.a(true, jSONObject);
            } catch (JSONException e7) {
                e7.printStackTrace();
                aVar.a(false, (JSONObject) null);
            }
        }

        private a() {
        }
    }

    public m() {
        super("RealTime");
        d("isConnected", new a());
    }
}
