package z;

import android.util.Rational;

public final class I0 {

    private int f24552a;

    private Rational f24553b;

    private int f24554c;

    private int f24555d;

    public static final class a {

        private final Rational f24557b;

        private final int f24558c;

        private int f24556a = 1;

        private int f24559d = 0;

        public a(Rational rational, int i7) {
            this.f24557b = rational;
            this.f24558c = i7;
        }

        public I0 a() {
            x0.g.h(this.f24557b, "The crop aspect ratio must be set.");
            return new I0(this.f24556a, this.f24557b, this.f24558c, this.f24559d);
        }

        public a b(int i7) {
            this.f24559d = i7;
            return this;
        }

        public a c(int i7) {
            this.f24556a = i7;
            return this;
        }
    }

    I0(int i7, Rational rational, int i8, int i9) {
        this.f24552a = i7;
        this.f24553b = rational;
        this.f24554c = i8;
        this.f24555d = i9;
    }

    public Rational a() {
        return this.f24553b;
    }

    public int b() {
        return this.f24555d;
    }

    public int c() {
        return this.f24554c;
    }

    public int d() {
        return this.f24552a;
    }
}
