package t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class C {

    private final a f23697a;

    interface a {
        void a(u.q qVar) throws C2894g;
    }

    static final class b extends CameraDevice.StateCallback {

        final CameraDevice.StateCallback f23698a;

        private final Executor f23699b;

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f23699b = executor;
            this.f23698a = stateCallback;
        }

        public void e(CameraDevice cameraDevice) {
            this.f23698a.onClosed(cameraDevice);
        }

        public void f(CameraDevice cameraDevice) {
            this.f23698a.onDisconnected(cameraDevice);
        }

        public void g(CameraDevice cameraDevice, int i7) {
            this.f23698a.onError(cameraDevice, i7);
        }

        public void h(CameraDevice cameraDevice) {
            this.f23698a.onOpened(cameraDevice);
        }

        @Override
        public void onClosed(final CameraDevice cameraDevice) {
            this.f23699b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23700d.e(cameraDevice);
                }
            });
        }

        @Override
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f23699b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23705d.f(cameraDevice);
                }
            });
        }

        @Override
        public void onError(final CameraDevice cameraDevice, final int i7) {
            this.f23699b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23702d.g(cameraDevice, i7);
                }
            });
        }

        @Override
        public void onOpened(final CameraDevice cameraDevice) {
            this.f23699b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23707d.h(cameraDevice);
                }
            });
        }
    }

    private C(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23697a = new J(cameraDevice);
        } else {
            this.f23697a = I.e(cameraDevice, handler);
        }
    }

    public static C b(CameraDevice cameraDevice, Handler handler) {
        return new C(cameraDevice, handler);
    }

    public void a(u.q qVar) throws C2894g {
        this.f23697a.a(qVar);
    }
}
