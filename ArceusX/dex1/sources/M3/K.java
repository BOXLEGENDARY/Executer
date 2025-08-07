package m3;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class K implements Runnable {

    final LifecycleCallback f22013d;

    final String f22014e;

    final L f22015i;

    K(L l7, LifecycleCallback lifecycleCallback, String str) {
        this.f22015i = l7;
        this.f22013d = lifecycleCallback;
        this.f22014e = str;
    }

    @Override
    public final void run() {
        Bundle bundle;
        L l7 = this.f22015i;
        if (l7.f22018e > 0) {
            LifecycleCallback lifecycleCallback = this.f22013d;
            if (l7.f22019i != null) {
                bundle = l7.f22019i.getBundle(this.f22014e);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f22015i.f22018e >= 2) {
            this.f22013d.j();
        }
        if (this.f22015i.f22018e >= 3) {
            this.f22013d.h();
        }
        if (this.f22015i.f22018e >= 4) {
            this.f22013d.k();
        }
        if (this.f22015i.f22018e >= 5) {
            this.f22013d.g();
        }
    }
}
