package com.roblox.client;

import E6.c;
import E6.f;
import H3.QdLC.QcdySgfdST;
import K0.wJ.BtcVLuo;
import M5.a;
import O7.a;
import Q6.QtA.QXojhh;
import Q7.a;
import T7.a;
import U.Gw.oeVkjmfPcLbWm;
import Y3.qE.KpBmp;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.AbstractC1694h;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.result.ActivityResult;
import android.view.result.IntentSenderRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.axjava.Main;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.app.AppInputFocusLifecycleObserver;
import com.roblox.client.app.AppWebViewLifecycleObserver;
import com.roblox.client.captcha.ActivityFunCaptcha;
import com.roblox.client.captcha.CaptchaConfig;
import com.roblox.client.captcha.LoginCaptchaConfig;
import com.roblox.client.captcha.SignUpCaptchaConfig;
import com.roblox.client.e0;
import com.roblox.client.feature.FeatureState;
import com.roblox.client.game.MainActivityController;
import com.roblox.client.game.a;
import com.roblox.client.n0;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.client.startup.c;
import com.roblox.client.startup.f;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.mediapicker.MediaPickerProtocol;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.protocols.webview.a;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.JNISystemThemeProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import e.AbstractC2403c;
import e.InterfaceC2401a;
import e2.vb.oyfFwvPUKctyaG;
import g6.C2467c;
import g6.C2472h;
import h6.C2479a;
import ha.C2704j;
import ha.InterfaceC2707m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l6.C2553i;
import m6.C2591H;
import m6.C2617t;
import m6.EnumC2597N;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import t4.gYZ.uCYQMIHsy;
import w6.C2980b;
import w6.C2981c;
import ya.HnSi.PLHvHoayk;
import z3.AdxZ.bpTQi;
import z6.C3086b;

public class ActivityNativeMain extends S implements f.e, h6.d, c7.T, a.d, a.g, c.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, NativeGLJavaInterface.WebViewUserAgentGetter, NativeGLJavaInterface.MobileAdvertisingIdGetter, b7.d, a.f, C2617t.d, a.f {

    private static boolean f19379c0 = true;

    private boolean f19380H;

    private C2479a f19381I;

    private View f19382J;

    private View f19383K;

    private boolean f19384L;

    private long f19385M;

    private String f19386N;

    private int f19387O;

    private z6.f f19388P;

    private WebViewProtocol f19390R;

    private AppHangMonitor f19391S;

    private ScheduledThreadPoolExecutor f19392T;

    private MainActivityController f19393U;

    private AbstractC2403c<IntentSenderRequest> f19394V;

    private e7.i f19396X;

    private ImageView f19397Y;

    private M5.a f19389Q = null;

    private boolean f19395W = false;

    private final Runnable f19398Z = new Runnable() {
        @Override
        public final void run() {
            this.f20003d.i1();
        }
    };

    private final Runnable f19399a0 = new Runnable() {
        @Override
        public final void run() {
            this.f20075d.j1();
        }
    };

    private final InterfaceC2707m f19400b0 = new n();

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
            ActivityNativeMain.this.finish();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override
        public void run() {
            ActivityNativeMain activityNativeMain = ActivityNativeMain.this;
            q0.k(activityNativeMain, activityNativeMain.f19382J);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override
        public void run() {
            ActivityNativeMain.this.f19383K.setVisibility(8);
        }
    }

    class f extends n0.b {
        f() {
        }

        @Override
        public void a(n0.d dVar) {
            if (dVar.b()) {
                ActivityNativeMain.this.E0(false);
            } else if (dVar.c()) {
                ActivityNativeMain.this.E0(true);
            }
        }
    }

    class g implements e0.h {
        g() {
        }

        @Override
        public void a(String str) {
            if (ActivityNativeMain.this.f19390R != null) {
                ActivityNativeMain.this.f19390R.r(str);
            }
        }
    }

    class h implements Runnable {

        final ActivityNativeMain f19408d;

        h(ActivityNativeMain activityNativeMain) {
            this.f19408d = activityNativeMain;
        }

