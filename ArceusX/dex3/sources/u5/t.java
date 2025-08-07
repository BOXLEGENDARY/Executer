package u5;

import C9.h;
import android.content.Context;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.b;
import o8.InterfaceC0723a;

public final class t {
    private final h<Context> a;
    private final h<InterfaceC0723a> b;

    public t(h<Context> hVar, h<InterfaceC0723a> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static t a(h<Context> hVar, h<InterfaceC0723a> hVar2) {
        return new t(hVar, hVar2);
    }

    public static b c(Context context, InterfaceC0723a interfaceC0723a, CameraPreview cameraPreview, PreviewView previewView, s sVar) {
        return new b(context, interfaceC0723a, cameraPreview, previewView, sVar);
    }

    public b b(CameraPreview cameraPreview, PreviewView previewView, s sVar) {
        return c((Context) this.a.get(), (InterfaceC0723a) this.b.get(), cameraPreview, previewView, sVar);
    }
}
