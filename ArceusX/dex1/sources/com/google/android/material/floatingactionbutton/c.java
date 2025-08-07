package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import c4.C1747c;
import java.util.ArrayList;
import s4.C2884b;
import u4.C2937g;
import u4.k;
import x0.g;

class c extends b {

    private StateListAnimator f18008O;

    static class a extends C2937g {
        a(k kVar) {
            super(kVar);
        }

        @Override
        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, t4.b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator j0(float f7, float f8, float f9) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.f17945I, k0(f7, f9));
        stateListAnimator.addState(b.f17946J, k0(f7, f8));
        stateListAnimator.addState(b.f17947K, k0(f7, f8));
        stateListAnimator.addState(b.f17948L, k0(f7, f8));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f17976w, "elevation", f7).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f17976w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.f17940D);
        stateListAnimator.addState(b.f17949M, animatorSet);
        stateListAnimator.addState(b.f17950N, k0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator k0(float f7, float f8) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f17976w, "elevation", f7).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f17976w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f8).setDuration(100L));
        animatorSet.setInterpolator(b.f17940D);
        return animatorSet;
    }

    @Override
    void A() {
    }

    @Override
    void C() {
        f0();
    }

    @Override
    void E(int[] iArr) {
    }

    @Override
    void F(float f7, float f8, float f9) {
        if (this.f17976w.getStateListAnimator() == this.f18008O) {
            StateListAnimator stateListAnimatorJ0 = j0(f7, f8, f9);
            this.f18008O = stateListAnimatorJ0;
            this.f17976w.setStateListAnimator(stateListAnimatorJ0);
        }
        if (Z()) {
            f0();
        }
    }

    @Override
    boolean K() {
        return false;
    }

    @Override
    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f17956c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C2884b.a(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override
    boolean Z() {
        return this.f17977x.b() || !b0();
    }

    @Override
    void d0() {
    }

    com.google.android.material.floatingactionbutton.a i0(int i7, ColorStateList colorStateList) {
        Context context = this.f17976w.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((k) g.g(this.f17954a));
        aVar.e(androidx.core.content.a.c(context, C1747c.f12768e), androidx.core.content.a.c(context, C1747c.f12767d), androidx.core.content.a.c(context, C1747c.f12765b), androidx.core.content.a.c(context, C1747c.f12766c));
        aVar.d(i7);
        aVar.c(colorStateList);
        return aVar;
    }

    C2937g l0() {
        return new a((k) g.g(this.f17954a));
    }

    @Override
    public float m() {
        return this.f17976w.getElevation();
    }

    @Override
    void r(Rect rect) {
        if (this.f17977x.b()) {
            super.r(rect);
        } else if (b0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f17964k - this.f17976w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override
    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i7) {
        Drawable layerDrawable;
        C2937g c2937gL0 = l0();
        this.f17955b = c2937gL0;
        c2937gL0.setTintList(colorStateList);
        if (mode != null) {
            this.f17955b.setTintMode(mode);
        }
        this.f17955b.Q(this.f17976w.getContext());
        if (i7 > 0) {
            this.f17957d = i0(i7, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) g.g(this.f17957d), (Drawable) g.g(this.f17955b)});
        } else {
            this.f17957d = null;
            layerDrawable = this.f17955b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C2884b.a(colorStateList2), layerDrawable, null);
        this.f17956c = rippleDrawable;
        this.f17958e = rippleDrawable;
    }
}
