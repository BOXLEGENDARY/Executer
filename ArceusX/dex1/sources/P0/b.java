package p0;

import android.graphics.Color;

final class b {

    static final float[][] f22625a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    static final float[][] f22626b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    static final float[] f22627c = {95.047f, 100.0f, 108.883f};

    static final float[][] f22628d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f7) {
        if (f7 < 1.0f) {
            return -16777216;
        }
        if (f7 > 99.0f) {
            return -1;
        }
        float f8 = (f7 + 16.0f) / 116.0f;
        float f9 = f7 > 8.0f ? f8 * f8 * f8 : f7 / 903.2963f;
        float f10 = f8 * f8 * f8;
        boolean z7 = f10 > 0.008856452f;
        float f11 = z7 ? f10 : ((f8 * 116.0f) - 16.0f) / 903.2963f;
        if (!z7) {
            f10 = ((f8 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f22627c;
        return androidx.core.graphics.a.b(f11 * fArr[0], f9 * fArr[1], f10 * fArr[2]);
    }

    static float b(int i7) {
        return c(g(i7));
    }

    static float c(float f7) {
        float f8 = f7 / 100.0f;
        return f8 <= 0.008856452f ? f8 * 903.2963f : (((float) Math.cbrt(f8)) * 116.0f) - 16.0f;
    }

    static float d(float f7, float f8, float f9) {
        return f7 + ((f8 - f7) * f9);
    }

    static float e(int i7) {
        float f7 = i7 / 255.0f;
        return (f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void f(int i7, float[] fArr) {
        float fE = e(Color.red(i7));
        float fE2 = e(Color.green(i7));
        float fE3 = e(Color.blue(i7));
        float[][] fArr2 = f22628d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fE) + (fArr4[1] * fE2) + (fArr4[2] * fE3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fE * fArr5[0]) + (fE2 * fArr5[1]) + (fE3 * fArr5[2]);
    }

    static float g(int i7) {
        float fE = e(Color.red(i7));
        float fE2 = e(Color.green(i7));
        float fE3 = e(Color.blue(i7));
        float[] fArr = f22628d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    static float h(float f7) {
        return (f7 > 8.0f ? (float) Math.pow((f7 + 16.0d) / 116.0d, 3.0d) : f7 / 903.2963f) * 100.0f;
    }
}
