package com.appsflyer.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFg1mSDK {
    public static JSONObject getMediationNetwork(Map<String, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getMonetizationNetwork(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object getMonetizationNetwork(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getMonetizationNetwork(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? getMediationNetwork((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i7 = 0; i7 < length; i7++) {
                jSONArray2.put(getMonetizationNetwork(Array.get(obj, i7)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject getRevenue(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static List<Object> getRevenue(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object monetizationNetwork = jSONArray.get(i7);
            if (monetizationNetwork instanceof JSONArray) {
                monetizationNetwork = getRevenue((JSONArray) monetizationNetwork);
            } else if (monetizationNetwork instanceof JSONObject) {
                monetizationNetwork = getMonetizationNetwork((JSONObject) monetizationNetwork);
            }
            arrayList.add(monetizationNetwork);
        }
        return arrayList;
    }

    public static Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object monetizationNetwork = jSONObject.get(next);
            if (monetizationNetwork instanceof JSONArray) {
                monetizationNetwork = getRevenue((JSONArray) monetizationNetwork);
            } else if (monetizationNetwork instanceof JSONObject) {
                monetizationNetwork = getMonetizationNetwork((JSONObject) monetizationNetwork);
            }
            map.put(next, monetizationNetwork);
        }
        return map;
    }
}
