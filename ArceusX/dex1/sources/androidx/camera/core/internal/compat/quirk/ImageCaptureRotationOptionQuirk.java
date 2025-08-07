package androidx.camera.core.internal.compat.quirk;

import C.N0;
import C.V;
import C.X;
import H3.QdLC.QcdySgfdST;
import android.os.Build;

public final class ImageCaptureRotationOptionQuirk implements N0 {
    private static boolean f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains(QcdySgfdST.FAsyQeUwFmNyT) && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    private static boolean g() {
        f();
        return false;
    }

    private static boolean h() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && QcdySgfdST.Mci.equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return i() || h() || g();
    }

    public boolean j(X.a<?> aVar) {
        return aVar != V.f441i;
    }
}
