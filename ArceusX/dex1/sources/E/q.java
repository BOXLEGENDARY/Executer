package E;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

public class q {

    public static final RectF f1066a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static float a(float f7, float f8, float f9, float f10) {
        float f11 = (f7 * f9) + (f8 * f10);
        float f12 = (f7 * f10) - (f8 * f9);
        double dSqrt = Math.sqrt((f7 * f7) + (f8 * f8)) * Math.sqrt((f9 * f9) + (f10 * f10));
        return (float) Math.toDegrees(Math.atan2(f12 / dSqrt, f11 / dSqrt));
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f1066a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i7) {
        return e(rectF, rectF2, i7, false);
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i7, boolean z7) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f1066a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i7);
        if (z7) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static Size f(Rect rect, int i7) {
        return q(m(rect), i7);
    }

    public static int g(Matrix matrix) {
        matrix.getValues(new float[9]);
        return w((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i7) {
        if (i7 == 90 || i7 == 270) {
            return true;
        }
        if (i7 == 0 || i7 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i7);
    }

    public static boolean j(Size size, Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean k(Size size, boolean z7, Size size2, boolean z8) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z7) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z8) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static boolean l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String n(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static Size o(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static RectF p(RectF rectF, int i7) {
        x0.g.b(i7 % 90 == 0, "Invalid rotation degrees: " + i7);
        return i(w(i7)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static Size q(Size size, int i7) {
        x0.g.b(i7 % 90 == 0, "Invalid rotation degrees: " + i7);
        return i(w(i7)) ? o(size) : size;
    }

    public static Rect r(Size size) {
        return s(size, 0, 0);
    }

    public static Rect s(Size size, int i7, int i8) {
        return new Rect(i7, i8, size.getWidth() + i7, size.getHeight() + i8);
    }

    public static RectF t(Size size) {
        return u(size, 0, 0);
    }

    public static RectF u(Size size, int i7, int i8) {
        return new RectF(i7, i8, i7 + size.getWidth(), i8 + size.getHeight());
    }

    public static Matrix v(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int w(int i7) {
        return ((i7 % 360) + 360) % 360;
    }
}
