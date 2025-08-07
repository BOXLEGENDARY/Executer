package com.android.billingclient.api;

import com.android.billingclient.api.C1763g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class M {
    M(JSONObject jSONObject) throws JSONException {
        jSONObject.getString("type");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i7)));
            }
        }
        new C1763g.d(jSONObject.getJSONArray("pricingPhases"));
    }
}
