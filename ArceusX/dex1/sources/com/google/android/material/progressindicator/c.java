package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.h;
import k4.C2517a;
import o4.C2681a;

final class c extends h<e> {

    private float f18226b;

    private float f18227c;

    private float f18228d;

    private boolean f18229e;

    private float f18230f;

    c(e eVar) {
        super(eVar);
    }

    private void h(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9) {
        float f9 = f8 >= f7 ? f8 - f7 : (f8 + 1.0f) - f7;
        float f10 = f7 % 1.0f;
        if (this.f18230f < 1.0f) {
            float f11 = f10 + f9;
            if (f11 > 1.0f) {
                h(canvas, paint, f10, 1.0f, i7, i8, 0);
                h(canvas, paint, 1.0f, f11, i7, 0, i9);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f18227c / this.f18228d);
        if (f10 == 0.0f && f9 >= 0.99f) {
            f9 += ((f9 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fC = C2681a.c(1.0f - this.f18230f, 1.0f, f10);
        float fC2 = C2681a.c(0.0f, this.f18230f, f9);
        float degrees2 = (float) Math.toDegrees(i8 / this.f18228d);
        float degrees3 = ((fC2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i9 / this.f18228d));
        float f12 = (fC * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i7);
        paint.setStrokeWidth(this.f18226b);
        float f13 = degrees * 2.0f;
        if (degrees3 < f13) {
            float f14 = degrees3 / f13;
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, f12 + (degrees * f14), this.f18227c * 2.0f, this.f18226b, f14);
            return;
        }
        float f15 = this.f18228d;
        RectF rectF = new RectF(-f15, -f15, f15, f15);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f18229e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f16 = f12 + degrees;
        canvas.drawArc(rectF, f16, degrees3 - f13, false, paint);
        if (this.f18229e || this.f18227c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f16, this.f18227c * 2.0f, this.f18226b);
        i(canvas, paint, (f12 + degrees3) - degrees, this.f18227c * 2.0f, this.f18226b);
    }

    private void i(Canvas canvas, Paint paint, float f7, float f8, float f9) {
        j(canvas, paint, f7, f8, f9, 1.0f);
    }

    private void j(Canvas canvas, Paint paint, float f7, float f8, float f9, float f10) {
        float fMin = (int) Math.min(f9, this.f18226b);
        float f11 = f8 / 2.0f;
        float fMin2 = Math.min(f11, (this.f18227c * fMin) / this.f18226b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f8) / 2.0f, fMin / 2.0f, f11);
        canvas.save();
        double d7 = f7;
        canvas.translate((float) (this.f18228d * Math.cos(Math.toRadians(d7))), (float) (this.f18228d * Math.sin(Math.toRadians(d7))));
        canvas.rotate(f7);
        canvas.scale(f10, f10);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int k() {
        S s7 = this.f18272a;
        return ((e) s7).f18246h + (((e) s7).f18247i * 2);
    }

    @Override
    void a(Canvas canvas, Rect rect, float f7, boolean z7, boolean z8) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        S s7 = this.f18272a;
        float f8 = (((e) s7).f18246h / 2.0f) + ((e) s7).f18247i;
        canvas.translate((f8 * fWidth) + rect.left, (f8 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((e) this.f18272a).f18248j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f9 = -f8;
        canvas.clipRect(f9, f9, f8, f8);
        S s8 = this.f18272a;
        this.f18229e = ((e) s8).f18219a / 2 <= ((e) s8).f18220b;
        this.f18226b = ((e) s8).f18219a * f7;
        this.f18227c = Math.min(((e) s8).f18219a / 2, ((e) s8).f18220b) * f7;
        S s9 = this.f18272a;
        float f10 = (((e) s9).f18246h - ((e) s9).f18219a) / 2.0f;
        this.f18228d = f10;
        if (z7 || z8) {
            if ((z7 && ((e) s9).f18223e == 2) || (z8 && ((e) s9).f18224f == 1)) {
                this.f18228d = f10 + (((1.0f - f7) * ((e) s9).f18219a) / 2.0f);
            } else if ((z7 && ((e) s9).f18223e == 1) || (z8 && ((e) s9).f18224f == 2)) {
                this.f18228d = f10 - (((1.0f - f7) * ((e) s9).f18219a) / 2.0f);
            }
        }
        if (z8 && ((e) s9).f18224f == 3) {
            this.f18230f = f7;
        } else {
            this.f18230f = 1.0f;
        }
    }

    @Override
    void b(Canvas canvas, Paint paint, int i7, int i8) {
    }

    @Override
    void c(Canvas canvas, Paint paint, h.a aVar, int i7) {
        int iA = C2517a.a(aVar.f18275c, i7);
        float f7 = aVar.f18273a;
        float f8 = aVar.f18274b;
        int i8 = aVar.f18276d;
        h(canvas, paint, f7, f8, iA, i8, i8);
    }

    @Override
    void d(Canvas canvas, Paint paint, float f7, float f8, int i7, int i8, int i9) {
        h(canvas, paint, f7, f8, C2517a.a(i7, i8), i9, i9);
    }

    @Override
    int e() {
        return k();
    }

    @Override
    int f() {
        return k();
    }
}
