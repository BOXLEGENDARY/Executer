package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1751g;
import d4.C2388a;
import d4.C2389b;
import d4.C2393f;
import d4.C2394g;
import d4.C2395h;
import java.util.ArrayList;
import java.util.Iterator;
import q0.C2731a;
import s4.C2884b;
import u4.C2937g;
import u4.n;

class b {

    static final TimeInterpolator f17940D = C2388a.f20314c;

    private static final int f17941E = C1746b.f12708D;

    private static final int f17942F = C1746b.f12718N;

    private static final int f17943G = C1746b.f12709E;

    private static final int f17944H = C1746b.f12716L;

    static final int[] f17945I = {R.attr.state_pressed, R.attr.state_enabled};

    static final int[] f17946J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    static final int[] f17947K = {R.attr.state_focused, R.attr.state_enabled};

    static final int[] f17948L = {R.attr.state_hovered, R.attr.state_enabled};

    static final int[] f17949M = {R.attr.state_enabled};

    static final int[] f17950N = new int[0];

    private ViewTreeObserver.OnPreDrawListener f17953C;

    u4.k f17954a;

    C2937g f17955b;

    Drawable f17956c;

    com.google.android.material.floatingactionbutton.a f17957d;

    Drawable f17958e;

    boolean f17959f;

    float f17961h;

    float f17962i;

    float f17963j;

    int f17964k;

    private final com.google.android.material.internal.k f17965l;

    private Animator f17966m;

    private C2395h f17967n;

    private C2395h f17968o;

    private float f17969p;

    private int f17971r;

    private ArrayList<Animator.AnimatorListener> f17973t;

    private ArrayList<Animator.AnimatorListener> f17974u;

    private ArrayList<j> f17975v;

    final FloatingActionButton f17976w;

    final t4.b f17977x;

    boolean f17960g = true;

    private float f17970q = 1.0f;

    private int f17972s = 0;

    private final Rect f17978y = new Rect();

    private final RectF f17979z = new RectF();

    private final RectF f17951A = new RectF();

    private final Matrix f17952B = new Matrix();

    class a extends AnimatorListenerAdapter {

        private boolean f17980a;

        final boolean f17981b;

        final k f17982c;

        a(boolean z7, k kVar) {
            this.f17981b = z7;
            this.f17982c = kVar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f17980a = true;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            b.this.f17972s = 0;
            b.this.f17966m = null;
            if (this.f17980a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.f17976w;
            boolean z7 = this.f17981b;
            floatingActionButton.b(z7 ? 8 : 4, z7);
            k kVar = this.f17982c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            b.this.f17976w.b(0, this.f17981b);
            b.this.f17972s = 1;
            b.this.f17966m = animator;
            this.f17980a = false;
        }
    }

    class C0159b extends AnimatorListenerAdapter {

        final boolean f17984a;

        final k f17985b;

        C0159b(boolean z7, k kVar) {
            this.f17984a = z7;
            this.f17985b = kVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            b.this.f17972s = 0;
            b.this.f17966m = null;
            k kVar = this.f17985b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            b.this.f17976w.b(0, this.f17984a);
            b.this.f17972s = 2;
            b.this.f17966m = animator;
        }
    }

    class c extends C2394g {
        c() {
        }

        @Override
        public Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            b.this.f17970q = f7;
            return super.evaluate(f7, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        final float f17988a;

        final float f17989b;

        final float f17990c;

        final float f17991d;

        final float f17992e;

        final float f17993f;

        final float f17994g;

        final Matrix f17995h;

        d(float f7, float f8, float f9, float f10, float f11, float f12, float f13, Matrix matrix) {
            this.f17988a = f7;
            this.f17989b = f8;
            this.f17990c = f9;
            this.f17991d = f10;
            this.f17992e = f11;
            this.f17993f = f12;
            this.f17994g = f13;
            this.f17995h = matrix;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f17976w.setAlpha(C2388a.b(this.f17988a, this.f17989b, 0.0f, 0.2f, fFloatValue));
            b.this.f17976w.setScaleX(C2388a.a(this.f17990c, this.f17991d, fFloatValue));
            b.this.f17976w.setScaleY(C2388a.a(this.f17992e, this.f17991d, fFloatValue));
            b.this.f17970q = C2388a.a(this.f17993f, this.f17994g, fFloatValue);
            b.this.h(C2388a.a(this.f17993f, this.f17994g, fFloatValue), this.f17995h);
            b.this.f17976w.setImageMatrix(this.f17995h);
        }
    }

    class e implements TypeEvaluator<Float> {

        FloatEvaluator f17997a = new FloatEvaluator();

        e() {
        }

