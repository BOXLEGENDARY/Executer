package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.C2889b;
import t.C2891d;

public final class M0 {

    static final class a extends CameraCaptureSession.StateCallback {

        private final List<CameraCaptureSession.StateCallback> f23107a = new ArrayList();

        a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f23107a.add(stateCallback);
                }
            }
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                it.next().onActive(cameraCaptureSession);
            }
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                C2891d.a(it.next(), cameraCaptureSession);
            }
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                it.next().onReady(cameraCaptureSession);
            }
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f23107a.iterator();
            while (it.hasNext()) {
                C2889b.a(it.next(), cameraCaptureSession, surface);
            }
        }
    }

    static final class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    public static CameraCaptureSession.StateCallback a(List<CameraCaptureSession.StateCallback> list) {
        return list.isEmpty() ? b() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static CameraCaptureSession.StateCallback b() {
        return new b();
    }
}
