package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.Z;
import g.C2456j;
import q0.C2731a;

class l extends j {

    private final SeekBar f9295d;

    private Drawable f9296e;

    private ColorStateList f9297f;

    private PorterDuff.Mode f9298g;

    private boolean f9299h;

    private boolean f9300i;

    l(SeekBar seekBar) {
        super(seekBar);
        this.f9297f = null;
        this.f9298g = null;
        this.f9299h = false;
        this.f9300i = false;
        this.f9295d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f9296e;
        if (drawable != null) {
            if (this.f9299h || this.f9300i) {
                Drawable drawableR = C2731a.r(drawable.mutate());
                this.f9296e = drawableR;
                if (this.f9299h) {
                    C2731a.o(drawableR, this.f9297f);
                }
                if (this.f9300i) {
                    C2731a.p(this.f9296e, this.f9298g);
                }
                if (this.f9296e.isStateful()) {
                    this.f9296e.setState(this.f9295d.getDrawableState());
                }
            }
        }
    }

    @Override
    void c(AttributeSet attributeSet, int i7) {
        super.c(attributeSet, i7);
        Context context = this.f9295d.getContext();
        int[] iArr = C2456j.f20785V;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        SeekBar seekBar = this.f9295d;
        Z.l0(seekBar, seekBar.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(C2456j.f20786W);
        if (drawableIfKnown != null) {
            this.f9295d.setThumb(drawableIfKnown);
        }
        j(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20788X));
        int i8 = C2456j.f20792Z;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f9298g = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i8, -1), this.f9298g);
            this.f9300i = true;
        }
        int i9 = C2456j.f20790Y;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f9297f = tintTypedArrayObtainStyledAttributes.getColorStateList(i9);
            this.f9299h = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        f();
    }

    void g(Canvas canvas) {
        if (this.f9296e != null) {
            int max = this.f9295d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9296e.getIntrinsicWidth();
                int intrinsicHeight = this.f9296e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9296e.setBounds(-i7, -i8, i7, i8);
                float width = ((this.f9295d.getWidth() - this.f9295d.getPaddingLeft()) - this.f9295d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f9295d.getPaddingLeft(), this.f9295d.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f9296e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f9296e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f9295d.getDrawableState())) {
            this.f9295d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f9296e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f9296e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9296e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f9295d);
            C2731a.m(drawable, Z.z(this.f9295d));
            if (drawable.isStateful()) {
                drawable.setState(this.f9295d.getDrawableState());
            }
            f();
        }
        this.f9295d.invalidate();
    }
}
