package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.Z;
import g.C2456j;
import h.C2473a;
import q0.C2731a;

class e {

    private final CompoundButton f9280a;

    private ColorStateList f9281b = null;

    private PorterDuff.Mode f9282c = null;

    private boolean f9283d = false;

    private boolean f9284e = false;

    private boolean f9285f;

    e(CompoundButton compoundButton) {
        this.f9280a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.d.a(this.f9280a);
        if (drawableA != null) {
            if (this.f9283d || this.f9284e) {
                Drawable drawableMutate = C2731a.r(drawableA).mutate();
                if (this.f9283d) {
                    C2731a.o(drawableMutate, this.f9281b);
                }
                if (this.f9284e) {
                    C2731a.p(drawableMutate, this.f9282c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f9280a.getDrawableState());
                }
                this.f9280a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i7) {
        return i7;
    }

    ColorStateList c() {
        return this.f9281b;
    }

    PorterDuff.Mode d() {
        return this.f9282c;
    }

    void e(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        Context context = this.f9280a.getContext();
        int[] iArr = C2456j.f20787W0;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        CompoundButton compoundButton = this.f9280a;
        Z.l0(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        try {
            int i8 = C2456j.f20791Y0;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i8) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i8, 0)) == 0) {
                int i9 = C2456j.f20789X0;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i9) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i9, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f9280a;
                    compoundButton2.setButtonDrawable(C2473a.b(compoundButton2.getContext(), resourceId));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f9280a;
                    compoundButton3.setButtonDrawable(C2473a.b(compoundButton3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i10 = C2456j.f20793Z0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
                androidx.core.widget.d.d(this.f9280a, tintTypedArrayObtainStyledAttributes.getColorStateList(i10));
            }
            int i11 = C2456j.f20796a1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                androidx.core.widget.d.e(this.f9280a, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i11, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    void f() {
        if (this.f9285f) {
            this.f9285f = false;
        } else {
            this.f9285f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f9281b = colorStateList;
        this.f9283d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f9282c = mode;
        this.f9284e = true;
        a();
    }
}
