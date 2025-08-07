package V8;

import com.withpersona.sdk2.camera.CameraPreview;
import u5.H;

public final class k implements C9.d<com.withpersona.sdk2.inquiry.selfie.f> {
    private final C9.h<CameraPreview> a;
    private final C9.h<H> b;

    public k(C9.h<CameraPreview> hVar, C9.h<H> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static k a(C9.h<CameraPreview> hVar, C9.h<H> hVar2) {
        return new k(hVar, hVar2);
    }

    public static com.withpersona.sdk2.inquiry.selfie.f c(CameraPreview cameraPreview, H h) {
        return new com.withpersona.sdk2.inquiry.selfie.f(cameraPreview, h);
    }

    public com.withpersona.sdk2.inquiry.selfie.f get() {
        return c((CameraPreview) this.a.get(), (H) this.b.get());
    }
}
