package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1750f;
import d4.C2388a;
import k4.C2517a;
import p4.e;

public class SnackbarContentLayout extends LinearLayout implements a {

    private TextView f18440d;

    private Button f18441e;

    private final TimeInterpolator f18442i;

    private int f18443v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18442i = e.g(context, C1746b.f12718N, C2388a.f20313b);
    }

    private static void d(View view, int i7, int i8) {
        if (Z.T(view)) {
            Z.C0(view, Z.E(view), i7, Z.D(view), i8);
        } else {
            view.setPadding(view.getPaddingLeft(), i7, view.getPaddingRight(), i8);
        }
    }

    private boolean e(int i7, int i8, int i9) {
        boolean z7;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f18440d.getPaddingTop() == i8 && this.f18440d.getPaddingBottom() == i9) {
            return z7;
        }
        d(this.f18440d, i8, i9);
        return true;
    }

    @Override
    public void a(int i7, int i8) {
        this.f18440d.setAlpha(0.0f);
        long j7 = i8;
        long j8 = i7;
        this.f18440d.animate().alpha(1.0f).setDuration(j7).setInterpolator(this.f18442i).setStartDelay(j8).start();
        if (this.f18441e.getVisibility() == 0) {
            this.f18441e.setAlpha(0.0f);
            this.f18441e.animate().alpha(1.0f).setDuration(j7).setInterpolator(this.f18442i).setStartDelay(j8).start();
        }
    }

    @Override
    public void b(int i7, int i8) {
        this.f18440d.setAlpha(1.0f);
        long j7 = i8;
        long j8 = i7;
        this.f18440d.animate().alpha(0.0f).setDuration(j7).setInterpolator(this.f18442i).setStartDelay(j8).start();
        if (this.f18441e.getVisibility() == 0) {
            this.f18441e.setAlpha(1.0f);
            this.f18441e.animate().alpha(0.0f).setDuration(j7).setInterpolator(this.f18442i).setStartDelay(j8).start();
        }
    }

    void c(float f7) {
        if (f7 != 1.0f) {
            this.f18441e.setTextColor(C2517a.j(C2517a.d(this, C1746b.f12751n), this.f18441e.getCurrentTextColor(), f7));
        }
    }

    public Button getActionView() {
        return this.f18441e;
    }

    public TextView getMessageView() {
        return this.f18440d;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18440d = (TextView) findViewById(C1750f.f12861K);
        this.f18441e = (Button) findViewById(C1750f.f12860J);
    }

    @Override
    protected void onMeasure(int i7, int i8) throws Resources.NotFoundException {
        super.onMeasure(i7, i8);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1748d.f12810f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C1748d.f12808e);
        Layout layout = this.f18440d.getLayout();
        boolean z7 = layout != null && layout.getLineCount() > 1;
        if (!z7 || this.f18443v <= 0 || this.f18441e.getMeasuredWidth() <= this.f18443v) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i8);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f18443v = i7;
    }
}
