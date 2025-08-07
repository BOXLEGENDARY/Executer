package b2;

import R1.k;
import W1.m;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public class g {
    private static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    static int g(float f, float f2) {
        return h((int) f, (int) f2);
    }

    private static int h(int i, int i2) {
        return i - (i2 * f(i, i2));
    }

    public static void i(m mVar, Path path) {
        path.reset();
        PointF pointFB = mVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        a.set(pointFB.x, pointFB.y);
        for (int i = 0; i < mVar.a().size(); i++) {
            U1.a aVar = mVar.a().get(i);
            PointF pointFA = aVar.a();
            PointF pointFB2 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointF = a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
            } else {
                path.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
        }
        if (mVar.d()) {
            path.close();
        }
    }

    public static double j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int l(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void m(U1.e eVar, int i, List<U1.e> list, U1.e eVar2, k kVar) {
        if (eVar.c(kVar.getName(), i)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
