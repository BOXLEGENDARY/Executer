package O0;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {

    private final float[] f2703a;

    private final float f2704b;

    protected d(float[] fArr) {
        this.f2703a = fArr;
        this.f2704b = 1.0f / (fArr.length - 1);
    }

    @Override
    public float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2703a;
        int iMin = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f8 = this.f2704b;
        float f9 = (f7 - (iMin * f8)) / f8;
        float[] fArr2 = this.f2703a;
        float f10 = fArr2[iMin];
        return f10 + (f9 * (fArr2[iMin + 1] - f10));
    }
}
