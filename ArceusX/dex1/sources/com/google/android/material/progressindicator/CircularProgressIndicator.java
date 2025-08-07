package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import c4.C1746b;
import c4.C1754j;

public class CircularProgressIndicator extends a<e> {

    public static final int f18199I = C1754j.f12966s;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12739e);
    }

    private void s() {
        c cVar = new c((e) this.f18208d);
        setIndeterminateDrawable(j.t(getContext(), (e) this.f18208d, cVar));
        setProgressDrawable(f.v(getContext(), (e) this.f18208d, cVar));
    }

    public int getIndicatorDirection() {
        return ((e) this.f18208d).f18248j;
    }

    public int getIndicatorInset() {
        return ((e) this.f18208d).f18247i;
    }

    public int getIndicatorSize() {
        return ((e) this.f18208d).f18246h;
    }

    @Override
    public e i(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public void setIndicatorDirection(int i7) {
        ((e) this.f18208d).f18248j = i7;
        invalidate();
    }

    public void setIndicatorInset(int i7) {
        S s7 = this.f18208d;
        if (((e) s7).f18247i != i7) {
            ((e) s7).f18247i = i7;
            invalidate();
        }
    }

    public void setIndicatorSize(int i7) {
        int iMax = Math.max(i7, getTrackThickness() * 2);
        S s7 = this.f18208d;
        if (((e) s7).f18246h != iMax) {
            ((e) s7).f18246h = iMax;
            ((e) s7).e();
            requestLayout();
            invalidate();
        }
    }

    @Override
    public void setTrackThickness(int i7) {
        super.setTrackThickness(i7);
        ((e) this.f18208d).e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, f18199I);
        s();
    }
}
