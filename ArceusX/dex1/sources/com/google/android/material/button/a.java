package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1755k;
import com.google.android.material.internal.s;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import s4.C2883a;
import s4.C2884b;
import u4.C2937g;
import u4.k;
import u4.n;

class a {

    private static final boolean f17477u = true;

    private static final boolean f17478v = false;

    private final MaterialButton f17479a;

    private k f17480b;

    private int f17481c;

    private int f17482d;

    private int f17483e;

    private int f17484f;

    private int f17485g;

    private int f17486h;

    private PorterDuff.Mode f17487i;

    private ColorStateList f17488j;

    private ColorStateList f17489k;

    private ColorStateList f17490l;

    private Drawable f17491m;

    private boolean f17495q;

    private LayerDrawable f17497s;

    private int f17498t;

    private boolean f17492n = false;

    private boolean f17493o = false;

    private boolean f17494p = false;

    private boolean f17496r = true;

    a(MaterialButton materialButton, k kVar) {
        this.f17479a = materialButton;
        this.f17480b = kVar;
    }

    private void G(int i7, int i8) {
        int iE = Z.E(this.f17479a);
        int paddingTop = this.f17479a.getPaddingTop();
        int iD = Z.D(this.f17479a);
        int paddingBottom = this.f17479a.getPaddingBottom();
        int i9 = this.f17483e;
        int i10 = this.f17484f;
        this.f17484f = i8;
        this.f17483e = i7;
        if (!this.f17493o) {
            H();
        }
        Z.C0(this.f17479a, iE, (paddingTop + i7) - i9, iD, (paddingBottom + i8) - i10);
    }

