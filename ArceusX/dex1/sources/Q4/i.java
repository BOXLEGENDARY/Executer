package Q4;

import android.content.Context;
import android.text.TextUtils;
import j0.tkB.pkcpMQSgx;
import n3.C2649g;
import n3.C2651i;
import n3.C2653k;
import v3.r;

public final class i {

    private final String f4863a;

    private final String f4864b;

    private final String f4865c;

    private final String f4866d;

    private final String f4867e;

    private final String f4868f;

    private final String f4869g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2651i.q(!r.a(str), "ApplicationId must be set.");
        this.f4864b = str;
        this.f4863a = str2;
        this.f4865c = str3;
        this.f4866d = str4;
        this.f4867e = str5;
        this.f4868f = str6;
        this.f4869g = str7;
    }

    public static i a(Context context) {
        C2653k c2653k = new C2653k(context);
        String strA = c2653k.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new i(strA, c2653k.a("google_api_key"), c2653k.a("firebase_database_url"), c2653k.a("ga_trackingId"), c2653k.a(pkcpMQSgx.VGcEAKVUnXC), c2653k.a("google_storage_bucket"), c2653k.a("project_id"));
    }

    public String b() {
        return this.f4863a;
    }

    public String c() {
        return this.f4864b;
    }

    public String d() {
        return this.f4867e;
    }

    public String e() {
        return this.f4869g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C2649g.b(this.f4864b, iVar.f4864b) && C2649g.b(this.f4863a, iVar.f4863a) && C2649g.b(this.f4865c, iVar.f4865c) && C2649g.b(this.f4866d, iVar.f4866d) && C2649g.b(this.f4867e, iVar.f4867e) && C2649g.b(this.f4868f, iVar.f4868f) && C2649g.b(this.f4869g, iVar.f4869g);
    }

    public int hashCode() {
        return C2649g.c(this.f4864b, this.f4863a, this.f4865c, this.f4866d, this.f4867e, this.f4868f, this.f4869g);
    }

    public String toString() {
        return C2649g.d(this).a("applicationId", this.f4864b).a("apiKey", this.f4863a).a("databaseUrl", this.f4865c).a("gcmSenderId", this.f4867e).a("storageBucket", this.f4868f).a("projectId", this.f4869g).toString();
    }
}
