package com.roblox.client.game;

import E6.c;
import E6.k;
import G6.e;
import O7.a;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC1663h;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.C2366n;
import com.roblox.client.X;
import com.roblox.client.app.AppInputFocusLifecycleObserver;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import g6.C2467c;
import g6.C2472h;
import g6.i;
import h7.l;
import org.json.JSONObject;

public class c extends OnAppBridgeNotificationListener {

    private a f20071c;

    private b f20072d;

    private final String f20069a = "rbx.datamodel";

    private final String f20070b = "OPEN_YOUTUBE_VIDEO";

    private AppInputFocusLifecycleObserver f20073e = new AppInputFocusLifecycleObserver();

    public interface a {
        void c(String str);
    }

    public interface b {
        X a();
    }

    public c(a aVar, b bVar) {
        this.f20071c = aVar;
        this.f20072d = bVar;
    }

    private void c(String str) {
        str.hashCode();
        if (str.equals("Startup")) {
            ha.d.p().j("luaStartup");
        } else if (str.equals("Landing")) {
            ha.d.p().j("luaLandingScreen");
        }
    }

    private void d() {
        ha.d.p().j("luaHomeScreen");
    }

    public void e(JSONObject jSONObject) {
        C2366n.b(jSONObject, this.f20072d.a().getActivity());
    }

    public void a(String str, String str2) throws Resources.NotFoundException, NumberFormatException {
        String str3;
        long j7;
        StringBuilder sb = new StringBuilder();
        sb.append("onDataModelNotification() type:");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb.append(str3);
        l.g("rbx.datamodel", sb.toString());
        if (str.equals("VIEW_PROFILE")) {
            i iVarB = i.b("PROFILE_TAG");
            iVarB.i(str2);
            iVarB.j(true);
            Wa.c.d().j(iVarB);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            Wa.c.d().j(new i("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            i iVar = new i("ABUSE_REPORT_TAG");
            iVar.i(str2);
            iVar.j(true);
            Wa.c.d().j(iVar);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            Wa.c.d().j(new C2467c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new e(this.f20072d.a(), "tabAvatar").g(this.f20073e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new G6.d(this.f20072d.a()).f(this.f20073e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f20071c.c(str2);
            if (!j6.d.a().z1() && this.f20072d.a().getActivity() != null) {
                U7.e.n().o(this.f20072d.a().getActivity());
            }
            if (j6.d.a().L3()) {
                c(str2);
                return;
            }
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            i iVarB2 = i.b("CUSTOM_WEBVIEW_TAG");
            iVarB2.g(str2);
            iVarB2.j(true);
            Wa.c.d().j(iVarB2);
            return;
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new G6.b(this.f20072d.a(), "tabMore").c(this.f20073e);
            return;
        }
        if (str.equals(vxbbqXNtzfMxs.bWmLf)) {
            i iVarB3 = i.b("SEARCH_GAMES_TAG");
            iVarB3.i(str2);
            iVarB3.j(true);
            Wa.c.d().j(iVarB3);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new G6.c(this.f20072d.a()).c(this.f20073e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            ha.e.b().c(true);
            ha.l.a("LuaHomePageLoaded");
            ha.l.d();
            if (j6.d.a().L3()) {
                d();
                return;
            }
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j7 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                l.k("rbx.datamodel", "could not parse data");
                j7 = -1;
            }
            if (j7 != -1) {
                Wa.c.d().j(new C2472h(j7));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            Wa.c.d().j(new i("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            i iVarA = i.a("YOUTUBE_TAG", str2);
            iVarA.j(true);
            Wa.c.d().j(iVarA);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            ha.e.b().g();
            ActivityC1663h activity = this.f20072d.a().getActivity();
            if (activity != null) {
                com.roblox.client.startup.d.s(activity).J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            ActivityC1663h activity2 = this.f20072d.a().getActivity();
            if (activity2 != null) {
                com.roblox.client.startup.d.G(activity2, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            ha.e.b().g();
            ActivityC1663h activity3 = this.f20072d.a().getActivity();
            if (activity3 != null) {
                com.roblox.client.startup.d.s(activity3).I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            ActivityC1663h activity4 = this.f20072d.a().getActivity();
            if (activity4 == null || !k.e().f()) {
                return;
            }
            E6.c.e().h(activity4, c.d.LOGOUT_BY_USER_IN_LUA);
            O7.a.a().c();
            if (j6.d.a().X0()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            ActivityC1663h activity5 = this.f20072d.a().getActivity();
            if (activity5 != null) {
                E6.c.e().i(activity5);
                O7.a.a().c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            ActivityC1663h activity6 = this.f20072d.a().getActivity();
            if (activity6 == 0 || activity6.isFinishing() || !(activity6 instanceof b7.d)) {
                return;
            }
            ((b7.d) activity6).j(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            ActivityC1663h activity7 = this.f20072d.a().getActivity();
            if (activity7 != null) {
                activity7.recreate();
            } else {
                l.k("rbx.datamodel", "could not restart lua app");
            }
        }
    }

    public void f() {
        if (this.f20072d.a().getActivity() != null) {
            O7.a.a().b(new a.b() {
                public final void a(JSONObject jSONObject) {
                    this.f22177a.e(jSONObject);
                }
            });
            if (j6.d.a().z1()) {
                return;
            }
            U7.e.n().o(this.f20072d.a().getActivity());
        }
    }
}
