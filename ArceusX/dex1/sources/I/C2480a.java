package i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import q0.C2731a;

public class C2480a extends Drawable implements Drawable.Callback {

    private Drawable f21044d;

    public C2480a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f21044d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21044d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.f21044d.draw(canvas);
    }

    @Override
    public int getChangingConfigurations() {
        return this.f21044d.getChangingConfigurations();
    }

    @Override
    public Drawable getCurrent() {
        return this.f21044d.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f21044d.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f21044d.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return this.f21044d.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.f21044d.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f21044d.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.f21044d.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return this.f21044d.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return this.f21044d.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isAutoMirrored() {
        return C2731a.h(this.f21044d);
    }

    @Override
    public boolean isStateful() {
        return this.f21044d.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.f21044d.jumpToCurrentState();
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        this.f21044d.setBounds(rect);
    }

    @Override
    protected boolean onLevelChange(int i7) {
        return this.f21044d.setLevel(i7);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override
    public void setAlpha(int i7) {
        this.f21044d.setAlpha(i7);
    }

    @Override
    public void setAutoMirrored(boolean z7) {
        C2731a.j(this.f21044d, z7);
    }

    @Override
    public void setChangingConfigurations(int i7) {
        this.f21044d.setChangingConfigurations(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21044d.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z7) {
        this.f21044d.setDither(z7);
    }

    @Override
    public void setFilterBitmap(boolean z7) {
        this.f21044d.setFilterBitmap(z7);
    }

    @Override
    public void setHotspot(float f7, float f8) {
        C2731a.k(this.f21044d, f7, f8);
    }

    @Override
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        C2731a.l(this.f21044d, i7, i8, i9, i10);
    }

    @Override
    public boolean setState(int[] iArr) {
        return this.f21044d.setState(iArr);
    }

    @Override
    public void setTint(int i7) {
        C2731a.n(this.f21044d, i7);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        C2731a.o(this.f21044d, colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        C2731a.p(this.f21044d, mode);
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8) || this.f21044d.setVisible(z7, z8);
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
