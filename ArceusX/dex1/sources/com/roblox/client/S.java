package com.roblox.client;

import E6.c;
import U.Gw.oeVkjmfPcLbWm;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.n0;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import d6.C2400b;
import e7.e;
import w6.C2980b;
import z6.C3086b;
import z6.h;

public abstract class S extends V implements e.b {

    public static int f19839G;

    private ProgressDialog f19840A;

    private boolean f19841B = false;

    private C2980b f19842C = p0();

    private R5.a f19843D = new R5.a();

    protected Toolbar f19844E;

    protected e7.e f19845F;

    private androidx.appcompat.app.c f19846w;

    private androidx.appcompat.app.c f19847y;

    private androidx.appcompat.app.c f19848z;

    class a implements h.d {
        a() {
        }

        @Override
        public void a(boolean z7) {
            if (!z7) {
                h7.l.g("rbx.locale", "Retrieved locale same as current locale");
            } else {
                h7.l.g("rbx.locale", "(OnAppResume) Recreating activity due to Locale change.");
                S.this.recreate();
            }
        }
    }

    class b implements DialogInterface.OnDismissListener {
        b() {
        }

        @Override
        public void onDismiss(DialogInterface dialogInterface) {
            S.this.f19846w = null;
        }
    }

    class c implements DialogInterface.OnClickListener {

        final n0.d f19851d;

        final Activity f19852e;

        final String f19853i;

        c(n0.d dVar, Activity activity, String str, g gVar) {
            this.f19851d = dVar;
            this.f19852e = activity;
            this.f19853i = str;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            h7.n.k(this.f19852e, this.f19853i);
            S.this.F0(true, null);
        }
    }

    class d implements DialogInterface.OnClickListener {
        d(g gVar) {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
        }
    }

    class e implements DialogInterface.OnClickListener {

        final n0.d f19856d;

        final Activity f19857e;

        final String f19858i;

        e(n0.d dVar, Activity activity, String str, g gVar) {
            this.f19856d = dVar;
            this.f19857e = activity;
            this.f19858i = str;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            h7.n.k(this.f19857e, this.f19858i);
        }
    }

    static class f {

