package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import f0.C2438a;
import f0.C2439b;
import f0.C2440c;

public class CardView extends FrameLayout {

    private static final int[] f9734A = {R.attr.colorBackground};

    private static final c f9735B;

    private boolean f9736d;

    private boolean f9737e;

    int f9738i;

    int f9739v;

    final Rect f9740w;

    final Rect f9741y;

    private final b f9742z;

    class a implements b {

        private Drawable f9743a;

        a() {
        }

        @Override
        public void a(int i7, int i8, int i9, int i10) {
            CardView.this.f9741y.set(i7, i8, i9, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.f9740w;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }

        @Override
        public void b(Drawable drawable) {
            this.f9743a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override
        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override
        public Drawable e() {
            return this.f9743a;
        }

        @Override
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f9735B = aVar;
        aVar.j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2438a.f20443a);
    }

    public void d(int i7, int i8, int i9, int i10) {
        this.f9740w.set(i7, i8, i9, i10);
        f9735B.i(this.f9742z);
    }

    public ColorStateList getCardBackgroundColor() {
        return f9735B.h(this.f9742z);
    }

    public float getCardElevation() {
        return f9735B.c(this.f9742z);
    }

    public int getContentPaddingBottom() {
        return this.f9740w.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9740w.left;
    }

    public int getContentPaddingRight() {
        return this.f9740w.right;
    }

    public int getContentPaddingTop() {
        return this.f9740w.top;
    }

    public float getMaxCardElevation() {
        return f9735B.g(this.f9742z);
    }

    public boolean getPreventCornerOverlap() {
        return this.f9737e;
    }

    public float getRadius() {
        return f9735B.d(this.f9742z);
    }

    public boolean getUseCompatPadding() {
        return this.f9736d;
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (f9735B instanceof androidx.cardview.widget.a) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.f9742z)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f9742z)), View.MeasureSpec.getSize(i8)), mode2);
        }
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        f9735B.n(this.f9742z, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f7) {
        f9735B.f(this.f9742z, f7);
    }

    public void setMaxCardElevation(float f7) {
        f9735B.o(this.f9742z, f7);
    }

    @Override
    public void setMinimumHeight(int i7) {
        this.f9739v = i7;
        super.setMinimumHeight(i7);
    }

    @Override
    public void setMinimumWidth(int i7) {
        this.f9738i = i7;
        super.setMinimumWidth(i7);
    }

    @Override
    public void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f9737e) {
            this.f9737e = z7;
            f9735B.m(this.f9742z);
        }
    }

    public void setRadius(float f7) {
        f9735B.b(this.f9742z, f7);
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f9736d != z7) {
            this.f9736d = z7;
            f9735B.e(this.f9742z);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i7);
        Rect rect = new Rect();
        this.f9740w = rect;
        this.f9741y = new Rect();
        a aVar = new a();
        this.f9742z = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.d.f20447a, i7, C2440c.f20446a);
        int i8 = f0.d.f20450d;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i8);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f9734A);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C2439b.f20445b) : getResources().getColor(C2439b.f20444a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(f0.d.f20451e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(f0.d.f20452f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(f0.d.f20453g, 0.0f);
        this.f9736d = typedArrayObtainStyledAttributes.getBoolean(f0.d.f20455i, false);
        this.f9737e = typedArrayObtainStyledAttributes.getBoolean(f0.d.f20454h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20456j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20458l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20460n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20459m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20457k, dimensionPixelSize);
        float f7 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f9738i = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20448b, 0);
        this.f9739v = typedArrayObtainStyledAttributes.getDimensionPixelSize(f0.d.f20449c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f9735B.a(aVar, context, colorStateList, dimension, dimension2, f7);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f9735B.n(this.f9742z, colorStateList);
    }
}
