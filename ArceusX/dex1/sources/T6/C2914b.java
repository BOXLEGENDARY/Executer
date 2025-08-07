package t6;

import g6.C2472h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.b;
import w7.Jld.EZYiRMRTxKdo;

public class C2914b extends q7.b {

    private class a implements b.b {
        public void a(q7.a aVar) {
            String strOptString = aVar.f().optString("placeID");
            if (strOptString == null) {
                aVar.a(false, (JSONObject) null);
                return;
            }
            h7.l.i("rbx.hybrid", EZYiRMRTxKdo.cQhcmEjwnW + strOptString);
            aVar.a(true, (JSONObject) null);
        }

        private a() {
        }
    }

    private class C0229b implements b.b {
        public void a(q7.a aVar) {
            JSONObject jSONObjectOptJSONObject;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null && (jSONObjectOptJSONObject = jSONObjectF.optJSONObject("params")) != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("userIds");
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    long jOptLong = jSONArrayOptJSONArray.optLong(i7, -1L);
                    if (jOptLong != -1) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            if (arrayList.size() <= 0) {
                aVar.a(false, (JSONObject) null);
            } else {
                Wa.c.d().j(new C2472h(-1L, ((Long) arrayList.get(0)).longValue()));
                aVar.a(true, (JSONObject) null);
            }
        }

        private C0229b() {
        }
    }

    public C2914b() {
        super("Chat");
        d("startChatConversation", new C0229b());
        d("shareGameToChat", new a());
    }
}
