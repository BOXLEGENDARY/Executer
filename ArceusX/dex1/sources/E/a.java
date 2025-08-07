package E;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

public final class a {

    public static final Rational f999a = new Rational(4, 3);

    public static final Rational f1000b = new Rational(3, 4);

    public static final Rational f1001c = new Rational(16, 9);

    public static final Rational f1002d = new Rational(9, 16);

    public static final class C0009a implements Comparator<Rational> {

        private final Rational f1003d;

        private final RectF f1004e;

        private final Rational f1005i;

        public C0009a(Rational rational, Rational rational2) {
            this.f1003d = rational;
            this.f1005i = rational2 == null ? new Rational(4, 3) : rational2;
            this.f1004e = d(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF d(Rational rational) {
            return rational.floatValue() == this.f1005i.floatValue() ? new RectF(0.0f, 0.0f, this.f1005i.getNumerator(), this.f1005i.getDenominator()) : rational.floatValue() > this.f1005i.floatValue() ? new RectF(0.0f, 0.0f, this.f1005i.getNumerator(), (rational.getDenominator() * this.f1005i.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f1005i.getDenominator()) / rational.getDenominator(), this.f1005i.getDenominator());
        }

        private boolean e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFD = d(rational);
            RectF rectFD2 = d(rational2);
            boolean zE = e(rectFD, this.f1004e);
            boolean zE2 = e(rectFD2, this.f1004e);
            if (zE && zE2) {
                return (int) Math.signum(b(rectFD) - b(rectFD2));
            }
            if (zE) {
                return -1;
            }
            if (zE2) {
                return 1;
            }
            return -((int) Math.signum(c(rectFD, this.f1004e) - c(rectFD2, this.f1004e)));
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, L.d.f1939c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (L.d.c(size) >= L.d.c(size2)) {
            return c(size, rational);
        }
        return false;
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i7 = width % 16;
        if (i7 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + (-16)), width, rational) || d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i7 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    private static boolean d(int i7, int i8, Rational rational) {
        x0.g.a(i8 % 16 == 0);
        double numerator = (i7 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i8 + (-16))) && numerator < ((double) (i8 + 16));
    }
}
