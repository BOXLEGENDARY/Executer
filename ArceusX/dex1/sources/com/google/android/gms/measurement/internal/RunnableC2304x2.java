package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import n3.C2651i;

final class RunnableC2304x2 implements Runnable {

    final Bundle f17102d;

    final N2 f17103e;

    RunnableC2304x2(N2 n22, Bundle bundle) {
        this.f17103e = n22;
        this.f17102d = bundle;
    }

    @Override
    public final void run() throws IllegalStateException {
        N2 n22 = this.f17103e;
        Bundle bundle = this.f17102d;
        n22.h();
        n22.i();
        C2651i.l(bundle);
        String strF = C2651i.f(bundle.getString("name"));
        if (!n22.f16818a.o()) {
            n22.f16818a.b().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            n22.f16818a.L().s(new zzab(bundle.getString("app_id"), BuildConfig.FLAVOR, new zzkv(strF, 0L, null, BuildConfig.FLAVOR), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), n22.f16818a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
