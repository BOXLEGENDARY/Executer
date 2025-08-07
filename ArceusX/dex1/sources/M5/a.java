package M5;

import S5.Cg.XjqcfAbdbc;
import android.os.Handler;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import h7.l;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    private final String f2359a = "rbx.browserservice";

    private Handler f2360b;

    private d f2361c;

    private Connection f2362d;

    private Connection f2363e;

    private Connection f2364f;

    class C0034a implements Callback {

        class RunnableC0035a implements Runnable {

            final E7.a f2366d;

            RunnableC0035a(E7.a aVar) {
                this.f2366d = aVar;
            }

            @Override
            public void run() {
                a.this.f2361c.f(this.f2366d);
            }
        }

        C0034a() {
        }

        public void onItemSet(String str) {
            l.a("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            a.this.d(new RunnableC0035a(new E7.a(str)));
        }
    }

    class b implements Callback {

        class RunnableC0036a implements Runnable {
            RunnableC0036a() {
            }

            @Override
            public void run() {
                a.this.f2361c.e();
            }
        }

        b() {
        }

        public void onItemSet(String str) {
            l.a("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            a.this.d(new RunnableC0036a());
        }
    }

    class c implements Callback {

        class RunnableC0037a implements Runnable {

            final E7.a f2371d;

            RunnableC0037a(E7.a aVar) {
                this.f2371d = aVar;
            }

            @Override
            public void run() {
                a.this.f2361c.f(this.f2371d);
            }
        }

        class b implements Runnable {

            final E7.a f2373d;

            b(E7.a aVar) {
                this.f2373d = aVar;
            }

            @Override
            public void run() {
                a.this.f2361c.d(this.f2373d);
            }
        }

        c() {
        }

        public void onItemSet(String str) throws JSONException {
            l.a("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    a.this.d(new RunnableC0037a(new E7.a(jSONObject.getString("url"), jSONObject.optString("title", BuildConfig.FLAVOR), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean(XjqcfAbdbc.SJbQQdnjbcxI, false)))));
                    return;
                }
                if (string.equals("config")) {
                    a.this.d(new b(new E7.a((String) null, jSONObject.has("title") ? jSONObject.optString("title") : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, (Boolean) null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
                    return;
                }
                l.d("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
            } catch (JSONException unused) {
                l.d("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    public interface d {
        void d(E7.a aVar);

        void e();

        void f(E7.a aVar);
    }

    public a(d dVar, Handler handler) {
        this.f2361c = dVar;
        this.f2360b = handler;
    }

    public void d(Runnable runnable) {
        this.f2360b.post(runnable);
    }

    public void c() {
        this.f2362d = MemStorage.bind("BrowserService.OpenBrowserWindow", new C0034a());
        this.f2363e = MemStorage.bind("BrowserService.CloseBrowserWindow", new b());
        this.f2364f = MemStorage.bind("BrowserService.SendCommand", new c());
    }

    public void e() {
        Connection connection = this.f2362d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f2363e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f2364f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
