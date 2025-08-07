package com.google.android.material.card;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1750f;
import c4.C1754j;
import c4.C1755k;
import d4.C2388a;
import k4.C2517a;
import p4.e;
import q0.C2731a;
import r4.C2754c;
import s4.C2884b;
import u4.C2934d;
import u4.C2935e;
import u4.C2937g;
import u4.j;
import u4.k;

class b {

    private static final Drawable f17508A;

    private static final double f17509z = Math.cos(Math.toRadians(45.0d));

    private final MaterialCardView f17510a;

    private final C2937g f17512c;

    private final C2937g f17513d;

    private int f17514e;

    private int f17515f;

    private int f17516g;

    private int f17517h;

    private Drawable f17518i;

    private Drawable f17519j;

    private ColorStateList f17520k;

    private ColorStateList f17521l;

    private k f17522m;

    private ColorStateList f17523n;

    private Drawable f17524o;

    private LayerDrawable f17525p;

    private C2937g f17526q;

    private C2937g f17527r;

    private boolean f17529t;

    private ValueAnimator f17530u;

    private final TimeInterpolator f17531v;

    private final int f17532w;

    private final int f17533x;

    private final Rect f17511b = new Rect();

    private boolean f17528s = false;

    private float f17534y = 0.0f;

    class a extends InsetDrawable {
        a(Drawable drawable, int i7, int i8, int i9, int i10) {
            super(drawable, i7, i8, i9, i10);
        }

        @Override
        public int getMinimumHeight() {
            return -1;
        }

        @Override
        public int getMinimumWidth() {
            return -1;
        }

