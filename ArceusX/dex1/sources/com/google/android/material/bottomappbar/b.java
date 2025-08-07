package com.google.android.material.bottomappbar;

import u4.C2936f;
import u4.m;

public class b extends C2936f implements Cloneable {

    private float f17349d;

    private float f17350e;

    private float f17351i;

    private float f17352v;

    private float f17353w;

    private float f17354y;

    @Override
    public void b(float f7, float f8, float f9, m mVar) {
        float f10;
        float f11;
        float f12 = this.f17351i;
        if (f12 == 0.0f) {
            mVar.m(f7, 0.0f);
            return;
        }
        float f13 = ((this.f17350e * 2.0f) + f12) / 2.0f;
        float f14 = f9 * this.f17349d;
        float f15 = f8 + this.f17353w;
        float f16 = (this.f17352v * f9) + ((1.0f - f9) * f13);
        if (f16 / f13 >= 1.0f) {
            mVar.m(f7, 0.0f);
            return;
        }
        float f17 = this.f17354y;
        float f18 = f17 * f9;
        boolean z7 = f17 == -1.0f || Math.abs((f17 * 2.0f) - f12) < 0.1f;
        if (z7) {
            f10 = f16;
            f11 = 0.0f;
        } else {
            f11 = 1.75f;
            f10 = 0.0f;
        }
        float f19 = f13 + f14;
        float f20 = f10 + f14;
        float fSqrt = (float) Math.sqrt((f19 * f19) - (f20 * f20));
        float f21 = f15 - fSqrt;
        float f22 = f15 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f20));
        float f23 = (90.0f - degrees) + f11;
        mVar.m(f21, 0.0f);
        float f24 = f14 * 2.0f;
        mVar.a(f21 - f14, 0.0f, f21 + f14, f24, 270.0f, degrees);
        if (z7) {
            mVar.a(f15 - f13, (-f13) - f10, f15 + f13, f13 - f10, 180.0f - f23, (f23 * 2.0f) - 180.0f);
        } else {
            float f25 = this.f17350e;
            float f26 = f18 * 2.0f;
            float f27 = f15 - f13;
            mVar.a(f27, -(f18 + f25), f27 + f25 + f26, f25 + f18, 180.0f - f23, ((f23 * 2.0f) - 180.0f) / 2.0f);
            float f28 = f15 + f13;
            float f29 = this.f17350e;
            mVar.m(f28 - ((f29 / 2.0f) + f18), f29 + f18);
            float f30 = this.f17350e;
            mVar.a(f28 - (f26 + f30), -(f18 + f30), f28, f30 + f18, 90.0f, f23 - 90.0f);
        }
        mVar.a(f22 - f14, 0.0f, f22 + f14, f24, 270.0f - degrees, degrees);
        mVar.m(f7, 0.0f);
    }

    float c() {
        return this.f17352v;
    }

    public float d() {
        return this.f17354y;
    }

    float e() {
        return this.f17350e;
    }

    float g() {
        return this.f17349d;
    }

    public float h() {
        return this.f17351i;
    }

    void i(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f17352v = f7;
    }

    public void j(float f7) {
        this.f17354y = f7;
    }

    void k(float f7) {
        this.f17350e = f7;
    }

    void l(float f7) {
        this.f17349d = f7;
    }

    public void n(float f7) {
        this.f17351i = f7;
    }

    void o(float f7) {
        this.f17353w = f7;
    }
}
