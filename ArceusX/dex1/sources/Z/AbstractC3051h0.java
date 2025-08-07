package z;

import android.graphics.PointF;
import android.util.Rational;

public abstract class AbstractC3051h0 {

    private Rational f24651a;

    public AbstractC3051h0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    protected abstract PointF a(float f7, float f8);

    public final C3049g0 b(float f7, float f8) {
        return c(f7, f8, d());
    }

    public final C3049g0 c(float f7, float f8, float f9) {
        PointF pointFA = a(f7, f8);
        return new C3049g0(pointFA.x, pointFA.y, f9, this.f24651a);
    }

    protected void e(Rational rational) {
        this.f24651a = rational;
    }

    public AbstractC3051h0(Rational rational) {
        this.f24651a = rational;
    }
}
