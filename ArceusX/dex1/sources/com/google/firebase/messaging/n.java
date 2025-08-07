package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import k0.BAKp.xAQOwX;
import org.json.JSONArray;
import org.json.JSONException;
import ya.HnSi.PLHvHoayk;

public final class n {

    private final Bundle f19146a;

    public n(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f19146a = new Bundle(bundle);
    }

    public static boolean d(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(r("gcm.n.e"))) || bundle.getString("gcm.n.icon") != null || bundle.getString(r("gcm.n.icon")) != null;
    }

    private final String f(Resources resources, String str, String str2) {
        String strM = m(str2);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM, "string", str);
        if (identifier == 0) {
            String strValueOf = String.valueOf(str2);
            String strQ = q("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new String(strValueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 49 + String.valueOf(str2).length());
            sb.append(strQ);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] objArrO = o(str2);
        if (objArrO == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrO);
        } catch (MissingFormatArgumentException e7) {
            String strQ2 = q(str2);
            String string = Arrays.toString(objArrO);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strQ2).length() + 58 + String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strQ2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e7);
            return null;
        }
    }

    private final JSONArray p(String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            return new JSONArray(strC);
        } catch (JSONException unused) {
            String strQ = q(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 50 + String.valueOf(strC).length());
            sb.append("Malformed JSON for key ");
            sb.append(strQ);
            sb.append(": ");
            sb.append(strC);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    private static String q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    private static String r(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public final Uri a() {
        String strC = c("gcm.n.link_android");
        if (TextUtils.isEmpty(strC)) {
            strC = c("gcm.n.link");
        }
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return Uri.parse(strC);
    }

    public final String b(Resources resources, String str, String str2) {
        String strC = c(str2);
        return !TextUtils.isEmpty(strC) ? strC : f(resources, str, str2);
    }

    public final String c(String str) {
        Bundle bundle = this.f19146a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strR = r(str);
            if (this.f19146a.containsKey(strR)) {
                str = strR;
            }
        }
        return bundle.getString(str);
    }

    public final String e() {
        String strC = c("gcm.n.sound2");
        return TextUtils.isEmpty(strC) ? c("gcm.n.sound") : strC;
    }

    public final boolean g(String str) {
        String strC = c(str);
        return "1".equals(strC) || Boolean.parseBoolean(strC);
    }

    public final Integer h(String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strC));
        } catch (NumberFormatException unused) {
            String strQ = q(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 38 + String.valueOf(strC).length());
            sb.append("Couldn't parse value of ");
            sb.append(strQ);
            sb.append("(");
            sb.append(strC);
            sb.append(") into an int");
            Log.w(PLHvHoayk.qwwfO, sb.toString());
            return null;
        }
    }

    public final long[] i() throws JSONException {
        JSONArray jSONArrayP = p("gcm.n.vibrate_timings");
        if (jSONArrayP == null) {
            return null;
        }
        try {
            if (jSONArrayP.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayP.length();
            long[] jArr = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = jSONArrayP.optLong(i7);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String strValueOf = String.valueOf(jSONArrayP);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(strValueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final Long j(String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strC));
        } catch (NumberFormatException unused) {
            String strQ = q(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strQ).length() + 38 + String.valueOf(strC).length());
            sb.append("Couldn't parse value of ");
            sb.append(strQ);
            sb.append("(");
            sb.append(strC);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    final int[] k() throws JSONException {
        JSONArray jSONArrayP = p("gcm.n.light_settings");
        if (jSONArrayP == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayP.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayP.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayP.optInt(1);
            iArr[2] = jSONArrayP.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            String strValueOf = String.valueOf(jSONArrayP);
            String message = e7.getMessage();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(strValueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String strValueOf2 = String.valueOf(jSONArrayP);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(strValueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public final Bundle l() {
        Bundle bundle = new Bundle(this.f19146a);
        for (String str : this.f19146a.keySet()) {
            if (str.startsWith(xAQOwX.xmLejuD) || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String m(String str) {
        String strValueOf = String.valueOf(str);
        return c("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new String(strValueOf));
    }

    public final Bundle n() {
        Bundle bundle = new Bundle(this.f19146a);
        for (String str : this.f19146a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Object[] o(String str) {
        String strValueOf = String.valueOf(str);
        JSONArray jSONArrayP = p("_loc_args".length() != 0 ? strValueOf.concat("_loc_args") : new String(strValueOf));
        if (jSONArrayP == null) {
            return null;
        }
        int length = jSONArrayP.length();
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            strArr[i7] = jSONArrayP.optString(i7);
        }
        return strArr;
    }
}
