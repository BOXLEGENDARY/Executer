package S6;

import org.json.JSONException;
import org.json.JSONObject;

public class h implements m {

    private String f7422a;

    private String f7423b;

    private String f7424c;

    public h(i iVar) throws JSONException {
        this.f7422a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7423b = jSONObjectB.getString("revokedNotificationType");
        this.f7424c = jSONObjectB.getString("revokedNotificationId");
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public String b() {
        return this.f7422a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof h) {
            this.f7422a = mVar.b();
            h hVar = (h) mVar;
            this.f7424c = hVar.d();
            this.f7423b = hVar.e();
        }
    }

    public String d() {
        return this.f7424c;
    }

    public String e() {
        return this.f7423b;
    }
}
