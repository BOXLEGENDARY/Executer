package s;

import C.AbstractC0345p;
import C.r;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

final class S0 extends CameraCaptureSession.CaptureCallback {

    private final AbstractC0345p f23155a;

    S0(AbstractC0345p abstractC0345p) {
        if (abstractC0345p == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f23155a = abstractC0345p;
    }

    private int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof C.g1) && (num = (Integer) ((C.g1) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C.g1 g1VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            x0.g.b(tag instanceof C.g1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            g1VarB = (C.g1) tag;
        } else {
            g1VarB = C.g1.b();
        }
        this.f23155a.b(a(captureRequest), new C2810g(g1VarB, totalCaptureResult));
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f23155a.c(a(captureRequest), new C.r(r.a.ERROR));
    }

    @Override
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
        this.f23155a.d(a(captureRequest));
    }
}
