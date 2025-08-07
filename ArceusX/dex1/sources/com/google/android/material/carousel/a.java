package com.google.android.material.carousel;

import s0.C2870a;

final class a {

    final int f17560a;

    float f17561b;

    int f17562c;

    int f17563d;

    float f17564e;

    float f17565f;

    final int f17566g;

    final float f17567h;

    a(int i7, float f7, float f8, float f9, int i8, float f10, int i9, float f11, int i10, float f12) {
        this.f17560a = i7;
        this.f17561b = C2870a.b(f7, f8, f9);
        this.f17562c = i8;
        this.f17564e = f10;
        this.f17563d = i9;
        this.f17565f = f11;
        this.f17566g = i10;
        d(f12, f8, f9, f11);
        this.f17567h = b(f11);
    }

    private float a(float f7, int i7, float f8, int i8, int i9) {
        if (i7 <= 0) {
            f8 = 0.0f;
        }
        float f9 = i8 / 2.0f;
        return (f7 - ((i7 + f9) * f8)) / (i9 + f9);
    }

    private float b(float f7) {
        if (g()) {
            return Math.abs(f7 - this.f17565f) * this.f17560a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f7, float f8, float f9, float f10, int[] iArr, float f11, int[] iArr2, float f12, int[] iArr3) {
        a aVar = null;
        int i7 = 1;
        for (int i8 : iArr3) {
            int length = iArr2.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr2[i9];
                int length2 = iArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = i11;
                    int i13 = length2;
                    int i14 = i9;
                    int i15 = length;
                    a aVar2 = new a(i7, f8, f9, f10, iArr[i11], f11, i10, f12, i8, f7);
                    if (aVar == null || aVar2.f17567h < aVar.f17567h) {
                        if (aVar2.f17567h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i7++;
                    i11 = i12 + 1;
                    length2 = i13;
                    i9 = i14;
                    length = i15;
                }
                i9++;
            }
        }
        return aVar;
    }

    private void d(float f7, float f8, float f9, float f10) {
        float f11 = f7 - f();
        int i7 = this.f17562c;
        if (i7 > 0 && f11 > 0.0f) {
            float f12 = this.f17561b;
            this.f17561b = f12 + Math.min(f11 / i7, f9 - f12);
        } else if (i7 > 0 && f11 < 0.0f) {
            float f13 = this.f17561b;
            this.f17561b = f13 + Math.max(f11 / i7, f8 - f13);
        }
        int i8 = this.f17562c;
        float f14 = i8 > 0 ? this.f17561b : 0.0f;
        this.f17561b = f14;
        float fA = a(f7, i8, f14, this.f17563d, this.f17566g);
        this.f17565f = fA;
        float f15 = (this.f17561b + fA) / 2.0f;
        this.f17564e = f15;
        int i9 = this.f17563d;
        if (i9 <= 0 || fA == f10) {
            return;
        }
        float f16 = (f10 - fA) * this.f17566g;
        float fMin = Math.min(Math.abs(f16), f15 * 0.1f * i9);
        if (f16 > 0.0f) {
            this.f17564e -= fMin / this.f17563d;
            this.f17565f += fMin / this.f17566g;
        } else {
            this.f17564e += fMin / this.f17563d;
            this.f17565f -= fMin / this.f17566g;
        }
    }

    private float f() {
        return (this.f17565f * this.f17566g) + (this.f17564e * this.f17563d) + (this.f17561b * this.f17562c);
    }

    private boolean g() {
        int i7 = this.f17566g;
        if (i7 <= 0 || this.f17562c <= 0 || this.f17563d <= 0) {
            return i7 <= 0 || this.f17562c <= 0 || this.f17565f > this.f17561b;
        }
        float f7 = this.f17565f;
        float f8 = this.f17564e;
        return f7 > f8 && f8 > this.f17561b;
    }

    int e() {
        return this.f17562c + this.f17563d + this.f17566g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f17560a + ", smallCount=" + this.f17562c + ", smallSize=" + this.f17561b + ", mediumCount=" + this.f17563d + ", mediumSize=" + this.f17564e + ", largeCount=" + this.f17566g + ", largeSize=" + this.f17565f + ", cost=" + this.f17567h + "]";
    }
}
