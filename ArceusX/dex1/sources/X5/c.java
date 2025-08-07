package X5;

import H3.QdLC.QcdySgfdST;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    private JSONObject f7964a;

    private String f7965b;

    private String f7966c;

    private String f7967d;

    private String f7968e;

    private String f7969f;

    private String f7970g;

    private String f7971h;

    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        c e();

        void f(String str);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f7965b = str;
        this.f7966c = str2;
        this.f7967d = str3;
        this.f7968e = str4;
        j(str5);
        this.f7969f = str6;
        this.f7970g = str7;
        this.f7971h = str8;
    }

    public String a() {
        return this.f7967d;
    }

    public String b() {
        return this.f7968e;
    }

    public String c() {
        return this.f7966c;
    }

    public String d() {
        return this.f7970g;
    }

    public String e() {
        return this.f7971h;
    }

    public String f() {
        return this.f7965b;
    }

    public JSONObject g() {
        return this.f7964a;
    }

    public String h() {
        return this.f7964a.toString();
    }

    public String i() {
        return this.f7969f;
    }

    public void j(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f7964a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", QcdySgfdST.myeW);
            }
        }
        if (this.f7964a == null) {
            this.f7964a = new JSONObject();
        }
    }

    public void k(String str) {
        this.f7967d = str;
    }

    public void l(String str) {
        this.f7971h = str;
    }

    public void m(String str) {
        this.f7965b = str;
    }

    public void n(String str) {
        this.f7969f = str;
    }
}
