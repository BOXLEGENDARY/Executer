package com.google.android.gms.measurement.internal;

import K0.wJ.BtcVLuo;
import android.os.Bundle;
import n3.C2651i;

final class RunnableC2299w2 implements Runnable {

    final Bundle f17073d;

    final N2 f17074e;

    RunnableC2299w2(N2 n22, Bundle bundle) {
        this.f17074e = n22;
        this.f17073d = bundle;
    }

    @Override
    public final void run() throws IllegalStateException {
        N2 n22 = this.f17074e;
        Bundle bundle = this.f17073d;
        n22.h();
        n22.i();
        C2651i.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C2651i.f(string);
        C2651i.f(string2);
        C2651i.l(bundle.get("value"));
        if (!n22.f16818a.o()) {
            n22.f16818a.b().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkv zzkvVar = new zzkv(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzat zzatVarW0 = n22.f16818a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            n22.f16818a.L().s(new zzab(bundle.getString("app_id"), string2, zzkvVar, bundle.getLong("creation_timestamp"), false, bundle.getString(BtcVLuo.Mjm), n22.f16818a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzatVarW0, bundle.getLong("time_to_live"), n22.f16818a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