        @Override
        public Float evaluate(float f7, Float f8, Float f9) {
            float fFloatValue = this.f17997a.evaluate(f7, (Number) f8, (Number) f9).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override
        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(b.this, null);
        }

        @Override
        protected float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(b.this, null);
        }

        @Override
        protected float a() {
            b bVar = b.this;
            return bVar.f17961h + bVar.f17962i;
        }
    }

    private class i extends m {
        i() {
            super(b.this, null);
        }

        @Override
        protected float a() {
            b bVar = b.this;
            return bVar.f17961h + bVar.f17963j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(b.this, null);
        }

        @Override
        protected float a() {
            return b.this.f17961h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        private boolean f18004a;

        private float f18005b;

        private float f18006c;

        private m() {
        }

        protected abstract float a();

        @Override
        public void onAnimationEnd(Animator animator) {
            b.this.g0((int) this.f18006c);
            this.f18004a = false;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f18004a) {
                C2937g c2937g = b.this.f17955b;
                this.f18005b = c2937g == null ? 0.0f : c2937g.w();
                this.f18006c = a();
                this.f18004a = true;
            }
            b bVar = b.this;
            float f7 = this.f18005b;
            bVar.g0((int) (f7 + ((this.f18006c - f7) * valueAnimator.getAnimatedFraction())));
        }

        m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, t4.b bVar) {
        this.f17976w = floatingActionButton;
        this.f17977x = bVar;
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k();
        this.f17965l = kVar;
        kVar.a(f17945I, k(new i()));
        kVar.a(f17946J, k(new h()));
        kVar.a(f17947K, k(new h()));
        kVar.a(f17948L, k(new h()));
        kVar.a(f17949M, k(new l()));
        kVar.a(f17950N, k(new g()));
        this.f17969p = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return Z.R(this.f17976w) && !this.f17976w.isInEditMode();
    }

    public void h(float f7, Matrix matrix) {
        matrix.reset();
        if (this.f17976w.getDrawable() == null || this.f17971r == 0) {
            return;
        }
        RectF rectF = this.f17979z;
        RectF rectF2 = this.f17951A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i7 = this.f17971r;
        rectF2.set(0.0f, 0.0f, i7, i7);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i8 = this.f17971r;
        matrix.postScale(f7, f7, i8 / 2.0f, i8 / 2.0f);
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    private AnimatorSet i(C2395h c2395h, float f7, float f8, float f9) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17976w, (Property<FloatingActionButton, Float>) View.ALPHA, f7);
        c2395h.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f17976w, (Property<FloatingActionButton, Float>) View.SCALE_X, f8);
        c2395h.e("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f17976w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f8);
        c2395h.e("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f9, this.f17952B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f17976w, new C2393f(), new c(), new Matrix(this.f17952B));
        c2395h.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2389b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f7, float f8, float f9, int i7, int i8) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(this.f17976w.getAlpha(), f7, this.f17976w.getScaleX(), f8, this.f17976w.getScaleY(), this.f17970q, f9, new Matrix(this.f17952B)));
        arrayList.add(valueAnimatorOfFloat);
        C2389b.a(animatorSet, arrayList);
        animatorSet.setDuration(p4.e.f(this.f17976w.getContext(), i7, this.f17976w.getContext().getResources().getInteger(C1751g.f12898b)));
        animatorSet.setInterpolator(p4.e.g(this.f17976w.getContext(), i8, C2388a.f20313b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f17940D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.f17953C == null) {
            this.f17953C = new f();
        }
        return this.f17953C;
    }

    void A() {
        throw null;
    }

