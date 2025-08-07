package g6;

import com.roblox.client.a0;
import k0.BAKp.xAQOwX;
import org.json.JSONObject;

public class i {

    public String f21001a;

    public String f21002b;

    private String f21003c;

    private JSONObject f21004d;

    public boolean f21005e = false;

    private boolean f21006f;

    public i(String str) {
        this.f21001a = str;
    }

    public static i a(String str, String str2) {
        i iVar = new i(str);
        iVar.g(str2);
        return iVar;
    }

    public static i b(String str) {
        i iVar = new i(str);
        iVar.f21005e = true;
        return iVar;
    }

    public static String c(long j7) {
        if (j7 == -1) {
            return a0.z0();
        }
        return a0.i() + "users/" + j7 + xAQOwX.FqNbHK;
    }

    public String d() {
        return this.f21003c;
    }

    public JSONObject e() {
        return this.f21004d;
    }

    public boolean f() {
        return this.f21006f;
    }

    public void g(String str) {
        this.f21003c = str;
    }

    public void h(JSONObject jSONObject) {
        this.f21004d = jSONObject;
    }

    public void i(String str) {
        this.f21002b = str;
    }

    public void j(boolean z7) {
        this.f21006f = z7;
    }
}
