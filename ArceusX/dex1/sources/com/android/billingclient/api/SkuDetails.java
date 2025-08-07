package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

@Deprecated
public class SkuDetails {

    private final String f13400a;

    private final JSONObject f13401b;

    public String a() {
        return this.f13401b.optString("productId");
    }

    public String b() {
        return this.f13401b.optString("type");
    }

    public int c() {
        return this.f13401b.optInt("offer_type");
    }

    public String d() {
        return this.f13401b.optString("offer_id");
    }

    public String e() {
        String strOptString = this.f13401b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f13401b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f13400a, ((SkuDetails) obj).f13400a);
        }
        return false;
    }

    public final String f() {
        return this.f13401b.optString("packageName");
    }

    public String g() {
        return this.f13401b.optString("serializedDocid");
    }

    final String h() {
        return this.f13401b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f13400a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f13400a));
    }
}
