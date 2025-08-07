package ha;

import A9.a;
import C9.e;
import C9.h;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import ha.C0645f;
import p8.EnumC0732a;

public final class C0647h implements C0645f.a {
    private final C0646g a;

    C0647h(C0646g c0646g) {
        this.a = c0646g;
    }

    public static h<C0645f.a> b(C0646g c0646g) {
        return e.a(new C0647h(c0646g));
    }

    @Override
    public C0645f a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC0636b interfaceC0636b, EnumC0732a enumC0732a, a aVar, boolean z) {
        return this.a.b(cameraChoices, camera2PreviewView, interfaceC0636b, enumC0732a, aVar, z);
    }
}