        @Override
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f17508A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i7, int i8) {
        this.f17510a = materialCardView;
        C2937g c2937g = new C2937g(materialCardView.getContext(), attributeSet, i7, i8);
        this.f17512c = c2937g;
        c2937g.Q(materialCardView.getContext());
        c2937g.f0(-12303292);
        k.b bVarV = c2937g.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C1755k.f13194j0, i7, C1754j.f12948a);
        int i9 = C1755k.f13202k0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i9, 0.0f));
        }
        this.f17513d = new C2937g();
        Z(bVarV.m());
        this.f17531v = e.g(materialCardView.getContext(), C1746b.f12719O, C2388a.f20312a);
        this.f17532w = e.f(materialCardView.getContext(), C1746b.f12713I, 300);
        this.f17533x = e.f(materialCardView.getContext(), C1746b.f12712H, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f17510a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f17516g & 80) == 80;
    }

    private boolean H() {
        return (this.f17516g & 8388613) == 8388613;
    }

    public void I(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f17519j.setAlpha((int) (255.0f * fFloatValue));
        this.f17534y = fFloatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f17522m.q(), this.f17512c.J()), d(this.f17522m.s(), this.f17512c.K())), Math.max(d(this.f17522m.k(), this.f17512c.t()), d(this.f17522m.i(), this.f17512c.s())));
    }

    private float d(C2934d c2934d, float f7) {
        if (c2934d instanceof j) {
            return (float) ((1.0d - f17509z) * f7);
        }
        if (c2934d instanceof C2935e) {
            return f7 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f17510a.getPreventCornerOverlap() && !g();
    }

    private float e() {
        return this.f17510a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    private boolean e0() {
        return this.f17510a.getPreventCornerOverlap() && g() && this.f17510a.getUseCompatPadding();
    }

    private float f() {
        return (this.f17510a.getMaxCardElevation() * 1.5f) + (e0() ? c() : 0.0f);
    }

    private boolean f0() {
        if (this.f17510a.isClickable()) {
            return true;
        }
        View view = this.f17510a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private boolean g() {
        return this.f17512c.T();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C2937g c2937gJ = j();
        this.f17526q = c2937gJ;
        c2937gJ.a0(this.f17520k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f17526q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!C2884b.f23671a) {
            return h();
        }
        this.f17527r = j();
        return new RippleDrawable(this.f17520k, null, this.f17527r);
    }

    private C2937g j() {
        return new C2937g(this.f17522m);
    }

    private void j0(Drawable drawable) {
        if (this.f17510a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f17510a.getForeground()).setDrawable(drawable);
        } else {
            this.f17510a.setForeground(D(drawable));
        }
    }

    private void l0() {
        Drawable drawable;
        if (C2884b.f23671a && (drawable = this.f17524o) != null) {
            ((RippleDrawable) drawable).setColor(this.f17520k);
            return;
        }
        C2937g c2937g = this.f17526q;
        if (c2937g != null) {
            c2937g.a0(this.f17520k);
        }
    }

    private Drawable t() {
        if (this.f17524o == null) {
            this.f17524o = i();
        }
        if (this.f17525p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f17524o, this.f17513d, this.f17519j});
            this.f17525p = layerDrawable;
            layerDrawable.setId(2, C1750f.f12852B);
        }
        return this.f17525p;
    }

    private float v() {
        if (this.f17510a.getPreventCornerOverlap() && this.f17510a.getUseCompatPadding()) {
            return (float) ((1.0d - f17509z) * this.f17510a.getCardViewRadius());
        }
        return 0.0f;
    }

    ColorStateList A() {
        return this.f17523n;
    }

    int B() {
        return this.f17517h;
    }

    Rect C() {
        return this.f17511b;
    }

    boolean E() {
        return this.f17528s;
    }

    boolean F() {
        return this.f17529t;
    }

    void J(TypedArray typedArray) {
        ColorStateList colorStateListA = C2754c.a(this.f17510a.getContext(), typedArray, C1755k.f13028J3);
        this.f17523n = colorStateListA;
        if (colorStateListA == null) {
            this.f17523n = ColorStateList.valueOf(-1);
        }
        this.f17517h = typedArray.getDimensionPixelSize(C1755k.f13034K3, 0);
        boolean z7 = typedArray.getBoolean(C1755k.f12984B3, false);
        this.f17529t = z7;
        this.f17510a.setLongClickable(z7);
        this.f17521l = C2754c.a(this.f17510a.getContext(), typedArray, C1755k.f13018H3);
        R(C2754c.d(this.f17510a.getContext(), typedArray, C1755k.f12997D3));
        U(typedArray.getDimensionPixelSize(C1755k.f13013G3, 0));
        T(typedArray.getDimensionPixelSize(C1755k.f13008F3, 0));
        this.f17516g = typedArray.getInteger(C1755k.f13003E3, 8388661);
        ColorStateList colorStateListA2 = C2754c.a(this.f17510a.getContext(), typedArray, C1755k.f13023I3);
        this.f17520k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f17520k = ColorStateList.valueOf(C2517a.d(this.f17510a, C1746b.f12743g));
        }
        N(C2754c.a(this.f17510a.getContext(), typedArray, C1755k.f12991C3));
        l0();
        i0();
        m0();
        this.f17510a.setBackgroundInternal(D(this.f17512c));
        Drawable drawableT = f0() ? t() : this.f17513d;
        this.f17518i = drawableT;
        this.f17510a.setForeground(D(drawableT));
    }

    void K(int i7, int i8) {
        int iCeil;
        int iCeil2;
        int i9;
        int i10;
        if (this.f17525p != null) {
            if (this.f17510a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i11 = H() ? ((i7 - this.f17514e) - this.f17515f) - iCeil2 : this.f17514e;
            int i12 = G() ? this.f17514e : ((i8 - this.f17514e) - this.f17515f) - iCeil;
            int i13 = H() ? this.f17514e : ((i7 - this.f17514e) - this.f17515f) - iCeil2;
            int i14 = G() ? ((i8 - this.f17514e) - this.f17515f) - iCeil : this.f17514e;
            if (Z.z(this.f17510a) == 1) {
                i10 = i13;
                i9 = i11;
            } else {
                i9 = i13;
                i10 = i11;
            }
            this.f17525p.setLayerInset(2, i10, i14, i9, i12);
        }
    }

    void L(boolean z7) {
        this.f17528s = z7;
    }

    void M(ColorStateList colorStateList) {
        this.f17512c.a0(colorStateList);
    }

    void N(ColorStateList colorStateList) {
        C2937g c2937g = this.f17513d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c2937g.a0(colorStateList);
    }

    void O(boolean z7) {
        this.f17529t = z7;
    }

    public void P(boolean z7) {
        Q(z7, false);
    }

    public void Q(boolean z7, boolean z8) {
        Drawable drawable = this.f17519j;
        if (drawable != null) {
            if (z8) {
                b(z7);
            } else {
                drawable.setAlpha(z7 ? 255 : 0);
                this.f17534y = z7 ? 1.0f : 0.0f;
            }
        }
    }

    void R(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = C2731a.r(drawable).mutate();
            this.f17519j = drawableMutate;
            C2731a.o(drawableMutate, this.f17521l);
            P(this.f17510a.isChecked());
        } else {
            this.f17519j = f17508A;
        }
        LayerDrawable layerDrawable = this.f17525p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C1750f.f12852B, this.f17519j);
        }
    }

    void S(int i7) {
        this.f17516g = i7;
        K(this.f17510a.getMeasuredWidth(), this.f17510a.getMeasuredHeight());
    }

    void T(int i7) {
        this.f17514e = i7;
    }

    void U(int i7) {
        this.f17515f = i7;
    }

    void V(ColorStateList colorStateList) {
        this.f17521l = colorStateList;
        Drawable drawable = this.f17519j;
        if (drawable != null) {
            C2731a.o(drawable, colorStateList);
        }
    }

    void W(float f7) {
        Z(this.f17522m.w(f7));
        this.f17518i.invalidateSelf();
        if (e0() || d0()) {
            h0();
        }
        if (e0()) {
            k0();
        }
    }

    void X(float f7) {
        this.f17512c.b0(f7);
        C2937g c2937g = this.f17513d;
        if (c2937g != null) {
            c2937g.b0(f7);
        }
        C2937g c2937g2 = this.f17527r;
        if (c2937g2 != null) {
            c2937g2.b0(f7);
        }
    }

    void Y(ColorStateList colorStateList) {
        this.f17520k = colorStateList;
        l0();
    }

    void Z(k kVar) {
        this.f17522m = kVar;
        this.f17512c.setShapeAppearanceModel(kVar);
        this.f17512c.e0(!r0.T());
        C2937g c2937g = this.f17513d;
        if (c2937g != null) {
            c2937g.setShapeAppearanceModel(kVar);
        }
        C2937g c2937g2 = this.f17527r;
        if (c2937g2 != null) {
            c2937g2.setShapeAppearanceModel(kVar);
        }
        C2937g c2937g3 = this.f17526q;
        if (c2937g3 != null) {
            c2937g3.setShapeAppearanceModel(kVar);
        }
    }

    void a0(ColorStateList colorStateList) {
        if (this.f17523n == colorStateList) {
            return;
        }
        this.f17523n = colorStateList;
        m0();
    }

    public void b(boolean z7) {
        float f7 = z7 ? 1.0f : 0.0f;
        float f8 = z7 ? 1.0f - this.f17534y : this.f17534y;
        ValueAnimator valueAnimator = this.f17530u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17530u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17534y, f7);
        this.f17530u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f17507a.I(valueAnimator2);
            }
        });
        this.f17530u.setInterpolator(this.f17531v);
        this.f17530u.setDuration((long) ((z7 ? this.f17532w : this.f17533x) * f8));
        this.f17530u.start();
    }

    void b0(int i7) {
        if (i7 == this.f17517h) {
            return;
        }
        this.f17517h = i7;
        m0();
    }

    void c0(int i7, int i8, int i9, int i10) {
        this.f17511b.set(i7, i8, i9, i10);
        h0();
    }

    void g0() {
        Drawable drawable = this.f17518i;
        Drawable drawableT = f0() ? t() : this.f17513d;
        this.f17518i = drawableT;
        if (drawable != drawableT) {
            j0(drawableT);
        }
    }

    void h0() {
        int iC = (int) (((d0() || e0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f17510a;
        Rect rect = this.f17511b;
        materialCardView.i(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void i0() {
        this.f17512c.Z(this.f17510a.getCardElevation());
    }

    void k() {
        Drawable drawable = this.f17524o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i7 = bounds.bottom;
            this.f17524o.setBounds(bounds.left, bounds.top, bounds.right, i7 - 1);
            this.f17524o.setBounds(bounds.left, bounds.top, bounds.right, i7);
        }
    }

    void k0() {
        if (!E()) {
            this.f17510a.setBackgroundInternal(D(this.f17512c));
        }
        this.f17510a.setForeground(D(this.f17518i));
    }

    C2937g l() {
        return this.f17512c;
    }

    ColorStateList m() {
        return this.f17512c.x();
    }

    void m0() {
        this.f17513d.h0(this.f17517h, this.f17523n);
    }

    ColorStateList n() {
        return this.f17513d.x();
    }

    Drawable o() {
        return this.f17519j;
    }

    int p() {
        return this.f17516g;
    }

    int q() {
        return this.f17514e;
    }

    int r() {
        return this.f17515f;
    }

    ColorStateList s() {
        return this.f17521l;
    }

    float u() {
        return this.f17512c.J();
    }

    float w() {
        return this.f17512c.y();
    }

    ColorStateList x() {
        return this.f17520k;
    }

    k y() {
        return this.f17522m;
    }

    int z() {
        ColorStateList colorStateList = this.f17523n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
