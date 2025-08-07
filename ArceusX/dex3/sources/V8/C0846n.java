package v8;

import com.withpersona.sdk2.camera.CameraPreview;
import i9.C0594a;

public final class C0846n implements C9.d<com.withpersona.sdk2.inquiry.governmentid.h> {
    private final C9.h<u5.w> a;
    private final C9.h<CameraPreview> b;
    private final C9.h<C0594a> c;

    public C0846n(C9.h<u5.w> hVar, C9.h<CameraPreview> hVar2, C9.h<C0594a> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static C0846n a(C9.h<u5.w> hVar, C9.h<CameraPreview> hVar2, C9.h<C0594a> hVar3) {
        return new C0846n(hVar, hVar2, hVar3);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.h c(u5.w wVar, CameraPreview cameraPreview, C0594a c0594a) {
        return new com.withpersona.sdk2.inquiry.governmentid.h(wVar, cameraPreview, c0594a);
    }

    public com.withpersona.sdk2.inquiry.governmentid.h get() {
        return c((u5.w) this.a.get(), (CameraPreview) this.b.get(), (C0594a) this.c.get());
    }
}
