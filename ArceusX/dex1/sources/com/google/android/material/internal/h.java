package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import c4.C1755k;
import com.appsflyer.R;

public class h extends LinearLayoutCompat {

    private Drawable f18137d;

    private final Rect f18138e;

    private final Rect f18139i;

    private int f18140v;

    protected boolean f18141w;

    boolean f18142y;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f18137d;
        if (drawable != null) {
            if (this.f18142y) {
                this.f18142y = false;
                Rect rect = this.f18138e;
                Rect rect2 = this.f18139i;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f18141w) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f18140v, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f18137d;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f18137d;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f18137d.setState(getDrawableState());
    }

    @Override
    public Drawable getForeground() {
        return this.f18137d;
    }

    @Override
    public int getForegroundGravity() {
        return this.f18140v;
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18137d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        this.f18142y = z7 | this.f18142y;
    }

    @Override
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f18142y = true;
    }

    @Override
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f18137d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f18137d);
            }
            this.f18137d = drawable;
            this.f18142y = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f18140v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public void setForegroundGravity(int i7) {
        if (this.f18140v != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i7 |= 48;
            }
            this.f18140v = i7;
            if (i7 == 119 && this.f18137d != null) {
                this.f18137d.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18137d;
    }

    public h(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18138e = new Rect();
        this.f18139i = new Rect();
        this.f18140v = R.styleable.AppCompatTheme_windowActionModeOverlay;
        this.f18141w = true;
        this.f18142y = false;
        TypedArray typedArrayI = p.i(context, attributeSet, C1755k.b2, i7, 0, new int[0]);
        this.f18140v = typedArrayI.getInt(C1755k.f13148d2, this.f18140v);
        Drawable drawable = typedArrayI.getDrawable(C1755k.c2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f18141w = typedArrayI.getBoolean(C1755k.f13156e2, true);
        typedArrayI.recycle();
    }
}