    void B() {
        C2937g c2937g = this.f17955b;
        if (c2937g != null) {
            u4.h.f(this.f17976w, c2937g);
        }
        if (K()) {
            this.f17976w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    void C() {
        throw null;
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f17976w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f17953C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f17953C = null;
        }
    }

    void E(int[] iArr) {
        throw null;
    }

    void F(float f7, float f8, float f9) {
        throw null;
    }

    void G(Rect rect) {
        x0.g.h(this.f17958e, "Didn't initialize content background");
        if (!Z()) {
            this.f17977x.setBackgroundDrawable(this.f17958e);
        } else {
            this.f17977x.setBackgroundDrawable(new InsetDrawable(this.f17958e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f17976w.getRotation();
        if (this.f17969p != rotation) {
            this.f17969p = rotation;
            d0();
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f17975v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void J() {
        ArrayList<j> arrayList = this.f17975v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean K() {
        throw null;
    }

    void L(ColorStateList colorStateList) {
        C2937g c2937g = this.f17955b;
        if (c2937g != null) {
            c2937g.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f17957d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    void M(PorterDuff.Mode mode) {
        C2937g c2937g = this.f17955b;
        if (c2937g != null) {
            c2937g.setTintMode(mode);
        }
    }

    final void N(float f7) {
        if (this.f17961h != f7) {
            this.f17961h = f7;
            F(f7, this.f17962i, this.f17963j);
        }
    }

    void O(boolean z7) {
        this.f17959f = z7;
    }

    final void P(C2395h c2395h) {
        this.f17968o = c2395h;
    }

    final void Q(float f7) {
        if (this.f17962i != f7) {
            this.f17962i = f7;
            F(this.f17961h, f7, this.f17963j);
        }
    }

    final void R(float f7) {
        this.f17970q = f7;
        Matrix matrix = this.f17952B;
        h(f7, matrix);
        this.f17976w.setImageMatrix(matrix);
    }

    final void S(int i7) {
        if (this.f17971r != i7) {
            this.f17971r = i7;
            e0();
        }
    }

    void T(int i7) {
        this.f17964k = i7;
    }

    final void U(float f7) {
        if (this.f17963j != f7) {
            this.f17963j = f7;
            F(this.f17961h, this.f17962i, f7);
        }
    }

    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f17956c;
        if (drawable != null) {
            C2731a.o(drawable, C2884b.a(colorStateList));
        }
    }

    void W(boolean z7) {
        this.f17960g = z7;
        f0();
    }

    final void X(u4.k kVar) {
        this.f17954a = kVar;
        C2937g c2937g = this.f17955b;
        if (c2937g != null) {
            c2937g.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f17956c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f17957d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    final void Y(C2395h c2395h) {
        this.f17967n = c2395h;
    }

    boolean Z() {
        throw null;
    }

    final boolean b0() {
        return !this.f17959f || this.f17976w.getSizeDimension() >= this.f17964k;
    }

    void c0(k kVar, boolean z7) {
        if (z()) {
            return;
        }
        Animator animator = this.f17966m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z8 = this.f17967n == null;
        if (!a0()) {
            this.f17976w.b(0, z7);
            this.f17976w.setAlpha(1.0f);
            this.f17976w.setScaleY(1.0f);
            this.f17976w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f17976w.getVisibility() != 0) {
            this.f17976w.setAlpha(0.0f);
            this.f17976w.setScaleY(z8 ? 0.4f : 0.0f);
            this.f17976w.setScaleX(z8 ? 0.4f : 0.0f);
            R(z8 ? 0.4f : 0.0f);
        }
        C2395h c2395h = this.f17967n;
        AnimatorSet animatorSetI = c2395h != null ? i(c2395h, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f, f17941E, f17942F);
        animatorSetI.addListener(new C0159b(z7, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f17973t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void d0() {
        throw null;
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f17974u == null) {
            this.f17974u = new ArrayList<>();
        }
        this.f17974u.add(animatorListener);
    }

    final void e0() {
        R(this.f17970q);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f17973t == null) {
            this.f17973t = new ArrayList<>();
        }
        this.f17973t.add(animatorListener);
    }

    final void f0() {
        Rect rect = this.f17978y;
        r(rect);
        G(rect);
        this.f17977x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void g(j jVar) {
        if (this.f17975v == null) {
            this.f17975v = new ArrayList<>();
        }
        this.f17975v.add(jVar);
    }

    void g0(float f7) {
        C2937g c2937g = this.f17955b;
        if (c2937g != null) {
            c2937g.Z(f7);
        }
    }

    final Drawable l() {
        return this.f17958e;
    }

    float m() {
        throw null;
    }

    boolean n() {
        return this.f17959f;
    }

    final C2395h o() {
        return this.f17968o;
    }

    float p() {
        return this.f17962i;
    }

    void r(Rect rect) {
        int iV = v();
        int iMax = Math.max(iV, (int) Math.ceil(this.f17960g ? m() + this.f17963j : 0.0f));
        int iMax2 = Math.max(iV, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float s() {
        return this.f17963j;
    }

    final u4.k t() {
        return this.f17954a;
    }

    final C2395h u() {
        return this.f17967n;
    }

    int v() {
        if (this.f17959f) {
            return Math.max((this.f17964k - this.f17976w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(k kVar, boolean z7) {
        if (y()) {
            return;
        }
        Animator animator = this.f17966m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f17976w.b(z7 ? 8 : 4, z7);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        C2395h c2395h = this.f17968o;
        AnimatorSet animatorSetI = c2395h != null ? i(c2395h, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f, f17943G, f17944H);
        animatorSetI.addListener(new a(z7, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f17974u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i7) {
        throw null;
    }

    boolean y() {
        return this.f17976w.getVisibility() == 0 ? this.f17972s == 1 : this.f17972s != 2;
    }

    boolean z() {
        return this.f17976w.getVisibility() != 0 ? this.f17972s == 2 : this.f17972s != 1;
    }
}
