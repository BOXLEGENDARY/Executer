package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.Z;
import g.C2456j;
import h.C2473a;

public class AppCompatImageHelper {
    private TintInfo mImageTint;
    private TintInfo mInternalImageTint;
    private int mLevel = 0;
    private TintInfo mTmpInfo;
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView) {
        this.mView = imageView;
    }

    private boolean applyFrameworkTintUsingColorFilter(Drawable drawable) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new TintInfo();
        }
        TintInfo tintInfo = this.mTmpInfo;
        tintInfo.clear();
        ColorStateList colorStateListA = androidx.core.widget.f.a(this.mView);
        if (colorStateListA != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.f.b(this.mView);
        if (modeB != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = modeB;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        return true;
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        return this.mInternalImageTint != null;
    }

    void applyImageLevel() {
        if (this.mView.getDrawable() != null) {
            this.mView.getDrawable().setLevel(this.mLevel);
        }
    }

    void applySupportImageTint() {
        Drawable drawable = this.mView.getDrawable();
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        if (drawable != null) {
            if (shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable)) {
                return;
            }
            TintInfo tintInfo = this.mImageTint;
            if (tintInfo != null) {
                AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.mInternalImageTint;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.tintDrawable(drawable, tintInfo2, this.mView.getDrawableState());
            }
        }
    }

    ColorStateList getSupportImageTintList() {
        TintInfo tintInfo = this.mImageTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    PorterDuff.Mode getSupportImageTintMode() {
        TintInfo tintInfo = this.mImageTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    boolean hasOverlappingRendering() {
        return !(this.mView.getBackground() instanceof RippleDrawable);
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i7) {
        int resourceId;
        Context context = this.mView.getContext();
        int[] iArr = C2456j.f20776R;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i7, 0);
        ImageView imageView = this.mView;
        Z.l0(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        try {
            Drawable drawable = this.mView.getDrawable();
            if (drawable == null && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20779S, -1)) != -1 && (drawable = C2473a.b(this.mView.getContext(), resourceId)) != null) {
                this.mView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            int i8 = C2456j.f20782T;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
                androidx.core.widget.f.c(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(i8));
            }
            int i9 = C2456j.f20784U;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
                androidx.core.widget.f.d(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i9, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void obtainLevelFromDrawable(Drawable drawable) {
        this.mLevel = drawable.getLevel();
    }

    public void setImageResource(int i7) {
        if (i7 != 0) {
            Drawable drawableB = C2473a.b(this.mView.getContext(), i7);
            if (drawableB != null) {
                DrawableUtils.fixDrawable(drawableB);
            }
            this.mView.setImageDrawable(drawableB);
        } else {
            this.mView.setImageDrawable(null);
        }
        applySupportImageTint();
    }

    void setInternalImageTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.mInternalImageTint == null) {
                this.mInternalImageTint = new TintInfo();
            }
            TintInfo tintInfo = this.mInternalImageTint;
            tintInfo.mTintList = colorStateList;
            tintInfo.mHasTintList = true;
        } else {
            this.mInternalImageTint = null;
        }
        applySupportImageTint();
    }

    void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        TintInfo tintInfo = this.mImageTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = true;
        applySupportImageTint();
    }

    void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        TintInfo tintInfo = this.mImageTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = true;
        applySupportImageTint();
    }
}
