package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class V0 implements Application.ActivityLifecycleCallbacks {

    final W0 f15051d;

    V0(W0 w02) {
        this.f15051d = w02;
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f15051d.l(new N0(this, bundle, activity));
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        this.f15051d.l(new U0(this, activity));
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        this.f15051d.l(new Q0(this, activity));
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        this.f15051d.l(new P0(this, activity));
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        this.f15051d.l(new T0(this, activity, binderC1850d0));
        Bundle bundleO0 = binderC1850d0.O0(50L);
        if (bundleO0 != null) {
            bundle.putAll(bundleO0);
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        this.f15051d.l(new O0(this, activity));
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        this.f15051d.l(new S0(this, activity));
    }
}
