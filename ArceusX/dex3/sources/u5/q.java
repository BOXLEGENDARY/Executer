package u5;

import C9.d;
import com.withpersona.sdk2.camera.CameraPreview;

public final class q implements d<CameraPreview> {

    private static final class a {
        static final q a = new q();
    }

    public static q a() {
        return a.a;
    }

    public static CameraPreview c() {
        return new CameraPreview();
    }

    public CameraPreview get() {
        return c();
    }
}
