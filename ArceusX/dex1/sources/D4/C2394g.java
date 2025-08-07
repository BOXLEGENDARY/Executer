package d4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class C2394g implements TypeEvaluator<Matrix> {

    private final float[] f20322a = new float[9];

    private final float[] f20323b = new float[9];

    private final Matrix f20324c = new Matrix();

    public Matrix a(float f7, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f20322a);
        matrix2.getValues(this.f20323b);
        for (int i7 = 0; i7 < 9; i7++) {
            float[] fArr = this.f20323b;
            float f8 = fArr[i7];
            float f9 = this.f20322a[i7];
            fArr[i7] = f9 + ((f8 - f9) * f7);
        }
        this.f20324c.setValues(this.f20323b);
        return this.f20324c;
    }
}
