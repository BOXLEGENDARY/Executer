package m3;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class RunnableC2568I implements Runnable {

    final LifecycleCallback f22006d;

    final String f22007e;

    final FragmentC2569J f22008i;

    RunnableC2568I(FragmentC2569J fragmentC2569J, LifecycleCallback lifecycleCallback, String str) {
        this.f22008i = fragmentC2569J;
        this.f22006d = lifecycleCallback;
        this.f22007e = str;
    }

    @Override
    public final void run() {
        Bundle bundle;
        FragmentC2569J fragmentC2569J = this.f22008i;
        if (fragmentC2569J.f22011e > 0) {
            LifecycleCallback lifecycleCallback = this.f22006d;
            if (fragmentC2569J.f22012i != null) {
                bundle = fragmentC2569J.f22012i.getBundle(this.f22007e);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f22008i.f22011e >= 2) {
            this.f22006d.j();
        }
        if (this.f22008i.f22011e >= 3) {
            this.f22006d.h();
        }
        if (this.f22008i.f22011e >= 4) {
            this.f22006d.k();
        }
        if (this.f22008i.f22011e >= 5) {
            this.f22006d.g();
        }
    }
}
