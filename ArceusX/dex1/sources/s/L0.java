package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C2890c;

class L0 extends CameraCaptureSession.CaptureCallback {

    a f23027b = null;

    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f23026a = new HashMap();

    interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i7, boolean z7);
    }

    L0() {
    }

    private List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f23026a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f23026a.get(captureRequest);
        if (list2 == null) {
            this.f23026a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f23026a.put(captureRequest, arrayList);
    }

    public void c(a aVar) {
        this.f23027b = aVar;
    }

    @Override
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            C2890c.a(it.next(), cameraCaptureSession, captureRequest, surface, j7);
        }
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f23026a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceAborted(cameraCaptureSession, i7);
            }
        }
        a aVar = this.f23027b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i7, true);
        }
    }

    @Override
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j7) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f23026a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceCompleted(cameraCaptureSession, i7, j7);
            }
        }
        a aVar = this.f23027b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i7, false);
        }
    }

    @Override
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
        }
    }
}
