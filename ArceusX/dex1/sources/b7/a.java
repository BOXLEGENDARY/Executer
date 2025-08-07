package b7;

import U.Gw.oeVkjmfPcLbWm;
import Y3.qE.KpBmp;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import h7.l;
import org.json.JSONException;
import org.json.JSONObject;
import y0.xyyu.hkVlaTTCDY;

public class a {

    protected String f12649a;

    public a(String str) {
        this.f12649a = str;
    }

    public void a(Activity activity, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            l.k(this.f12649a, oeVkjmfPcLbWm.ZOzu);
            jSONObject = null;
        }
        c(activity, jSONObject);
    }

    public void b(Activity activity, String str, String str2) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
                return;
            }
        }
        if (str2 == null || str2.isEmpty()) {
            l.k(this.f12649a, hkVlaTTCDY.eDN);
        } else {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public void c(Activity activity, JSONObject jSONObject) {
        if (jSONObject != null) {
            b(activity, jSONObject.optString("app_uri"), jSONObject.optString(KpBmp.DApHec));
        }
    }
}
