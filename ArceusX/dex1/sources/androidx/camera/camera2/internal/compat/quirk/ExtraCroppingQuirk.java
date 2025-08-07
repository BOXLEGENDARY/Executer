package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import C.e1;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExtraCroppingQuirk implements N0 {

    private static final Map<String, Range<Integer>> f9380a;

    static class a {

        static final int[] f9381a;

        static {
            int[] iArr = new int[e1.b.values().length];
            f9381a = iArr;
            try {
                iArr[e1.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9381a[e1.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9381a[e1.b.f574i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f9380a = map;
        map.put("SM-T580", null);
        map.put(JmBUOGMwkkxg.gPkQgzdhIN, new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    private static boolean g() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f9380a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range<Integer> range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean h() {
        return g();
    }

    public Size f(e1.b bVar) {
        if (!g()) {
            return null;
        }
        int i7 = a.f9381a[bVar.ordinal()];
        if (i7 == 1) {
            return new Size(1920, 1080);
        }
        if (i7 == 2) {
            return new Size(1280, 720);
        }
        if (i7 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
