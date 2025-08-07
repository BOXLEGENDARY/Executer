package y6;

import E6.i;
import com.roblox.client.a0;
import g6.n;
import ha.C2697c;
import org.json.JSONException;
import org.json.JSONObject;
import y6.f;

public class e extends f {

    private final long f24471J;

    public e(long j7) {
        this.f24471J = j7;
    }

    @Override
    public void m() throws Throwable {
        U5.a aVar = null;
        try {
            JSONObject jSONObject = new JSONObject(C2697c.i(a0.V(this.f24471J), null, null).a());
            aVar = new U5.a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        if (aVar != null) {
            U5.b.b().e(aVar);
            i.b().c(new c(this.f24471J));
            Wa.c.d().j(new n(aVar.b()));
        }
    }

    @Override
    protected void v(f.a aVar) {
    }
}
