package com.appsflyer.internal;

import P9.o;
import Y3.qE.KpBmp;
import Za.qhkq.dHkZSUxHu;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFh1iSDK {
    public final AFh1hSDK AFAdRevenueData;
    public final AFh1gSDK getMediationNetwork;
    public AFh1bSDK getRevenue;

    public AFh1iSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, BuildConfig.FLAVOR);
        this.getRevenue = getMediationNetwork(jSONObject);
        this.getMediationNetwork = getMonetizationNetwork(jSONObject);
        this.AFAdRevenueData = getRevenue(jSONObject);
    }

    private static AFh1bSDK getMediationNetwork(JSONObject jSONObject) {
        Object objB;
        AFh1bSDK aFh1bSDK;
        List listJ;
        try {
            o.a aVar = P9.o.e;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j7 = mediationNetwork.getLong("ttl");
                int i7 = mediationNetwork.getInt("counter");
                String strOptString = mediationNetwork.optString("app_ver", BuildConfig.FLAVOR);
                String strOptString2 = mediationNetwork.optString(dHkZSUxHu.QEWU, BuildConfig.FLAVOR);
                float fOptDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = mediationNetwork.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, BuildConfig.FLAVOR);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        String string = jSONArrayOptJSONArray.getString(i8);
                        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                        arrayList.add(string);
                    }
                    listJ = arrayList;
                } else {
                    listJ = CollectionsKt.j();
                }
                Intrinsics.checkNotNullExpressionValue(strOptString, BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(strOptString2, BuildConfig.FLAVOR);
                aFh1bSDK = new AFh1bSDK(j7, fOptDouble, listJ, i7, strOptString, strOptString2);
            } else {
                aFh1bSDK = null;
            }
            objB = P9.o.b(aFh1bSDK);
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        return (AFh1bSDK) (P9.o.g(objB) ? null : objB);
    }

    private static AFh1gSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, KpBmp.kPeIjOWvCKkSf);
            objB = P9.o.b(mediationNetwork != null ? new AFh1gSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        return (AFh1gSDK) (P9.o.g(objB) ? null : objB);
    }

    private static AFh1hSDK getRevenue(JSONObject jSONObject) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            objB = P9.o.b(mediationNetwork != null ? new AFh1hSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        return (AFh1hSDK) (P9.o.g(objB) ? null : objB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(AFh1iSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, BuildConfig.FLAVOR);
        AFh1iSDK aFh1iSDK = (AFh1iSDK) obj;
        return Intrinsics.b(this.getMediationNetwork, aFh1iSDK.getMediationNetwork) && Intrinsics.b(this.AFAdRevenueData, aFh1iSDK.AFAdRevenueData) && Intrinsics.b(this.getRevenue, aFh1iSDK.getRevenue);
    }

    public final int hashCode() {
        AFh1gSDK aFh1gSDK = this.getMediationNetwork;
        int iHashCode = (aFh1gSDK != null ? aFh1gSDK.hashCode() : 0) * 31;
        AFh1hSDK aFh1hSDK = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0)) * 31;
        AFh1bSDK aFh1bSDK = this.getRevenue;
        return iHashCode2 + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
