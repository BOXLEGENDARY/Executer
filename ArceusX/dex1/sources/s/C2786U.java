package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t.C2890c;

public final class C2786U {

    private static final class a extends CameraCaptureSession.CaptureCallback {

        private final List<CameraCaptureSession.CaptureCallback> f23174a = new ArrayList();

        a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof b)) {
                    this.f23174a.add(captureCallback);
                }
            }
        }

        @Override
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                C2890c.a(it.next(), cameraCaptureSession, captureRequest, surface, j7);
            }
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(cameraCaptureSession, i7);
            }
        }

        @Override
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j7) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(cameraCaptureSession, i7, j7);
            }
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f23174a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
            }
        }
    }

    static final class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        }

        @Override
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j7) {
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        }
    }

    static CameraCaptureSession.CaptureCallback a(List<CameraCaptureSession.CaptureCallback> list) {
        return new a(list);
    }

    public static CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return a(Arrays.asList(captureCallbackArr));
    }

    public static CameraCaptureSession.CaptureCallback c() {
        return new b();
    }
}
