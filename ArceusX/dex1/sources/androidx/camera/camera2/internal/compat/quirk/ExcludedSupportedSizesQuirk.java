package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import S9.Gvmm.CAqKeu;
import android.os.Build;
import android.util.Size;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.C3043d0;

public class ExcludedSupportedSizesQuirk implements N0 {
    private List<Size> g(String str, int i7, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i7 == 34 || i7 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    private List<Size> h(String str, int i7) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i7 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> i(String str, int i7) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i7 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> j(String str, int i7) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i7 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    private List<Size> k(String str, int i7, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i7 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i7 == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i7 == 34 || i7 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private List<Size> l(String str, int i7, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i7 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i7 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i7 == 34 || i7 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private static boolean m() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean n() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && CAqKeu.riTfbVyVJpNoZf.equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean o() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean p() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean q() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean r() {
        return GObvYfBKohxpYX.CKRUjzljQC.equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean s() {
        return n() || o() || m() || r() || q() || p();
    }

    public List<Size> f(String str, int i7) {
        if (n()) {
            return h(str, i7);
        }
        if (o()) {
            return i(str, i7);
        }
        if (m()) {
            return g(str, i7, null);
        }
        if (r()) {
            return l(str, i7, null);
        }
        if (q()) {
            return k(str, i7, null);
        }
        if (p()) {
            return j(str, i7);
        }
        C3043d0.l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