        @Override
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            E6.c.o();
            new s(this.f19408d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override
        public void run() {
            WebView webView = new WebView(ActivityNativeMain.this);
            String userAgentString = webView.getSettings().getUserAgentString();
            webView.destroy();
            NativeGLInterface.setWebviewUserAgent(userAgentString);
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override
        public void run() {
            h7.l.a("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.Y0(false);
        }
    }

    class k implements ViewTreeObserver.OnGlobalFocusChangeListener {

        final ViewGroup f19412d;

        k(ViewGroup viewGroup) {
            this.f19412d = viewGroup;
        }

        @Override
        public void onGlobalFocusChanged(View view, View view2) {
            SurfaceView surfaceView;
            if (ActivityNativeMain.this.f19393U == null || !ActivityNativeMain.this.f19393U.h() || view2 != null || (surfaceView = (SurfaceView) this.f19412d.findViewById(J.f19511X)) == null) {
                return;
            }
            surfaceView.requestFocus();
        }
    }

    class l implements SurfaceHolder.Callback {

        Bitmap f19414d = null;

        boolean f19415e = false;

        final ViewGroup f19416i;

        final SurfaceView f19417v;

        l(ViewGroup viewGroup, SurfaceView surfaceView) {
            this.f19416i = viewGroup;
            this.f19417v = surfaceView;
        }

        public void b(int i7) {
            this.f19415e = i7 == 0;
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        }

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f19397Y == null || this.f19414d == null || !this.f19415e) {
                return;
            }
            ActivityNativeMain.this.f19397Y.setVisibility(0);
            ActivityNativeMain.this.f19397Y.setImageBitmap(this.f19414d);
            ActivityNativeMain.this.I1(3000L);
            this.f19414d = null;
            this.f19415e = false;
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f19397Y != null) {
                long width = this.f19416i.getWidth() * this.f19416i.getHeight() * 4;
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < width) {
                    h7.l.g("rbx.main", "surfaceDestroyed: Not enough memory for screenshot. Available: " + jFreeMemory + ", Required: " + width);
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f19416i.getWidth(), this.f19416i.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f19414d = bitmapCreateBitmap;
                    PixelCopy.request(this.f19417v, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                        @Override
                        public final void onPixelCopyFinished(int i7) {
                            this.f20123a.b(i7);
                        }
                    }, new Handler(Looper.getMainLooper()));
                } catch (OutOfMemoryError e7) {
                    h7.l.e("rbx.main", "surfaceDestroyed: Out of memory while creating screenshot.", e7);
                }
            }
        }
    }

    class m implements View.OnTouchListener {
        m() {
        }

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class n implements InterfaceC2707m {
        n() {
        }

        @Override
        public void a(C2704j c2704j) {
            if (c2704j.b() == 401) {
                h7.l.k("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                E6.c.e().h(ActivityNativeMain.this, c.d.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    class o extends n0.b {
        o() {
        }

        @Override
        public void a(n0.d dVar) {
            if (dVar.b()) {
                ActivityNativeMain.this.E0(false);
                return;
            }
            if (dVar.c()) {
                ActivityNativeMain.this.E0(true);
            } else if (h7.n.i() && dVar.a()) {
                E6.c.e().h(ActivityNativeMain.this, c.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override
        public void b(n0.d dVar) {
            if (a0.k0() && dVar.c()) {
                ActivityNativeMain.this.E0(true);
            }
        }
    }

    class p implements DialogInterface.OnCancelListener {
        p() {
        }

        @Override
        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    class q implements DialogInterface.OnClickListener {
        q() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
        }
    }

    class r implements DialogInterface.OnClickListener {
        r() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            dialogInterface.dismiss();
            ActivityNativeMain.this.finish();
        }
    }

    private static class s extends AsyncTask<Void, Void, Boolean> {

        private WeakReference<ActivityNativeMain> f19425a;

        s(ActivityNativeMain activityNativeMain) {
            h7.l.g("rbx.main", "Reloading lua app.");
            this.f19425a = new WeakReference<>(activityNativeMain);
        }

        @Override
        public Boolean doInBackground(Void... voidArr) {
            com.roblox.client.game.a aVarD;
            Surface surfaceH;
            ActivityNativeMain activityNativeMain = this.f19425a.get();
            if (activityNativeMain == null || (aVarD = activityNativeMain.e1().d()) == null || (surfaceH = aVarD.H()) == null) {
                return Boolean.FALSE;
            }
            E6.c.d();
            if (a0.C0()) {
                com.roblox.client.game.b.k().B(activityNativeMain, surfaceH, activityNativeMain);
            } else {
                com.roblox.client.game.b.k().A(activityNativeMain, surfaceH);
            }
            return Boolean.TRUE;
        }

        @Override
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f19425a.get()) == null || activityNativeMain.f19383K == null) {
                return;
            }
            activityNativeMain.f19383K.setVisibility(8);
        }

        @Override
        protected void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f19425a.get();
            if (activityNativeMain == null || activityNativeMain.f19383K == null) {
                return;
            }
            activityNativeMain.f19383K.setVisibility(0);
        }
    }

    private void B1(String str) {
        JSONObject jSONObject;
        CaptchaConfig signUpCaptchaConfig;
        String strOptString;
        LoginCaptchaConfig.c cVar;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            h7.l.k("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString(GObvYfBKohxpYX.mWv).equals("login")) {
                strOptString = jSONObject.optString("cvalueType");
                String strOptString2 = jSONObject.optString("cvalue");
                strOptString.hashCode();
                switch (strOptString) {
                    case "phone_number":
                        cVar = LoginCaptchaConfig.c.PHONE_NUMBER;
                        break;
                    case "username":
                        cVar = LoginCaptchaConfig.c.USERNAME;
                        break;
                    case "email":
                        cVar = LoginCaptchaConfig.c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + strOptString + ".");
                }
                signUpCaptchaConfig = new LoginCaptchaConfig(cVar, strOptString2);
            } else {
                signUpCaptchaConfig = new SignUpCaptchaConfig();
            }
            h7.l.g("rbx.main", "openFunCaptchaActivity: config = " + signUpCaptchaConfig);
            startActivityForResult(ActivityFunCaptcha.H0(this, signUpCaptchaConfig), 20115);
        }
    }

    private void C1() {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ActivityNativeMain.C1():void");
    }

    public static void F1(ActivityNativeMain activityNativeMain, boolean z7) {
        com.roblox.client.game.a aVarD = activityNativeMain.e1().d();
        if (aVarD != null && z7) {
            activityNativeMain.getSupportFragmentManager().p().m(aVarD).h();
        }
        h7.l.a("rbx.appshell", "removeGlApp() clearing app shell");
        com.roblox.client.game.b.k().g();
    }

    private boolean G1() {
        int i7 = 0;
        if (getSupportFragmentManager().Q0()) {
            return false;
        }
        if (!j6.d.a().P1()) {
            if (getSupportFragmentManager().q0() <= 0) {
                return false;
            }
            getSupportFragmentManager().d1();
            return true;
        }
        int iQ0 = getSupportFragmentManager().q0();
        boolean z7 = false;
        while (i7 < iQ0) {
            getSupportFragmentManager().d1();
            i7++;
            z7 = true;
        }
        return z7;
    }

    public void H1() {
        h7.l.g("rbx.main", "Requesting permissions for MediaPickerProtocol");
        C2374w.h().k().X(new String[]{W7.m.A.toString()});
    }

    public void I1(long j7) {
        this.f19397Y.removeCallbacks(this.f19398Z);
        this.f19397Y.postDelayed(this.f19398Z, j7);
    }

    private void K1() {
        h7.l.a("rbx.main", "setupMainTabs: tabs-loaded = " + this.f19380H);
        if (this.f19380H) {
            return;
        }
        this.f19380H = true;
        p1((!s1() || h7.n.i()) ? new FeatureState(KpBmp.kybg) : new FeatureState("GAMES_TAG"));
        if (this.f19389Q == null) {
            M5.a aVar = new M5.a(this, new Handler(Looper.getMainLooper()));
            this.f19389Q = aVar;
            aVar.c();
        }
        if (!j6.d.a().P1() || a0.k0()) {
            return;
        }
        this.f19390R = new WebViewProtocol(this);
    }

    private boolean L1() {
        return !a0.k0();
    }

    private void M1() {
        int iS2 = j6.d.a().s2();
        String str = QXojhh.cOkTC;
        String str2 = BtcVLuo.DBriVfShylXpr;
        String str3 = PLHvHoayk.mvOYQsx;
        if (iS2 == 1) {
            String string = O().getString(M.f19639d);
            String string2 = getString(M.f19657j);
            String string3 = getString(M.f19654i);
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(String.format(string, " <a href='" + string3 + "'>" + string2 + str2));
            sb.append(str);
            String string4 = sb.toString();
            TextView textView = new TextView(this);
            textView.setPadding(5, 5, 5, 5);
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(Html.fromHtml(string4));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(M.f19651h).setView(textView).setPositiveButton(M.f19682v, new a()).create().show();
            return;
        }
        if (j6.d.a().s2() == 2) {
            String string5 = O().getString(M.f19633b);
            String string6 = getString(M.f19657j);
            String string7 = getString(M.f19654i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(String.format(string5, getString(M.f19642e), " <a href='" + string7 + "'>" + string6 + str2));
            sb2.append(str);
            String string8 = sb2.toString();
            TextView textView2 = new TextView(this);
            textView2.setPadding(5, 5, 5, 5);
            textView2.setGravity(17);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(Html.fromHtml(string8));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(M.f19645f).setView(textView2).setPositiveButton(M.f19682v, new b()).create().show();
            return;
        }
        if (j6.d.a().s2() == 3) {
            String string9 = O().getString(M.f19636c);
            String string10 = getString(M.f19657j);
            String string11 = getString(M.f19654i);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(String.format(string9, " <a href='" + string11 + "'>" + string10 + str2));
            sb3.append(str);
            String string12 = sb3.toString();
            TextView textView3 = new TextView(this);
            textView3.setPadding(5, 5, 5, 5);
            textView3.setGravity(17);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(Html.fromHtml(string12));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(M.f19648g).setView(textView3).setPositiveButton(M.f19660k, new c()).create().show();
        }
    }

    private void O1() {
        new AlertDialog.Builder(this).setMessage(M.f19662l).setPositiveButton(M.f19660k, new r()).setNegativeButton(M.f19690z, new q()).setOnCancelListener(new p()).create().show();
    }

    private void P1() {
        if (!j6.d.a().l() || U5.b.b().c() < j6.d.a().v()) {
            return;
        }
        N5.a.e().i(this, this.f19385M, this.f19386N);
    }

    private void Q1(int i7) {
        LoggingProtocol.h().c("retry_during_main");
        com.roblox.client.startup.c.v(this, i7);
    }

    private void R1(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(E.f19431b, E.f19432c);
    }

    private void S1() {
        h7.l.g("rbx.main", "startup:");
        if (com.roblox.client.startup.d.s(this).v() || E6.k.e().f() || com.roblox.client.startup.a.k() || !h7.n.d()) {
            com.roblox.client.startup.d.s(this).T();
            return;
        }
        h7.l.d("rbx.main", "Incomplete initialization, restarting app");
        startActivity(ActivitySplash.J0(this, StartedForEnum.SHELL_PROCESS_RESTART));
        finish();
    }

    public void Y0(boolean z7) {
        if (j6.d.a().L2()) {
            IAPPurchaseManager.q(this, z7);
            return;
        }
        if (h7.n.e()) {
            String strK = g7.c.c().k();
            long j7 = g7.c.c().j();
            if (TextUtils.isEmpty(strK)) {
                return;
            }
            if (j7 > 0) {
                M6.i.n0(this).i0(j7, strK, z7);
                return;
            } else {
                M6.i.n0(this).j0(strK, z7);
                return;
            }
        }
        if (h7.n.h()) {
            g7.c cVarC = g7.c.c();
            String strK2 = cVarC.k();
            long j8 = cVarC.j();
            if (TextUtils.isEmpty(strK2)) {
                return;
            }
            if (j8 > 0) {
                P6.a.a(this);
                throw null;
            }
            P6.a.a(this);
            throw null;
        }
    }

    private void Z0() {
        this.f19382J.post(new d());
    }

    private void a1() {
        View rootView = this.f19382J.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView;
        rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(new k(viewGroup));
        int i7 = J.f19550y;
        this.f19387O = i7;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(i7);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getLayoutInflater().inflate(K.f19568n, (ViewGroup) frameLayout, true);
        int i8 = J.f19511X;
        this.f19393U = new MainActivityController(this, (SurfaceView) frameLayout.findViewById(i8));
        getLifecycle().a(this.f19393U);
        h7.l.g(sMlEMqrxoGI.dWfmybCo, "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
        if (L1()) {
            SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(i8);
            surfaceView.getHolder().addCallback(new l(viewGroup, surfaceView));
        }
    }

    private void b1() {
        if (this.f19397Y != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f19382J.getRootView();
        this.f19397Y = new ImageView(this);
        new FrameLayout.LayoutParams(-1, -1);
        this.f19397Y.setVisibility(8);
        this.f19397Y.setOnTouchListener(new m());
        viewGroup.addView(this.f19397Y);
        NativeGLInterface.nativeScheduleOnFirstFrame(this.f19399a0);
    }

    private void c1() {
        com.roblox.client.startup.c.s(this);
    }

    private void d1() {
        if (j6.d.a().E2()) {
            h7.l.g("rbx.main", "Requesting Persona SDK module download immediately.");
            ka.e.i("personasdk");
        } else {
            h7.l.g("rbx.main", "Deferring Persona SDK module download.");
            ka.e.h("personasdk");
        }
    }

    public C2479a e1() {
        if (this.f19381I == null) {
            this.f19381I = new C2479a(this, this.f19387O);
        }
        return this.f19381I;
    }

    private g6.i f1() {
        g6.i iVarB = g6.i.b("CUSTOM_WEBVIEW_TAG");
        iVarB.g(a0.M(this));
        iVarB.j(true);
        return iVarB;
    }

    private void g1() {
        h7.l.g("rbx.main", "internalOnResume:");
        Y0(true);
        n0.e().b(new o());
        if ((h7.n.i() || E6.k.e().i()) && q0.l(this)) {
            E6.k.e().d(this.f19400b0);
        }
        h7.l.g("rbx.main", "internalOnResume: NotificationManager addObserver");
        E6.f.c().b(this);
        if (Q6.m.c().l() && q0.l(this)) {
            if (this.f19384L) {
                this.f19384L = false;
            }
            C1();
        }
        if (this.f19384L) {
            h7.l.g("rbx.main", "Back from game. Resuming Lua App.");
            z1();
        }
        C2479a c2479aE1 = e1();
        getSupportFragmentManager().g0();
        if (c2479aE1.d() == null) {
            c2479aE1.g(new FeatureState("CUSTOM_LUAVIEW_TAG"));
        }
    }

    public void h1(JSONObject jSONObject) {
        C2366n.b(jSONObject, this);
    }

    public void i1() {
        ImageView imageView = this.f19397Y;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.f19397Y.setImageBitmap(null);
        }
    }

    public void j1() {
        I1(500L);
    }

    public void k1() {
        this.f19383K.setVisibility(8);
    }

    public static void l1(String str) {
        g7.c.c().s(e7.f.e(str));
    }

    public void m1(final String str) {
        runOnUiThread(new Runnable() {
            @Override
            public final void run() {
                ActivityNativeMain.l1(str);
            }
        });
    }

    public void n1() {
        this.f19384L = true;
        L();
    }

    public void o1(ActivityResult activityResult) {
        C2374w.h().g().r(this, activityResult.getData());
    }

    private void p1(FeatureState featureState) {
        h7.l.g("rbx.appshell", "loadDataModel()");
        com.roblox.client.game.b.k().H(this);
        com.roblox.client.game.b.k().l(com.roblox.client.game.d.a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && E6.k.h()) {
            O7.a.a().b(new a.b() {
                public final void a(JSONObject jSONObject) {
                    this.f19941a.h1(jSONObject);
                }
            });
            com.roblox.client.startup.d.G(this, E6.k.l().toString());
        }
        if (C2374w.h().f().i()) {
            return;
        }
        N1(featureState);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    private void q1(Bundle bundle) {
        long j7 = bundle.getLong("EXTRA_NOTIFICATION_USER_ID", -1L);
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE");
        boolean z7 = bundle.getBoolean("EXTRA_STACKED_NOTIFICATION", false);
        String strX = null;
        if (string == null) {
            finish();
        } else if (z7) {
            if (string.equals("FriendRequestAccepted")) {
                strX = a0.X(E6.k.e().g());
            } else if (string.equals("FriendRequestReceived")) {
                strX = a0.W(E6.k.e().g());
            }
        } else if (string.equals("FriendRequestAccepted")) {
            strX = j7 == -1 ? a0.X(E6.k.e().g()) : a0.Y(j7);
        } else if (string.equals("FriendRequestReceived")) {
            strX = j7 == -1 ? a0.W(E6.k.e().g()) : a0.Y(j7);
        }
        R1(strX);
    }

    private void r1(Bundle bundle) {
        long j7 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        R1(j7 == -1 ? a0.t0() : a0.y0(j7));
    }

    private boolean s1() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("loginAfterSignup", false);
        }
        return false;
    }

    private void t1(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("FEATURE_EXTRA")) == null) {
            return;
        }
        if ("CHAT_TAG".equals(stringExtra)) {
            long longExtra = intent.getLongExtra("USER_ID_EXTRA", -1L);
            if (longExtra != -1) {
                y1(longExtra);
                return;
            } else {
                v1(intent.getLongExtra("CONVERSATION_ID_EXTRA", -1L));
                return;
            }
        }
        boolean zEquals = "PROFILE_TAG".equals(stringExtra);
        String str = QcdySgfdST.FcqUALgQfs;
        if (zEquals) {
            C2366n.f(this, intent.getStringExtra(str), getString(M.f19613Q));
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            C2366n.f(this, intent.getStringExtra(str), getString(M.f19619T));
        } else {
            C2366n.f(this, intent.getStringExtra(str), h6.b.a(this, stringExtra));
        }
    }

    private String u1() {
        return "OVERLAY_" + getSupportFragmentManager().q0();
    }

    private void v1(long j7) {
        h7.l.a("rbx.main", "navigateToConversation() conversation:" + j7);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.c("CHAT_CONVERSATION_ID", j7);
        w1(featureState);
    }

    private void w1(FeatureState featureState) {
        h7.l.i("rbx.main", "navigateToFeature:" + featureState.getName() + " bundle:" + featureState.a());
        N1(featureState);
    }

    private void x1(String str, String str2) {
        C2366n.f(this, h7.f.c(str2), str);
    }

    private void y1(long j7) {
        h7.l.a("rbx.main", "navigateToUserConversation() user:" + j7);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.c("USER_ID_EXTRA", j7);
        w1(featureState);
    }

    private void z1() {
        P1();
        this.f19384L = false;
    }

    @Override
    public void A() {
        this.f19393U.r();
    }

    public void A1(String str, String str2) {
        b7.b.c(str, str2);
    }

    @Override
    public void D(int i7, Fragment fragment, String str) {
        if (fragment != null) {
            androidx.fragment.app.B bP = getSupportFragmentManager().p();
            if (fragment.isAdded()) {
                bP.q(fragment);
            } else {
                bP.b(i7, fragment, str);
            }
            bP.h();
        }
    }

    public void D1() {
        if (j6.d.a().h2()) {
            new com.roblox.client.startup.f().e(this, new f.a() {
                public final void a() {
                    this.f20080a.finish();
                }
            });
        } else {
            O1();
        }
    }

    public void E1() {
        h7.l.g("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f19394V = registerForActivityResult(new f.l(), new InterfaceC2401a() {
            @Override
            public final void a(Object obj) {
                this.f20118a.o1((ActivityResult) obj);
            }
        });
    }

    public void F() {
        h7.l.g("rbx.main", "updateViewAppSettingsLoaded:");
        K1();
    }

    public void H() {
    }

    @Override
    public void I() {
        d0();
    }

    public void J() {
        h7.l.g("rbx.main", "showRetryUI:");
        if (a0.k0()) {
            h7.q.a(this, M.f19631a0);
            finish();
        } else if (i0()) {
            Q1(M.f19631a0);
        }
    }

    protected void J1(boolean z7) {
        m7.a aVar = new m7.a(z7);
        NativeGLInterface.nativeBroadcastEventWithNamespace(((m7.c) aVar).a, ((m7.c) aVar).b, ((m7.c) aVar).c);
    }

    public void L() {
        h7.l.g("rbx.main", "navigateToMainScreen: IsLoggedIn = " + E6.k.e().f());
        K1();
        if (!C2374w.h().f().i() && i0() && E6.k.e().f()) {
            g1();
        }
    }

    public void N() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new i());
    }

    public void N1(FeatureState featureState) {
        h7.l.g("rbx.main", "ANM.showFeature: " + featureState.getName());
        e1().g(featureState);
    }

    @Override
    public ActivityC1663h O() {
        return this;
    }

    public void Q() {
        c1();
        S1();
    }

    public void T1(EnumC2597N enumC2597N) {
        this.f19393U.s(enumC2597N);
    }

    @Override
    public boolean a() {
        return this.f19393U.a();
    }

    @Override
    public void b(boolean z7) {
        this.f19393U.b(z7);
    }

    @Override
    public void c(String str) {
        h7.l.g("rbx.main", "onAppReady: " + str);
        View view = this.f19383K;
        if (view != null && view.getVisibility() != 8) {
            this.f19383K.post(new e());
        }
        if (!"Landing".equals(str) && !"Home".equals(str)) {
            if ("Push".equals(str)) {
                C2374w.h().k().Z(getApplicationContext());
            }
        } else {
            n0.e().b(new f());
            if (NativeGLInterface.shouldDisplayOpenGLUnsupportedMessage()) {
                M1();
            }
        }
    }

    @Override
    public void d(E7.a aVar) {
        if (getSupportFragmentManager().q0() > 0) {
            Fragment fragmentJ0 = getSupportFragmentManager().j0(J.f19534k);
            if (fragmentJ0 instanceof e0) {
                ((e0) fragmentJ0).m0(aVar);
            }
        }
    }

    @Override
    public void e() {
        WebViewProtocol webViewProtocol;
        if (!j6.d.a().P1()) {
            G1();
        } else {
            if (!G1() || (webViewProtocol = this.f19390R) == null) {
                return;
            }
            webViewProtocol.s();
        }
    }

    @Override
    public void f(E7.a aVar) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Z0();
        Boolean bool = aVar.d;
        boolean zBooleanValue3 = false;
        boolean z7 = bool != null && bool.booleanValue();
        if (j6.d.a().G0()) {
            Boolean bool2 = aVar.c;
            zBooleanValue = bool2 == null ? true : bool2.booleanValue();
            Boolean bool3 = aVar.e;
            zBooleanValue2 = bool3 != null && bool3.booleanValue();
            Boolean bool4 = aVar.f;
            if (bool4 != null && bool4.booleanValue()) {
                zBooleanValue3 = true;
            }
        } else {
            zBooleanValue = aVar.c.booleanValue();
            zBooleanValue2 = aVar.e.booleanValue();
            zBooleanValue3 = aVar.f.booleanValue();
        }
        e0 y7 = z7 ? new Y() : new C2553i();
        y7.getLifecycle().a(new AppWebViewLifecycleObserver());
        y7.getLifecycle().a(new AppInputFocusLifecycleObserver());
        Bundle bundle = new Bundle();
        bundle.putString(bpTQi.uedHpvPJiWG, aVar.a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", zBooleanValue);
        bundle.putBoolean(bpTQi.bOc, zBooleanValue2);
        bundle.putString("TITLE_STRING", aVar.b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        bundle.putBoolean(uCYQMIHsy.IAKiy, zBooleanValue3);
        y7.setArguments(bundle);
        if (j6.d.a().P1()) {
            y7.g0(new g());
        }
        androidx.fragment.app.B bP = getSupportFragmentManager().p();
        bP.b(J.f19534k, y7, u1());
        bP.f(null);
        bP.h();
    }

    @Override
    public void finish() {
        super.finish();
        if (j6.d.a().d0() && a0.k0()) {
            Process.killProcess(Process.myPid());
        }
    }

    public void g() {
        h7.l.g("rbx.main", "navigateToLandingScreen:");
        Intent intentO = C2374w.h().o(this);
        intentO.putExtra("send_app_input_focus_to_lua", true);
        startActivity(intentO);
        finish();
    }

    public void h() {
        c1();
        S1();
    }

    @Override
    public void i(int i7, Bundle bundle) {
        if (i7 != 2) {
            if (i7 != 101) {
                return;
            }
            C2366n.j(C2591H.c(bundle.getBundle("game_init_params")), this);
        } else {
            h7.l.g("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (Z6.c.a()) {
                new s(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                w0(E6.c.f(bundle));
            }
        }
    }

    @Override
    public void j(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            h7.l.a("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            b7.b.c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            J1(false);
            startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
        } catch (JSONException unused) {
            h7.l.a("rbx.main", "Error parsing share data.");
        }
    }

    public void k() {
        if (isFinishing()) {
            return;
        }
        NativeGLInterface.setMobileAdvertisingId(h7.c.d());
    }

    @Override
    public void l() {
        this.f19393U.l();
    }

    @Override
    public void n(Bundle bundle) {
        h7.l.g("rbx.main", "Request to end the game. Performing app restoration.");
        if (j6.d.a().a1()) {
            this.f19385M = bundle.getLong("placeId");
            this.f19386N = bundle.getString("gameId");
        }
        C2374w.h().f().l(null);
        T1(EnumC2597N.APP);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!i0() || supportFragmentManager.Q0()) {
            h7.l.g("rbx.main", "Experience has been ended in the background.");
            this.f19395W = true;
        } else {
            a0.Q(this).edit().putBoolean("ROBLOXCrash", true).apply();
            com.roblox.client.game.b.k().C();
            com.roblox.client.game.b.k().E(true);
            runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f19903d.n1();
                }
            });
        }
    }

    @Override
    protected boolean o0() {
        return true;
    }

    @Override
    protected void onActivityResult(int i7, int i8, Intent intent) {
        h7.l.a("rbx.main", "onActivityResult: requestCode = " + i7 + oeVkjmfPcLbWm.xunYEchVRojvb + i8 + " Intent data = " + intent);
        if (i7 != -1) {
            if (i7 == 20104) {
                this.f19384L = true;
                return;
            }
            if (i7 == 20110) {
                if (i8 == -1) {
                    t1(intent);
                    return;
                }
                return;
            }
            if (i7 == 20115) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityResult from FunCaptcha: code:");
                sb.append(i8);
                sb.append(", result:");
                sb.append(i8 == 101 ? "success" : "dismiss");
                h7.l.g("rbx.main", sb.toString());
                com.roblox.client.game.b.k().D(new m7.a(true));
                N1(new FeatureState("HOME_TAG"));
                return;
            }
            if (i7 != 20124) {
                if (i7 != 20125) {
                    super.onActivityResult(i7, i8, intent);
                    return;
                } else {
                    V6.k.c(intent);
                    return;
                }
            }
            b7.b.a();
            J1(true);
            if (j6.d.a().u0()) {
                Q7.a.i().c(intent);
            }
        }
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(C2467c c2467c) {
        D1();
    }

    @Override
    public void onBackPressed() {
        WebViewProtocol webViewProtocol;
        if (getSupportFragmentManager().q0() <= 0) {
            if (e1().f()) {
                return;
            }
            D1();
            return;
        }
        Fragment fragmentJ0 = getSupportFragmentManager().j0(J.f19534k);
        if (fragmentJ0 instanceof e0) {
            e0 e0Var = (e0) fragmentJ0;
            if (!e0Var.W() && !e0Var.T()) {
                getSupportFragmentManager().d1();
            }
            if (!j6.d.a().P1() || (webViewProtocol = this.f19390R) == null) {
                return;
            }
            webViewProtocol.s();
            return;
        }
        if (fragmentJ0 instanceof k0) {
            k0 k0Var = (k0) fragmentJ0;
            if (k0Var.O() || k0Var.L()) {
                return;
            }
            getSupportFragmentManager().d1();
            return;
        }
        if (j6.d.a().M2() && V6.k.d(this)) {
            h7.l.g("rbx.main", "onBackPressed: BACK button is handled for QrCodeScanner.");
        } else {
            getSupportFragmentManager().d1();
        }
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(g6.o oVar) {
        h7.l.g("rbx.main", "SMS code received.");
        h7.l.g("rbx.main", oyfFwvPUKctyaG.ceSPRd);
        C2374w.h().g().o(oVar.f21010a);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MainActivityController mainActivityController = this.f19393U;
        if (mainActivityController != null) {
            mainActivityController.k(configuration);
        }
        if (L1()) {
            this.f19398Z.run();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        Main.Start(this);
        if (!ActivitySplash.M0() && !com.roblox.client.startup.a.k() && bundle != null) {
            com.roblox.client.startup.d.x(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (com.roblox.client.startup.d.z()) {
                h7.l.g("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        if (j6.d.a().v1()) {
            if (f19379c0) {
                f19379c0 = false;
            } else {
                h7.l.k("rbx.main", "onCreate: Activity recreated");
                LoggingProtocol.h().c("activity_recreated");
            }
        }
        LoggingProtocol.h().c("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate NativeMain. savedInstanceState is null: ");
        sb.append(bundle == null);
        h7.l.g("rbx.main", sb.toString());
        if (j6.d.a().E() && this.f19391S == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            this.f19391S = appHangMonitor;
            appHangMonitor.c();
        }
        if (j6.d.a().W0() && Build.VERSION.SDK_INT >= 29) {
            LoggingProtocol.h().d("android_thermal_throttling", ((PowerManager) getSystemService("power")).getCurrentThermalStatus() + 1000);
        }
        this.f19388P = C3086b.f().j();
        com.roblox.client.startup.d.s(this).P(this);
        setContentView(K.f19560f);
        if (bundle != null) {
            this.f19384L = bundle.getBoolean(PLHvHoayk.LQCKQqaWDgBfjN);
        }
        T7.a.c(this);
        if (!this.f19384L) {
            T7.a.d().a(a.a.e, bundle);
        }
        this.f19382J = findViewById(J.f19532j);
        a1();
        this.f19383K = findViewById(J.f19501N);
        if (C2374w.h().f().h()) {
            this.f19383K.post(new Runnable() {
                @Override
                public final void run() {
                    this.f20083d.k1();
                }
            });
        } else {
            this.f19383K.setVisibility(0);
        }
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        NativeGLJavaInterface.setWebviewUserAgentGetter(this);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(this);
        if (this.f19392T == null && j6.d.a().d1()) {
            long jG1 = j6.d.a().g1();
            h7.l.a("rbx.main", "Setup mPendingPurchaseExecutor to run every " + jG1 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f19392T = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new j(), jG1, jG1, TimeUnit.SECONDS);
        }
        if (j6.d.a().H3()) {
            C2374w.h().g().n(this);
        } else {
            E1();
        }
        if (j6.d.a().B3() && this.f19396X == null) {
            e7.i iVar = new e7.i(new Handler(Looper.getMainLooper()));
            this.f19396X = iVar;
            iVar.a();
        }
        if (Q6.m.c().l()) {
            C1();
        }
        if (!j6.d.a().m()) {
            MediaPickerProtocol.p().l(this);
        }
        if (JNISystemThemeProtocol.isSystemThemeEnabled()) {
            AbstractC1694h lifecycle = getLifecycle();
            SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.d;
            lifecycle.a(systemThemeProtocol);
            systemThemeProtocol.w(new SystemThemeProtocol.b() {
                public final void a(String str) {
                    this.f20086a.m1(str);
                }
            });
        } else {
            SystemThemeProtocol.l();
        }
        if (j6.d.a().f2() && h7.o.a()) {
            d1();
            getLifecycle().a(FacialAgeEstimationProtocol.INSTANCE);
        }
        if (j6.d.a().m()) {
            getLifecycle().a(MediaPickerProtocolV2.INSTANCE);
        }
    }

    @Override
    protected void onDestroy() {
        e7.i iVar;
        if (com.roblox.client.startup.d.z()) {
            h7.l.g("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        h7.l.g("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener((NativeGLJavaInterface.OnAppShellReloadNeededListener) null);
        NativeGLJavaInterface.setWebviewUserAgentGetter((NativeGLJavaInterface.WebViewUserAgentGetter) null);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter((NativeGLJavaInterface.MobileAdvertisingIdGetter) null);
        if (this.f19393U.f20009d == EnumC2597N.EXPERIENCE) {
            C2374w.h().f().g(true);
        } else {
            F1(this, isFinishing());
        }
        this.f19380H = false;
        com.roblox.client.startup.d.s(this).V(this);
        M5.a aVar = this.f19389Q;
        if (aVar != null) {
            aVar.e();
            this.f19389Q = null;
        }
        if (j6.d.a().B3() && (iVar = this.f19396X) != null) {
            iVar.b();
            this.f19396X = null;
        }
        super.onDestroy();
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return this.f19393U.o(keyEvent) || super.onKeyDown(i7, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        return this.f19393U.p(keyEvent) || super.onKeyUp(i7, keyEvent);
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C2472h c2472h) {
        long j7 = c2472h.f21000b;
        if (j7 != -1) {
            y1(j7);
        } else {
            v1(c2472h.f20999a);
        }
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g6.i iVar) {
        JSONObject jSONObject;
        String str;
        h7.l.a("rbx.main", "NavigateToFeature: " + iVar.f21001a);
        if ("FRIEND_FINDER_TAG".equals(iVar.f21001a) || "UNIVERSAL_FRIENDS_TAG".equals(iVar.f21001a)) {
            iVar = f1();
        }
        if ("PROFILE_TAG".equals(iVar.f21001a)) {
            C2366n.e(this, iVar.f21002b, M.f19613Q, iVar.f21005e, iVar.f());
            return;
        }
        if ("GAME_DETAILS_TAG".equals(iVar.f21001a)) {
            C2366n.e(this, a0.i() + "games/" + iVar.f21002b, M.f19585C, iVar.f21005e, iVar.f());
            return;
        }
        if ("CUSTOM_WEBVIEW_TAG".equals(iVar.f21001a) || "YOUTUBE_TAG".equals(iVar.f21001a)) {
            try {
                jSONObject = new JSONObject(iVar.d());
            } catch (JSONException unused) {
                h7.l.k("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String strOptString = jSONObject.optString("title");
                String strOptString2 = jSONObject.optString("url");
                if (strOptString2.isEmpty()) {
                    h7.l.k("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                    return;
                }
                if ("YOUTUBE_TAG".equals(iVar.f21001a) && a0.k0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        h7.l.k("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!iVar.f21005e) {
                    C2366n.h(this, strOptString2, strOptString, false, true);
                    return;
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                    C2366n.g(this, strOptString2, strOptString, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
                    return;
                }
            }
            return;
        }
        if ("SOCIAL_MEDIA_TAG".equals(iVar.f21001a)) {
            new b7.a("rbx.main").a(this, iVar.d());
            return;
        }
        if ("MY_FEED_TAG".equals(iVar.f21001a)) {
            C2366n.e(this, a0.i() + "feeds/inapp", M.f19609O, iVar.f21005e, iVar.f());
            return;
        }
        if ("SEARCH_GAMES_TAG".equals(iVar.f21001a)) {
            C2366n.e(this, a0.F0(iVar.f21002b), M.f19615R, iVar.f21005e, iVar.f());
            return;
        }
        if ("GAMES_SEE_ALL_TAG".equals(iVar.f21001a)) {
            C2366n.e(this, a0.A(iVar.f21002b), M.f19603L, iVar.f21005e, iVar.f());
            return;
        }
        if ("ABUSE_REPORT_TAG".equals(iVar.f21001a)) {
            C2366n.d(this, iVar.f21002b, iVar.f());
            return;
        }
        if ("ANIMATED_ASSET_DETAILS_TAG".equals(iVar.f21001a)) {
            if (iVar.f21002b != null) {
                str = a0.i() + "catalog/" + iVar.f21002b;
            } else {
                str = a0.i() + "games/";
            }
            C2366n.i(this, str, getString(M.f19620U), iVar.f21005e, true, false);
            return;
        }
        if ("CAPTCHA_SUCCESS_TAG".equals(iVar.f21001a)) {
            h7.l.g("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
            return;
        }
        if ("CAPTCHA_TAG".equals(iVar.f21001a)) {
            B1(iVar.d());
            return;
        }
        if (!"SCAN_QR_CODE".equals(iVar.f21001a)) {
            x1(h6.b.a(this, iVar.f21001a), iVar.f21002b);
        } else if (j6.d.a().M2()) {
            V6.k.h(this, this.f19387O);
        } else {
            V6.k.i(this, 20125);
        }
    }

    @Wa.j
    public void onNavigateToLuaEvent(e0.g gVar) {
        e();
    }

    @Override
    protected void onPause() {
        super.onPause();
        h7.l.g("rbx.main", "onPause");
        Q7.a.i().k();
        T7.a.d().b(a.a.e);
        if (L1()) {
            b1();
        }
        if (!j6.d.a().U1()) {
            h7.l.g("rbx.main", "onPause: NotificationManager removerObserver");
            E6.f.c().g(this);
        }
        K7.c.j().l(this);
        if (ha.q.l()) {
            P.j("onAppBackground");
        }
    }

    @Override
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        C2374w.h().k().P(i7, strArr, iArr);
    }

    @Override
    protected void onResume() {
        super.onResume();
        h7.l.g("rbx.main", "onResume: IsLoggedIn = " + E6.k.e().f());
        K7.c.j().k(this);
        z6.f fVarJ = C3086b.f().j();
        if (this.f19388P != fVarJ) {
            this.f19388P = fVarJ;
            h7.l.g("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        com.roblox.client.startup.d.s(this).P(this);
        if (!C2374w.h().f().i()) {
            S1();
        } else if (this.f19393U.f20009d == EnumC2597N.EXPERIENCE && Q6.m.c().l()) {
            C2374w.h().f().g(false);
        }
        if (this.f19395W) {
            com.roblox.client.game.b.k().E(true);
            this.f19395W = false;
        }
        C2374w.h().k().b0(this);
        C2374w.h().k().a0();
        Q7.a.i().j(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new a.f() {
            public final void a(String str, String str2) {
                this.f19949a.A1(str, str2);
            }
        });
        if (!j6.d.a().H3()) {
            h7.l.g("rbx.main", "Setting result launcher for IdentityProtocol");
            C2374w.h().g().y(this.f19394V);
        }
        if (h7.n.e()) {
            C2374w.h().e().s(this);
        }
        if (j6.d.a().m()) {
            return;
        }
        MediaPickerProtocol.p().m(this, new D7.f() {
            public final void a() {
                this.f19980a.H1();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.f19384L);
        super.onSaveInstanceState(bundle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (j6.d.a().E()) {
            this.f19391S.b();
        }
        q0.f20220a = getResources().getDisplayMetrics();
        if (S.f19839G == 1 && this.f19393U.f20009d == EnumC2597N.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        if (j6.d.a().W2()) {
            h7.l.g("rbx.main", "onStart: App is going to foreground. setAppSuspended(false)");
            NativeReportingInterface.setAppSuspended(false);
        }
        Wa.c.d().n(this);
        t7.g.h().i(com.roblox.client.game.b.k());
        P.r("main");
        R7.g.f().d();
        if (this.f19393U.f20009d == EnumC2597N.EXPERIENCE) {
            C2374w.h().f().p();
        }
        X7.a.c().a();
    }

    @Override
    protected void onStop() {
        Wa.c.d().p(this);
        if (j6.d.a().E()) {
            this.f19391S.a();
        }
        if (S.f19839G == 1 && this.f19393U.f20009d == EnumC2597N.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        if (j6.d.a().W2() && this.f19393U.f20009d == EnumC2597N.APP) {
            h7.l.g("rbx.main", "onStop: App is going to background. setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        t7.g.h().j(com.roblox.client.game.b.k());
        R7.g.f().e();
        if (this.f19393U.f20009d == EnumC2597N.EXPERIENCE) {
            C2374w.h().f().n();
        }
        X7.a.c().b();
        if (j6.d.a().U1()) {
            h7.l.g("rbx.main", "onStop: NotificationManager removerObserver");
            E6.f.c().g(this);
        }
        if (j6.d.a().Q3() && a0.k0()) {
            h7.l.g("rbx.main", "onStop: On a quest device, exiting the app.");
            finish();
        }
        super.onStop();
        h7.l.g("rbx.main", "onStop");
    }

    @Override
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        this.f19393U.q(i7);
    }

    public void p() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new h(this));
    }

    @Override
    protected C2980b p0() {
        return new C2981c();
    }

    @Override
    public void t() {
        h7.l.g("rbx.main", "onAppStarted: ");
        if (i0() && E6.c.d()) {
            new s(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override
    public Fragment w(String str) {
        return getSupportFragmentManager().k0(str);
    }
}
