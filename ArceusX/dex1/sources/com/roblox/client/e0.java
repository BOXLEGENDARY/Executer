package com.roblox.client;

import E6.c;
import U7.e;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.fragment.app.ActivityC1663h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.purchase.IAPPurchaseManager;
import d6.C2400b;
import ha.C2704j;
import ha.InterfaceC2707m;
import l6.C2554j;
import org.greenrobot.eventbus.ThreadMode;
import s6.C2886a;

public class e0 extends X implements SwipeRefreshLayout.j {

    private String f19957M;

    private ProgressDialog f19958N;

    protected FrameLayout f19959O;

    private boolean f19960P;

    private h f19961Q;

    protected ValueCallback<Uri[]> f19962R;

    private M5.b f19966V;

    private TextView f19950F = null;

    protected RBHybridWebView f19951G = null;

    private SwipeRefreshLayout f19952H = null;

    protected String f19953I = null;

    private int f19954J = 0;

    private int f19955K = 0;

    protected String f19956L = null;

    private boolean f19963S = false;

    private boolean f19964T = false;

    protected boolean f19965U = true;

    final L6.f f19967W = new c();

    final L6.f f19968X = new d();

    final L6.f f19969Y = new e();

    private final L6.f f19970Z = new f();

    class a implements C2886a.b {
        a() {
        }

        @Override
        public void a(String str) {
            if (e0.this.f19961Q != null) {
                e0.this.f19961Q.a(str);
            }
        }
    }

    class b extends WebChromeClient {
        b() {
        }

        @Override
        public boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
            if (!z8) {
                return super.onCreateWindow(webView, z7, z8, message);
            }
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (androidx.core.content.a.a(e0.this.getActivity(), C2374w.h().k().s(W7.m.d)) != 0) {
                        h7.l.g("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        h7.l.g("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override
        public void onProgressChanged(WebView webView, int i7) {
            super.onProgressChanged(webView, i7);
            e0.this.e0(webView, i7);
        }

        @Override
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            e0.this.f19962R = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            e0.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    class c implements L6.f {
        c() {
        }

        @Override
        public void a(L6.g gVar) {
            e0.this.L(gVar);
        }

        @Override
        public void b() {
            e0.this.k0();
        }

        @Override
        public void c() {
            e0.this.V();
        }

        @Override
        public void e() {
            e0.this.k0();
        }
    }

    class d implements L6.f {
        d() {
        }

        @Override
        public void a(L6.g gVar) {
            e0.this.L(gVar);
        }

        @Override
        public void b() {
            e0.this.k0();
        }

        @Override
        public void c() {
            e0.this.V();
        }

        @Override
        public void e() {
            e0.this.k0();
        }
    }

    class e implements L6.f {
        e() {
        }

        @Override
        public void a(L6.g gVar) {
            h7.l.g("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + gVar + ".");
            e0.this.L(gVar);
        }

        @Override
        public void b() {
        }

        @Override
        public void c() {
        }

        @Override
        public void e() {
        }
    }

    class f implements L6.f {
        f() {
        }

        @Override
        public void a(L6.g gVar) {
            e0.this.L(gVar);
        }

        @Override
        public void b() {
        }

        @Override
        public void c() {
        }

        @Override
        public void e() {
            e0.this.k0();
        }
    }

    public class g {
        public g() {
        }
    }

    public interface h {
        void a(String str);
    }

    public interface i {
    }

    protected class j extends WebViewClient {

        class a implements InterfaceC2707m {
            a() {
            }

            @Override
            public void a(C2704j c2704j) {
            }
        }

        protected j() {
        }

        public void c(ActivityC1663h activityC1663h, String str, WebView webView) {
            if (activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
                return;
            }
            e0.this.f19950F.setText(str);
            webView.loadUrl(str);
        }

        public void d(final String str, final ActivityC1663h activityC1663h, final WebView webView, boolean z7) {
            if (!z7) {
                activityC1663h.runOnUiThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f20004d.c(activityC1663h, str, webView);
                    }
                });
            } else {
                Wa.c.d().j(e0.this.new g());
                U7.e.n().c(str);
            }
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            t7.g.h().k(a0.i());
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            e0.this.f19952H.setRefreshing(false);
            h7.l.g("rbx.web", "onPageFinished. url=" + str);
            e0.this.d0(str);
            if (C2554j.b().a(str)) {
                e0.this.f19951G.reload();
            }
        }

        @Override
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            h7.l.g("rbx.web", "-> " + str);
            e0.this.c0(str);
            e0.this.f19952H.setRefreshing(true);
        }

