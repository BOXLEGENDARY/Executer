package r;

import C.D0;
import C.E0;
import C.J0;
import C.X;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import y.j;
import z.InterfaceC3031A;

public final class C2739a extends j {

    public static final X.a<Integer> f22721J = X.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    public static final X.a<Long> f22722K = X.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    public static final X.a<CameraDevice.StateCallback> f22723L = X.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    public static final X.a<CameraCaptureSession.StateCallback> f22724M = X.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    public static final X.a<CameraCaptureSession.CaptureCallback> f22725N = X.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    public static final X.a<Object> f22726O = X.a.a("camera2.captureRequest.tag", Object.class);

    public static final X.a<String> f22727P = X.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    public static final class C0218a implements InterfaceC3031A<C2739a> {

        private final E0 f22728a = E0.d0();

        public C2739a a() {
            return new C2739a(J0.b0(this.f22728a));
        }

        public C0218a b(X x7) {
            e(x7, X.c.OPTIONAL);
            return this;
        }

        @Override
        public D0 c() {
            return this.f22728a;
        }

        public C0218a e(X x7, X.c cVar) {
            for (X.a<?> aVar : x7.c()) {
                this.f22728a.T(aVar, cVar, x7.f(aVar));
            }
            return this;
        }

        public <ValueT> C0218a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f22728a.l(C2739a.Z(key), valuet);
            return this;
        }

        public <ValueT> C0218a g(CaptureRequest.Key<ValueT> key, ValueT valuet, X.c cVar) {
            this.f22728a.T(C2739a.Z(key), cVar, valuet);
            return this;
        }
    }

    public C2739a(X x7) {
        super(x7);
    }

    public static X.a<Object> Z(CaptureRequest.Key<?> key) {
        return X.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public j a0() {
        return j.a.e(e()).b();
    }

    public int b0(int i7) {
        return ((Integer) e().a(f22721J, Integer.valueOf(i7))).intValue();
    }

    public CameraDevice.StateCallback c0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) e().a(f22723L, stateCallback);
    }

    public String d0(String str) {
        return (String) e().a(f22727P, str);
    }

    public CameraCaptureSession.CaptureCallback e0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) e().a(f22725N, captureCallback);
    }

    public CameraCaptureSession.StateCallback f0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) e().a(f22724M, stateCallback);
    }

    public long g0(long j7) {
        return ((Long) e().a(f22722K, Long.valueOf(j7))).longValue();
    }
}
