package com.roblox.client;

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
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.roblox.client.hybrid.RBHybridWebView;
import d6.C2400b;
import e7.e;
import ha.C2704j;
import ha.InterfaceC2707m;
import l6.C2554j;
import org.greenrobot.eventbus.ThreadMode;
import s6.C2886a;
import w6.C2980b;

public class k0 extends Fragment implements SwipeRefreshLayout.j, e.b {

    private String f20087A;

    private ProgressDialog f20088B;

    protected FrameLayout f20089C;

    private boolean f20090D;

    protected ValueCallback<Uri[]> f20091E;

    private M5.b f20095I;

    private C2980b f20096J;

    private e7.e f20097K;

    private TextView f20102d = null;

    protected RBHybridWebView f20103e = null;

    private SwipeRefreshLayout f20104i = null;

    protected String f20105v = null;

    private int f20106w = 0;

    private int f20107y = 0;

    protected String f20108z = null;

    private boolean f20092F = false;

    private boolean f20093G = false;

    protected boolean f20094H = true;

    final L6.f f20098L = new b();

    final L6.f f20099M = new c();

    final L6.f f20100N = new d();

    private final L6.f f20101O = new e();

    class a extends WebChromeClient {
        a() {
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
                    if (androidx.core.content.a.a(k0.this.getActivity(), C2374w.h().k().s(W7.m.d)) != 0) {
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
            k0.this.a0(webView, i7);
        }

        @Override
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            k0.this.f20091E = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            k0.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    class b implements L6.f {
        b() {
        }

        @Override
        public void a(L6.g gVar) {
            k0.this.F(gVar);
        }

        @Override
        public void b() {
            k0.this.c0();
        }

        @Override
        public void c() {
            k0.this.N();
        }

        @Override
        public void e() {
            k0.this.c0();
        }
    }

    class c implements L6.f {
        c() {
        }

        @Override
        public void a(L6.g gVar) {
            k0.this.F(gVar);
        }

        @Override
        public void b() {
            k0.this.c0();
        }

        @Override
        public void c() {
            k0.this.N();
        }

        @Override
        public void e() {
            k0.this.c0();
        }
    }

    class d implements L6.f {
        d() {
        }

        @Override
        public void a(L6.g gVar) {
            h7.l.g("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + gVar + ".");
            k0.this.F(gVar);
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

    class e implements L6.f {
        e() {
        }

        @Override
        public void a(L6.g gVar) {
            k0.this.F(gVar);
        }

        @Override
        public void b() {
        }

        @Override
        public void c() {
        }

        @Override
        public void e() {
            k0.this.c0();
        }
    }

    static class f {

        static final int[] f20114a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f20114a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20114a[e7.f.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20114a[e7.f.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class g {
        public g() {
        }
    }

    public interface h {
    }

    protected class i extends WebViewClient {

        class a implements InterfaceC2707m {
            a() {
            }

            @Override
            public void a(C2704j c2704j) {
            }
        }

        protected i() {
        }

        public void c(ActivityC1663h activityC1663h, String str, WebView webView) {
            if (activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
                return;
            }
            k0.this.f20102d.setText(str);
            webView.loadUrl(str);
        }

        public void d(final String str, final ActivityC1663h activityC1663h, final WebView webView, boolean z7) {
            if (!z7) {
                activityC1663h.runOnUiThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f20124d.c(activityC1663h, str, webView);
                    }
                });
            } else {
                Wa.c.d().j(k0.this.new g());
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
            k0.this.f20104i.setRefreshing(false);
            h7.l.g("rbx.web", "onPageFinished. url=" + str);
            k0.this.Z(str);
            if (C2554j.b().a(str)) {
                k0.this.f20103e.reload();
            }
        }

        @Override
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            h7.l.g("rbx.web", "-> " + str);
            k0.this.Y(str);
            k0.this.f20104i.setRefreshing(true);
        }

        @Override
        public boolean shouldOverrideUrlLoading(final android.webkit.WebView r12, final java.lang.String r13) {
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.k0.i.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    private synchronized void G(CharSequence charSequence) {
        ActivityC1663h activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.appcompat.app.c cVarA = new c.a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(M.f19643e0);
        int iIndexOf = charSequence.toString().indexOf(string);
        i7.b.b(textView, charSequence.toString(), new i7.a[]{new i7.c(activity, (String) null, string, iIndexOf, iIndexOf + string.length())});
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        cVarA.n(textView, 150, 100, 150, 100);
        cVarA.setCanceledOnTouchOutside(true);
        try {
            cVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private ProgressDialog H(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public boolean M(String str) {
        Intent intent = str.startsWith(sMlEMqrxoGI.YjmWRSAwhZfXiDC) ? new Intent("android.intent.action.SENDTO", Uri.parse(str)) : str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        if (intent == null) {
            return false;
        }
        if (h7.n.a(getContext(), intent)) {
            startActivity(intent);
            return true;
        }
        try {
            J().j0(M.f19637c0, 1);
        } catch (T unused) {
            W();
        }
        return true;
    }

    public void N() {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f20081d.T(activity);
                }
            });
        }
    }

    public void Q(ActivityC1663h activityC1663h, L6.g gVar) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        N();
        d0(gVar);
    }

    public void T(ActivityC1663h activityC1663h) {
        ProgressDialog progressDialog;
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed() || (progressDialog = this.f20088B) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f20088B.dismiss();
    }

    public void U(ActivityC1663h activityC1663h) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        if (this.f20088B == null) {
            this.f20088B = H(activityC1663h, null, getString(M.f19624X));
        }
        this.f20088B.show();
    }

    public static void W() {
        h7.l.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    public boolean X(String str) {
        b7.c cVar = new b7.c("rbx.web");
        if (!cVar.d(str)) {
            return false;
        }
        cVar.b(getActivity(), str, str);
        return true;
    }

    public void b0(String str, boolean z7) {
        if (str.contains("sponsored")) {
            this.f20103e.getSettings().setBuiltInZoomControls(z7);
        } else {
            this.f20103e.getSettings().setBuiltInZoomControls(!z7);
        }
    }

    public void c0() {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f20084d.U(activity);
                }
            });
        }
    }

