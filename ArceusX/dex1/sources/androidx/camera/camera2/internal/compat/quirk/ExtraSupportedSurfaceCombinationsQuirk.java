package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import C.d1;
import C.e1;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ExtraSupportedSurfaceCombinationsQuirk implements N0 {

    private static final d1 f9382a = f();

    private static final d1 f9383b = g();

    private static final Set<String> f9384c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    private static final Set<String> f9385d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    private static d1 f() {
        d1 d1Var = new d1();
        e1.b bVar = e1.b.YUV;
        d1Var.a(e1.a(bVar, e1.a.VGA));
        d1Var.a(e1.a(e1.b.PRIV, e1.a.PREVIEW));
        d1Var.a(e1.a(bVar, e1.a.MAXIMUM));
        return d1Var;
    }

    private static d1 g() {
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        d1Var.a(e1.a(bVar, e1.a.PREVIEW));
        d1Var.a(e1.a(bVar, e1.a.VGA));
        d1Var.a(e1.a(e1.b.YUV, e1.a.MAXIMUM));
        return d1Var;
    }

    private List<d1> i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f9382a);
        }
        return arrayList;
    }

    private static boolean j() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean k() {
        return j() || l() || m();
    }

    private static boolean l() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f9384c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean m() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = f9385d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public List<d1> h(String str) {
        return j() ? i(str) : (l() || m()) ? Collections.singletonList(f9383b) : Collections.emptyList();
    }
}
