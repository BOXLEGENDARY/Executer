package com.appsflyer.internal;

import S5.Cg.XjqcfAbdbc;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFj1iSDK {
    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return getMonetizationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getRevenue((JSONObject) obj);
        }
        if (Intrinsics.b(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> getMonetizationNetwork(JSONArray jSONArray) throws JSONException {
        IntRange intRangeM = kotlin.ranges.b.m(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.t(intRangeM, 10));
        kotlin.collections.D it = intRangeM.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(it.a());
            Intrinsics.checkNotNullExpressionValue(obj, XjqcfAbdbc.sIhwL);
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getRevenue(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, BuildConfig.FLAVOR);
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, BuildConfig.FLAVOR);
        Sequence sequenceA = kotlin.sequences.g.a(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceA) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, BuildConfig.FLAVOR);
            linkedHashMap.put(obj, AFAdRevenueData(obj2));
        }
        return linkedHashMap;
    }
}