    private void d0(L6.g gVar) {
        boolean zContains;
        ActivityC1663h activity = getActivity();
        if (activity == null) {
            return;
        }
        if (j6.d.a().P2()) {
            zContains = j6.d.a().Z1().contains(((L6.b) gVar).a());
        } else {
            zContains = false;
        }
        h7.l.a("rbx.web", "isBonusItemEnabled = " + zContains);
        CharSequence charSequenceB = gVar.b(activity);
        if (gVar.e()) {
            G(charSequenceB);
            return;
        }
        try {
            if (zContains) {
                J().e0(getString(M.f19638c1), getString(M.f19641d1));
            } else {
                J().r(charSequenceB.toString());
            }
        } catch (T unused) {
            W();
        }
    }

    static h x(k0 k0Var) {
        k0Var.getClass();
        return null;
    }

    protected void F(final L6.g gVar) {
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f20076d.Q(activity, gVar);
                }
            });
        }
    }

    public RBHybridWebView I() {
        return this.f20092F ? new C2886a(getContext()) : new RBHybridWebView(getContext());
    }

    protected S J() throws T {
        ActivityC1663h activity = getActivity();
        if (activity instanceof S) {
            return (S) activity;
        }
        throw new T();
    }

    protected String K() {
        return "undefinedWebContext";
    }

    public boolean L() {
        q7.c cVar = this.f20103e;
        if (cVar == null || !cVar.canGoBack()) {
            return false;
        }
        b0(this.f20103e.getUrl(), false);
        this.f20103e.goBack();
        return true;
    }

    public boolean O() {
        return this.f20093G;
    }

    public void R(e7.f fVar) {
        h7.l.a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + fVar);
        if (this.f20096J != null) {
            int i7 = f.f20114a[fVar.ordinal()];
            this.f20096J.g(i7 != 1 ? i7 != 2 ? getResources().getColor(G.f19441h) : getResources().getColor(G.f19434a) : getResources().getColor(G.f19448o));
        }
    }

    public void V(String str) {
        q7.c cVar = this.f20103e;
        if (cVar == null) {
            this.f20105v = str;
        } else {
            cVar.loadUrl(str);
        }
    }

    public void Y(String str) {
    }

    public void Z(String str) {
    }

    public void a0(WebView webView, int i7) {
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (j6.d.a().y3()) {
            e7.e eVar = new e7.e(this);
            this.f20097K = eVar;
            eVar.b(this);
        }
    }

    @Override
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (i7 == 20123) {
            if (i8 == -1) {
                this.f20091E.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                h7.l.g("rbx.web", "Result of file chooser invalid.");
                this.f20091E.onReceiveValue(null);
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
            if (string != null) {
                this.f20108z = string;
                if (this.f20105v == null) {
                    this.f20105v = string;
                }
            }
            this.f20087A = arguments.getString("WEB_VIEW_TAG", null);
            this.f20092F = arguments.getBoolean("USE_APP_HYBRID");
        }
        this.f20095I = new M5.b(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(K.f19569o, viewGroup, false);
        if (j6.d.a().y3()) {
            this.f20096J = new C2980b();
            ((ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams()).topMargin = 0;
            View viewE = this.f20096J.e(layoutInflater, this);
            this.f20096J.c().addView(viewInflate);
            viewInflate = viewE;
        }
        int i7 = J.f19512Y;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(i7);
        this.f20102d = (TextView) viewInflate.findViewById(J.f19537l0);
        WebViewClient iVar = new i();
        ?? I2 = I();
        this.f20103e = I2;
        viewGroup2.addView((View) I2, new ViewGroup.LayoutParams(-1, -1));
        this.f20103e.setTag(this.f20087A);
        this.f20103e.setWebViewClient(iVar);
        this.f20103e.getSettings().setSupportMultipleWindows(true);
        this.f20103e.setWebChromeClient(new a());
        this.f20103e.getSettings().setJavaScriptEnabled(true);
        if (j6.d.a().O3()) {
            this.f20103e.getSettings().setDomStorageEnabled(true);
        }
        this.f20103e.getSettings().setUserAgentString(a0.T0());
        this.f20103e.getSettings().setCacheMode(-1);
        this.f20103e.setHorizontalScrollBarEnabled(false);
        this.f20103e.setVerticalScrollBarEnabled(false);
        String userAgentString = this.f20103e.getSettings().getUserAgentString();
        this.f20103e.getSettings().setUserAgentString(null);
        String userAgentString2 = this.f20103e.getSettings().getUserAgentString();
        this.f20103e.getSettings().setUserAgentString(userAgentString);
        userAgentString2.contains("Chrome/");
        if (C2400b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        String str = this.f20105v;
        if (str != null) {
            this.f20103e.loadUrl(str);
            this.f20105v = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(i7);
        this.f20104i = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f20104i;
        int i8 = G.f19435b;
        int i9 = G.f19450q;
        swipeRefreshLayout2.setColorSchemeResources(i8, i8, i9, i9);
        this.f20089C = (FrameLayout) viewInflate.findViewById(J.f19517b0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20106w = arguments.getInt("dialogHeight", 0);
            this.f20107y = arguments.getInt("dialogWidth", 0);
            if (!arguments.getBoolean("enablePullToRefresh", true)) {
                this.f20104i.setEnabled(false);
            }
            this.f20090D = arguments.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f20094H = arguments.getBoolean("VISIBLE", true);
            this.f20093G = arguments.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            J().m0();
        } catch (T unused) {
            W();
        }
        this.f20103e.g();
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
        this.f20103e.h();
        this.f20096J = null;
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(r7.a aVar) {
        if (this.f20103e != null) {
            throw null;
        }
    }

    @Override
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        if (z7 || !C2554j.b().a(this.f20103e.getUrl())) {
            return;
        }
        this.f20103e.reload();
    }

    @Override
    public void onPause() {
        super.onPause();
        q7.c cVar = this.f20103e;
        if (cVar != null) {
            cVar.onPause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        q7.c cVar = this.f20103e;
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
                this.f20104i.setRefreshing(false);
            } else {
                this.f20103e.reload();
            }
        }
    }
}
