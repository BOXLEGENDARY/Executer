package S6;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements m {

    private String f7387a;

    private String f7388b;

    private String f7389c;

    private long f7390d;

    private long f7391e;

    @Deprecated
    private long f7392f;

    private String f7393g;

    private String f7394h;

    private String f7395i;

    private String f7396j;

    private String f7397k;

    private String f7398l;

    private String f7399m;

    public b(i iVar) throws JSONException, Q6.g {
        this.f7387a = iVar.c();
        JSONObject jSONObjectB = iVar.b();
        this.f7388b = jSONObjectB.isNull("SenderUserName") ? null : jSONObjectB.getString("SenderUserName");
        this.f7389c = jSONObjectB.isNull("SenderDisplayName") ? null : jSONObjectB.getString("SenderDisplayName");
        this.f7390d = jSONObjectB.getLong("SenderUserId");
        String string = jSONObjectB.isNull("EventDate") ? null : jSONObjectB.getString("EventDate");
        this.f7399m = string;
        this.f7391e = string == null ? -1L : h7.g.a(string);
        this.f7394h = jSONObjectB.isNull("ConversationTitle") ? null : jSONObjectB.getString("ConversationTitle");
        if (j6.d.a().D()) {
            this.f7393g = jSONObjectB.isNull("ConversationId") ? null : jSONObjectB.getString("ConversationId");
        } else {
            this.f7392f = jSONObjectB.getLong("ConversationId");
        }
        this.f7395i = jSONObjectB.isNull("ConversationType") ? null : jSONObjectB.getString("ConversationType");
        this.f7396j = jSONObjectB.isNull("MessageId") ? null : jSONObjectB.getString("MessageId");
        this.f7397k = jSONObjectB.isNull("MessageContent") ? null : jSONObjectB.getString("MessageContent");
        this.f7398l = jSONObjectB.isNull("Category") ? null : jSONObjectB.getString("Category");
        d();
    }

    private void d() throws Q6.g {
        String str = this.f7388b;
        if (str == null || TextUtils.isEmpty(str)) {
            throw new Q6.g("ChatNewMessageNotification senderName is null or empty");
        }
        if (this.f7390d <= 0) {
            throw new Q6.g("ChatNewMessageNotification senderId <= 0");
        }
        String str2 = this.f7398l;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            throw new Q6.g("ChatNewMessageNotification category is null or empty");
        }
        String str3 = this.f7399m;
        if (str3 == null || TextUtils.isEmpty(str3)) {
            throw new Q6.g("ChatNewMessageNotification date is null or empty");
        }
        String str4 = this.f7394h;
        if (str4 == null || TextUtils.isEmpty(str4)) {
            throw new Q6.g("ChatNewMessageNotification conversationTitle is null or empty");
        }
        if (this.f7392f <= 0) {
            throw new Q6.g("ChatNewMessageNotification conversationId is null");
        }
        String str5 = this.f7396j;
        if (str5 == null || TextUtils.isEmpty(str5)) {
            throw new Q6.g("ChatNewMessageNotification messageId is null or empty");
        }
        String str6 = this.f7397k;
        if (str6 == null || TextUtils.isEmpty(str6)) {
            throw new Q6.g("ChatNewMessageNotification messageContent is null or empty");
        }
        String str7 = this.f7395i;
        if (str7 == null || TextUtils.isEmpty(str7)) {
            throw new Q6.g("ChatNewMessageNotification conversationType is null or empty");
        }
        if (!o(this.f7395i)) {
            throw new Q6.g("ChatNewMessageNotification conversationType is invalid");
        }
    }

    private boolean o(String str) {
        return str.equals("OneToOneConversation") || str.equals("MultiUserConversation");
    }

    @Override
    public long a() {
        return this.f7391e;
    }

    @Override
    public String b() {
        return this.f7387a;
    }

    @Override
    public void c(m mVar) {
        if (mVar instanceof b) {
            this.f7387a = mVar.b();
            this.f7391e = mVar.a();
            b bVar = (b) mVar;
            this.f7388b = bVar.n();
            this.f7389c = bVar.l();
            this.f7390d = bVar.m();
            this.f7392f = bVar.g();
            this.f7394h = bVar.h();
            this.f7395i = bVar.i();
            this.f7396j = bVar.k();
            this.f7397k = bVar.j();
            this.f7398l = bVar.e();
        }
    }

    public String e() {
        return this.f7398l;
    }

    public String f() {
        return this.f7393g;
    }

    @Deprecated
    public long g() {
        return this.f7392f;
    }

    public String h() {
        return this.f7394h;
    }

    public String i() {
        return this.f7395i;
    }

    public String j() {
        return this.f7397k;
    }

    public String k() {
        return this.f7396j;
    }

    public String l() {
        return this.f7389c;
    }

    public long m() {
        return this.f7390d;
    }

    public String n() {
        return this.f7388b;
    }

    @Deprecated
    public b(String str, long j7, String str2, String str3) {
        this.f7398l = str;
        this.f7392f = j7;
        this.f7394h = str2;
        this.f7387a = str3;
    }

    public b(String str, String str2, String str3, String str4) {
        this.f7398l = str;
        this.f7393g = str2;
        this.f7394h = str3;
        this.f7387a = str4;
    }
}
