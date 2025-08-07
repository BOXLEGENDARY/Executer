package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Z;
import c4.C1750f;
import c4.C1752h;
import c4.C1755k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u4.C2937g;
import u4.i;

class d extends ConstraintLayout {

    private final Runnable f18740d;

    private int f18741e;

    private C2937g f18742i;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(List<View> list, androidx.constraintlayout.widget.d dVar, int i7) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            dVar.j(it.next().getId(), C1750f.f12873c, i7, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable c() {
        C2937g c2937g = new C2937g();
        this.f18742i = c2937g;
        c2937g.Y(new i(0.5f));
        this.f18742i.a0(ColorStateList.valueOf(-1));
        return this.f18742i;
    }

    private static boolean g(View view) {
        return "skip".equals(view.getTag());
    }

    private void i() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f18740d);
            handler.post(this.f18740d);
        }
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(Z.k());
        }
        i();
    }

    int d(int i7) {
        return i7 == 2 ? Math.round(this.f18741e * 0.66f) : this.f18741e;
    }

    public int e() {
        return this.f18741e;
    }

    public void f(int i7) {
        this.f18741e = i7;
        h();
    }

    protected void h() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != C1750f.f12873c && !g(childAt)) {
                int i8 = (Integer) childAt.getTag(C1750f.f12881k);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!map.containsKey(i8)) {
                    map.put(i8, new ArrayList());
                }
                ((List) map.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            b((List) entry.getValue(), dVar, d(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        i();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f18742i.a0(ColorStateList.valueOf(i7));
    }

    public d(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(C1752h.f12907h, this);
        Z.r0(this, c());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13110X4, i7, 0);
        this.f18741e = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.f13116Y4, 0);
        this.f18740d = new Runnable() {
            @Override
            public final void run() {
                this.f18739d.h();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
