package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c4.C1746b;
import c4.C1755k;
import r4.C2753b;
import r4.C2754c;

final class b {

    final a f17754a;

    final a f17755b;

    final a f17756c;

    final a f17757d;

    final a f17758e;

    final a f17759f;

    final a f17760g;

    final Paint f17761h;

    b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C2753b.d(context, C1746b.f12761x, e.class.getCanonicalName()), C1755k.f13165f3);
        this.f17754a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13197j3, 0));
        this.f17760g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13181h3, 0));
        this.f17755b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13189i3, 0));
        this.f17756c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13204k3, 0));
        ColorStateList colorStateListA = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13211l3);
        this.f17757d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13225n3, 0));
        this.f17758e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13218m3, 0));
        this.f17759f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(C1755k.f13231o3, 0));
        Paint paint = new Paint();
        this.f17761h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
