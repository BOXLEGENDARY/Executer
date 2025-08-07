package M6;

import e2.vb.oyfFwvPUKctyaG;
import org.json.JSONObject;

public class b {

    private String f2379a;

    private String f2380b;

    private String f2381c;

    private boolean f2382d;

    public b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2379a = jSONObject.getString("providerProductId");
            this.f2380b = jSONObject.getString("providerProductType");
            this.f2381c = jSONObject.getString("chargeRequestId");
            this.f2382d = !this.f2379a.isEmpty() && (this.f2380b.equalsIgnoreCase("subs") || this.f2380b.equalsIgnoreCase(oyfFwvPUKctyaG.BNssCKZFBgvIMAU)) && !this.f2381c.isEmpty();
        } catch (Exception unused) {
            this.f2382d = false;
        }
    }

    public String a() {
        return this.f2381c;
    }

    public boolean b() {
        return this.f2382d;
    }

    public boolean c() {
        return this.f2380b.equals("subs");
    }

    public String d() {
        return this.f2379a;
    }

    public String e() {
        return this.f2380b;
    }

    public String toString() {
        return "{ providerProductId: " + this.f2379a + ", providerProductType: " + this.f2380b + ", chargeRequestId: " + this.f2381c + " }";
    }
}
