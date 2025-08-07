package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import c4.C1754j;
import c4.C1755k;
import h.C2473a;
import r4.C2754c;
import u4.C2937g;
import u4.k;
import u4.l;
import u4.n;
import x4.C2990a;

public class ShapeableImageView extends AppCompatImageView implements n {

    private static final int f18009L = C1754j.f12945A;

    private C2937g f18010A;

    private k f18011B;

    private float f18012C;

    private Path f18013D;

    private int f18014E;

    private int f18015F;

    private int f18016G;

    private int f18017H;

    private int f18018I;

    private int f18019J;

    private boolean f18020K;

    private final l f18021d;

    private final RectF f18022e;

    private final RectF f18023i;

    private final Paint f18024v;

    private final Paint f18025w;

    private final Path f18026y;

    private ColorStateList f18027z;

    class a extends ViewOutlineProvider {

        private final Rect f18028a = new Rect();

        a() {
        }

        @Override
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f18011B == null) {
                return;
            }
            if (ShapeableImageView.this.f18010A == null) {
                ShapeableImageView.this.f18010A = new C2937g(ShapeableImageView.this.f18011B);
            }
            ShapeableImageView.this.f18022e.round(this.f18028a);
            ShapeableImageView.this.f18010A.setBounds(this.f18028a);
            ShapeableImageView.this.f18010A.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void e(Canvas canvas) {
        if (this.f18027z == null) {
            return;
        }
        this.f18024v.setStrokeWidth(this.f18012C);
        int colorForState = this.f18027z.getColorForState(getDrawableState(), this.f18027z.getDefaultColor());
        if (this.f18012C <= 0.0f || colorForState == 0) {
            return;
        }
        this.f18024v.setColor(colorForState);
        canvas.drawPath(this.f18026y, this.f18024v);
    }

    private boolean f() {
        return (this.f18018I == Integer.MIN_VALUE && this.f18019J == Integer.MIN_VALUE) ? false : true;
    }

    private boolean g() {
        return getLayoutDirection() == 1;
    }

    private void h(int i7, int i8) {
        this.f18022e.set(getPaddingLeft(), getPaddingTop(), i7 - getPaddingRight(), i8 - getPaddingBottom());
        this.f18021d.d(this.f18011B, 1.0f, this.f18022e, this.f18026y);
        this.f18013D.rewind();
        this.f18013D.addPath(this.f18026y);
        this.f18023i.set(0.0f, 0.0f, i7, i8);
        this.f18013D.addRect(this.f18023i, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f18017H;
    }

    public final int getContentPaddingEnd() {
        int i7 = this.f18019J;
        return i7 != Integer.MIN_VALUE ? i7 : g() ? this.f18014E : this.f18016G;
    }

    public int getContentPaddingLeft() {
        int i7;
        int i8;
        if (f()) {
            if (g() && (i8 = this.f18019J) != Integer.MIN_VALUE) {
                return i8;
            }
            if (!g() && (i7 = this.f18018I) != Integer.MIN_VALUE) {
                return i7;
            }
        }
        return this.f18014E;
    }

    public int getContentPaddingRight() {
        int i7;
        int i8;
        if (f()) {
            if (g() && (i8 = this.f18018I) != Integer.MIN_VALUE) {
                return i8;
            }
            if (!g() && (i7 = this.f18019J) != Integer.MIN_VALUE) {
                return i7;
            }
        }
        return this.f18016G;
    }

    public final int getContentPaddingStart() {
        int i7 = this.f18018I;
        return i7 != Integer.MIN_VALUE ? i7 : g() ? this.f18016G : this.f18014E;
    }

    public int getContentPaddingTop() {
        return this.f18015F;
    }

    @Override
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public k getShapeAppearanceModel() {
        return this.f18011B;
    }

    public ColorStateList getStrokeColor() {
        return this.f18027z;
    }

    public float getStrokeWidth() {
        return this.f18012C;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f18013D, this.f18025w);
        e(canvas);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (!this.f18020K && isLayoutDirectionResolved()) {
            this.f18020K = true;
            if (isPaddingRelative() || f()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        h(i7, i8);
    }

    @Override
    public void setPadding(int i7, int i8, int i9, int i10) {
        super.setPadding(i7 + getContentPaddingLeft(), i8 + getContentPaddingTop(), i9 + getContentPaddingRight(), i10 + getContentPaddingBottom());
    }

    @Override
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
        super.setPaddingRelative(i7 + getContentPaddingStart(), i8 + getContentPaddingTop(), i9 + getContentPaddingEnd(), i10 + getContentPaddingBottom());
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        this.f18011B = kVar;
        C2937g c2937g = this.f18010A;
        if (c2937g != null) {
            c2937g.setShapeAppearanceModel(kVar);
        }
        h(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f18027z = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i7) {
        setStrokeColor(C2473a.a(getContext(), i7));
    }

    public void setStrokeWidth(float f7) {
        if (this.f18012C != f7) {
            this.f18012C = f7;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i7) {
        setStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f18009L;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f18021d = l.k();
        this.f18026y = new Path();
        this.f18020K = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f18025w = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f18022e = new RectF();
        this.f18023i = new RectF();
        this.f18013D = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1755k.f13268t5, i7, i8);
        setLayerType(2, null);
        this.f18027z = C2754c.a(context2, typedArrayObtainStyledAttributes, C1755k.f12986B5);
        this.f18012C = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.C5, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13275u5, 0);
        this.f18014E = dimensionPixelSize;
        this.f18015F = dimensionPixelSize;
        this.f18016G = dimensionPixelSize;
        this.f18017H = dimensionPixelSize;
        this.f18014E = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13297x5, dimensionPixelSize);
        this.f18015F = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f12979A5, dimensionPixelSize);
        this.f18016G = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13305y5, dimensionPixelSize);
        this.f18017H = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13282v5, dimensionPixelSize);
        this.f18018I = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13312z5, Integer.MIN_VALUE);
        this.f18019J = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13289w5, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f18024v = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f18011B = k.e(context2, attributeSet, i7, i8).m();
        setOutlineProvider(new a());
    }
}
