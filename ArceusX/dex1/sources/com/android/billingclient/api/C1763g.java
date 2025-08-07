package com.android.billingclient.api;

import S9.Gvmm.CAqKeu;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1763g {

    private final String f13489a;

    private final JSONObject f13490b;

    private final String f13491c;

    private final String f13492d;

    private final String f13493e;

    private final String f13494f;

    private final String f13495g;

    private final String f13496h;

    private final String f13497i;

    private final List f13498j;

    private final List f13499k;

    public static final class a {

        private final int f13500a;

        private final int f13501b;

        a(JSONObject jSONObject) throws JSONException {
            this.f13500a = jSONObject.getInt("commitmentPaymentsCount");
            this.f13501b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {

        private final String f13502a;

        private final long f13503b;

        private final String f13504c;

        private final String f13505d;

        private final String f13506e;

        private final M f13507f;

        b(JSONObject jSONObject) throws JSONException {
            this.f13502a = jSONObject.optString("formattedPrice");
            this.f13503b = jSONObject.optLong("priceAmountMicros");
            this.f13504c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f13505d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").isEmpty();
            jSONObject.optString("purchaseOptionId").isEmpty();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            AbstractC2057e0.q(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f13506e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").isEmpty();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f13507f = jSONObjectOptJSONObject6 != null ? new M(jSONObjectOptJSONObject6) : null;
        }

        public String a() {
            return this.f13502a;
        }

        public long b() {
            return this.f13503b;
        }

        public String c() {
            return this.f13504c;
        }

        public final M d() {
            return this.f13507f;
        }

        public final String e() {
            return this.f13505d;
        }

        final String f() {
            return this.f13506e;
        }
    }

    public static final class c {

        private final String f13508a;

        private final long f13509b;

        private final String f13510c;

        private final String f13511d;

        private final int f13512e;

        private final int f13513f;

        c(JSONObject jSONObject) {
            this.f13511d = jSONObject.optString(ZJZXBWla.zVnAwwjz);
            this.f13510c = jSONObject.optString("priceCurrencyCode");
            this.f13508a = jSONObject.optString("formattedPrice");
            this.f13509b = jSONObject.optLong("priceAmountMicros");
            this.f13513f = jSONObject.optInt("recurrenceMode");
            this.f13512e = jSONObject.optInt("billingCycleCount");
        }

        public String a() {
            return this.f13508a;
        }

        public long b() {
            return this.f13509b;
        }

        public String c() {
            return this.f13510c;
        }
    }

    public static class d {

        private final List f13514a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f13514a = arrayList;
        }

        public List<c> a() {
            return this.f13514a;
        }
    }

    public static final class e {

        private final String f13515a;

        private final String f13516b;

        private final String f13517c;

        private final d f13518d;

        private final List f13519e;

        private final a f13520f;

        e(JSONObject jSONObject) throws JSONException {
            String str = wtzgsqRsIZB.yCrVNe;
            this.f13515a = jSONObject.optString(str);
            String strOptString = jSONObject.optString("offerId");
            this.f13516b = true == strOptString.isEmpty() ? null : strOptString;
            this.f13517c = jSONObject.getString("offerIdToken");
            this.f13518d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f13520f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString(str);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            this.f13519e = arrayList;
        }

        public String a() {
            return this.f13517c;
        }

        public d b() {
            return this.f13518d;
        }
    }

    C1763g(String str) throws JSONException {
        this.f13489a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f13490b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f13491c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f13492d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f13493e = jSONObject.optString("title");
        this.f13494f = jSONObject.optString("name");
        this.f13495g = jSONObject.optString("description");
        jSONObject.optString(CAqKeu.FuPLpgXLQtFZL);
        jSONObject.optString("iconUrl");
        this.f13496h = jSONObject.optString("skuDetailsToken");
        this.f13497i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i7)));
            }
            this.f13498j = arrayList;
        } else {
            this.f13498j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f13490b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f13490b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i8)));
            }
            this.f13499k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f13499k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f13499k = arrayList2;
        }
    }

    public String a() {
        return this.f13495g;
    }

    public b b() {
        List list = this.f13499k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f13499k.get(0);
    }

    public String c() {
        return this.f13491c;
    }

    public String d() {
        return this.f13492d;
    }

    public List<e> e() {
        return this.f13498j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1763g) {
            return TextUtils.equals(this.f13489a, ((C1763g) obj).f13489a);
        }
        return false;
    }

    public final String f() {
        return this.f13490b.optString("packageName");
    }

    final String g() {
        return this.f13496h;
    }

    public String h() {
        return this.f13497i;
    }

    public int hashCode() {
        return this.f13489a.hashCode();
    }

    final List i() {
        return this.f13499k;
    }

    public String toString() {
        List list = this.f13498j;
        return "ProductDetails{jsonString='" + this.f13489a + "', parsedJson=" + this.f13490b.toString() + ", productId='" + this.f13491c + "', productType='" + this.f13492d + "', title='" + this.f13493e + "', productDetailsToken='" + this.f13496h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
