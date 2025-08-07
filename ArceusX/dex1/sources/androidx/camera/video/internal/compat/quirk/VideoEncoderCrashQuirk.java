package androidx.camera.video.internal.compat.quirk;

import C.I;
import S.C1230l;
import android.os.Build;

public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }

    @Override
    public boolean d(I i7, C1230l c1230l) {
        return f() && i7.h() == 0 && c1230l == C1230l.f6336a;
    }
}
