package s;

import C.X;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.concurrent.futures.c;
import r.C2739a;
import s.o2;
import u.C2921b;
import z.InterfaceC3054j;

final class C2798c implements o2.b {

    private final t.B f23302a;

    private final Range<Float> f23303b;

    private c.a<Void> f23305d;

    private boolean f23307f;

    private float f23304c = 1.0f;

    private float f23306e = 1.0f;

    C2798c(t.B b2) {
        this.f23307f = false;
        this.f23302a = b2;
        this.f23303b = (Range) b2.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f23307f = b2.d();
    }

    @Override
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f23305d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f7 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f7 == null) {
                return;
            }
            if (this.f23306e == f7.floatValue()) {
                this.f23305d.c(null);
                this.f23305d = null;
            }
        }
    }

    @Override
    public void b(C2739a.C0218a c0218a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f23304c);
        X.c cVar = X.c.REQUIRED;
        c0218a.g(key, fValueOf, cVar);
        if (this.f23307f) {
            C2921b.a(c0218a, cVar);
        }
    }

    @Override
    public void c(float f7, c.a<Void> aVar) {
        this.f23304c = f7;
        c.a<Void> aVar2 = this.f23305d;
        if (aVar2 != null) {
            aVar2.f(new InterfaceC3054j.a("There is a new zoomRatio being set"));
        }
        this.f23306e = this.f23304c;
        this.f23305d = aVar;
    }

    @Override
    public float d() {
        return ((Float) this.f23303b.getUpper()).floatValue();
    }

    @Override
    public float e() {
        return ((Float) this.f23303b.getLower()).floatValue();
    }

    @Override
    public Rect f() {
        return (Rect) x0.g.g((Rect) this.f23302a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override
    public void g() {
        this.f23304c = 1.0f;
        c.a<Void> aVar = this.f23305d;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a("Camera is not active."));
            this.f23305d = null;
        }
    }
}
