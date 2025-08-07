package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class e extends Drawable {

    private final Drawable f18129a;

    private final Drawable f18130b;

    private final float[] f18131c;

    private float f18132d;

    public void a(float f7) {
        if (this.f18132d != f7) {
            this.f18132d = f7;
            f.a(f7, this.f18131c);
            this.f18129a.setAlpha((int) (this.f18131c[0] * 255.0f));
            this.f18130b.setAlpha((int) (this.f18131c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.f18129a.draw(canvas);
        this.f18130b.draw(canvas);
    }

    @Override
    public int getIntrinsicHeight() {
        return Math.max(this.f18129a.getIntrinsicHeight(), this.f18130b.getIntrinsicHeight());
    }

    @Override
    public int getIntrinsicWidth() {
        return Math.max(this.f18129a.getIntrinsicWidth(), this.f18130b.getIntrinsicWidth());
    }

    @Override
    public int getMinimumHeight() {
        return Math.max(this.f18129a.getMinimumHeight(), this.f18130b.getMinimumHeight());
    }

    @Override
    public int getMinimumWidth() {
        return Math.max(this.f18129a.getMinimumWidth(), this.f18130b.getMinimumWidth());
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public boolean isStateful() {
        return this.f18129a.isStateful() || this.f18130b.isStateful();
    }

    @Override
    public void setAlpha(int i7) {
        if (this.f18132d <= 0.5f) {
            this.f18129a.setAlpha(i7);
            this.f18130b.setAlpha(0);
        } else {
            this.f18129a.setAlpha(0);
            this.f18130b.setAlpha(i7);
        }
        invalidateSelf();
    }

    @Override
    public void setBounds(int i7, int i8, int i9, int i10) {
        super.setBounds(i7, i8, i9, i10);
        this.f18129a.setBounds(i7, i8, i9, i10);
        this.f18130b.setBounds(i7, i8, i9, i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18129a.setColorFilter(colorFilter);
        this.f18130b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public boolean setState(int[] iArr) {
        return this.f18129a.setState(iArr) || this.f18130b.setState(iArr);
    }
}
