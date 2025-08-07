package s;

import C.X;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import r.C2739a;
import s.o2;
import z.InterfaceC3054j;

final class C2812g1 implements o2.b {

    private final t.B f23350a;

    private c.a<Void> f23352c;

    private Rect f23351b = null;

    private Rect f23353d = null;

    C2812g1(t.B b2) {
        this.f23350a = b2;
    }

    private static Rect h(Rect rect, float f7) {
        float fWidth = rect.width() / f7;
        float fHeight = rect.height() / f7;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    private Rect i() {
        return (Rect) x0.g.g((Rect) this.f23350a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f23352c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f23353d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f23352c.c(null);
            this.f23352c = null;
            this.f23353d = null;
        }
    }

    @Override
    public void b(C2739a.C0218a c0218a) {
        Rect rect = this.f23351b;
        if (rect != null) {
            c0218a.g(CaptureRequest.SCALER_CROP_REGION, rect, X.c.REQUIRED);
        }
    }

    @Override
    public void c(float f7, c.a<Void> aVar) {
        this.f23351b = h(i(), f7);
        c.a<Void> aVar2 = this.f23352c;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3054j.a("There is a new zoomRatio being set"));
        }
        this.f23353d = this.f23351b;
        this.f23352c = aVar;
    }

    @Override
    public float d() {
        Float f7 = (Float) this.f23350a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f7 == null) {
            return 1.0f;
        }
        return f7.floatValue() < e() ? e() : f7.floatValue();
    }

    @Override
    public float e() {
        return 1.0f;
    }

    @Override
    public Rect f() {
        Rect rect = this.f23351b;
        return rect != null ? rect : i();
    }

    @Override
    public void g() {
        this.f23353d = null;
        this.f23351b = null;
        c.a<Void> aVar = this.f23352c;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a("Camera is not active."));
            this.f23352c = null;
        }
    }
}
