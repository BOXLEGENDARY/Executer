package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class j {

    private static final long f19048d = TimeUnit.DAYS.toMillis(7);

    final String f19049a;

    private final String f19050b;

    private final long f19051c;

    private j(String str, String str2, long j7) {
        this.f19049a = str;
        this.f19050b = str2;
        this.f19051c = j7;
    }

    static j a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new j(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new j(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(strValueOf);
            Log.w(tAjeAKSIqDqzNP.EmltfqXbb, sb.toString());
            return null;
        }
    }

    static String b(String str, String str2, long j7) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j7);
            return jSONObject.toString();
        } catch (JSONException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    final boolean c(String str) {
        return System.currentTimeMillis() > this.f19051c + f19048d || !str.equals(this.f19050b);
    }
}
