package s;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t.C2894g;
import z.C3039b0;
import z.C3061p;
import z.InterfaceC3060o;

class P0 {
    private static String a(t.O o2, Integer num, List<String> list) throws C2894g {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) o2.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) o2.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    static List<String> b(C2858w c2858w, C3061p c3061p) throws C3039b0 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(c2858w.c().d());
            if (c3061p == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                strA = a(c2858w.c(), c3061p.d(), listAsList);
            } catch (IllegalStateException unused) {
                strA = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : listAsList) {
                if (!str.equals(strA)) {
                    arrayList2.add(c2858w.f(str));
                }
            }
            Iterator<InterfaceC3060o> it2 = c3061p.b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C.I) it2.next()).d());
            }
            return arrayList;
        } catch (C2894g e7) {
            throw new C3039b0(R0.a(e7));
        } catch (z.r e8) {
            throw new C3039b0(e8);
        }
    }
}
