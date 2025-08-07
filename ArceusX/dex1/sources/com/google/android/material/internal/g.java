package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1646v;
import androidx.core.view.Z;
import c4.C1750f;

public class g extends ViewGroup {

    private int f18133d;

    private int f18134e;

    private boolean f18135i;

    private int f18136v;

    private static int a(int i7, int i8, int i9) {
        return i8 != Integer.MIN_VALUE ? i8 != 1073741824 ? i9 : i7 : Math.min(i9, i7);
    }

    public int b(View view) {
        Object tag = view.getTag(C1750f.f12858H);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f18135i;
    }

    protected int getItemSpacing() {
        return this.f18134e;
    }

    protected int getLineSpacing() {
        return this.f18133d;
    }

    protected int getRowCount() {
        return this.f18136v;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f18136v = 0;
            return;
        }
        this.f18136v = 1;
        boolean z8 = Z.z(this) == 1;
        int paddingRight = z8 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z8 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = (i9 - i7) - paddingLeft;
        int measuredWidth = paddingRight;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1750f.f12858H, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = C1646v.b(marginLayoutParams);
                    iA = C1646v.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f18135i && measuredWidth2 > i11) {
                    i12 = this.f18133d + paddingTop;
                    this.f18136v++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C1750f.f12858H, Integer.valueOf(this.f18136v - 1));
                int i14 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z8) {
                    childAt.layout(i11 - measuredWidth3, i12, (i11 - measuredWidth) - iB, measuredHeight);
                } else {
                    childAt.layout(i14, i12, measuredWidth3, measuredHeight);
                }
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f18134e;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.leftMargin;
                    i10 = marginLayoutParams.rightMargin;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int i15 = paddingLeft2;
                if (paddingLeft2 + i9 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i15;
                } else {
                    paddingLeft = getPaddingLeft();
                    i12 = this.f18133d + paddingTop;
                }
                int measuredWidth = paddingLeft + i9 + childAt.getMeasuredWidth();
                int measuredHeight = i12 + childAt.getMeasuredHeight();
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i9 + i10 + childAt.getMeasuredWidth() + this.f18134e;
                if (i14 == getChildCount() - 1) {
                    i13 += i10;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i13 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i7) {
        this.f18134e = i7;
    }

    protected void setLineSpacing(int i7) {
        this.f18133d = i7;
    }

    public void setSingleLine(boolean z7) {
        this.f18135i = z7;
    }
}
