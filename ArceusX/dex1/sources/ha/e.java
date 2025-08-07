package ha;

import E6.h;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.roblox.client.P;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.universalapp.logging.LoggingProtocol;
import h7.l;
import h7.u;
import h7.v;
import java.util.ArrayList;
import java.util.List;

public class e {

    private static e f2089j;

    private final String f2090a = "app_start_loadtime";

    private final String f2091b = "startup_to_lua";

    private final String f2092c = "startup_to_web";

    private a f2093d = a.LAUNCH_STATE_NONE;

    private boolean f2094e = false;

    private long f2095f = 0;

    private long f2096g = 0;

    private final u f2097h;

    private final h f2098i;

    enum a {
        LAUNCH_STATE_NONE,
        LAUNCH_STATE_UI_PAUSED_BY_USER,
        f2105i,
        LAUNCH_STATE_INIT_DONE_OK,
        LAUNCH_STATE_INIT_STOPPED,
        LAUNCH_STATE_SESSION_CHECK_DONE_OK,
        LAUNCH_STATE_SESSION_CHECK_STOPPED,
        LAUNCH_STATE_POST_LOGIN_DONE_OK,
        LAUNCH_STATE_UI_HOME_STARTING,
        LAUNCH_STATE_UI_HOME_LOADED_OK
    }

    e(h hVar, u uVar) {
        l.g("LaunchTimeReporter", "[Constructor]: ENTER.");
        this.f2098i = hVar;
        this.f2097h = uVar;
    }

    private List<NameValuePair> a(long j7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("target", "mobile"));
        arrayList.add(new NameValuePair("event_type", "app_start_loadtime"));
        arrayList.add(new NameValuePair("startup_state", JmBUOGMwkkxg.CRiR));
        arrayList.add(new NameValuePair("startup_time", Long.toString(j7)));
        return arrayList;
    }

    public static e b() {
        if (f2089j == null) {
            synchronized (e.class) {
                try {
                    if (f2089j == null) {
                        f2089j = new e(h.b(), new v());
                    }
                } finally {
                }
            }
        }
        return f2089j;
    }

    public void c(boolean z7) {
        a aVar = this.f2093d;
        if (aVar == a.LAUNCH_STATE_UI_HOME_STARTING || aVar == a.f2105i || aVar == a.LAUNCH_STATE_INIT_DONE_OK || aVar == a.LAUNCH_STATE_SESSION_CHECK_DONE_OK) {
            this.f2093d = a.LAUNCH_STATE_UI_HOME_LOADED_OK;
            if (this.f2094e) {
                return;
            }
            long jB = this.f2097h.b() - this.f2095f;
            if (jB < 0) {
                return;
            }
            this.f2098i.q("Android-AppStartup-Launch-To-Home-Time", jB);
            LoggingProtocol.h().d("android_launch_time_reporter", jB);
            P.h("app_start_loadtime", z7 ? "startup_to_lua" : "startup_to_web", a(jB));
        }
    }

    public void d() {
        if (this.f2093d == a.LAUNCH_STATE_POST_LOGIN_DONE_OK) {
            this.f2093d = a.LAUNCH_STATE_UI_HOME_STARTING;
        }
    }

    public void e(boolean z7) {
        if (this.f2093d == a.f2105i) {
            this.f2093d = z7 ? a.LAUNCH_STATE_INIT_DONE_OK : a.LAUNCH_STATE_INIT_STOPPED;
            this.f2096g = this.f2097h.b();
        }
    }

    public void f() {
        if (this.f2093d == a.LAUNCH_STATE_NONE) {
            this.f2093d = a.f2105i;
            this.f2095f = this.f2097h.b();
        }
    }

    public void g() {
        this.f2094e = true;
    }

    public void h() {
        if (this.f2093d == a.LAUNCH_STATE_SESSION_CHECK_DONE_OK) {
            this.f2093d = a.LAUNCH_STATE_POST_LOGIN_DONE_OK;
        }
    }

    public void i(boolean z7) {
        if (this.f2093d == a.LAUNCH_STATE_INIT_DONE_OK) {
            this.f2093d = z7 ? a.LAUNCH_STATE_SESSION_CHECK_DONE_OK : a.LAUNCH_STATE_SESSION_CHECK_STOPPED;
            if (z7) {
                this.f2097h.b();
            }
        }
    }

    public void j() {
        if (this.f2093d != a.LAUNCH_STATE_UI_HOME_STARTING) {
            this.f2093d = a.LAUNCH_STATE_UI_PAUSED_BY_USER;
        }
    }
}
