package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import s0.C2870a;

public final class i extends d {

    private static final int[] f17601d = {1};

    private static final int[] f17602e = {1, 0};

    private int f17603c = 0;

    @Override
    f g(b bVar, View view) {
        float fB = bVar.b();
        if (bVar.f()) {
            fB = bVar.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f7 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f8 = f7;
        float fD = d() + f8;
        float fMax = Math.max(c() + f8, fD);
        float fMin = Math.min(measuredHeight + f8, fB);
        float fB2 = C2870a.b((measuredHeight / 3.0f) + f8, fD + f8, fMax + f8);
        float f9 = (fMin + fB2) / 2.0f;
        int[] iArrA = f17601d;
        if (fB < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f17602e;
        if (bVar.d() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fB - (e.i(iArr2) * f9)) - (e.i(iArr) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(fB / fMin);
        int i7 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr3[i8] = iCeil - i8;
        }
        a aVarC = a.c(fB, fB2, fD, fMax, iArr, f9, iArr2, fMin, iArr3);
        this.f17603c = aVarC.e();
        if (i(aVarC, bVar.e())) {
            aVarC = a.c(fB, fB2, fD, fMax, new int[]{aVarC.f17562c}, f9, new int[]{aVarC.f17563d}, fMin, new int[]{aVarC.f17566g});
        }
        return e.d(view.getContext(), f8, fB, aVarC, bVar.d());
    }

    @Override
    boolean h(b bVar, int i7) {
        return (i7 < this.f17603c && bVar.e() >= this.f17603c) || (i7 >= this.f17603c && bVar.e() < this.f17603c);
    }

    boolean i(a aVar, int i7) {
        int iE = aVar.e() - i7;
        boolean z7 = iE > 0 && (aVar.f17562c > 0 || aVar.f17563d > 1);
        while (iE > 0) {
            int i8 = aVar.f17562c;
            if (i8 > 0) {
                aVar.f17562c = i8 - 1;
            } else {
                int i9 = aVar.f17563d;
                if (i9 > 1) {
                    aVar.f17563d = i9 - 1;
                }
            }
            iE--;
        }
        return z7;
    }
}
