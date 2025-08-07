package s6;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import h7.l;
import java.util.Iterator;
import java.util.Vector;

public class C2886a extends RBHybridWebView {

    private b f23683A;

    private final String f23684v;

    private Vector<String> f23685w;

    private boolean f23686y;

    private Connection f23687z;

    class C0225a implements Callback {

        class RunnableC0226a implements Runnable {

            final String f23689d;

            RunnableC0226a(String str) {
                this.f23689d = str;
            }

            @Override
            public void run() {
                C2886a.this.a(this.f23689d);
            }
        }

        C0225a() {
        }

        public void onItemSet(String str) {
            l.a("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            C2886a.this.n(new RunnableC0226a(str));
        }
    }

    public interface b {
        void a(String str);
    }

    private class c extends WebViewClient {

        private WebViewClient f23691a;

        c(WebViewClient webViewClient) {
            this.f23691a = webViewClient;
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f23691a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            C2886a.this.f23686y = true;
            WebViewClient webViewClient = this.f23691a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            C2886a.this.m();
        }

        @Override
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C2886a.this.f23686y = false;
            WebViewClient webViewClient = this.f23691a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f23691a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    public C2886a(Context context, b bVar) {
        super(context);
        this.f23684v = "rbx.browserservice";
        this.f23685w = null;
        this.f23686y = false;
        this.f23683A = bVar;
    }

    private void l() {
        this.f23687z = MemStorage.bind("BrowserService.ExecuteJavaScript", new C0225a());
    }

    public void m() {
        Vector<String> vector = this.f23685w;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.a(it.next());
            }
            this.f23685w.clear();
        }
    }

    public void n(Runnable runnable) {
        ((q7.c) this).d.post(runnable);
    }

    private void o() {
        Connection connection = this.f23687z;
        if (connection != null) {
            connection.disconnect();
        }
    }

    public void a(String str) {
        if (this.f23686y) {
            super.a(str);
            return;
        }
        if (this.f23685w == null) {
            this.f23685w = new Vector<>();
        }
        this.f23685w.add(str);
    }

    protected void d(String str) {
        b bVar = this.f23683A;
        if (bVar != null) {
            bVar.a(str);
        } else {
            MemStorage.fire("BrowserService.JavaScriptCallback", str);
        }
    }

    @Override
    protected void f(Context context) {
    }

    @Override
    public void g() {
        l.a("rbx.browserservice", "create -> bindBrowserService");
        l();
    }

    @Override
    public void h() {
        l.a("rbx.browserservice", "destroy -> unbindBrowserService");
        o();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super/*android.webkit.WebView*/.setWebViewClient(new c(webViewClient));
    }

    public C2886a(Context context) {
        super(context);
        this.f23684v = "rbx.browserservice";
        this.f23685w = null;
        this.f23686y = false;
    }
}
