package l6;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC1663h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.M;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.e0;
import f6.ck.ZJZXBWla;
import g6.C2465a;
import g6.m;
import h7.l;
import java.net.URI;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import z6.h;

public class C2546b extends e0 {

    private String f21816d0;

    private boolean f21817e0;

    private JSONObject f21819g0;

    private boolean f21820h0;

    protected RobloxToolbar f21821i0;

    protected RobloxToolbar f21822j0;

    protected G6.d f21823k0;

    protected Menu f21824l0;

    private View.OnClickListener f21828p0;

    protected G6.f f21829q0;

    private G6.h f21830r0;

    private ProgressDialog f21831s0;

    protected String f21813a0 = null;

    protected boolean f21814b0 = false;

    private int f21815c0 = -1;

    protected boolean f21818f0 = false;

    private boolean f21825m0 = false;

    private boolean f21826n0 = false;

    private View f21827o0 = null;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            if (C2546b.this.T()) {
                return;
            }
            C2546b c2546b = C2546b.this;
            if (c2546b.f21814b0) {
                c2546b.getActivity().onBackPressed();
            }
        }
    }

    class ViewOnClickListenerC0206b implements View.OnClickListener {
        ViewOnClickListenerC0206b() {
        }

        @Override
        public void onClick(View view) {
            C2546b.this.f21826n0 = true;
            ActivityC1663h activity = C2546b.this.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    class c implements h.c {

        final Activity f21834a;

        c(Activity activity) {
            this.f21834a = activity;
        }

        @Override
        public void a(boolean z7) {
            l.i("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f21834a;
            if (activity == null || !activity.isFinishing()) {
                C2546b.this.q0();
                if (z7) {
                    this.f21834a.recreate();
                    Activity activity2 = this.f21834a;
                    if (activity2 instanceof ActivityNativeMain) {
                        return;
                    }
                    activity2.finish();
                }
            }
        }
    }

    private ProgressDialog p0(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public void q0() {
        ProgressDialog progressDialog = this.f21831s0;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f21831s0.dismiss();
    }

    private void t0(String str) {
        String string = BuildConfig.FLAVOR;
        try {
            URI uri = new URI(str);
            boolean zEqualsIgnoreCase = uri.getScheme().equalsIgnoreCase("https");
            String host = uri.getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(zEqualsIgnoreCase ? "🔒 " : BuildConfig.FLAVOR);
            sb.append(host);
            string = sb.toString();
        } catch (Exception e7) {
            l.e("rbx.web", ZJZXBWla.vPrXf, e7);
        }
        this.f21822j0.setTitle(string);
    }

    private void w0() {
        G6.d dVar = this.f21823k0;
        if (dVar != null) {
            dVar.j();
        }
    }

    private void x0(String str) {
        G6.h hVar;
        if (this.f21829q0 == null || (hVar = this.f21830r0) == null) {
            return;
        }
        hVar.e(str);
        this.f21829q0.r();
    }

    private void y0(boolean z7) {
        if (this.f21825m0 != z7) {
            l.a("rbx.web", "updateToolbar() canGoBack:" + z7);
            this.f21825m0 = z7;
            V5.i.e(this.f21822j0, (z7 || this.f21814b0) ? this.f21828p0 : null);
        }
    }

    @Override
    public void R(e7.f fVar) {
        this.f21822j0.R(fVar);
        this.f21821i0.R(fVar);
        ActivityC1663h activity = getActivity();
        if (activity != null) {
            Menu menu = this.f21822j0.getMenu();
            menu.clear();
            u0(menu, activity.getMenuInflater());
        }
        super.R(fVar);
    }

    @Override
    public boolean T() {
        if (this.f21826n0) {
            return false;
        }
        return super.T();
    }

    @Override
    public void c0(String str) {
        if (this.f21817e0) {
            t0(str);
        }
        x0(str);
    }

    @Override
    public void e0(WebView webView, int i7) {
        super.e0(webView, i7);
        y0(webView.canGoBack());
    }

    @Override
    public void h0(boolean z7) {
        super.h0(z7);
        View view = this.f21827o0;
        if (view != null) {
            view.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override
    public void m0(E7.a aVar) {
        super.m0(aVar);
        String str = aVar.b;
        if (str != null) {
            this.f21822j0.setTitle(str);
        }
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.f21817e0) {
            String str = this.f21816d0;
            if (str != null) {
                this.f21822j0.setTitle(str);
            } else {
                int i7 = this.f21815c0;
                if (i7 == -1) {
                    this.f21822j0.setTitle(M.f19589E);
                } else {
                    this.f21822j0.setTitle(i7);
                }
            }
        }
        V5.i.e(this.f21822j0, this.f21814b0 ? this.f21828p0 : null);
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(C2465a c2465a) {
        ActivityC1663h activity = getActivity();
        if (activity != null) {
            ProgressDialog progressDialogP0 = p0(activity, getString(M.f19617S));
            this.f21831s0 = progressDialogP0;
            progressDialogP0.show();
            s0(activity, new z6.h(), new c(activity));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (j6.d.a().P1() || !(context instanceof ActivityNativeMain)) {
            return;
        }
        this.f21820h0 = true;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f21815c0 = arguments.getInt("TITLE_ID", -1);
            this.f21816d0 = arguments.getString("TITLE_STRING");
            this.f21813a0 = arguments.getString("REPORTING_TAB_NAME");
            this.f21814b0 = arguments.getBoolean("HAS_PARENT");
            this.f21818f0 = arguments.getBoolean("HIDE_ACCESSORY_BUTTONS");
            this.f21817e0 = arguments.getBoolean("SHOW_DOMAIN_AS_TITLE");
            try {
                this.f21819g0 = new JSONObject(arguments.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (this.f21819g0 == null) {
            this.f21819g0 = new JSONObject();
        }
        this.f21828p0 = new a();
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(K.f19574t, viewGroup, false);
        this.f21821i0 = (RobloxToolbar) linearLayout.findViewById(J.f19521d0);
        RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(J.f19523e0);
        this.f21822j0 = robloxToolbar;
        if (this.f21820h0) {
            this.f21821i0.setVisibility(8);
        } else {
            robloxToolbar.setThemeColorDelegate(new RobloxToolbar.f());
            this.f21821i0.setIconDelegate(new RobloxToolbar.c());
            this.f21821i0.setThemeColorDelegate(new RobloxToolbar.d());
            this.f21821i0.setNavigationOnClickListener(new ViewOnClickListenerC0206b());
        }
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(J.f19530i);
        frameLayout.addView(super.onCreateView(layoutInflater, frameLayout, bundle));
        u0(this.f21822j0.getMenu(), getActivity().getMenuInflater());
        this.f21827o0 = linearLayout;
        if (!this.f19965U) {
            h0(false);
        }
        return linearLayout;
    }

    @Override
    public void onDestroyView() {
        q0();
        super.onDestroyView();
    }

    @Override
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        if (z7) {
            return;
        }
        w0();
    }

    @Override
    public void onResume() {
        super.onResume();
        w0();
    }

    @Override
    public void onStart() {
        super.onStart();
        Wa.c.d().n(this);
    }

    @Override
    public void onStop() {
        Wa.c.d().p(this);
        super.onStop();
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(m mVar) {
        l.h("GWF.onUnreadNotificationCountEvent() " + mVar.a());
        G6.d dVar = this.f21823k0;
        if (dVar != null) {
            dVar.j();
        }
    }

    protected void r0(Menu menu, MenuInflater menuInflater) {
        G6.d dVar = new G6.d(this);
        this.f21823k0 = dVar;
        dVar.d(menu, menuInflater);
    }

    void s0(Activity activity, z6.h hVar, h.c cVar) {
        hVar.b(activity, true, cVar);
    }

    protected void u0(Menu menu, MenuInflater menuInflater) {
        this.f21824l0 = menu;
        if (this.f21818f0) {
            if (this.f21819g0.length() > 0) {
                v0(menu, menuInflater, 54);
            }
        } else {
            v0(menu, menuInflater, 34);
            new G6.e(this, this.f21813a0).e(menu, menuInflater);
            r0(menu, menuInflater);
        }
    }

    protected void v0(Menu menu, MenuInflater menuInflater, int i7) {
        String strOptString = this.f21819g0.optString("searchType", null);
        if (strOptString != null) {
            this.f21830r0 = new G6.g(this, strOptString);
        }
        if (this.f21830r0 == null) {
            this.f21830r0 = new G6.h(this);
        }
        G6.f fVar = new G6.f(this);
        this.f21829q0 = fVar;
        fVar.n(menu);
        this.f21829q0.p(this.f21822j0);
        this.f21829q0.o(this.f21830r0);
        this.f21829q0.k(menu, menuInflater);
        V5.i.a(this.f21822j0, getContext(), J.f19518c, i7);
    }
}
