package p0;

public class C2717a {

    private final float f22616a;

    private final float f22617b;

    private final float f22618c;

    private final float f22619d;

    private final float f22620e;

    private final float f22621f;

    private final float f22622g;

    private final float f22623h;

    private final float f22624i;

    C2717a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22616a = f7;
        this.f22617b = f8;
        this.f22618c = f9;
        this.f22619d = f10;
        this.f22620e = f11;
        this.f22621f = f12;
        this.f22622g = f13;
        this.f22623h = f14;
        this.f22624i = f15;
    }

    private static C2717a b(float f7, float f8, float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        C2717a c2717a = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int iP = e(f14, f8, f7).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f9 - fB);
            if (fAbs < 0.2f) {
                C2717a c2717aC = c(iP);
                float fA = c2717aC.a(e(c2717aC.k(), c2717aC.i(), f7));
                if (fA <= 1.0f) {
                    c2717a = c2717aC;
                    f11 = fAbs;
                    f13 = fA;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                break;
            }
            if (fB < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return c2717a;
    }

    static C2717a c(int i7) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i7, l.f22662k, fArr, fArr2);
        return new C2717a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i7, l lVar, float[] fArr, float[] fArr2) {
        b.f(i7, fArr2);
        float[][] fArr3 = b.f22625a;
        float f7 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f8 = fArr4[0] * f7;
        float f9 = fArr2[1];
        float f10 = f8 + (fArr4[1] * f9);
        float f11 = fArr2[2];
        float f12 = f10 + (fArr4[2] * f11);
        float[] fArr5 = fArr3[1];
        float f13 = (fArr5[0] * f7) + (fArr5[1] * f9) + (fArr5[2] * f11);
        float[] fArr6 = fArr3[2];
        float f14 = (f7 * fArr6[0]) + (f9 * fArr6[1]) + (f11 * fArr6[2]);
        float f15 = lVar.i()[0] * f12;
        float f16 = lVar.i()[1] * f13;
        float f17 = lVar.i()[2] * f14;
        float fPow = (float) Math.pow((lVar.c() * Math.abs(f15)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((lVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((lVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d7 = fSignum3;
        float f18 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d7)) / 11.0f;
        float f19 = ((float) ((fSignum + fSignum2) - (d7 * 2.0d))) / 9.0f;
        float f20 = fSignum2 * 20.0f;
        float f21 = (((fSignum * 20.0f) + f20) + (21.0f * fSignum3)) / 20.0f;
        float f22 = (((fSignum * 40.0f) + f20) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f23 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f22 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d));
        float fD = lVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d8 = f23;
        float fCos = ((float) Math.cos(d8)) * fLog;
        float fSin = fLog * ((float) Math.sin(d8));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f24;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static C2717a e(float f7, float f8, float f9) {
        return f(f7, f8, f9, l.f22662k);
    }

    private static C2717a f(float f7, float f8, float f9, l lVar) {
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(f7 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f8 * lVar.d();
        float fSqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float fLog = ((float) Math.log((fD * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f9) / 180.0f;
        return new C2717a(f9, f8, f7, fB, fD, fSqrt, f10, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static int m(float f7, float f8, float f9) {
        return n(f7, f8, f9, l.f22662k);
    }

    static int n(float f7, float f8, float f9, l lVar) {
        if (f8 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
            return b.a(f9);
        }
        float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        C2717a c2717a = null;
        boolean z7 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            C2717a c2717aB = b(fMin, f11, f9);
            if (!z7) {
                if (c2717aB == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    c2717a = c2717aB;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (c2717aB != null) {
                    return c2717aB.o(lVar);
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
                z7 = false;
            }
        }
        return c2717a == null ? b.a(f9) : c2717a.o(lVar);
    }

    float a(C2717a c2717a) {
        float fL = l() - c2717a.l();
        float fG = g() - c2717a.g();
        float fH = h() - c2717a.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f22623h;
    }

    float h() {
        return this.f22624i;
    }

    float i() {
        return this.f22617b;
    }

    float j() {
        return this.f22616a;
    }

    float k() {
        return this.f22618c;
    }

    float l() {
        return this.f22622g;
    }

    int o(l lVar) {
        float fPow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f7 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f9 = fCos2 * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float fSignum = Math.signum(f12) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float fSignum2 = Math.signum(f13) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f14 = fSignum / lVar.i()[0];
        float f15 = fSignum2 / lVar.i()[1];
        float f16 = fSignum3 / lVar.i()[2];
        float[][] fArr = b.f22626b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    int p() {
        return o(l.f22662k);
    }
}
