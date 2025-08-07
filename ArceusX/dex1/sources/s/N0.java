package s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class N0 {

    private static final class a extends CameraDevice.StateCallback {

        private final List<CameraDevice.StateCallback> f23112a = new ArrayList();

        a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f23112a.add(stateCallback);
                }
            }
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f23112a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f23112a.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i7) {
            Iterator<CameraDevice.StateCallback> it = this.f23112a.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i7);
            }
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f23112a.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    static final class b extends CameraDevice.StateCallback {
        b() {
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i7) {
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        return list.isEmpty() ? b() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }
}
