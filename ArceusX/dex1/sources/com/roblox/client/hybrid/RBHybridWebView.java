package com.roblox.client.hybrid;

import V5.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import j6.d;
import q7.c;
import t6.C2913a;
import t6.C2914b;
import t6.C2916d;
import t6.C2917e;
import t6.C2919g;
import t6.h;
import t6.l;
import t6.m;
import t6.o;

public class RBHybridWebView extends c {

    protected j f20079i;

    public RBHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void c(Context context) {
        super.c(context);
        j jVar = new j();
        this.f20079i = jVar;
        jVar.a(d.a().O1());
    }

    protected void f(Context context) {
        e(new o());
        e(new C2916d());
        e(new C2913a());
        e(new C2917e());
        e(new C2914b());
        e(new m());
        e(new l(context));
        e(new h());
        e(new t6.j());
        e(new C2919g());
    }

    public void g() {
    }

    public void h() {
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f20079i.b(motionEvent) && super/*android.view.View*/.onFilterTouchEventForSecurity(motionEvent);
    }

    public RBHybridWebView(Context context) {
        super(context);
    }
}
