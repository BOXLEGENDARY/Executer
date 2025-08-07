package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import com.google.android.material.internal.q;
import q0.C2731a;
import u4.C2937g;
import u4.h;
import x4.C2990a;

public class MaterialToolbar extends Toolbar {

    private static final int f17238y = C1754j.f12947C;

    private static final ImageView.ScaleType[] f17239z = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    private Integer f17240d;

    private boolean f17241e;

    private boolean f17242i;

    private ImageView.ScaleType f17243v;

    private Boolean f17244w;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12744g0);
    }

    private Pair<Integer, Integer> a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i7 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.g(background);
        if (colorStateListValueOf != null) {
            C2937g c2937g = new C2937g();
            c2937g.a0(colorStateListValueOf);
            c2937g.Q(context);
            c2937g.Z(Z.u(this));
            Z.r0(this, c2937g);
        }
    }

    private void c(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i7;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i7 += iMax;
            i8 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i8 - i7, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i7, view.getTop(), i8, view.getBottom());
    }

    private void d() {
        if (this.f17241e || this.f17242i) {
            TextView textViewG = q.g(this);
            TextView textViewE = q.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairA = a(textViewG, textViewE);
            if (this.f17241e && textViewG != null) {
                c(textViewG, pairA);
            }
            if (!this.f17242i || textViewE == null) {
                return;
            }
            c(textViewE, pairA);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable == null || this.f17240d == null) {
            return drawable;
        }
        Drawable drawableR = C2731a.r(drawable.mutate());
        C2731a.n(drawableR, this.f17240d.intValue());
        return drawableR;
    }

    private void f() {
        ImageView imageViewC = q.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f17244w;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f17243v;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f17243v;
    }

    public Integer getNavigationIconTint() {
        return this.f17240d;
    }

    @Override
    public void inflateMenu(int i7) {
        Menu menu = getMenu();
        boolean z7 = menu instanceof g;
        if (z7) {
            ((g) menu).d0();
        }
        super.inflateMenu(i7);
        if (z7) {
            ((g) menu).c0();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        d();
        f();
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        h.d(this, f7);
    }

    public void setLogoAdjustViewBounds(boolean z7) {
        Boolean bool = this.f17244w;
        if (bool == null || bool.booleanValue() != z7) {
            this.f17244w = Boolean.valueOf(z7);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f17243v != scaleType) {
            this.f17243v = scaleType;
            requestLayout();
        }
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(e(drawable));
    }

    public void setNavigationIconTint(int i7) {
        this.f17240d = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z7) {
        if (this.f17242i != z7) {
            this.f17242i = z7;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z7) {
        if (this.f17241e != z7) {
            this.f17241e = z7;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17238y;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.f13311z4, i7, i8, new int[0]);
        int i9 = C1755k.f12992C4;
        if (typedArrayI.hasValue(i9)) {
            setNavigationIconTint(typedArrayI.getColor(i9, -1));
        }
        this.f17241e = typedArrayI.getBoolean(C1755k.f13004E4, false);
        this.f17242i = typedArrayI.getBoolean(C1755k.f12998D4, false);
        int i10 = typedArrayI.getInt(C1755k.f12985B4, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f17239z;
            if (i10 < scaleTypeArr.length) {
                this.f17243v = scaleTypeArr[i10];
            }
        }
        int i11 = C1755k.f12978A4;
        if (typedArrayI.hasValue(i11)) {
            this.f17244w = Boolean.valueOf(typedArrayI.getBoolean(i11, false));
        }
        typedArrayI.recycle();
        b(context2);
    }
}
