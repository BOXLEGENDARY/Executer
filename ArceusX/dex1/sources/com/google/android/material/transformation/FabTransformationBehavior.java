package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import c4.C1750f;
import com.appsflyer.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.C2388a;
import d4.C2389b;
import d4.C2390c;
import d4.C2391d;
import d4.C2392e;
import d4.C2395h;
import d4.C2396i;
import d4.C2397j;
import i4.d;
import java.util.ArrayList;
import java.util.List;
import o4.C2681a;
import y4.C3027a;
import y4.C3028b;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    private final Rect f18751c;

    private final RectF f18752d;

    private final RectF f18753e;

    private final int[] f18754f;

    private float f18755g;

    private float f18756h;

    class a extends AnimatorListenerAdapter {

        final boolean f18757a;

        final View f18758b;

        final View f18759c;

        a(boolean z7, View view, View view2) {
            this.f18757a = z7;
            this.f18758b = view;
            this.f18759c = view2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f18757a) {
                return;
            }
            this.f18758b.setVisibility(4);
            this.f18759c.setAlpha(1.0f);
            this.f18759c.setVisibility(0);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            if (this.f18757a) {
                this.f18758b.setVisibility(0);
                this.f18759c.setAlpha(0.0f);
                this.f18759c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        final View f18761a;

        b(View view) {
            this.f18761a = view;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18761a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        final i4.d f18763a;

        final Drawable f18764b;

        c(i4.d dVar, Drawable drawable) {
            this.f18763a = dVar;
            this.f18764b = drawable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f18763a.setCircularRevealOverlayDrawable(null);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f18763a.setCircularRevealOverlayDrawable(this.f18764b);
        }
    }

    class d extends AnimatorListenerAdapter {

        final i4.d f18766a;

        d(i4.d dVar) {
            this.f18766a = dVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f18766a.getRevealInfo();
            revealInfo.f21078c = Float.MAX_VALUE;
            this.f18766a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        public C2395h f18768a;

        public C2397j f18769b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f18751c = new Rect();
        this.f18752d = new RectF();
        this.f18753e = new RectF();
        this.f18754f = new int[2];
    }

    private ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(C1750f.f12853C);
        return viewFindViewById != null ? f0(viewFindViewById) : ((view instanceof C3028b) || (view instanceof C3027a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, C2396i c2396i, C2396i c2396i2, float f7, float f8, float f9, float f10, RectF rectF) {
        float fS = S(eVar, c2396i, f7, f9);
        float fS2 = S(eVar, c2396i2, f8, f10);
        Rect rect = this.f18751c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f18752d;
        rectF2.set(rect);
        RectF rectF3 = this.f18753e;
        T(view, rectF3);
        rectF3.offset(fS, fS2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f18755g, this.f18756h);
    }

    private Pair<C2396i, C2396i> N(float f7, float f8, boolean z7, e eVar) {
        C2396i c2396iE;
        C2396i c2396iE2;
        if (f7 == 0.0f || f8 == 0.0f) {
            c2396iE = eVar.f18768a.e("translationXLinear");
            c2396iE2 = eVar.f18768a.e("translationYLinear");
        } else if ((!z7 || f8 >= 0.0f) && (z7 || f8 <= 0.0f)) {
            c2396iE = eVar.f18768a.e("translationXCurveDownwards");
            c2396iE2 = eVar.f18768a.e("translationYCurveDownwards");
        } else {
            c2396iE = eVar.f18768a.e("translationXCurveUpwards");
            c2396iE2 = eVar.f18768a.e("translationYCurveUpwards");
        }
        return new Pair<>(c2396iE, c2396iE2);
    }

    private float O(View view, View view2, C2397j c2397j) {
        RectF rectF = this.f18752d;
        RectF rectF2 = this.f18753e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, c2397j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, C2397j c2397j) {
        RectF rectF = this.f18752d;
        RectF rectF2 = this.f18753e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, c2397j));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, C2397j c2397j) {
        float fCenterX;
        float fCenterX2;
        float f7;
        RectF rectF = this.f18752d;
        RectF rectF2 = this.f18753e;
        M(view, rectF);
        T(view2, rectF2);
        int i7 = c2397j.f20332a & 7;
        if (i7 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i7 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i7 != 5) {
                f7 = 0.0f;
                return f7 + c2397j.f20333b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f7 = fCenterX - fCenterX2;
        return f7 + c2397j.f20333b;
    }

    private float R(View view, View view2, C2397j c2397j) {
        float fCenterY;
        float fCenterY2;
        float f7;
        RectF rectF = this.f18752d;
        RectF rectF2 = this.f18753e;
        M(view, rectF);
        T(view2, rectF2);
        int i7 = c2397j.f20332a & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i7 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i7 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i7 != 80) {
                f7 = 0.0f;
                return f7 + c2397j.f20334c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f7 = fCenterY - fCenterY2;
        return f7 + c2397j.f20334c;
    }

    private float S(e eVar, C2396i c2396i, float f7, float f8) {
        long jC = c2396i.c();
        long jD = c2396i.d();
        C2396i c2396iE = eVar.f18768a.e("expansion");
        return C2388a.a(f7, f8, c2396i.e().getInterpolation((((c2396iE.c() + c2396iE.d()) + 17) - jC) / jD));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f18754f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z7, boolean z8, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof i4.d) && i4.c.f21071a == 0) || (viewGroupK = K(view2)) == null) {
                return;
            }
            if (z7) {
                if (!z8) {
                    C2391d.f20318a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, C2391d.f20318a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, C2391d.f20318a, 0.0f);
            }
            eVar.f18768a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private void V(View view, View view2, boolean z7, boolean z8, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof i4.d) {
            i4.d dVar = (i4.d) view2;
            int iD0 = d0(view);
            int i7 = 16777215 & iD0;
            if (z7) {
                if (!z8) {
                    dVar.setCircularRevealScrimColor(iD0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0196d.f21075a, i7);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0196d.f21075a, iD0);
            }
            objectAnimatorOfInt.setEvaluator(C2390c.b());
            eVar.f18768a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void W(View view, View view2, boolean z7, e eVar, List<Animator> list) {
        float fQ = Q(view, view2, eVar.f18769b);
        float fR = R(view, view2, eVar.f18769b);
        Pair<C2396i, C2396i> pairN = N(fQ, fR, z7, eVar);
        C2396i c2396i = (C2396i) pairN.first;
        C2396i c2396i2 = (C2396i) pairN.second;
        Property property = View.TRANSLATION_X;
        if (!z7) {
            fQ = this.f18755g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fQ);
        Property property2 = View.TRANSLATION_Y;
        if (!z7) {
            fR = this.f18756h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fR);
        c2396i.a(objectAnimatorOfFloat);
        c2396i2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void X(View view, View view2, boolean z7, boolean z8, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fU = Z.u(view2) - Z.u(view);
        if (z7) {
            if (!z8) {
                view2.setTranslationZ(-fU);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fU);
        }
        eVar.f18768a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void Y(View view, View view2, boolean z7, boolean z8, e eVar, float f7, float f8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof i4.d) {
            i4.d dVar = (i4.d) view2;
            float fO = O(view, view2, eVar.f18769b);
            float fP = P(view, view2, eVar.f18769b);
            ((FloatingActionButton) view).i(this.f18751c);
            float fWidth = this.f18751c.width() / 2.0f;
            C2396i c2396iE = eVar.f18768a.e("expansion");
            if (z7) {
                if (!z8) {
                    dVar.setRevealInfo(new d.e(fO, fP, fWidth));
                }
                if (z8) {
                    fWidth = dVar.getRevealInfo().f21078c;
                }
                animatorA = i4.a.a(dVar, fO, fP, C2681a.b(fO, fP, 0.0f, 0.0f, f7, f8));
                animatorA.addListener(new d(dVar));
                b0(view2, c2396iE.c(), (int) fO, (int) fP, fWidth, list);
            } else {
                float f9 = dVar.getRevealInfo().f21078c;
                Animator animatorA2 = i4.a.a(dVar, fO, fP, fWidth);
                int i7 = (int) fO;
                int i8 = (int) fP;
                b0(view2, c2396iE.c(), i7, i8, f9, list);
                a0(view2, c2396iE.c(), c2396iE.d(), eVar.f18768a.f(), i7, i8, fWidth, list);
                animatorA = animatorA2;
            }
            c2396iE.a(animatorA);
            list.add(animatorA);
            list2.add(i4.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z7, boolean z8, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof i4.d) && (view instanceof ImageView)) {
            i4.d dVar = (i4.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z7) {
                if (!z8) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C2392e.f20319b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C2392e.f20319b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f18768a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void a0(View view, long j7, long j8, long j9, int i7, int i8, float f7, List<Animator> list) {
        long j10 = j7 + j8;
        if (j10 < j9) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i7, i8, f7, f7);
            animatorCreateCircularReveal.setStartDelay(j10);
            animatorCreateCircularReveal.setDuration(j9 - j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void b0(View view, long j7, int i7, int i8, float f7, List<Animator> list) {
        if (j7 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i7, i8, f7, f7);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j7);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z7, boolean z8, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fQ = Q(view, view2, eVar.f18769b);
        float fR = R(view, view2, eVar.f18769b);
        Pair<C2396i, C2396i> pairN = N(fQ, fR, z7, eVar);
        C2396i c2396i = (C2396i) pairN.first;
        C2396i c2396i2 = (C2396i) pairN.second;
        if (z7) {
            if (!z8) {
                view2.setTranslationX(-fQ);
                view2.setTranslationY(-fR);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, c2396i, c2396i2, -fQ, -fR, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fQ);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fR);
        }
        c2396i.a(objectAnimatorOfFloat);
        c2396i2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int d0(View view) {
        ColorStateList colorStateListR = Z.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override
    protected AnimatorSet J(View view, View view2, boolean z7, boolean z8) {
        e eVarE0 = e0(view2.getContext(), z7);
        if (z7) {
            this.f18755g = view.getTranslationX();
            this.f18756h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        X(view, view2, z7, z8, eVarE0, arrayList, arrayList2);
        RectF rectF = this.f18752d;
        c0(view, view2, z7, z8, eVarE0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        W(view, view2, z7, eVarE0, arrayList);
        Z(view, view2, z7, z8, eVarE0, arrayList, arrayList2);
        Y(view, view2, z7, z8, eVarE0, fWidth, fHeight, arrayList, arrayList2);
        V(view, view2, z7, z8, eVarE0, arrayList, arrayList2);
        U(view, view2, z7, z8, eVarE0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C2389b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z7, view2, view));
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            animatorSet.addListener(arrayList2.get(i7));
        }
        return animatorSet;
    }

    @Override
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e e0(Context context, boolean z7);

    @Override
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f10337h == 0) {
            fVar.f10337h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18751c = new Rect();
        this.f18752d = new RectF();
        this.f18753e = new RectF();
        this.f18754f = new int[2];
    }
}
