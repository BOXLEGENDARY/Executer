package E6;

import D6.a;
import G6.c;
import K0.wJ.BtcVLuo;
import Q6.p;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import com.roblox.client.a0;
import h7.l;
import ha.C2701g;
import ha.C2703i;
import ha.C2704j;
import ha.InterfaceC2700f;
import ha.InterfaceC2707m;
import org.json.JSONException;
import org.json.JSONObject;
import t4.gYZ.uCYQMIHsy;

public class k {

    private long f1213a = -1;

    private boolean f1214b = false;

    class a extends C2703i {

        final d f1215a;

        a(d dVar) {
            this.f1215a = dVar;
        }

        @Override
        public void a(C2704j c2704j) {
            g7.c cVarC = g7.c.c();
            int iF = cVarC.f();
            boolean z7 = false;
            if (!c2704j.a().isEmpty()) {
                try {
                    iF = new JSONObject(c2704j.a()).optInt("robux");
                    cVarC.r(iF);
                    z7 = true;
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
            d dVar = this.f1215a;
            if (dVar != null) {
                dVar.a(z7, iF);
            }
        }
    }

    class b implements a.d {

        final f f1217a;

        b(f fVar) {
            this.f1217a = fVar;
        }

        @Override
        public void a() {
            this.f1217a.a();
        }
    }

    class c extends C2703i {

        final c.b f1219a;

        c(c.b bVar) {
            this.f1219a = bVar;
        }

        @Override
        public void a(C2704j c2704j) {
            l.g("rbx.login", "Logout: " + c2704j);
            if (c2704j.b() != 200) {
                P.f("logout", c2704j.e(), c2704j.b(), -1);
                t7.i.c().e(a0.K(), a0.i());
            }
            c.b bVar = this.f1219a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface d {
        void a(boolean z7, int i7);
    }

    private static class e {

        static final k f1221a = new k();
    }

    public interface f {
        void a();
    }

    public k() {
        k();
    }

    private void a(c.b bVar) {
        c cVar = new c(bVar);
        C2701g.a().a(a0.r0(), null, null, cVar).b();
    }

    private void b(Context context) {
        if (context != null) {
            ((NotificationManager) context.getSystemService("notification")).cancelAll();
        }
    }

    public static k e() {
        return e.f1221a;
    }

    public static boolean h() {
        return a0.P().getLong("userid_long", -1L) != -1;
    }

    private void k() {
        SharedPreferences sharedPreferencesP = a0.P();
        String string = sharedPreferencesP.getString("username", BuildConfig.FLAVOR);
        String string2 = sharedPreferencesP.getString("displayName", BuildConfig.FLAVOR);
        long j7 = sharedPreferencesP.getLong("userid_long", -1L);
        this.f1213a = j7;
        if (j7 == -1) {
            this.f1213a = sharedPreferencesP.getInt("userid", -1);
        }
        g7.c.c().o(sharedPreferencesP.getBoolean("under13", true));
        g7.c.c().u(string);
        g7.c.c().n(string2);
    }

    public static JSONObject l() throws JSONException {
        SharedPreferences sharedPreferencesP = a0.P();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", sharedPreferencesP.getLong("userid_long", -1L));
            jSONObject.put("isUnder13", sharedPreferencesP.getBoolean("under13", true));
            jSONObject.put("username", sharedPreferencesP.getString("username", BuildConfig.FLAVOR));
            jSONObject.put("displayName", sharedPreferencesP.getString("displayName", BuildConfig.FLAVOR));
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("invalid UserInfo json");
        }
    }

    private void n(Context context) {
        this.f1214b = false;
        o(-1L);
        q();
        p();
        r(true);
        U5.b.b().a();
        g7.c.c().a();
        p.c().a();
        b(context);
    }

    private void p() {
        a0.P().edit().remove("last_auth_cookie_expir_key").apply();
    }

    private void q() {
        a0.P().edit().remove("user_logged_in_time").apply();
    }

    private void r(boolean z7) {
        SharedPreferences.Editor editorEdit = a0.P().edit();
        editorEdit.remove("userid");
        String str = uCYQMIHsy.ifpEDqqqLfVlcwp;
        if (z7) {
            editorEdit.remove(str);
            editorEdit.remove("displayName");
            editorEdit.remove("under13");
        } else {
            editorEdit.putString("username", g7.c.c().k());
            editorEdit.putString("displayName", g7.c.c().b());
            editorEdit.putLong(str, this.f1213a);
            editorEdit.putBoolean("under13", g7.c.c().m());
        }
        editorEdit.apply();
    }

    public void c(Context context, boolean z7, c.b bVar) {
        if (z7) {
            a(bVar);
        }
        n(context);
        C2374w.h().p().c();
    }

    public void d(InterfaceC2707m interfaceC2707m) {
        g7.a aVar = new g7.a(interfaceC2707m);
        aVar.b();
        h.a("activeSession");
        aVar.c();
    }

    public boolean f() {
        return this.f1214b;
    }

    public long g() {
        return this.f1213a;
    }

    public boolean i() {
        return this.f1213a != -1;
    }

    public void j(Context context, String str, f fVar) {
        l.g("SessionManager", "didLoggedIn");
        this.f1214b = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f1213a = jSONObject.optLong("userId", this.f1213a);
                g7.c.c().t(this.f1213a);
                g7.c.c().o(jSONObject.optBoolean("isUnder13"));
                g7.c.c().u(jSONObject.optString("username", g7.c.c().k()));
                g7.c.c().n(jSONObject.optString("displayName", BuildConfig.FLAVOR));
                r(false);
                g7.c.c().p(jSONObject.optInt("membershipType", 0));
                jSONObject.optString(BtcVLuo.wfer, BuildConfig.FLAVOR);
                if (j6.d.a().N2()) {
                    C2374w.h().d().i(Long.toString(this.f1213a));
                }
            } catch (JSONException e7) {
                l.j("onAccountInfoFromLua: Exception: + " + e7.getMessage());
            }
        }
        D6.a aVar = new D6.a(context, "PostLogin", this.f1213a, g7.c.c().k());
        aVar.g(new b(fVar));
        aVar.e();
    }

    public void m(d dVar, InterfaceC2700f interfaceC2700f) {
        interfaceC2700f.b(a0.h(), null, new a(dVar)).b();
    }

    public void o(long j7) {
        this.f1213a = j7;
    }
}
