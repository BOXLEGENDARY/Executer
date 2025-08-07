package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.Z;
import g.C2456j;

class C1598c {

    private final View f9268a;

    private TintInfo f9271d;

    private TintInfo f9272e;

    private TintInfo f9273f;

    private int f9270c = -1;

    private final AppCompatDrawableManager f9269b = AppCompatDrawableManager.get();

    C1598c(View view) {
        this.f9268a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f9273f == null) {
            this.f9273f = new TintInfo();
        }
        TintInfo tintInfo = this.f9273f;
        tintInfo.clear();
        ColorStateList colorStateListR = Z.r(this.f9268a);
        if (colorStateListR != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = colorStateListR;
        }
        PorterDuff.Mode modeS = Z.s(this.f9268a);
        if (modeS != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = modeS;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.f9268a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f9271d != null;
    }

    void b() {
        Drawable background = this.f9268a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            TintInfo tintInfo = this.f9272e;
            if (tintInfo != null) {
                AppCompatDrawableManager.tintDrawable(background, tintInfo, this.f9268a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f9271d;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.tintDrawable(background, tintInfo2, this.f9268a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        TintInfo tintInfo = this.f9272e;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    PorterDuff.Mode d() {
        TintInfo tintInfo = this.f9272e;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i7) {
        Context context = this.f9268a.getContext();
        int[] iArr = C2456j.f20763M3;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        View view = this.f9268a;
        Z.l0(view, view.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        try {
            int i8 = C2456j.f20766N3;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
                this.f9270c = tintTypedArrayObtainStyledAttributes.getResourceId(i8, -1);
                ColorStateList tintList = this.f9269b.getTintList(this.f9268a.getContext(), this.f9270c);
                if (tintList != null) {
                    h(tintList);
                }
            }
            int i9 = C2456j.f20769O3;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
                Z.s0(this.f9268a, tintTypedArrayObtainStyledAttributes.getColorStateList(i9));
            }
            int i10 = C2456j.f20772P3;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
                Z.t0(this.f9268a, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i10, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f9270c = -1;
        h(null);
        b();
    }

    void g(int i7) {
        this.f9270c = i7;
        AppCompatDrawableManager appCompatDrawableManager = this.f9269b;
        h(appCompatDrawableManager != null ? appCompatDrawableManager.getTintList(this.f9268a.getContext(), i7) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9271d == null) {
                this.f9271d = new TintInfo();
            }
            TintInfo tintInfo = this.f9271d;
            tintInfo.mTintList = colorStateList;
            tintInfo.mHasTintList = true;
        } else {
            this.f9271d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f9272e == null) {
            this.f9272e = new TintInfo();
        }
        TintInfo tintInfo = this.f9272e;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f9272e == null) {
            this.f9272e = new TintInfo();
        }
        TintInfo tintInfo = this.f9272e;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        b();
    }
}
