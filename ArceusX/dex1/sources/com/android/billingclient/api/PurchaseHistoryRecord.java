package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseHistoryRecord {

    private final String f13394a;

    private final String f13395b;

    private final JSONObject f13396c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f13394a = str;
        this.f13395b = str2;
        this.f13396c = new JSONObject(str);
    }

    public String a() {
        return this.f13394a;
    }

    public String b() {
        JSONObject jSONObject = this.f13396c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String c() {
        return this.f13395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f13394a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f13395b, purchaseHistoryRecord.c());
    }

    public int hashCode() {
        return this.f13394a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f13394a));
    }
}
