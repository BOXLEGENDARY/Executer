package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

public abstract class d {

    private float f17571a;

    private float f17572b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr2[i7] = iArr[i7] * 2;
        }
        return iArr2;
    }

    static float b(float f7, float f8, float f9) {
        return 1.0f - ((f7 - f9) / (f8 - f9));
    }

    public float c() {
        return this.f17572b;
    }

    public float d() {
        return this.f17571a;
    }

    void e(Context context) {
        float fH = this.f17571a;
        if (fH <= 0.0f) {
            fH = e.h(context);
        }
        this.f17571a = fH;
        float fG = this.f17572b;
        if (fG <= 0.0f) {
            fG = e.g(context);
        }
        this.f17572b = fG;
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i7);
}
