package androidx.camera.view;

import android.content.Context;
import android.util.Log;
import android.view.InterfaceC1701o;
import z.H0;
import z.InterfaceC3052i;

public final class C1604f extends AbstractC1601c {

    private InterfaceC1701o f9659M;

    public C1604f(Context context) {
        super(context);
    }

    @Override
    InterfaceC3052i K() {
        if (this.f9659M == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        if (this.f9650u == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        H0 h0I = i();
        if (h0I == null) {
            return null;
        }
        try {
            return this.f9650u.c(this.f9659M, this.f9630a, h0I);
        } catch (IllegalArgumentException e7) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e7);
        }
    }

    public void W(InterfaceC1701o interfaceC1701o) {
        E.p.a();
        this.f9659M = interfaceC1701o;
        L();
    }
}
