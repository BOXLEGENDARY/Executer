package E;

import android.opengl.Matrix;

public final class m {

    private static final float[] f1065a = new float[16];

    private static void a(float[] fArr, float f7, float f8) {
        Matrix.translateM(fArr, 0, -f7, -f8, 0.0f);
    }

    private static void b(float[] fArr, float f7, float f8) {
        Matrix.translateM(fArr, 0, f7, f8, 0.0f);
    }

    public static void c(float[] fArr, float f7, float f8, float f9) {
        b(fArr, f8, f9);
        Matrix.rotateM(fArr, 0, f7, 0.0f, 0.0f, 1.0f);
        a(fArr, f8, f9);
    }

    public static void d(float[] fArr, float f7) {
        b(fArr, 0.0f, f7);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, 0.0f, f7);
    }
}
