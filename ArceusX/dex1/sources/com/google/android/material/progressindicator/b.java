package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c4.C1746b;
import c4.C1748d;
import c4.C1755k;
import com.google.android.material.internal.p;
import k4.C2517a;
import r4.C2754c;

public abstract class b {

    public int f18219a;

    public int f18220b;

    public int[] f18221c = new int[0];

    public int f18222d;

    public int f18223e;

    public int f18224f;

    public int f18225g;

    protected b(Context context, AttributeSet attributeSet, int i7, int i8) throws Resources.NotFoundException {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1748d.f12811f0);
        TypedArray typedArrayI = p.i(context, attributeSet, C1755k.f13292x, i7, i8, new int[0]);
        this.f18219a = C2754c.c(context, typedArrayI, C1755k.f13011G, dimensionPixelSize);
        this.f18220b = Math.min(C2754c.c(context, typedArrayI, C1755k.f13006F, 0), this.f18219a / 2);
        this.f18223e = typedArrayI.getInt(C1755k.f12988C, 0);
        this.f18224f = typedArrayI.getInt(C1755k.f13299y, 0);
        this.f18225g = typedArrayI.getDimensionPixelSize(C1755k.f12974A, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void c(Context context, TypedArray typedArray) throws Resources.NotFoundException {
        int i7 = C1755k.f13307z;
        if (!typedArray.hasValue(i7)) {
            this.f18221c = new int[]{C2517a.b(context, C1746b.f12748k, -1)};
            return;
        }
        if (typedArray.peekValue(i7).type != 1) {
            this.f18221c = new int[]{typedArray.getColor(i7, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i7, -1));
        this.f18221c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i7 = C1755k.f13000E;
        if (typedArray.hasValue(i7)) {
            this.f18222d = typedArray.getColor(i7, -1);
            return;
        }
        this.f18222d = this.f18221c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f7 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f18222d = C2517a.a(this.f18222d, (int) (f7 * 255.0f));
    }

    public boolean a() {
        return this.f18224f != 0;
    }

    public boolean b() {
        return this.f18223e != 0;
    }

    void e() {
        if (this.f18225g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
