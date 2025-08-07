package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.d;
import u4.k;
import u4.l;

class a extends Drawable {

    private final Paint f17924b;

    float f17930h;

    private int f17931i;

    private int f17932j;

    private int f17933k;

    private int f17934l;

    private int f17935m;

    private k f17937o;

    private ColorStateList f17938p;

    private final l f17923a = l.k();

    private final Path f17925c = new Path();

    private final Rect f17926d = new Rect();

    private final RectF f17927e = new RectF();

    private final RectF f17928f = new RectF();

    private final b f17929g = new b();

    private boolean f17936n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override
        public int getChangingConfigurations() {
            return 0;
        }

        @Override
        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f17937o = kVar;
        Paint paint = new Paint(1);
        this.f17924b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f17926d);
        float fHeight = this.f17930h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{androidx.core.graphics.a.h(this.f17931i, this.f17935m), androidx.core.graphics.a.h(this.f17932j, this.f17935m), androidx.core.graphics.a.h(androidx.core.graphics.a.l(this.f17932j, 0), this.f17935m), androidx.core.graphics.a.h(androidx.core.graphics.a.l(this.f17934l, 0), this.f17935m), androidx.core.graphics.a.h(this.f17934l, this.f17935m), androidx.core.graphics.a.h(this.f17933k, this.f17935m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f17928f.set(getBounds());
        return this.f17928f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f17935m = colorStateList.getColorForState(getState(), this.f17935m);
        }
        this.f17938p = colorStateList;
        this.f17936n = true;
        invalidateSelf();
    }

    public void d(float f7) {
        if (this.f17930h != f7) {
            this.f17930h = f7;
            this.f17924b.setStrokeWidth(f7 * 1.3333f);
            this.f17936n = true;
            invalidateSelf();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.f17936n) {
            this.f17924b.setShader(a());
            this.f17936n = false;
        }
        float strokeWidth = this.f17924b.getStrokeWidth() / 2.0f;
        copyBounds(this.f17926d);
        this.f17927e.set(this.f17926d);
        float fMin = Math.min(this.f17937o.r().a(b()), this.f17927e.width() / 2.0f);
        if (this.f17937o.u(b())) {
            this.f17927e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f17927e, fMin, fMin, this.f17924b);
        }
    }

    void e(int i7, int i8, int i9, int i10) {
        this.f17931i = i7;
        this.f17932j = i8;
        this.f17933k = i9;
        this.f17934l = i10;
    }

    public void f(k kVar) {
        this.f17937o = kVar;
        invalidateSelf();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f17929g;
    }

    @Override
    public int getOpacity() {
        return this.f17930h > 0.0f ? -3 : -2;
    }

    @Override
    public void getOutline(Outline outline) {
        if (this.f17937o.u(b())) {
            outline.setRoundRect(getBounds(), this.f17937o.r().a(b()));
        } else {
            copyBounds(this.f17926d);
            this.f17927e.set(this.f17926d);
            this.f17923a.d(this.f17937o, 1.0f, this.f17927e, this.f17925c);
            d.k(outline, this.f17925c);
        }
    }

    @Override
    public boolean getPadding(Rect rect) {
        if (!this.f17937o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f17930h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override
    public boolean isStateful() {
        ColorStateList colorStateList = this.f17938p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        this.f17936n = true;
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f17938p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f17935m)) != this.f17935m) {
            this.f17936n = true;
            this.f17935m = colorForState;
        }
        if (this.f17936n) {
            invalidateSelf();
        }
        return this.f17936n;
    }

    @Override
    public void setAlpha(int i7) {
        this.f17924b.setAlpha(i7);
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17924b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
