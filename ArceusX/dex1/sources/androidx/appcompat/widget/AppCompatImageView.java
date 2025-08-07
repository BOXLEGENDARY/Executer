package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    private final C1598c mBackgroundTintHelper;
    private boolean mHasLevel;
    private final AppCompatImageHelper mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.b();
        }
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.applySupportImageTint();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.getSupportImageTintList();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.getSupportImageTintMode();
        }
        return null;
    }

    @Override
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.hasOverlappingRendering() && super.hasOverlappingRendering();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.f(drawable);
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.g(i7);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.applySupportImageTint();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null && drawable != null && !this.mHasLevel) {
            appCompatImageHelper.obtainLevelFromDrawable(drawable);
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.mImageHelper;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.applySupportImageTint();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.applyImageLevel();
        }
    }

    @Override
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.mHasLevel = true;
    }

    @Override
    public void setImageResource(int i7) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.setImageResource(i7);
        }
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.applySupportImageTint();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.setSupportImageTintList(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.setSupportImageTintMode(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i7) {
        super(TintContextWrapper.wrap(context), attributeSet, i7);
        this.mHasLevel = false;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        C1598c c1598c = new C1598c(this);
        this.mBackgroundTintHelper = c1598c;
        c1598c.e(attributeSet, i7);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.mImageHelper = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i7);
    }
}
