package S6;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements m {

    private String f7400a;

    private String f7401b;

    private long f7402c;

    private long f7403d;

    private String f7404e;

    public c(i iVar) throws JSONException, Q6.g {
        this.f7400a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7401b = jSONObjectB.isNull("AccepterUserName") ? null : jSONObjectB.getString("AccepterUserName");
        this.f7402c = jSONObjectB.getLong("AccepterUserId");
        String string = jSONObjectB.isNull("EventDate") ? null : jSONObjectB.getString("EventDate");
        this.f7404e = string;
        this.f7403d = string == null ? -1L : h7.g.a(string);
        d();
    }

    private void d() throws Q6.g {
        String str = this.f7401b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new Q6.g("FriendRequestAcceptedNotification username is null or empty");
        }
        if (this.f7402c <= 0) {
            throw new Q6.g("FriendRequestAcceptedNotification userId <= 0");
        }
        String str2 = this.f7404e;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            throw new Q6.g("FriendRequestAcceptedNotification date is null or empty");
        }
    }

    @Override
    public long a() {
        return this.f7403d;
    }

    @Override
    public String b() {
        return this.f7400a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof c) {
            this.f7400a = mVar.b();
            c cVar = (c) mVar;
            this.f7401b = cVar.f();
            this.f7402c = cVar.e();
            this.f7403d = mVar.a();
        }
    }

    public long e() {
        return this.f7402c;
    }

    public String f() {
        return this.f7401b;
    }
}
