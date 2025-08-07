package i;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import q0.C2731a;

public class C2481b extends Drawable {

    private static final float f21045m = (float) Math.toRadians(45.0d);

    private final Paint f21046a;

    private float f21047b;

    private float f21048c;

    private float f21049d;

    private float f21050e;

    private boolean f21051f;

    private final Path f21052g;

    private final int f21053h;

    private boolean f21054i;

    private float f21055j;

    private float f21056k;

    private int f21057l;

    private static float a(float f7, float f8, float f9) {
        return f7 + ((f8 - f7) * f9);
    }

    public void b(float f7) {
        if (this.f21055j != f7) {
            this.f21055j = f7;
            invalidateSelf();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f21057l;
        boolean z7 = false;
        if (i7 != 0 && (i7 == 1 || (i7 == 3 ? C2731a.f(this) == 0 : C2731a.f(this) == 1))) {
            z7 = true;
        }
        float f7 = this.f21047b;
        float fA = a(this.f21048c, (float) Math.sqrt(f7 * f7 * 2.0f), this.f21055j);
        float fA2 = a(this.f21048c, this.f21049d, this.f21055j);
        float fRound = Math.round(a(0.0f, this.f21056k, this.f21055j));
        float fA3 = a(0.0f, f21045m, this.f21055j);
        float fA4 = a(z7 ? 0.0f : -180.0f, z7 ? 180.0f : 0.0f, this.f21055j);
        double d7 = fA;
        double d8 = fA3;
        boolean z8 = z7;
        float fRound2 = Math.round(Math.cos(d8) * d7);
        float fRound3 = Math.round(d7 * Math.sin(d8));
        this.f21052g.rewind();
        float fA5 = a(this.f21050e + this.f21046a.getStrokeWidth(), -this.f21056k, this.f21055j);
        float f8 = (-fA2) / 2.0f;
        this.f21052g.moveTo(f8 + fRound, 0.0f);
        this.f21052g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f21052g.moveTo(f8, fA5);
        this.f21052g.rLineTo(fRound2, fRound3);
        this.f21052g.moveTo(f8, -fA5);
        this.f21052g.rLineTo(fRound2, -fRound3);
        this.f21052g.close();
        canvas.save();
        float strokeWidth = this.f21046a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f21050e);
        if (this.f21051f) {
            canvas.rotate(fA4 * (this.f21054i ^ z8 ? -1 : 1));
        } else if (z8) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f21052g, this.f21046a);
        canvas.restore();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f21053h;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f21053h;
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void setAlpha(int i7) {
        if (i7 != this.f21046a.getAlpha()) {
            this.f21046a.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21046a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
