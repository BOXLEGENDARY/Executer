package androidx.core.graphics;

import android.graphics.Color;

public final class a {

    private static final ThreadLocal<double[]> f10562a = new ThreadLocal<>();

    public static void a(int i7, int i8, int i9, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d7 = i7 / 255.0d;
        double dPow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = i8 / 255.0d;
        double dPow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = i9 / 255.0d;
        double dPow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d7, double d8, double d9) {
        double d10 = (((3.2406d * d7) + ((-1.5372d) * d8)) + ((-0.4986d) * d9)) / 100.0d;
        double d11 = ((((-0.9689d) * d7) + (1.8758d * d8)) + (0.0415d * d9)) / 100.0d;
        double d12 = (((0.0557d * d7) + ((-0.204d) * d8)) + (1.057d * d9)) / 100.0d;
        return Color.rgb(j((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), j((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), j((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255));
    }

    public static int c(int i7, int i8, float f7) {
        float f8 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), (int) ((Color.red(i7) * f8) + (Color.red(i8) * f7)), (int) ((Color.green(i7) * f8) + (Color.green(i8) * f7)), (int) ((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    public static double d(int i7, int i8) {
        if (Color.alpha(i8) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i8));
        }
        if (Color.alpha(i7) < 255) {
            i7 = h(i7, i8);
        }
        double dE = e(i7) + 0.05d;
        double dE2 = e(i8) + 0.05d;
        return Math.max(dE, dE2) / Math.min(dE, dE2);
    }

    public static double e(int i7) {
        double[] dArrK = k();
        f(i7, dArrK);
        return dArrK[1] / 100.0d;
    }

    public static void f(int i7, double[] dArr) {
        a(Color.red(i7), Color.green(i7), Color.blue(i7), dArr);
    }

    private static int g(int i7, int i8) {
        return 255 - (((255 - i8) * (255 - i7)) / 255);
    }

    public static int h(int i7, int i8) {
        int iAlpha = Color.alpha(i8);
        int iAlpha2 = Color.alpha(i7);
        int iG = g(iAlpha2, iAlpha);
        return Color.argb(iG, i(Color.red(i7), iAlpha2, Color.red(i8), iAlpha, iG), i(Color.green(i7), iAlpha2, Color.green(i8), iAlpha, iG), i(Color.blue(i7), iAlpha2, Color.blue(i8), iAlpha, iG));
    }

    private static int i(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((i7 * 255) * i8) + ((i9 * i10) * (255 - i8))) / (i11 * 255);
    }

    private static int j(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : Math.min(i7, i9);
    }

    private static double[] k() {
        ThreadLocal<double[]> threadLocal = f10562a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int l(int i7, int i8) {
        if (i8 < 0 || i8 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & 16777215) | (i8 << 24);
    }
}
