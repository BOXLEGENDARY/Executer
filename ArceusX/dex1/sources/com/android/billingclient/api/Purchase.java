package com.android.billingclient.api;

import android.text.TextUtils;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase {

    private final String f13391a;

    private final String f13392b;

    private final JSONObject f13393c;

    public Purchase(String str, String str2) throws JSONException {
        this.f13391a = str;
        this.f13392b = str2;
        this.f13393c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f13393c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f13393c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i7));
                }
            }
        } else if (this.f13393c.has("productId")) {
            arrayList.add(this.f13393c.optString("productId"));
        }
        return arrayList;
    }

    public C1757a a() {
        JSONObject jSONObject = this.f13393c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C1757a(strOptString, strOptString2);
    }

    public String b() {
        String strOptString = this.f13393c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String c() {
        return this.f13391a;
    }

    public String d() {
        return this.f13393c.optString("packageName");
    }

    public List<String> e() {
        return j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f13391a, purchase.c()) && TextUtils.equals(this.f13392b, purchase.h());
    }

    public int f() {
        return this.f13393c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String g() {
        JSONObject jSONObject = this.f13393c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String h() {
        return this.f13392b;
    }

    public int hashCode() {
        return this.f13391a.hashCode();
    }

    public boolean i() {
        return this.f13393c.optBoolean(YGBtcyQ.SJNmyzBlby, true);
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f13391a));
    }
}
