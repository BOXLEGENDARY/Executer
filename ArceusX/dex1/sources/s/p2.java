package s;

import s0.C2870a;

class p2 implements z.J0 {

    private float f23434a;

    private final float f23435b;

    private final float f23436c;

    private float f23437d;

    p2(float f7, float f8) {
        this.f23435b = f7;
        this.f23436c = f8;
    }

    private float e(float f7) {
        float f8 = this.f23435b;
        float f9 = this.f23436c;
        if (f8 == f9) {
            return 0.0f;
        }
        if (f7 == f8) {
            return 1.0f;
        }
        if (f7 == f9) {
            return 0.0f;
        }
        float f10 = 1.0f / f9;
        return ((1.0f / f7) - f10) / ((1.0f / f8) - f10);
    }

    private float f(float f7) {
        if (f7 == 1.0f) {
            return this.f23435b;
        }
        if (f7 == 0.0f) {
            return this.f23436c;
        }
        float f8 = this.f23435b;
        float f9 = this.f23436c;
        double d7 = 1.0f / f9;
        return (float) C2870a.a(1.0d / (d7 + (((1.0f / f8) - d7) * f7)), f9, f8);
    }

    @Override
    public float a() {
        return this.f23435b;
    }

    @Override
    public float b() {
        return this.f23436c;
    }

    @Override
    public float c() {
        return this.f23434a;
    }

    @Override
    public float d() {
        return this.f23437d;
    }

    void g(float f7) throws IllegalArgumentException {
        if (f7 <= 1.0f && f7 >= 0.0f) {
            this.f23437d = f7;
            this.f23434a = f(f7);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f7 + " is not within valid range [0..1]");
        }
    }

    void h(float f7) throws IllegalArgumentException {
        if (f7 <= this.f23435b && f7 >= this.f23436c) {
            this.f23434a = f7;
            this.f23437d = e(f7);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f7 + " is not within valid range [" + this.f23436c + " , " + this.f23435b + "]");
    }
}