        @Override
        public boolean shouldOverrideUrlLoading(final WebView webView, final String str) {
            h7.l.g("rbx.web", "-> " + str);
            if (str == null) {
                h7.l.d("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            final ActivityC1663h activity = e0.this.getActivity();
            if (activity == null || activity.isFinishing()) {
                h7.l.g("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                return true;
            }
            if (e0.this.q() || e0.this.U(str)) {
                return true;
            }
            if (e0.this.b0(str)) {
                h7.l.g("rbx.web", "Navigating social media Link...");
                return true;
            }
            if (str.equalsIgnoreCase(a0.x0())) {
                e0.F(e0.this);
                return true;
            }
            if (a0.h0(str) && !e0.this.f19960P) {
                h7.l.g("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                e0 e0Var = e0.this;
                e0Var.w(A6.a.c(e0Var.getContext(), M.f19684w, new Object[0]), 1);
                E6.c.e().h(activity, c.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a0.R(str);
                E6.k.e().d(new a());
                return true;
            }
            String queryParameter = null;
            e0.this.f19951G.setOnTouchListener(null);
            e0.this.j0(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                U7.e.n().e(str, new e.h() {
                    public final void a(boolean z7) {
                        this.f19981a.d(str, activity, webView, z7);
                    }
                });
                return true;
            }
            String strK = g7.c.c().k();
            Uri uri = Uri.parse(str);
            String queryParameter2 = uri.getQueryParameter("id");
            if (h7.n.h()) {
                h7.l.g("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app purchase. Username = " + strK);
                P6.a.a(activity);
                e0.this.o(M.f19644e1);
            } else if (j6.d.a().M0()) {
                M6.i.n0(activity).e(BuildConfig.FLAVOR);
                IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter2);
            } else {
                M6.i iVarN0 = M6.i.n0(activity);
                if (iVarN0 == null) {
                    e0.this.o(M.f19644e1);
                } else {
                    P.c(e0.this.O(), "purchaseStart" + queryParameter2);
                    try {
                        queryParameter = uri.getQueryParameter("recurring");
                    } catch (NullPointerException unused) {
                        h7.l.g("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                    } catch (UnsupportedOperationException unused2) {
                        h7.l.g("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                    }
                    if (!iVarN0.c(strK, queryParameter2, activity, e0.this.f19967W, Boolean.valueOf(queryParameter).booleanValue())) {
                        e0.this.o(M.f19632a1);
                    }
                }
            }
            return true;
        }
    }

    static i F(e0 e0Var) {
        e0Var.getClass();
        return null;
    }

    private ProgressDialog M(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public boolean U(String str) {
        Intent intent = str.startsWith("mailto:") ? new Intent("android.intent.action.SENDTO", Uri.parse(str)) : str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        if (intent == null) {
            return false;
        }
        if (h7.n.a(getContext(), intent)) {
            startActivity(intent);
            return true;
        }
        v(M.f19637c0, 1);
        return true;
    }

    public void V() {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f19904d.Y(activity);
                }
            });
        }
    }

    public void X(ActivityC1663h activityC1663h, L6.g gVar) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        V();
        l0(gVar);
    }

    public void Y(ActivityC1663h activityC1663h) {
        ProgressDialog progressDialog;
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed() || (progressDialog = this.f19958N) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f19958N.dismiss();
    }

    public void Z(ActivityC1663h activityC1663h) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        if (this.f19958N == null) {
            this.f19958N = M(activityC1663h, null, getString(M.f19624X));
        }
        this.f19958N.show();
    }

    public boolean b0(String str) {
        b7.c cVar = new b7.c("rbx.web");
        if (!cVar.d(str)) {
            return false;
        }
        cVar.b(getActivity(), str, str);
        return true;
    }

    public void j0(String str, boolean z7) {
        if (str.contains("sponsored")) {
            this.f19951G.getSettings().setBuiltInZoomControls(z7);
        } else {
            this.f19951G.getSettings().setBuiltInZoomControls(!z7);
        }
    }

    public void k0() {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f19942d.Z(activity);
                }
            });
        }
    }

    private void l0(L6.g gVar) {
        ActivityC1663h activity = getActivity();
        if (activity == null) {
            return;
        }
        CharSequence charSequenceB = gVar.b(activity);
        if (gVar.e()) {
            s(charSequenceB);
        } else {
            r(charSequenceB.toString());
        }
    }

    protected void L(final L6.g gVar) {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f19900d.X(activity, gVar);
                }
            });
        }
    }

    public RBHybridWebView N() {
        return this.f19963S ? j6.d.a().P1() ? new C2886a(getContext(), new a()) : new C2886a(getContext()) : new RBHybridWebView(getContext());
    }

    protected String O() {
        return KwdswzaUHE.vqXGjNEmqccDvfM;
    }

    public String Q() {
        q7.c cVar = this.f19951G;
        return cVar == null ? this.f19953I : cVar.getUrl();
    }

    @Override
    public void R(e7.f fVar) {
        super.R(fVar);
        this.f19951G.setBackgroundColor(this.f19966V.a(g7.c.c().g()));
    }

    public boolean T() {
        q7.c cVar = this.f19951G;
        if (cVar == null || !cVar.canGoBack()) {
            return false;
        }
        j0(this.f19951G.getUrl(), false);
        this.f19951G.goBack();
        return true;
    }

    public boolean W() {
        return this.f19964T;
    }

    public void a0(String str) {
        q7.c cVar = this.f19951G;
        if (cVar == null) {
            this.f19953I = str;
        } else {
            cVar.loadUrl(str);
        }
    }

    public void c0(String str) {
    }

    public void d0(String str) {
    }

    public void e0(WebView webView, int i7) {
    }

    public void f0(boolean z7) {
        this.f19964T = z7;
    }

    public void g0(h hVar) {
        this.f19961Q = hVar;
    }

    public void h0(boolean z7) {
        this.f19965U = z7;
    }

    public void m0(E7.a aVar) {
        Boolean bool = aVar.c;
        if (bool != null) {
            h0(bool.booleanValue());
        }
        Boolean bool2 = aVar.e;
        if (bool2 != null) {
            f0(bool2.booleanValue());
        }
    }

    @Override
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (i7 == 20123) {
            if (i8 == -1) {
                this.f19962R.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                h7.l.g("rbx.web", "Result of file chooser invalid.");
                this.f19962R.onReceiveValue(null);
            }
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r7.b.a().n(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("DEFAULT_URL", null);
            h7.l.a("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string.contains("/giftcards?")) {
                string = string.replace("/giftcards?", "/shopgiftcards?");
            }
            h7.l.a("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f19956L = string;
                if (this.f19953I == null) {
                    this.f19953I = string;
                }
            }
            this.f19957M = arguments.getString("WEB_VIEW_TAG", null);
            this.f19963S = arguments.getBoolean("USE_APP_HYBRID");
        }
        this.f19966V = new M5.b(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(K.f19567m, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(J.f19512Y);
        this.f19950F = (TextView) viewInflate.findViewById(J.f19537l0);
        WebViewClient jVar = new j();
        ?? N2 = N();
        this.f19951G = N2;
        viewGroup2.addView((View) N2, new ViewGroup.LayoutParams(-1, -1));
        this.f19951G.setTag(this.f19957M);
        this.f19951G.setWebViewClient(jVar);
        this.f19951G.getSettings().setSupportMultipleWindows(true);
        this.f19951G.setWebChromeClient(new b());
        try {
            this.f19951G.getSettings().setJavaScriptEnabled(true);
            this.f19951G.getSettings().setDomStorageEnabled(true);
            this.f19951G.getSettings().setUserAgentString(a0.T0());
            this.f19951G.getSettings().setCacheMode(-1);
            this.f19951G.setHorizontalScrollBarEnabled(false);
            this.f19951G.setVerticalScrollBarEnabled(false);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        String userAgentString = this.f19951G.getSettings().getUserAgentString();
        this.f19951G.getSettings().setUserAgentString(null);
        String userAgentString2 = this.f19951G.getSettings().getUserAgentString();
        this.f19951G.getSettings().setUserAgentString(userAgentString);
        userAgentString2.contains("Chrome/");
        if (C2400b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        String str = this.f19953I;
        if (str != null) {
            this.f19951G.loadUrl(str);
            this.f19953I = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(J.f19512Y);
        this.f19952H = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f19952H;
        int i7 = G.f19435b;
        int i8 = G.f19450q;
        swipeRefreshLayout2.setColorSchemeResources(i7, i7, i8, i8);
        this.f19959O = (FrameLayout) viewInflate.findViewById(J.f19517b0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f19954J = arguments.getInt("dialogHeight", 0);
            this.f19955K = arguments.getInt("dialogWidth", 0);
            this.f19952H.setEnabled(false);
            this.f19960P = arguments.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f19965U = arguments.getBoolean("VISIBLE", true);
            this.f19964T = arguments.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        q();
        this.f19951G.g();
        return viewInflate;
    }

    @Override
    public void onDestroy() {
        r7.b.a().p(this);
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.f19951G.h();
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(r7.a aVar) {
        if (this.f19951G != null) {
            throw null;
        }
    }

    @Override
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        if (z7 || !C2554j.b().a(this.f19951G.getUrl())) {
            return;
        }
        this.f19951G.reload();
    }

    @Override
    public void onPause() {
        super.onPause();
        q7.c cVar = this.f19951G;
        if (cVar != null) {
            cVar.onPause();
        }
    }

    @Override
    public void onResume() {
        Window window;
        super.onResume();
        if (getDialog() != null && this.f19954J != 0 && (window = getDialog().getWindow()) != null) {
            int i7 = this.f19955K;
            if (i7 == 0) {
                window.setLayout(-2, this.f19954J);
            } else {
                window.setLayout(i7, this.f19954J);
            }
        }
        q7.c cVar = this.f19951G;
        if (cVar != null) {
            cVar.onResume();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void p() {
        if (getActivity() != null) {
            if (((S) getActivity()).m0()) {
                this.f19952H.setRefreshing(false);
            } else {
                this.f19951G.reload();
            }
        }
    }
}
