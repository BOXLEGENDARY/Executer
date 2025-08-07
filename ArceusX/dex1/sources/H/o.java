package H;

import C.c1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;
import z.G0;

public class o {
    public static Map<G0, Rect> a(Rect rect, boolean z7, Rational rational, int i7, int i8, int i9, Map<G0, c1> map) {
        x0.g.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<G0, c1> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().e().getWidth(), entry.getValue().e().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFG = g(rectF2, L.b.g(i7, rational), i8, z7, i9, i7);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFG);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((G0) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF b(boolean z7, int i7, RectF rectF, RectF rectF2) {
        boolean z8 = false;
        boolean z9 = i7 == 0 && !z7;
        boolean z10 = i7 == 90 && z7;
        if (z9 || z10) {
            return rectF2;
        }
        boolean z11 = i7 == 0 && z7;
        boolean z12 = i7 == 270 && !z7;
        if (z11 || z12) {
            return c(rectF2, rectF.centerX());
        }
        boolean z13 = i7 == 90 && !z7;
        boolean z14 = i7 == 180 && z7;
        if (z13 || z14) {
            return d(rectF2, rectF.centerY());
        }
        boolean z15 = i7 == 180 && !z7;
        if (i7 == 270 && z7) {
            z8 = true;
        }
        if (z15 || z8) {
            return c(d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z7 + " rotation " + i7);
    }

    private static RectF c(RectF rectF, float f7) {
        return new RectF(e(rectF.right, f7), rectF.top, e(rectF.left, f7), rectF.bottom);
    }

    private static RectF d(RectF rectF, float f7) {
        return new RectF(rectF.left, f(rectF.bottom, f7), rectF.right, f(rectF.top, f7));
    }

    private static float e(float f7, float f8) {
        return (f8 + f8) - f7;
    }

    private static float f(float f7, float f8) {
        return (f8 + f8) - f7;
    }

    public static RectF g(RectF rectF, Rational rational, int i7, boolean z7, int i8, int i9) {
        if (i7 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i7 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i7 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i7);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z7, i8), i9, rectF, rectF3);
    }

    private static boolean h(boolean z7, int i7) {
        return z7 ^ (i7 == 1);
    }
}
