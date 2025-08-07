package S6;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements m {

    private String f7411a;

    private String f7412b;

    private long f7413c;

    private String f7414d;

    private long f7415e;

    private long f7416f;

    private String f7417g;

    public f(i iVar) throws JSONException, Q6.g {
        this.f7411a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7414d = jSONObjectB.isNull("AuthorUserName") ? null : jSONObjectB.getString("AuthorUserName");
        this.f7415e = jSONObjectB.getLong("AuthorUserId");
        this.f7412b = jSONObjectB.isNull("BodyPreview") ? null : jSONObjectB.getString("BodyPreview");
        this.f7413c = jSONObjectB.getLong("MessageId");
        String string = jSONObjectB.isNull("EventDate") ? null : jSONObjectB.getString("EventDate");
        this.f7417g = string;
        this.f7416f = string == null ? -1L : h7.g.a(string);
        d();
    }

    private void d() throws Q6.g {
        String str = this.f7414d;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new Q6.g("PrivateMessageNotification authorUserName is null or empty");
        }
        if (this.f7415e <= 0) {
            throw new Q6.g("PrivateMessageNotification authorUserId <= 0");
        }
        String str2 = this.f7417g;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            throw new Q6.g("PrivateMessageNotification date is null or empty");
        }
        String str3 = this.f7412b;
        if (str3 == null || TextUtils.isEmpty(str3)) {
            throw new Q6.g("PrivateMessageNotification bodyPreview is null or empty");
        }
        if (this.f7413c <= 0) {
            throw new Q6.g("PrivateMessageNotification messageId <= 0");
        }
    }

    private String g() {
        return this.f7412b;
    }

    @Override
    public long a() {
        return this.f7416f;
    }

    @Override
    public String b() {
        return this.f7411a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof f) {
            this.f7411a = mVar.b();
            f fVar = (f) mVar;
            this.f7414d = fVar.f();
            this.f7415e = fVar.e();
            this.f7412b = fVar.g();
            this.f7413c = fVar.h();
            this.f7416f = mVar.a();
        }
    }

    public long e() {
        return this.f7415e;
    }

    public String f() {
        return this.f7414d;
    }

    public long h() {
        return this.f7413c;
    }
}
