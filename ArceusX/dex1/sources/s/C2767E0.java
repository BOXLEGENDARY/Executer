package s;

import C.AbstractC0324e0;
import C.InterfaceC0364z;
import C.X;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.j;
import z.C3043d0;
import z3.AdxZ.bpTQi;

class C2767E0 {

    static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(C.V v7, CaptureRequest.Builder builder) {
        if (v7.e().equals(C.c1.f534a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, v7.e());
    }

    private static void b(CaptureRequest.Builder builder, C.X x7) {
        y.j jVarB = j.a.e(x7).b();
        for (X.a<?> aVar : jVarB.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, jVarB.f(aVar));
            } catch (IllegalArgumentException unused) {
                C3043d0.c(bpTQi.EVQExEN, "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(CaptureRequest.Builder builder, int i7, w.y yVar) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : yVar.a(i7).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    static void d(C.V v7, CaptureRequest.Builder builder) {
        if (v7.h() == 1 || v7.l() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (v7.h() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (v7.l() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    public static CaptureRequest e(C.V v7, CameraDevice cameraDevice, Map<AbstractC0324e0, Surface> map, boolean z7, w.y yVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listG = g(v7.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        InterfaceC0364z interfaceC0364zD = v7.d();
        if (v7.k() == 5 && interfaceC0364zD != null && (interfaceC0364zD.j() instanceof TotalCaptureResult)) {
            C3043d0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) interfaceC0364zD.j());
        } else {
            C3043d0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (v7.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z7 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(v7.k());
            }
        }
        c(builderCreateCaptureRequest, v7.k(), yVar);
        a(v7, builderCreateCaptureRequest);
        d(v7, builderCreateCaptureRequest);
        C.X xG = v7.g();
        X.a<Integer> aVar = C.V.f441i;
        if (xG.b(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) v7.g().f(aVar));
        }
        C.X xG2 = v7.g();
        X.a<Integer> aVar2 = C.V.f442j;
        if (xG2.b(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v7.g().f(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, v7.g());
        Iterator<Surface> it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget(it.next());
        }
        builderCreateCaptureRequest.setTag(v7.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(C.V v7, CameraDevice cameraDevice, w.y yVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        C3043d0.a("Camera2CaptureRequestBuilder", "template type = " + v7.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(v7.k());
        c(builderCreateCaptureRequest, v7.k(), yVar);
        b(builderCreateCaptureRequest, v7.g());
        return builderCreateCaptureRequest.build();
    }

    private static List<Surface> g(List<AbstractC0324e0> list, Map<AbstractC0324e0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0324e0> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
