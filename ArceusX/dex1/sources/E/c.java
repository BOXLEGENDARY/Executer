package E;

import z.C3043d0;

public final class c {
    public static int a(int i7, int i8, boolean z7) {
        int i9 = z7 ? ((i8 - i7) + 360) % 360 : (i8 + i7) % 360;
        if (C3043d0.h("CameraOrientationUtil")) {
            C3043d0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z7), Integer.valueOf(i9)));
        }
        return i9;
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 90;
        }
        if (i7 == 2) {
            return 180;
        }
        if (i7 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i7);
    }
}
