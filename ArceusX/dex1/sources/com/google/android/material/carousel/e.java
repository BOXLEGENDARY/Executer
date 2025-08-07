package com.google.android.material.carousel;

import android.content.Context;
import c4.C1748d;
import com.google.android.material.carousel.f;

final class e {
    static float a(float f7, float f8, int i7) {
        return f7 + (Math.max(0, i7 - 1) * f8);
    }

    static float b(float f7, float f8, int i7) {
        return i7 > 0 ? f7 + (f8 / 2.0f) : f7;
    }

    static f c(Context context, float f7, float f8, a aVar) {
        float f9;
        float f10;
        float fMin = Math.min(f(context) + f7, aVar.f17565f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, aVar.f17561b, aVar.f17562c);
        float fJ = j(0.0f, a(fB, aVar.f17561b, (int) Math.floor(aVar.f17562c / 2.0f)), aVar.f17561b, aVar.f17562c);
        float fB2 = b(fJ, aVar.f17564e, aVar.f17563d);
        float fJ2 = j(fJ, a(fB2, aVar.f17564e, (int) Math.floor(aVar.f17563d / 2.0f)), aVar.f17564e, aVar.f17563d);
        float fB3 = b(fJ2, aVar.f17565f, aVar.f17566g);
        float fJ3 = j(fJ2, a(fB3, aVar.f17565f, aVar.f17566g), aVar.f17565f, aVar.f17566g);
        float fB4 = b(fJ3, aVar.f17564e, aVar.f17563d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f17564e, (int) Math.ceil(aVar.f17563d / 2.0f)), aVar.f17564e, aVar.f17563d), aVar.f17561b, aVar.f17562c);
        float f13 = f11 + f8;
        float fB6 = d.b(fMin, aVar.f17565f, f7);
        float fB7 = d.b(aVar.f17561b, aVar.f17565f, f7);
        float fB8 = d.b(aVar.f17564e, aVar.f17565f, f7);
        f.b bVarA = new f.b(aVar.f17565f, f8).a(f12, fB6, fMin);
        if (aVar.f17562c > 0) {
            f9 = f13;
            bVarA.g(fB, fB7, aVar.f17561b, (int) Math.floor(r7 / 2.0f));
        } else {
            f9 = f13;
        }
        if (aVar.f17563d > 0) {
            bVarA.g(fB2, fB8, aVar.f17564e, (int) Math.floor(r4 / 2.0f));
        }
        bVarA.h(fB3, 0.0f, aVar.f17565f, aVar.f17566g, true);
        if (aVar.f17563d > 0) {
            f10 = 2.0f;
            bVarA.g(fB4, fB8, aVar.f17564e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f10 = 2.0f;
        }
        if (aVar.f17562c > 0) {
            bVarA.g(fB5, fB7, aVar.f17561b, (int) Math.ceil(r0 / f10));
        }
        bVarA.a(f9, fB6, fMin);
        return bVarA.i();
    }

    static f d(Context context, float f7, float f8, a aVar, int i7) {
        return i7 == 1 ? c(context, f7, f8, aVar) : e(context, f7, f8, aVar);
    }

    static f e(Context context, float f7, float f8, a aVar) {
        float fMin = Math.min(f(context) + f7, aVar.f17565f);
        float f9 = fMin / 2.0f;
        float f10 = 0.0f - f9;
        float fB = b(0.0f, aVar.f17565f, aVar.f17566g);
        float fJ = j(0.0f, a(fB, aVar.f17565f, aVar.f17566g), aVar.f17565f, aVar.f17566g);
        float fB2 = b(fJ, aVar.f17564e, aVar.f17563d);
        float fB3 = b(j(fJ, fB2, aVar.f17564e, aVar.f17563d), aVar.f17561b, aVar.f17562c);
        float f11 = f9 + f8;
        float fB4 = d.b(fMin, aVar.f17565f, f7);
        float fB5 = d.b(aVar.f17561b, aVar.f17565f, f7);
        float fB6 = d.b(aVar.f17564e, aVar.f17565f, f7);
        f.b bVarH = new f.b(aVar.f17565f, f8).a(f10, fB4, fMin).h(fB, 0.0f, aVar.f17565f, aVar.f17566g, true);
        if (aVar.f17563d > 0) {
            bVarH.b(fB2, fB6, aVar.f17564e);
        }
        int i7 = aVar.f17562c;
        if (i7 > 0) {
            bVarH.g(fB3, fB5, aVar.f17561b, i7);
        }
        bVarH.a(f11, fB4, fMin);
        return bVarH.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(C1748d.f12826o);
    }

    static float g(Context context) {
        return context.getResources().getDimension(C1748d.f12827p);
    }

    static float h(Context context) {
        return context.getResources().getDimension(C1748d.f12828q);
    }

    static int i(int[] iArr) {
        int i7 = Integer.MIN_VALUE;
        for (int i8 : iArr) {
            if (i8 > i7) {
                i7 = i8;
            }
        }
        return i7;
    }

    static float j(float f7, float f8, float f9, int i7) {
        return i7 > 0 ? f8 + (f9 / 2.0f) : f7;
    }
}
