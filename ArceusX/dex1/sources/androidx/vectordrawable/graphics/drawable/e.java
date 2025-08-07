package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import q0.C2731a;

abstract class e extends Drawable {

    Drawable f12446d;

    e() {
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.a(drawable, theme);
        }
    }

    @Override
    public void clearColorFilter() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override
    public Drawable getCurrent() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override
    public int getMinimumHeight() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override
    public int[] getState() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override
    public Region getTransparentRegion() {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override
    public void jumpToCurrentState() {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.i(drawable);
        }
    }

    @Override
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.setLevel(i7) : super.onLevelChange(i7);
    }

    @Override
    public void setChangingConfigurations(int i7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setChangingConfigurations(i7);
        } else {
            super.setChangingConfigurations(i7);
        }
    }

    @Override
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setColorFilter(i7, mode);
        } else {
            super.setColorFilter(i7, mode);
        }
    }

    @Override
    public void setFilterBitmap(boolean z7) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            drawable.setFilterBitmap(z7);
        }
    }

    @Override
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.k(drawable, f7, f8);
        }
    }

    @Override
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Drawable drawable = this.f12446d;
        if (drawable != null) {
            C2731a.l(drawable, i7, i8, i9, i10);
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f12446d;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
