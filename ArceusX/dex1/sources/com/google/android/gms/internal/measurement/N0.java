package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class N0 extends M0 {

    final Bundle f14899w;

    final Activity f14900y;

    final V0 f14901z;

    N0(V0 v02, Bundle bundle, Activity activity) {
        super(v02.f15051d, true);
        this.f14901z = v02;
        this.f14899w = bundle;
        this.f14900y = activity;
    }

    @Override
    final void a() throws RemoteException {
        Bundle bundle;
        if (this.f14899w != null) {
            bundle = new Bundle();
            if (this.f14899w.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14899w.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((InterfaceC1882h0) C2651i.l(this.f14901z.f15051d.f15066i)).onActivityCreated(BinderC3024b.h3(this.f14900y), bundle, this.f14829e);
    }
}
