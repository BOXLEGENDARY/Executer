package p0;

final class l {

    static final l f22662k = k(b.f22627c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    private final float f22663a;

    private final float f22664b;

    private final float f22665c;

    private final float f22666d;

    private final float f22667e;

    private final float f22668f;

    private final float[] f22669g;

    private final float f22670h;

    private final float f22671i;

    private final float f22672j;

    private l(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f22668f = f7;
        this.f22663a = f8;
        this.f22664b = f9;
        this.f22665c = f10;
        this.f22666d = f11;
        this.f22667e = f12;
        this.f22669g = fArr;
        this.f22670h = f13;
        this.f22671i = f14;
        this.f22672j = f15;
    }

    static l k(float[] fArr, float f7, float f8, float f9, boolean z7) {
        float[][] fArr2 = b.f22625a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float fD = ((double) f18) >= 0.9d ? b.d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float fExp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d7 = fExp;
        if (d7 > 1.0d) {
            fExp = 1.0f;
        } else if (d7 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(f7 * 5.0d)));
        float fH = b.h(f8) / fArr[1];
        double d8 = fH;
        float fSqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new l(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f18, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f22663a;
    }

    float b() {
        return this.f22666d;
    }

    float c() {
        return this.f22670h;
    }

    float d() {
        return this.f22671i;
    }

    float e() {
        return this.f22668f;
    }

    float f() {
        return this.f22664b;
    }

    float g() {
        return this.f22667e;
    }

    float h() {
        return this.f22665c;
    }

    float[] i() {
        return this.f22669g;
    }

    float j() {
        return this.f22672j;
    }
}
