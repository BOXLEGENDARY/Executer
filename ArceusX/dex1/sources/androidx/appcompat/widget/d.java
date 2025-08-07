package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.Z;
import g.C2456j;
import h.C2473a;
import q0.C2731a;

class d {

    private final CheckedTextView f9274a;

    private ColorStateList f9275b = null;

    private PorterDuff.Mode f9276c = null;

    private boolean f9277d = false;

    private boolean f9278e = false;

    private boolean f9279f;

    d(CheckedTextView checkedTextView) {
        this.f9274a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f9274a);
        if (drawableA != null) {
            if (this.f9277d || this.f9278e) {
                Drawable drawableMutate = C2731a.r(drawableA).mutate();
                if (this.f9277d) {
                    C2731a.o(drawableMutate, this.f9275b);
                }
                if (this.f9278e) {
                    C2731a.p(drawableMutate, this.f9276c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f9274a.getDrawableState());
                }
                this.f9274a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f9275b;
    }

    PorterDuff.Mode c() {
        return this.f9276c;
    }

    void d(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        Context context = this.f9274a.getContext();
        int[] iArr = C2456j.f20777R0;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        CheckedTextView checkedTextView = this.f9274a;
        Z.l0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        try {
            int i8 = C2456j.T0;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i8) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i8, 0)) == 0) {
                int i9 = C2456j.f20780S0;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i9) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i9, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f9274a;
                    checkedTextView2.setCheckMarkDrawable(C2473a.b(checkedTextView2.getContext(), resourceId));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f9274a;
                    checkedTextView3.setCheckMarkDrawable(C2473a.b(checkedTextView3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i10 = C2456j.U0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
                androidx.core.widget.c.b(this.f9274a, tintTypedArrayObtainStyledAttributes.getColorStateList(i10));
            }
            int i11 = C2456j.V0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                androidx.core.widget.c.c(this.f9274a, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i11, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    void e() {
        if (this.f9279f) {
            this.f9279f = false;
        } else {
            this.f9279f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f9275b = colorStateList;
        this.f9277d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f9276c = mode;
        this.f9278e = true;
        a();
    }
}
