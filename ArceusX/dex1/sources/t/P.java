package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

class P extends T {
    P(Context context) {
        super(context, null);
    }

    static P i(Context context) {
        return new P(context);
    }

    private boolean j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && k(th);
    }

    private static boolean k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void l(Throwable th) throws C2894g {
        throw new C2894g(10001, th);
    }

    @Override
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f23723a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f23723a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override
    public CameraCharacteristics c(String str) throws C2894g {
        try {
            return super.c(str);
        } catch (RuntimeException e7) {
            if (j(e7)) {
                l(e7);
            }
            throw e7;
        }
    }

    @Override
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C2894g {
        try {
            this.f23723a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        } catch (IllegalArgumentException e8) {
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            if (j(e10)) {
                l(e10);
            }
            throw e10;
        }
    }
}
