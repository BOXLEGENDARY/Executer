package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import r4.C2754c;
import u4.C2937g;
import x4.C2990a;

public class MaterialDivider extends View {

    private static final int f17877y = C1754j.f12972y;

    private final C2937g f17878d;

    private int f17879e;

    private int f17880i;

    private int f17881v;

    private int f17882w;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12705A);
    }

    public int getDividerColor() {
        return this.f17880i;
    }

    public int getDividerInsetEnd() {
        return this.f17882w;
    }

    public int getDividerInsetStart() {
        return this.f17881v;
    }

    public int getDividerThickness() {
        return this.f17879e;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        boolean z7 = Z.z(this) == 1;
        int i8 = z7 ? this.f17882w : this.f17881v;
        if (z7) {
            width = getWidth();
            i7 = this.f17881v;
        } else {
            width = getWidth();
            i7 = this.f17882w;
        }
        this.f17878d.setBounds(i8, 0, width - i7, getBottom() - getTop());
        this.f17878d.draw(canvas);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i9 = this.f17879e;
            if (i9 > 0 && measuredHeight != i9) {
                measuredHeight = i9;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i7) {
        if (this.f17880i != i7) {
            this.f17880i = i7;
            this.f17878d.a0(ColorStateList.valueOf(i7));
            invalidate();
        }
    }

    public void setDividerColorResource(int i7) {
        setDividerColor(a.c(getContext(), i7));
    }

    public void setDividerInsetEnd(int i7) {
        this.f17882w = i7;
    }

    public void setDividerInsetEndResource(int i7) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(int i7) {
        this.f17881v = i7;
    }

    public void setDividerInsetStartResource(int i7) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(int i7) {
        if (this.f17879e != i7) {
            this.f17879e = i7;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i7) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i7));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17877y;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        this.f17878d = new C2937g();
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.f13109X3, i7, i8, new int[0]);
        this.f17879e = typedArrayI.getDimensionPixelSize(C1755k.f13135b4, getResources().getDimensionPixelSize(C1748d.f12837z));
        this.f17881v = typedArrayI.getDimensionPixelOffset(C1755k.f13128a4, 0);
        this.f17882w = typedArrayI.getDimensionPixelOffset(C1755k.f13121Z3, 0);
        setDividerColor(C2754c.a(context2, typedArrayI, C1755k.f13115Y3).getDefaultColor());
        typedArrayI.recycle();
    }
}
