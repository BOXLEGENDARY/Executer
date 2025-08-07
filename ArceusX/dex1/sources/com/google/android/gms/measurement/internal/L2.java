package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import f6.ck.ZJZXBWla;

final class L2 implements Application.ActivityLifecycleCallbacks {

    final N2 f16376d;

    L2(N2 n22, W3.s sVar) {
        this.f16376d = n22;
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        N1 n1;
        Uri data;
        try {
            try {
                this.f16376d.f16818a.b().v().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null || (data = intent.getData()) == null || !data.isHierarchical()) {
                    n1 = this.f16376d.f16818a;
                } else {
                    this.f16376d.f16818a.N();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    this.f16376d.f16818a.a().z(new K2(this, bundle == null, data, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || ZJZXBWla.LCvztiTKlX.equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto", data.getQueryParameter("referrer")));
                    n1 = this.f16376d.f16818a;
                }
            } catch (RuntimeException e7) {
                this.f16376d.f16818a.b().r().b("Throwable caught in onActivityCreated", e7);
                n1 = this.f16376d.f16818a;
            }
            n1.K().z(activity, bundle);
        } catch (Throwable th) {
            this.f16376d.f16818a.K().z(activity, bundle);
            throw th;
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        this.f16376d.f16818a.K().A(activity);
    }

    @Override
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        this.f16376d.f16818a.K().B(activity);
        O3 o3M = this.f16376d.f16818a.M();
        o3M.f16818a.a().z(new G3(o3M, o3M.f16818a.c().b()));
    }

    @Override
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        O3 o3M = this.f16376d.f16818a.M();
        o3M.f16818a.a().z(new F3(o3M, o3M.f16818a.c().b()));
        this.f16376d.f16818a.K().C(activity);
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f16376d.f16818a.K().D(activity, bundle);
    }

    @Override
    public final void onActivityStarted(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }
}
