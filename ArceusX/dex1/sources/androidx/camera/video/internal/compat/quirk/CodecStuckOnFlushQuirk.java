package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class CodecStuckOnFlushQuirk implements N0 {
    private static boolean f() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return f();
    }

    public boolean g(String str) {
        return "video/mp4v-es".equals(str);
    }
}
