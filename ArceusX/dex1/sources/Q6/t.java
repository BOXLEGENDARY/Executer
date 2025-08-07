package Q6;

import android.content.Context;
import com.roblox.client.P;
import ha.C2697c;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class t {

    b f4891a = new a();

    class a implements b {
        a() {
        }

        @Override
        public void a(S6.j jVar, Context context, String str, String str2, j jVar2) {
            if (jVar != null) {
                JSONObject jSONObjectA = jVar.a();
                try {
                    jVar2.d(jSONObjectA, context);
                    P.q("onMetadataRetrieved", str, jSONObjectA.getString("type"), jSONObjectA.getString("notificationId"), str2, "0", new ArrayList());
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    public interface b {
        void a(S6.j jVar, Context context, String str, String str2, j jVar2);
    }

    private String b(Context context) {
        return h7.p.a(context);
    }

    private s c() {
        return new s();
    }

    String a(Context context, String str, s sVar) {
        return sVar.a(context, str);
    }

    void d(Context context, R6.a aVar, String str, String str2, String str3, String str4, b bVar) {
        h7.l.i("rbx.push", str + " " + str2 + " " + context);
        if (str == null || str2 == null || context == null) {
            return;
        }
        aVar.b(context, str, str2, str3, str4, bVar);
    }

    public void e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        s sVarC = c();
        String strA = a(context, m.c().e(context), sVarC);
        String strA2 = a(context, m.c().i(context), sVarC);
        String strB = b(context);
        E6.c.e().k(context);
        C2697c.e(context);
        d(context, new R6.a(), strA, strA2, str, strB, this.f4891a);
    }
}
