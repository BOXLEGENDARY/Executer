package androidx.camera.core.impl.utils;

import android.view.Surface;

public class SurfaceUtil {

    public static class a {

        public int f9475a = 0;

        public int f9476b = 0;

        public int f9477c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f9475a = iArrNativeGetSurfaceInfo[0];
        aVar.f9476b = iArrNativeGetSurfaceInfo[1];
        aVar.f9477c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