        static final int[] f19860a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f19860a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19860a[e7.f.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19860a[e7.f.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface g {
    }

    private void A0(e7.f fVar) {
        boolean z7 = fVar != e7.f.e;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(z7 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        if (a0.g0()) {
            getWindow().setStatusBarColor(f.f19860a[fVar.ordinal()] != 1 ? getResources().getColor(G.f19441h) : getResources().getColor(G.f19448o));
        }
        getWindow().setNavigationBarColor(getResources().getColor(G.f19438e));
    }

    private void D0() {
        androidx.appcompat.app.c cVar = this.f19846w;
        if (cVar == null) {
            androidx.appcompat.app.c cVarE = q0.e(this, getResources().getString(M.f19631a0));
            this.f19846w = cVarE;
            cVarE.setOnDismissListener(new b());
        } else if (cVar.isShowing()) {
            h7.l.a("RobloxActivity", oeVkjmfPcLbWm.zMFhz);
        } else {
            this.f19846w.show();
        }
    }

    private void G0() {
        h7.l.g("rbx.locale", "using new api on app resume. mIsAppResumedFromColdStart: " + this.f19841B);
        new z6.h().c(this, new a());
    }

    private void r0(androidx.appcompat.app.c cVar) {
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        cVar.dismiss();
    }

    private void t0() {
        r0(this.f19846w);
        this.f19846w = null;
    }

    private String u0() {
        return getString(M.f19605M);
    }

    private void x0() {
        super.setContentView(this.f19842C.f(LayoutInflater.from(this), this));
    }

    private void y0(int i7) {
        x0();
        LayoutInflater.from(this).inflate(i7, this.f19842C.c());
    }

    private void z0(View view, ViewGroup.LayoutParams layoutParams) {
        x0();
        this.f19842C.c().addView(view, layoutParams);
    }

    protected void B0() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(1280);
        this.f19863d.d(decorView);
    }

    public void C0(Context context) {
        String string = getString(M.f19686x);
        String string2 = getString(M.f19688y);
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(string);
        progressDialog.setMessage(string2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        this.f19840A = progressDialog;
        progressDialog.show();
    }

    protected void E0(boolean z7) {
        F0(z7, null);
    }

    protected void F0(boolean z7, g gVar) {
        if (a0.k0()) {
            h7.q.a(this, M.f19646f0);
            if (z7) {
                finish();
                return;
            }
            return;
        }
        r0(this.f19846w);
        r0(this.f19848z);
        String packageName = getPackageName();
        n0.d dVarD = n0.e().d();
        String string = h7.n.i() ? getString(M.f19676s) : getString(M.f19680u, u0());
        if (z7) {
            r0(this.f19847y);
            if (R5.a.a(getIntent())) {
                this.f19843D.b(this, true, dVarD);
                return;
            }
            this.f19848z = new c.a(this).o(M.f19678t).h(string).m(M.f19672q, new c(dVarD, this, packageName, gVar)).a();
        } else {
            this.f19848z = new c.a(this).o(M.f19678t).h(string).m(M.f19672q, new e(dVarD, this, packageName, gVar)).i(M.f19670p, new d(gVar)).a();
        }
        this.f19848z.setCancelable(false);
        this.f19848z.show();
    }

    public void R(e7.f fVar) {
        h7.l.a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + fVar);
        Toolbar toolbar = this.f19844E;
        if (toolbar instanceof RobloxToolbar) {
            ((RobloxToolbar) toolbar).R(fVar);
        }
        if (this.f19842C != null) {
            int i7 = f.f19860a[fVar.ordinal()];
            this.f19842C.g(i7 != 1 ? i7 != 2 ? getResources().getColor(G.f19441h) : getResources().getColor(G.f19434a) : getResources().getColor(G.f19448o));
        }
        A0(fVar);
    }

    public boolean m0() {
        boolean zL = q0.l(this);
        boolean z7 = !zL;
        if (!zL) {
            D0();
        }
        return z7;
    }

    protected void n0() {
        t0();
        if (this.f19847y == null) {
            this.f19847y = new c.a(this).o(M.f19640d0).g(M.f19628Z).d(false).a();
        }
        if (this.f19847y.isShowing()) {
            return;
        }
        this.f19847y.show();
    }

    protected boolean o0() {
        return false;
    }

    @Override
    protected void onActivityResult(int i7, int i8, Intent intent) {
        h7.l.a("RobloxActivity", "onActivityResult: requestCode = " + i7);
        if (i7 != 20103) {
            super.onActivityResult(i7, i8, intent);
            return;
        }
        if (i8 != -1) {
            h7.l.g("RobloxActivity", "Sharing dialog dismissed.");
            E6.h.b().p("Android-AppMain-GameShare-ChooserDismissed");
            return;
        }
        String packageName = intent.getComponent().getPackageName();
        h7.l.g("RobloxActivity", "Sharing with=" + packageName + ".");
        startActivity(intent);
        P.u(packageName);
        E6.h.b().p("Android-AppMain-GameShare-AppSelected");
    }

    @Override
    protected void onCreate(Bundle bundle) {
        if (com.roblox.client.startup.d.z()) {
            h7.l.g("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
            return;
        }
        if (j6.d.a().n3()) {
            h7.l.g("RobloxActivity", "GameActivity = ON. Return!");
            super.onCreate(bundle);
            return;
        }
        E6.c.e().k(this);
        boolean z7 = this instanceof ActivitySplash;
        boolean zK = com.roblox.client.startup.a.k();
        if (!zK && !z7) {
            h7.l.g("RobloxActivity", "onCreate ... settingsLoaded = false. Load from preferences!!!");
            com.roblox.client.startup.a.r(this);
        }
        C3086b.f().u(this);
        E6.f.c().d(this);
        super.onCreate(bundle);
        h7.l.a("RobloxActivity", "activity onCreate, name = " + getClass().getSimpleName());
        d0();
        B0();
        if (!zK && !o0()) {
            h7.l.g("RobloxActivity", "onCreate: no AppSettings in activity:" + getClass().getSimpleName() + ". Finish self!");
            finish();
        }
        this.f19841B = true;
        e7.e eVar = new e7.e(this);
        this.f19845F = eVar;
        eVar.b(this);
    }

    @Override
    protected void onDestroy() {
        if (com.roblox.client.startup.d.z()) {
            h7.l.g("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            t0();
            r0(this.f19847y);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Q6.m.c().j(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (C2400b.a() && a0.v0()) {
            h7.l.k("RobloxActivity", "Alert: needs restart");
            n0();
        }
        int i7 = f19839G;
        f19839G = i7 + 1;
        if (i7 == 0) {
            Wa.c.d().n(E6.a.a());
            E6.c.e().p(true);
            a0.Q(this).edit().putBoolean("ROBLOXCrash", true).apply();
            if (!this.f19841B) {
                G0();
            }
        }
        E6.h.b().f0();
        this.f19841B = false;
    }

    @Override
    protected void onStop() {
        int i7 = f19839G - 1;
        f19839G = i7;
        if (i7 == 0) {
            Wa.c.d().p(E6.a.a());
            E6.c.e().p(false);
            NativeReportingInterface.stopPushNotificationSession();
            a0.Q(this).edit().remove("ROBLOXCrash").apply();
            h7.l.g("RobloxActivity", "The Shell is in background.");
            ha.d.p().r();
            ha.d.p().q();
            if (ha.q.h()) {
                ha.h.f2110a.q(false);
            }
        }
        super.onStop();
    }

    protected C2980b p0() {
        return new C2980b();
    }

    protected boolean q0() {
        return a0.Q(this).getBoolean("ROBLOXCrash", false);
    }

    public void s0() {
        ProgressDialog progressDialog = this.f19840A;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f19840A.dismiss();
        this.f19840A = null;
    }

    @Override
    public void setContentView(int i7) {
        y0(i7);
    }

    @Override
    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.f19844E = toolbar;
    }

    public C2980b v0() {
        return this.f19842C;
    }

    public void w0(c.d dVar) {
        h7.l.g("RobloxActivity", "navigateToPostLogoutUI: logoutType = " + dVar + ", foreground = " + i0());
        h7.l.g("RobloxActivity", "navigateToPostLogoutUI: [New Startup] Launch Main activity...");
        startActivity(C2374w.h().i(this));
        if (dVar != c.d.LOGOUT_BY_USER_IN_LUA) {
            h7.l.g("RobloxActivity", "navigateToPostLogoutUI: notify Lua about this 401 logout condition");
            MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
        }
    }

    @Override
    public void setContentView(View view) {
        z0(view, null);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z0(view, layoutParams);
    }
}