    private void H() {
        this.f17479a.setInternalBackground(a());
        C2937g c2937gF = f();
        if (c2937gF != null) {
            c2937gF.Z(this.f17498t);
            c2937gF.setState(this.f17479a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (f17478v && !this.f17493o) {
            int iE = Z.E(this.f17479a);
            int paddingTop = this.f17479a.getPaddingTop();
            int iD = Z.D(this.f17479a);
            int paddingBottom = this.f17479a.getPaddingBottom();
            H();
            Z.C0(this.f17479a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        C2937g c2937gF = f();
        C2937g c2937gN = n();
        if (c2937gF != null) {
            c2937gF.h0(this.f17486h, this.f17489k);
            if (c2937gN != null) {
                c2937gN.g0(this.f17486h, this.f17492n ? C2517a.d(this.f17479a, C1746b.f12751n) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f17481c, this.f17483e, this.f17482d, this.f17484f);
    }

    private Drawable a() {
        C2937g c2937g = new C2937g(this.f17480b);
        c2937g.Q(this.f17479a.getContext());
        C2731a.o(c2937g, this.f17488j);
        PorterDuff.Mode mode = this.f17487i;
        if (mode != null) {
            C2731a.p(c2937g, mode);
        }
        c2937g.h0(this.f17486h, this.f17489k);
        C2937g c2937g2 = new C2937g(this.f17480b);
        c2937g2.setTint(0);
        c2937g2.g0(this.f17486h, this.f17492n ? C2517a.d(this.f17479a, C1746b.f12751n) : 0);
        if (f17477u) {
            C2937g c2937g3 = new C2937g(this.f17480b);
            this.f17491m = c2937g3;
            C2731a.n(c2937g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C2884b.a(this.f17490l), K(new LayerDrawable(new Drawable[]{c2937g2, c2937g})), this.f17491m);
            this.f17497s = rippleDrawable;
            return rippleDrawable;
        }
        C2883a c2883a = new C2883a(this.f17480b);
        this.f17491m = c2883a;
        C2731a.o(c2883a, C2884b.a(this.f17490l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2937g2, c2937g, this.f17491m});
        this.f17497s = layerDrawable;
        return K(layerDrawable);
    }

    private C2937g g(boolean z7) {
        LayerDrawable layerDrawable = this.f17497s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f17477u ? (C2937g) ((LayerDrawable) ((InsetDrawable) this.f17497s.getDrawable(0)).getDrawable()).getDrawable(!z7 ? 1 : 0) : (C2937g) this.f17497s.getDrawable(!z7 ? 1 : 0);
    }

    private C2937g n() {
        return g(true);
    }

    void A(boolean z7) {
        this.f17492n = z7;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f17489k != colorStateList) {
            this.f17489k = colorStateList;
            J();
        }
    }

    void C(int i7) {
        if (this.f17486h != i7) {
            this.f17486h = i7;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f17488j != colorStateList) {
            this.f17488j = colorStateList;
            if (f() != null) {
                C2731a.o(f(), this.f17488j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f17487i != mode) {
            this.f17487i = mode;
            if (f() == null || this.f17487i == null) {
                return;
            }
            C2731a.p(f(), this.f17487i);
        }
    }

    void F(boolean z7) {
        this.f17496r = z7;
    }

    int b() {
        return this.f17485g;
    }

    public int c() {
        return this.f17484f;
    }

    public int d() {
        return this.f17483e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f17497s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f17497s.getNumberOfLayers() > 2 ? (n) this.f17497s.getDrawable(2) : (n) this.f17497s.getDrawable(1);
    }

    C2937g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f17490l;
    }

    k i() {
        return this.f17480b;
    }

    ColorStateList j() {
        return this.f17489k;
    }

    int k() {
        return this.f17486h;
    }

    ColorStateList l() {
        return this.f17488j;
    }

    PorterDuff.Mode m() {
        return this.f17487i;
    }

    boolean o() {
        return this.f17493o;
    }

    boolean p() {
        return this.f17495q;
    }

    boolean q() {
        return this.f17496r;
    }

    void r(TypedArray typedArray) {
        this.f17481c = typedArray.getDimensionPixelOffset(C1755k.H2, 0);
        this.f17482d = typedArray.getDimensionPixelOffset(C1755k.I2, 0);
        this.f17483e = typedArray.getDimensionPixelOffset(C1755k.f13027J2, 0);
        this.f17484f = typedArray.getDimensionPixelOffset(C1755k.K2, 0);
        int i7 = C1755k.O2;
        if (typedArray.hasValue(i7)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i7, -1);
            this.f17485g = dimensionPixelSize;
            z(this.f17480b.w(dimensionPixelSize));
            this.f17494p = true;
        }
        this.f17486h = typedArray.getDimensionPixelSize(C1755k.Y2, 0);
        this.f17487i = s.j(typedArray.getInt(C1755k.N2, -1), PorterDuff.Mode.SRC_IN);
        this.f17488j = C2754c.a(this.f17479a.getContext(), typedArray, C1755k.M2);
        this.f17489k = C2754c.a(this.f17479a.getContext(), typedArray, C1755k.X2);
        this.f17490l = C2754c.a(this.f17479a.getContext(), typedArray, C1755k.W2);
        this.f17495q = typedArray.getBoolean(C1755k.L2, false);
        this.f17498t = typedArray.getDimensionPixelSize(C1755k.P2, 0);
        this.f17496r = typedArray.getBoolean(C1755k.Z2, true);
        int iE = Z.E(this.f17479a);
        int paddingTop = this.f17479a.getPaddingTop();
        int iD = Z.D(this.f17479a);
        int paddingBottom = this.f17479a.getPaddingBottom();
        if (typedArray.hasValue(C1755k.G2)) {
            t();
        } else {
            H();
        }
        Z.C0(this.f17479a, iE + this.f17481c, paddingTop + this.f17483e, iD + this.f17482d, paddingBottom + this.f17484f);
    }

    void s(int i7) {
        if (f() != null) {
            f().setTint(i7);
        }
    }

    void t() {
        this.f17493o = true;
        this.f17479a.setSupportBackgroundTintList(this.f17488j);
        this.f17479a.setSupportBackgroundTintMode(this.f17487i);
    }

    void u(boolean z7) {
        this.f17495q = z7;
    }

    void v(int i7) {
        if (this.f17494p && this.f17485g == i7) {
            return;
        }
        this.f17485g = i7;
        this.f17494p = true;
        z(this.f17480b.w(i7));
    }

    public void w(int i7) {
        G(this.f17483e, i7);
    }

    public void x(int i7) {
        G(i7, this.f17484f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f17490l != colorStateList) {
            this.f17490l = colorStateList;
            boolean z7 = f17477u;
            if (z7 && (this.f17479a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f17479a.getBackground()).setColor(C2884b.a(colorStateList));
            } else {
                if (z7 || !(this.f17479a.getBackground() instanceof C2883a)) {
                    return;
                }
                ((C2883a) this.f17479a.getBackground()).setTintList(C2884b.a(colorStateList));
            }
        }
    }

    void z(k kVar) {
        this.f17480b = kVar;
        I(kVar);
    }
}
