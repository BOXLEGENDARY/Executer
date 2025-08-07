package S6;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements m {

    private String f7405a;

    private String f7406b;

    private long f7407c;

    private long f7408d;

    private String f7409e;

    public d(i iVar) throws JSONException, Q6.g {
        this.f7405a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7406b = jSONObjectB.isNull("SenderUserName") ? null : jSONObjectB.getString("SenderUserName");
        this.f7407c = jSONObjectB.getLong("SenderUserId");
        String string = jSONObjectB.isNull("EventDate") ? null : jSONObjectB.getString("EventDate");
        this.f7409e = string;
        this.f7408d = string == null ? -1L : h7.g.a(string);
        d();
    }

    private void d() throws Q6.g {
        String str = this.f7406b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new Q6.g("FriendRequestReceivedNotification username is null or empty");
        }
        String str2 = this.f7409e;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            throw new Q6.g("FriendRequestReceivedNotification date is null or empty");
        }
        if (this.f7407c <= 0) {
            throw new Q6.g("FriendRequestReceivedNotification userId <= 0");
        }
    }

    @Override
    public long a() {
        return this.f7408d;
    }

    @Override
    public String b() {
        return this.f7405a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof d) {
            this.f7405a = mVar.b();
            d dVar = (d) mVar;
            this.f7406b = dVar.f();
            this.f7407c = dVar.e();
            this.f7408d = mVar.a();
        }
    }

    public long e() {
        return this.f7407c;
    }

    public String f() {
        return this.f7406b;
    }
}
