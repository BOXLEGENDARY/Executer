package t;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C2894g extends Exception {

    static final Set<Integer> f23733i = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    static final Set<Integer> f23734v = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    private final int f23735d;

    private final CameraAccessException f23736e;

    public C2894g(int i7, String str, Throwable th) {
        super(a(i7, str), th);
        this.f23735d = i7;
        this.f23736e = f23733i.contains(Integer.valueOf(i7)) ? new CameraAccessException(i7, str, th) : null;
    }

    private static String a(int i7, String str) {
        return String.format("%s (%d): %s", c(i7), Integer.valueOf(i7), str);
    }

    private static String b(int i7) {
        if (i7 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i7 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i7 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i7 == 4) {
            return "The camera device is in use already";
        }
        if (i7 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i7 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i7 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    private static String c(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? i7 != 1000 ? i7 != 10001 ? i7 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static C2894g e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C2894g(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int d() {
        return this.f23735d;
    }

    public C2894g(int i7, Throwable th) {
        super(b(i7), th);
        this.f23735d = i7;
        this.f23736e = f23733i.contains(Integer.valueOf(i7)) ? new CameraAccessException(i7, null, th) : null;
    }

    private C2894g(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f23735d = cameraAccessException.getReason();
        this.f23736e = cameraAccessException;
    }
}
