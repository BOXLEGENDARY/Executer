package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class d extends Drawable {

    private float f9745a;

    private final RectF f9747c;

    private final Rect f9748d;

    private float f9749e;

    private ColorStateList f9752h;

    private PorterDuffColorFilter f9753i;

    private ColorStateList f9754j;

    private boolean f9750f = false;

    private boolean f9751g = true;

    private PorterDuff.Mode f9755k = PorterDuff.Mode.SRC_IN;

    private final Paint f9746b = new Paint(5);

    d(ColorStateList colorStateList, float f7) {
        this.f9745a = f7;
        e(colorStateList);
        this.f9747c = new RectF();
        this.f9748d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f9752h = colorStateList;
        this.f9746b.setColor(colorStateList.getColorForState(getState(), this.f9752h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f9747c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f9748d.set(rect);
        if (this.f9750f) {
            this.f9748d.inset((int) Math.ceil(e.a(this.f9749e, this.f9745a, this.f9751g)), (int) Math.ceil(e.b(this.f9749e, this.f9745a, this.f9751g)));
            this.f9747c.set(this.f9748d);
        }
    }

    public ColorStateList b() {
        return this.f9752h;
    }

    float c() {
        return this.f9749e;
    }

    public float d() {
        return this.f9745a;
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f9746b;
        if (this.f9753i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f9753i);
            z7 = true;
        }
        RectF rectF = this.f9747c;
        float f7 = this.f9745a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f7, boolean z7, boolean z8) {
        if (f7 == this.f9749e && this.f9750f == z7 && this.f9751g == z8) {
            return;
        }
        this.f9749e = f7;
        this.f9750f = z7;
        this.f9751g = z8;
        i(null);
        invalidateSelf();
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f9748d, this.f9745a);
    }

    void h(float f7) {
        if (f7 == this.f9745a) {
            return;
        }
        this.f9745a = f7;
        i(null);
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9754j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f9752h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f9752h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z7 = colorForState != this.f9746b.getColor();
        if (z7) {
            this.f9746b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f9754j;
        if (colorStateList2 == null || (mode = this.f9755k) == null) {
            return z7;
        }
        this.f9753i = a(colorStateList2, mode);
        return true;
    }

    @Override
    public void setAlpha(int i7) {
        this.f9746b.setAlpha(i7);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9746b.setColorFilter(colorFilter);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.f9754j = colorStateList;
        this.f9753i = a(colorStateList, this.f9755k);
        invalidateSelf();
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        this.f9755k = mode;
        this.f9753i = a(this.f9754j, mode);
        invalidateSelf();
    }
}
