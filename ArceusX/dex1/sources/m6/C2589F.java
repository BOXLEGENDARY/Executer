package m6;

import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.a0;
import org.json.JSONException;
import org.json.JSONObject;

public class C2589F extends AbstractC2608j {

    private final String f22076a = "rbx.game.callback";

    private final a f22077b;

    private final P f22078c;

    public interface a {
        void a(long j7);

        void b(boolean z7);

        void d(long j7, String str);

        void e(int i7);

        void f(long j7, String str, String str2);

        void g(int i7);

        void i(String str, String str2, String str3);

        void m(long j7, String str, String str2);
    }

    public C2589F(a aVar, P p7) {
        this.f22077b = aVar;
        this.f22078c = p7;
    }

    private int t(int i7) {
        if (i7 == 3) {
            return com.roblox.client.M.f19665m0;
        }
        if (i7 == 4) {
            return com.roblox.client.M.f19667n0;
        }
        if (i7 == 5) {
            return com.roblox.client.M.f19669o0;
        }
        if (i7 == 6) {
            return com.roblox.client.M.f19671p0;
        }
        switch (i7) {
            case 10:
                return com.roblox.client.M.f19679t0;
            case 11:
                return com.roblox.client.M.f19675r0;
            case 12:
                return com.roblox.client.M.f19673q0;
            default:
                h7.l.k("rbx.game.callback", "(Game failed to start) Unexpected errorId=[" + i7 + "].");
                return com.roblox.client.M.f19677s0;
        }
    }

    public void a(int i7) {
        h7.l.g("rbx.game.callback", "exitGameWithError: errorID = " + i7);
        this.f22077b.g(t(i7));
    }

    public void b(long j7) {
        h7.l.a("rbx.game.callback", "gameLoadedCallback() " + j7);
        this.f22077b.a(j7);
    }

    public void e(String str) {
        this.f22077b.b(true);
    }

    public void f(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("onDataModelNotification() type:");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb.append(str3);
        h7.l.g("rbx.game.callback", sb.toString());
        if ("OPEN_CUSTOM_WEBVIEW".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("url");
                if (strOptString.isEmpty()) {
                    h7.l.k("rbx.game.callback", "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
                    return;
                }
                String strOptString2 = jSONObject.optString("title");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                this.f22077b.i(strOptString, strOptString2, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
            } catch (JSONException unused) {
                h7.l.k("rbx.game.callback", "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW");
            }
        }
    }

    public void j(long j7, String str) {
        this.f22077b.d(j7, str);
    }

    public void k(long j7, String str, String str2) {
        this.f22077b.m(j7, str, str2);
    }

    public void l(long j7, String str, String str2) {
        this.f22077b.f(j7, str, str2);
    }

    public void n(int i7) {
        if (a0.k0()) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: ignoring screen orientation change request on Quest");
            return;
        }
        if (i7 == 0) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE");
            this.f22077b.e(8);
            return;
        }
        if (i7 == 1) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE");
            this.f22077b.e(0);
            return;
        }
        if (i7 == 2) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
            this.f22077b.e(6);
            return;
        }
        if (i7 == 3) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT");
            this.f22077b.e(7);
        } else if (i7 == 4) {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER");
            this.f22077b.e(2);
        } else {
            h7.l.a("rbx.game.orientation", "screenOrientationChanged: newOrientation =" + i7);
        }
    }

    @Override
    public P p() {
        return this.f22078c;
    }
}
