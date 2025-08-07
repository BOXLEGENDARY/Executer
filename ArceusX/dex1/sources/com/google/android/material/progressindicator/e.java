package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c4.C1746b;
import c4.C1748d;
import c4.C1755k;
import com.google.android.material.internal.p;
import r4.C2754c;

public final class e extends b {

    public int f18246h;

    public int f18247i;

    public int f18248j;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12739e);
    }

    public e(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, CircularProgressIndicator.f18199I);
    }

    public e(Context context, AttributeSet attributeSet, int i7, int i8) throws Resources.NotFoundException {
        super(context, attributeSet, i7, i8);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1748d.f12809e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C1748d.f12807d0);
        TypedArray typedArrayI = p.i(context, attributeSet, C1755k.f13155e1, i7, i8, new int[0]);
        this.f18246h = Math.max(C2754c.c(context, typedArrayI, C1755k.f13179h1, dimensionPixelSize), this.f18219a * 2);
        this.f18247i = C2754c.c(context, typedArrayI, C1755k.f13171g1, dimensionPixelSize2);
        this.f18248j = typedArrayI.getInt(C1755k.f13163f1, 0);
        typedArrayI.recycle();
        e();
    }
}
