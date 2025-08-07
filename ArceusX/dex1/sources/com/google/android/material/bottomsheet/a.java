package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.C1630m0;
import androidx.core.view.WindowInsetsCompat;
import d4.C2388a;
import java.util.Iterator;
import java.util.List;

class a extends C1630m0.b {

    private final View f17436c;

    private int f17437d;

    private int f17438e;

    private final int[] f17439f;

    public a(View view) {
        super(0);
        this.f17439f = new int[2];
        this.f17436c = view;
    }

    @Override
    public void b(C1630m0 c1630m0) {
        this.f17436c.setTranslationY(0.0f);
    }

    @Override
    public void c(C1630m0 c1630m0) {
        this.f17436c.getLocationOnScreen(this.f17439f);
        this.f17437d = this.f17439f[1];
    }

    @Override
    public WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<C1630m0> list) {
        Iterator<C1630m0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f17436c.setTranslationY(C2388a.c(this.f17438e, 0, r0.b()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override
    public C1630m0.a e(C1630m0 c1630m0, C1630m0.a aVar) {
        this.f17436c.getLocationOnScreen(this.f17439f);
        int i7 = this.f17437d - this.f17439f[1];
        this.f17438e = i7;
        this.f17436c.setTranslationY(i7);
        return aVar;
    }
}
