package ha;

import A9.a;
import C9.h;
import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import o8.InterfaceC0723a;
import p8.EnumC0732a;

public final class C0646g {
    private final h<Context> a;
    private final h<InterfaceC0723a> b;

    public C0646g(h<Context> hVar, h<InterfaceC0723a> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static C0646g a(h<Context> hVar, h<InterfaceC0723a> hVar2) {
        return new C0646g(hVar, hVar2);
    }

    public static C0645f c(Context context, InterfaceC0723a interfaceC0723a, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC0636b interfaceC0636b, EnumC0732a enumC0732a, a aVar, boolean z) {
        return new C0645f(context, interfaceC0723a, cameraChoices, camera2PreviewView, interfaceC0636b, enumC0732a, aVar, z);
    }

    public C0645f b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, InterfaceC0636b interfaceC0636b, EnumC0732a enumC0732a, a aVar, boolean z) {
        return c((Context) this.a.get(), (InterfaceC0723a) this.b.get(), cameraChoices, camera2PreviewView, interfaceC0636b, enumC0732a, aVar, z);
    }
}
