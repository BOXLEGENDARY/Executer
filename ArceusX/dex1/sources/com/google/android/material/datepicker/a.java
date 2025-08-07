package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.Z;
import c4.C1755k;
import r4.C2754c;
import u4.C2937g;

final class a {

    private final Rect f17748a;

    private final ColorStateList f17749b;

    private final ColorStateList f17750c;

    private final ColorStateList f17751d;

    private final int f17752e;

    private final u4.k f17753f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i7, u4.k kVar, Rect rect) {
        x0.g.d(rect.left);
        x0.g.d(rect.top);
        x0.g.d(rect.right);
        x0.g.d(rect.bottom);
        this.f17748a = rect;
        this.f17749b = colorStateList2;
        this.f17750c = colorStateList;
        this.f17751d = colorStateList3;
        this.f17752e = i7;
        this.f17753f = kVar;
    }

    static a a(Context context, int i7) throws Resources.NotFoundException {
        x0.g.b(i7 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, C1755k.f13238p3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1755k.f13245q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1755k.f13259s3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1755k.f13252r3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1755k.f13266t3, 0));
        ColorStateList colorStateListA = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13273u3);
        ColorStateList colorStateListA2 = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13310z3);
        ColorStateList colorStateListA3 = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13295x3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13303y3, 0);
        u4.k kVarM = u4.k.b(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13280v3, 0), typedArrayObtainStyledAttributes.getResourceId(C1755k.f13287w3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.f17748a.bottom;
    }

    int c() {
        return this.f17748a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C2937g c2937g = new C2937g();
        C2937g c2937g2 = new C2937g();
        c2937g.setShapeAppearanceModel(this.f17753f);
        c2937g2.setShapeAppearanceModel(this.f17753f);
        if (colorStateList == null) {
            colorStateList = this.f17750c;
        }
        c2937g.a0(colorStateList);
        c2937g.h0(this.f17752e, this.f17751d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f17749b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f17749b.withAlpha(30), c2937g, c2937g2);
        Rect rect = this.f17748a;
        Z.r0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
