package C;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;
import z.C3043d0;
import z.C3061p;

public final class T {

    private static final C3061p f437a = new C3061p.a().b(2).a();

    private static class a {
        static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {

        private int f438d;

        public b(String str, int i7, Throwable th) {
            super(str, th);
            this.f438d = i7;
        }

        public int a() {
            return this.f438d;
        }
    }

    public static void a(Context context, N n7, C3061p c3061p) throws b {
        Integer numD;
        int i7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<J> linkedHashSetA = n7.a();
            if (linkedHashSetA.isEmpty()) {
                throw new b("No cameras available", 0, null);
            }
            C3043d0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + linkedHashSetA.size() + " cameras. Skipping validation.");
            return;
        }
        if (c3061p != null) {
            try {
                numD = c3061p.d();
                if (numD == null) {
                    C3043d0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e7) {
                C3043d0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e7);
                return;
            }
        } else {
            numD = null;
        }
        C3043d0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c3061p == null || numD.intValue() == 1)) {
                C3061p.f24686d.e(n7.a());
                i7 = 1;
            }
        } catch (IllegalArgumentException e8) {
            illegalArgumentException = e8;
            C3043d0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c3061p == null || numD.intValue() == 0)) {
                C3061p.f24685c.e(n7.a());
                i7++;
            }
        } catch (IllegalArgumentException e9) {
            illegalArgumentException = e9;
            C3043d0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f437a.e(n7.a());
            C3043d0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i7++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        C3043d0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + n7.a());
        throw new b("Expected camera missing from device.", i7, illegalArgumentException);
    }
}
