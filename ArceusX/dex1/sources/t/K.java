package t;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.C;
import z.C3043d0;

class K implements C.a {

    final CameraDevice f23709a;

    final Object f23710b;

    static class a {

        final Handler f23711a;

        a(Handler handler) {
            this.f23711a = handler;
        }
    }

    K(CameraDevice cameraDevice, Object obj) {
        this.f23709a = (CameraDevice) x0.g.g(cameraDevice);
        this.f23710b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<u.k> list) {
        String id = cameraDevice.getId();
        Iterator<u.k> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (strC != null && !strC.isEmpty()) {
                C3043d0.l("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + strC + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, u.q qVar) {
        x0.g.g(cameraDevice);
        x0.g.g(qVar);
        x0.g.g(qVar.e());
        List<u.k> listC = qVar.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (qVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, listC);
    }

    static List<Surface> d(List<u.k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<u.k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }
}
