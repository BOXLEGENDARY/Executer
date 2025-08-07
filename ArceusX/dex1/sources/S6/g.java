package S6;

import org.json.JSONException;
import org.json.JSONObject;

public class g implements m {

    private String f7418a;

    private String f7419b;

    private String f7420c;

    private String f7421d;

    public g(i iVar) throws JSONException {
        this.f7418a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7421d = jSONObjectB.getString("category");
        this.f7419b = jSONObjectB.getString("revokedNotificationType");
        this.f7420c = jSONObjectB.getString("revokeUpToDate");
    }

    @Override
    public long a() {
        return h7.g.a(this.f7420c);
    }

    @Override
    public String b() {
        return this.f7418a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof g) {
            this.f7418a = mVar.b();
            g gVar = (g) mVar;
            this.f7419b = gVar.e();
            this.f7420c = gVar.f();
            this.f7421d = gVar.d();
        }
    }

    public String d() {
        return this.f7421d;
    }

    public String e() {
        return this.f7419b;
    }

    public String f() {
        return this.f7420c;
    }
}
