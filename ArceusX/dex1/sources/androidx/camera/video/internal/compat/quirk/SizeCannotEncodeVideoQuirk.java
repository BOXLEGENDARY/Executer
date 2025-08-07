package androidx.camera.video.internal.compat.quirk;

import C.N0;
import E.q;
import X.k0;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SizeCannotEncodeVideoQuirk implements N0 {
    private static Set<Size> g() {
        return h() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.emptySet();
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return h();
    }

    public Rect f(Rect rect, int i7, k0 k0Var) {
        Size sizeQ = q.q(q.m(rect), i7);
        if (!i(sizeQ)) {
            return rect;
        }
        int iG = k0Var != null ? k0Var.g() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeQ.getHeight()) {
            rect2.left += iG;
            rect2.right -= iG;
        } else {
            rect2.top += iG;
            rect2.bottom -= iG;
        }
        return rect2;
    }

    public boolean i(Size size) {
        return g().contains(size);
    }
}
