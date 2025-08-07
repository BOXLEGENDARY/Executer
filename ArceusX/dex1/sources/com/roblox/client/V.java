package com.roblox.client;

import S5.Cg.XjqcfAbdbc;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.AbstractC1694h;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.reporter.SessionReporterJavaInterface;
import ha.C2697c;
import java.util.Locale;
import m6.EnumC2597N;
import w6.C2979a;
import x6.C2994a;
import x6.C2995b;
import z6.C3086b;

public abstract class V extends androidx.appcompat.app.d {

    protected static int f19861i;

    protected static int f19862v;

    protected C2979a f19863d = new C2979a();

    private boolean f19864e;

    private void g0(String str, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        c.a aVar = new c.a(this);
        aVar.j(M.f19583B, null);
        aVar.h(str);
        if (onDismissListener != null) {
            aVar.k(onDismissListener);
        }
        aVar.a().show();
    }

    private void h0(String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        if (isDestroyed()) {
            return;
        }
        c.a aVar = new c.a(this);
        aVar.j(M.f19583B, null);
        aVar.p(str2);
        aVar.h(str);
        if (onDismissListener != null) {
            aVar.k(onDismissListener);
        }
        aVar.a().show();
    }

    @Override
    protected void attachBaseContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        z6.f fVarD = C3086b.f().d(context);
        z6.f fVarJ = C3086b.f().j();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" -> Locale: base = ");
        sb.append(configuration.locale);
        sb.append("; default = ");
        sb.append(fVarD.c());
        sb.append("; user = ");
        sb.append(fVarJ != null ? fVarJ.c() : "null");
        h7.l.a("rbx.locale", sb.toString());
        Locale localeB = C3086b.b(fVarJ != null ? fVarJ.c() : fVarD.c());
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        super.attachBaseContext(context.createConfigurationContext(configuration));
        ka.h.b(this);
    }

    protected void d0() {
        if (a0.g0()) {
            return;
        }
        if (j6.d.a().n1()) {
            setRequestedOrientation(13);
        } else {
            setRequestedOrientation(a0.j0() ? 7 : 6);
        }
    }

    public void e0(String str, String str2) {
        h0(str, str2, null);
    }

    public C2979a f0() {
        return this.f19863d;
    }

    public boolean i0() {
        return this.f19864e;
    }

    @Override
    public boolean isDestroyed() {
        return AbstractC1694h.b.DESTROYED == getLifecycle().getState();
    }

    public void j0(int i7, int i8) {
        Toast.makeText(this, i7, i8).show();
    }

    public void k0(String str, int i7) {
        Toast.makeText(this, str, i7).show();
    }

    public void o(int i7) {
        g0(getString(i7), null);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        if (com.roblox.client.startup.d.z()) {
            h7.l.g("RobloxBaseActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            finish();
        } else {
            if (j6.d.a().n3()) {
                h7.l.g("RobloxBaseActivity", XjqcfAbdbc.oFhetPiLWOaFc);
                super.onCreate(bundle);
                return;
            }
            a0.N0(this);
            C2697c.e(this);
            super.onCreate(bundle);
            int i7 = f19861i;
            f19861i = i7 + 1;
            if (i7 == 0) {
                NativeLocaleJavaInterface.setImplementation(new C2994a());
                SessionReporterJavaInterface.setImplementation(new C2995b(this));
            }
            g7.c.c().l();
        }
    }

    @Override
    protected void onDestroy() {
        if (!com.roblox.client.startup.d.z()) {
            super.onDestroy();
            f19861i--;
            return;
        }
        h7.l.g("RobloxBaseActivity", "onDestroy: App was previously destroyed due to process death");
        super.onDestroy();
        if (j6.d.a().c()) {
            C2697c.a();
        }
        h7.p.c(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onPause() {
        this.f19864e = false;
        C2697c.f(getCacheDir(), a0.f19893n.getString("webview_url", BuildConfig.FLAVOR));
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.f19864e = true;
        C2697c.g();
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("RESTART_AFTER_PROCESS_DEATH", true);
        super.onSaveInstanceState(bundle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        f19862v++;
    }

    @Override
    protected void onStop() {
        C2697c.h();
        super.onStop();
        f19862v--;
    }

    @Override
    public void onTrimMemory(int i7) {
        h7.l.k("RobloxBaseActivity", "onTrimMemory: in " + getClass().getSimpleName() + ", level = " + i7);
        super.onTrimMemory(i7);
        RobloxApplication.b("RobloxBaseActivity", EnumC2597N.EXPERIENCE, i7);
    }

    public void r(String str) {
        g0(str, null);
    }
}
