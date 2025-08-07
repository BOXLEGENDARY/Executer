package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.n;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import d4.C2395h;
import f4.C2445a;
import h.C2473a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import r4.C2755d;
import s4.C2884b;
import u4.C2937g;
import w0.C2962a;

public class a extends C2937g implements Drawable.Callback, n.b {

    private static final int[] f17656c1 = {R.attr.state_enabled};

    private static final ShapeDrawable f17657d1 = new ShapeDrawable(new OvalShape());

    private final Paint f17658A0;

    private final Paint f17659B0;

    private final Paint.FontMetrics f17660C0;

    private final RectF f17661D0;

    private final PointF f17662E0;

    private final Path f17663F0;

    private final n f17664G0;

    private int f17665H0;

    private int f17666I0;

    private int f17667J0;

    private int f17668K0;

    private int f17669L0;

    private int f17670M0;

    private boolean f17671N0;

    private int f17672O0;

    private int f17673P0;

    private ColorFilter f17674Q0;

    private PorterDuffColorFilter f17675R0;

    private ColorStateList f17676S;

    private ColorStateList f17677S0;

    private ColorStateList f17678T;
    private PorterDuff.Mode T0;

    private float f17679U;
    private int[] U0;

    private float f17680V;
    private boolean V0;

    private ColorStateList f17681W;

    private ColorStateList f17682W0;

    private float f17683X;

    private WeakReference<InterfaceC0155a> f17684X0;

    private ColorStateList f17685Y;

    private TextUtils.TruncateAt f17686Y0;

    private CharSequence f17687Z;

    private boolean f17688Z0;

    private boolean f17689a0;

    private int f17690a1;

    private Drawable f17691b0;

    private boolean f17692b1;

    private ColorStateList f17693c0;

    private float f17694d0;

    private boolean f17695e0;

    private boolean f17696f0;

    private Drawable f17697g0;

    private Drawable f17698h0;

    private ColorStateList f17699i0;

    private float f17700j0;

    private CharSequence f17701k0;

    private boolean f17702l0;

    private boolean f17703m0;

    private Drawable f17704n0;

    private ColorStateList f17705o0;

    private C2395h f17706p0;

    private C2395h f17707q0;

    private float f17708r0;

    private float f17709s0;

    private float f17710t0;

    private float f17711u0;

    private float f17712v0;

    private float f17713w0;

    private float f17714x0;

    private float f17715y0;

    private final Context f17716z0;

    public interface InterfaceC0155a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f17680V = -1.0f;
        this.f17658A0 = new Paint(1);
        this.f17660C0 = new Paint.FontMetrics();
        this.f17661D0 = new RectF();
        this.f17662E0 = new PointF();
        this.f17663F0 = new Path();
        this.f17673P0 = 255;
        this.T0 = PorterDuff.Mode.SRC_IN;
        this.f17684X0 = new WeakReference<>(null);
        Q(context);
        this.f17716z0 = context;
        n nVar = new n(this);
        this.f17664G0 = nVar;
        this.f17687Z = BuildConfig.FLAVOR;
        nVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f17659B0 = null;
        int[] iArr = f17656c1;
        setState(iArr);
        o2(iArr);
        this.f17688Z0 = true;
        if (C2884b.f23671a) {
            f17657d1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (this.f17692b1) {
            return;
        }
        this.f17658A0.setColor(this.f17666I0);
        this.f17658A0.setStyle(Paint.Style.FILL);
        this.f17658A0.setColorFilter(o1());
        this.f17661D0.set(rect);
        canvas.drawRoundRect(this.f17661D0, L0(), L0(), this.f17658A0);
    }

    private void B0(Canvas canvas, Rect rect) {
        if (R2()) {
            o0(rect, this.f17661D0);
            RectF rectF = this.f17661D0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f17691b0.setBounds(0, 0, (int) this.f17661D0.width(), (int) this.f17661D0.height());
            this.f17691b0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.f17683X <= 0.0f || this.f17692b1) {
            return;
        }
        this.f17658A0.setColor(this.f17668K0);
        this.f17658A0.setStyle(Paint.Style.STROKE);
        if (!this.f17692b1) {
            this.f17658A0.setColorFilter(o1());
        }
        RectF rectF = this.f17661D0;
        float f7 = rect.left;
        float f8 = this.f17683X;
        rectF.set(f7 + (f8 / 2.0f), rect.top + (f8 / 2.0f), rect.right - (f8 / 2.0f), rect.bottom - (f8 / 2.0f));
        float f9 = this.f17680V - (this.f17683X / 2.0f);
        canvas.drawRoundRect(this.f17661D0, f9, f9, this.f17658A0);
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.f17692b1) {
            return;
        }
        this.f17658A0.setColor(this.f17665H0);
        this.f17658A0.setStyle(Paint.Style.FILL);
        this.f17661D0.set(rect);
        canvas.drawRoundRect(this.f17661D0, L0(), L0(), this.f17658A0);
    }

    private void E0(Canvas canvas, Rect rect) {
        if (S2()) {
            r0(rect, this.f17661D0);
            RectF rectF = this.f17661D0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f17697g0.setBounds(0, 0, (int) this.f17661D0.width(), (int) this.f17661D0.height());
            if (C2884b.f23671a) {
                this.f17698h0.setBounds(this.f17697g0.getBounds());
                this.f17698h0.jumpToCurrentState();
                this.f17698h0.draw(canvas);
            } else {
                this.f17697g0.draw(canvas);
            }
            canvas.translate(-f7, -f8);
        }
    }

    private void F0(Canvas canvas, Rect rect) {
        this.f17658A0.setColor(this.f17669L0);
        this.f17658A0.setStyle(Paint.Style.FILL);
        this.f17661D0.set(rect);
        if (!this.f17692b1) {
            canvas.drawRoundRect(this.f17661D0, L0(), L0(), this.f17658A0);
        } else {
            h(new RectF(rect), this.f17663F0);
            super.p(canvas, this.f17658A0, this.f17663F0, u());
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        Paint paint = this.f17659B0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.l(-16777216, 127));
            canvas.drawRect(rect, this.f17659B0);
            if (R2() || Q2()) {
                o0(rect, this.f17661D0);
                canvas.drawRect(this.f17661D0, this.f17659B0);
            }
            if (this.f17687Z != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f17659B0);
            }
            if (S2()) {
                r0(rect, this.f17661D0);
                canvas.drawRect(this.f17661D0, this.f17659B0);
            }
            this.f17659B0.setColor(androidx.core.graphics.a.l(-65536, 127));
            q0(rect, this.f17661D0);
            canvas.drawRect(this.f17661D0, this.f17659B0);
            this.f17659B0.setColor(androidx.core.graphics.a.l(-16711936, 127));
            s0(rect, this.f17661D0);
            canvas.drawRect(this.f17661D0, this.f17659B0);
        }
    }

    private void H0(Canvas canvas, Rect rect) {
        if (this.f17687Z != null) {
            Paint.Align alignW0 = w0(rect, this.f17662E0);
            u0(rect, this.f17661D0);
            if (this.f17664G0.e() != null) {
                this.f17664G0.f().drawableState = getState();
                this.f17664G0.l(this.f17716z0);
            }
            this.f17664G0.f().setTextAlign(alignW0);
            int iSave = 0;
            boolean z7 = Math.round(this.f17664G0.g(k1().toString())) > Math.round(this.f17661D0.width());
            if (z7) {
                iSave = canvas.save();
                canvas.clipRect(this.f17661D0);
            }
            CharSequence charSequenceEllipsize = this.f17687Z;
            if (z7 && this.f17686Y0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f17664G0.f(), this.f17661D0.width(), this.f17686Y0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f17662E0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f17664G0.f());
            if (z7) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean Q2() {
        return this.f17703m0 && this.f17704n0 != null && this.f17671N0;
    }

    private boolean R2() {
        return this.f17689a0 && this.f17691b0 != null;
    }

    private boolean S2() {
        return this.f17696f0 && this.f17697g0 != null;
    }

    private void T2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void U2() {
        this.f17682W0 = this.V0 ? C2884b.a(this.f17685Y) : null;
    }

    private void V2() {
        this.f17698h0 = new RippleDrawable(C2884b.a(i1()), this.f17697g0, f17657d1);
    }

    private float c1() {
        Drawable drawable = this.f17671N0 ? this.f17704n0 : this.f17691b0;
        float fCeil = this.f17694d0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(s.d(this.f17716z0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float d1() {
        Drawable drawable = this.f17671N0 ? this.f17704n0 : this.f17691b0;
        float f7 = this.f17694d0;
        return (f7 > 0.0f || drawable == null) ? f7 : drawable.getIntrinsicWidth();
    }

    private void e2(ColorStateList colorStateList) {
        if (this.f17676S != colorStateList) {
            this.f17676S = colorStateList;
            onStateChange(getState());
        }
    }

    private void n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C2731a.m(drawable, C2731a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f17697g0) {
            if (drawable.isStateful()) {
                drawable.setState(Z0());
            }
            C2731a.o(drawable, this.f17699i0);
            return;
        }
        Drawable drawable2 = this.f17691b0;
        if (drawable == drawable2 && this.f17695e0) {
            C2731a.o(drawable2, this.f17693c0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R2() || Q2()) {
            float f7 = this.f17708r0 + this.f17709s0;
            float fD1 = d1();
            if (C2731a.f(this) == 0) {
                float f8 = rect.left + f7;
                rectF.left = f8;
                rectF.right = f8 + fD1;
            } else {
                float f9 = rect.right - f7;
                rectF.right = f9;
                rectF.left = f9 - fD1;
            }
            float fC1 = c1();
            float fExactCenterY = rect.exactCenterY() - (fC1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fC1;
        }
    }

    private ColorFilter o1() {
        ColorFilter colorFilter = this.f17674Q0;
        return colorFilter != null ? colorFilter : this.f17675R0;
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (S2()) {
            float f7 = this.f17715y0 + this.f17714x0 + this.f17700j0 + this.f17713w0 + this.f17712v0;
            if (C2731a.f(this) == 0) {
                rectF.right = rect.right - f7;
            } else {
                rectF.left = rect.left + f7;
            }
        }
    }

    private static boolean q1(int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f7 = this.f17715y0 + this.f17714x0;
            if (C2731a.f(this) == 0) {
                float f8 = rect.right - f7;
                rectF.right = f8;
                rectF.left = f8 - this.f17700j0;
            } else {
                float f9 = rect.left + f7;
                rectF.left = f9;
                rectF.right = f9 + this.f17700j0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f10 = this.f17700j0;
            float f11 = fExactCenterY - (f10 / 2.0f);
            rectF.top = f11;
            rectF.bottom = f11 + f10;
        }
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f7 = this.f17715y0 + this.f17714x0 + this.f17700j0 + this.f17713w0 + this.f17712v0;
            if (C2731a.f(this) == 0) {
                float f8 = rect.right;
                rectF.right = f8;
                rectF.left = f8 - f7;
            } else {
                int i7 = rect.left;
                rectF.left = i7;
                rectF.right = i7 + f7;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f17687Z != null) {
            float fP0 = this.f17708r0 + p0() + this.f17711u0;
            float fT0 = this.f17715y0 + t0() + this.f17712v0;
            if (C2731a.f(this) == 0) {
                rectF.left = rect.left + fP0;
                rectF.right = rect.right - fT0;
            } else {
                rectF.left = rect.left + fT0;
                rectF.right = rect.right - fP0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean u1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float v0() {
        this.f17664G0.f().getFontMetrics(this.f17660C0);
        Paint.FontMetrics fontMetrics = this.f17660C0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean v1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean w1(C2755d c2755d) {
        return (c2755d == null || c2755d.i() == null || !c2755d.i().isStateful()) ? false : true;
    }

    private boolean x0() {
        return this.f17703m0 && this.f17704n0 != null && this.f17702l0;
    }

    private void x1(AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayI = p.i(this.f17716z0, attributeSet, C1755k.f13230o0, i7, i8, new int[0]);
        this.f17692b1 = typedArrayI.hasValue(C1755k.f13120Z0);
        e2(C2754c.a(this.f17716z0, typedArrayI, C1755k.f13045M0));
        I1(C2754c.a(this.f17716z0, typedArrayI, C1755k.f13308z0));
        W1(typedArrayI.getDimension(C1755k.f13017H0, 0.0f));
        int i9 = C1755k.f12975A0;
        if (typedArrayI.hasValue(i9)) {
            K1(typedArrayI.getDimension(i9, 0.0f));
        }
        a2(C2754c.a(this.f17716z0, typedArrayI, C1755k.f13033K0));
        c2(typedArrayI.getDimension(C1755k.f13039L0, 0.0f));
        B2(C2754c.a(this.f17716z0, typedArrayI, C1755k.f13114Y0));
        G2(typedArrayI.getText(C1755k.f13264t0));
        C2755d c2755dF = C2754c.f(this.f17716z0, typedArrayI, C1755k.f13236p0);
        c2755dF.l(typedArrayI.getDimension(C1755k.f13243q0, c2755dF.j()));
        H2(c2755dF);
        int i10 = typedArrayI.getInt(C1755k.f13250r0, 0);
        if (i10 == 1) {
            t2(TextUtils.TruncateAt.START);
        } else if (i10 == 2) {
            t2(TextUtils.TruncateAt.MIDDLE);
        } else if (i10 == 3) {
            t2(TextUtils.TruncateAt.END);
        }
        V1(typedArrayI.getBoolean(C1755k.f13012G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            V1(typedArrayI.getBoolean(C1755k.f12995D0, false));
        }
        O1(C2754c.d(this.f17716z0, typedArrayI, C1755k.f12989C0));
        int i11 = C1755k.f13007F0;
        if (typedArrayI.hasValue(i11)) {
            S1(C2754c.a(this.f17716z0, typedArrayI, i11));
        }
        Q1(typedArrayI.getDimension(C1755k.f13001E0, -1.0f));
        r2(typedArrayI.getBoolean(C1755k.T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            r2(typedArrayI.getBoolean(C1755k.f13057O0, false));
        }
        f2(C2754c.d(this.f17716z0, typedArrayI, C1755k.f13051N0));
        p2(C2754c.a(this.f17716z0, typedArrayI, C1755k.f13081S0));
        k2(typedArrayI.getDimension(C1755k.f13069Q0, 0.0f));
        A1(typedArrayI.getBoolean(C1755k.f13271u0, false));
        H1(typedArrayI.getBoolean(C1755k.f13300y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            H1(typedArrayI.getBoolean(C1755k.f13285w0, false));
        }
        C1(C2754c.d(this.f17716z0, typedArrayI, C1755k.f13278v0));
        int i12 = C1755k.f13293x0;
        if (typedArrayI.hasValue(i12)) {
            E1(C2754c.a(this.f17716z0, typedArrayI, i12));
        }
        E2(C2395h.b(this.f17716z0, typedArrayI, C1755k.f13127a1));
        u2(C2395h.b(this.f17716z0, typedArrayI, C1755k.V0));
        Y1(typedArrayI.getDimension(C1755k.f13026J0, 0.0f));
        y2(typedArrayI.getDimension(C1755k.f13108X0, 0.0f));
        w2(typedArrayI.getDimension(C1755k.f13102W0, 0.0f));
        M2(typedArrayI.getDimension(C1755k.f13141c1, 0.0f));
        J2(typedArrayI.getDimension(C1755k.f13134b1, 0.0f));
        m2(typedArrayI.getDimension(C1755k.f13075R0, 0.0f));
        h2(typedArrayI.getDimension(C1755k.f13063P0, 0.0f));
        M1(typedArrayI.getDimension(C1755k.f12982B0, 0.0f));
        A2(typedArrayI.getDimensionPixelSize(C1755k.f13257s0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public static a y0(Context context, AttributeSet attributeSet, int i7, int i8) {
        a aVar = new a(context, attributeSet, i7, i8);
        aVar.x1(attributeSet, i7, i8);
        return aVar;
    }

    private void z0(Canvas canvas, Rect rect) {
        if (Q2()) {
            o0(rect, this.f17661D0);
            RectF rectF = this.f17661D0;
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.f17704n0.setBounds(0, 0, (int) this.f17661D0.width(), (int) this.f17661D0.height());
            this.f17704n0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
    }

    private boolean z1(int[] iArr, int[] iArr2) {
        boolean z7;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f17676S;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f17665H0) : 0);
        boolean state = true;
        if (this.f17665H0 != iL) {
            this.f17665H0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f17678T;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f17666I0) : 0);
        if (this.f17666I0 != iL2) {
            this.f17666I0 = iL2;
            zOnStateChange = true;
        }
        int i7 = C2517a.i(iL, iL2);
        if ((this.f17667J0 != i7) | (x() == null)) {
            this.f17667J0 = i7;
            a0(ColorStateList.valueOf(i7));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f17681W;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f17668K0) : 0;
        if (this.f17668K0 != colorForState) {
            this.f17668K0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f17682W0 == null || !C2884b.b(iArr)) ? 0 : this.f17682W0.getColorForState(iArr, this.f17669L0);
        if (this.f17669L0 != colorForState2) {
            this.f17669L0 = colorForState2;
            if (this.V0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f17664G0.e() == null || this.f17664G0.e().i() == null) ? 0 : this.f17664G0.e().i().getColorForState(iArr, this.f17670M0);
        if (this.f17670M0 != colorForState3) {
            this.f17670M0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z8 = q1(getState(), R.attr.state_checked) && this.f17702l0;
        if (this.f17671N0 == z8 || this.f17704n0 == null) {
            z7 = false;
        } else {
            float fP0 = p0();
            this.f17671N0 = z8;
            if (fP0 != p0()) {
                zOnStateChange = true;
                z7 = true;
            } else {
                z7 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f17677S0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f17672O0) : 0;
        if (this.f17672O0 != colorForState4) {
            this.f17672O0 = colorForState4;
            this.f17675R0 = d.l(this, this.f17677S0, this.T0);
        } else {
            state = zOnStateChange;
        }
        if (v1(this.f17691b0)) {
            state |= this.f17691b0.setState(iArr);
        }
        if (v1(this.f17704n0)) {
            state |= this.f17704n0.setState(iArr);
        }
        if (v1(this.f17697g0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f17697g0.setState(iArr3);
        }
        if (C2884b.f23671a && v1(this.f17698h0)) {
            state |= this.f17698h0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z7) {
            y1();
        }
        return state;
    }

    public void A1(boolean z7) {
        if (this.f17702l0 != z7) {
            this.f17702l0 = z7;
            float fP0 = p0();
            if (!z7 && this.f17671N0) {
                this.f17671N0 = false;
            }
            float fP02 = p0();
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public void A2(int i7) {
        this.f17690a1 = i7;
    }

    public void B1(int i7) {
        A1(this.f17716z0.getResources().getBoolean(i7));
    }

    public void B2(ColorStateList colorStateList) {
        if (this.f17685Y != colorStateList) {
            this.f17685Y = colorStateList;
            U2();
            onStateChange(getState());
        }
    }

    public void C1(Drawable drawable) {
        if (this.f17704n0 != drawable) {
            float fP0 = p0();
            this.f17704n0 = drawable;
            float fP02 = p0();
            T2(this.f17704n0);
            n0(this.f17704n0);
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public void C2(int i7) {
        B2(C2473a.a(this.f17716z0, i7));
    }

    public void D1(int i7) {
        C1(C2473a.b(this.f17716z0, i7));
    }

    void D2(boolean z7) {
        this.f17688Z0 = z7;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.f17705o0 != colorStateList) {
            this.f17705o0 = colorStateList;
            if (x0()) {
                C2731a.o(this.f17704n0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void E2(C2395h c2395h) {
        this.f17706p0 = c2395h;
    }

    public void F1(int i7) {
        E1(C2473a.a(this.f17716z0, i7));
    }

    public void F2(int i7) {
        E2(C2395h.c(this.f17716z0, i7));
    }

    public void G1(int i7) {
        H1(this.f17716z0.getResources().getBoolean(i7));
    }

    public void G2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.f17687Z, charSequence)) {
            return;
        }
        this.f17687Z = charSequence;
        this.f17664G0.k(true);
        invalidateSelf();
        y1();
    }

    public void H1(boolean z7) {
        if (this.f17703m0 != z7) {
            boolean zQ2 = Q2();
            this.f17703m0 = z7;
            boolean zQ22 = Q2();
            if (zQ2 != zQ22) {
                if (zQ22) {
                    n0(this.f17704n0);
                } else {
                    T2(this.f17704n0);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public void H2(C2755d c2755d) {
        this.f17664G0.j(c2755d, this.f17716z0);
    }

    public Drawable I0() {
        return this.f17704n0;
    }

    public void I1(ColorStateList colorStateList) {
        if (this.f17678T != colorStateList) {
            this.f17678T = colorStateList;
            onStateChange(getState());
        }
    }

    public void I2(int i7) {
        H2(new C2755d(this.f17716z0, i7));
    }

    public ColorStateList J0() {
        return this.f17705o0;
    }

    public void J1(int i7) {
        I1(C2473a.a(this.f17716z0, i7));
    }

    public void J2(float f7) {
        if (this.f17712v0 != f7) {
            this.f17712v0 = f7;
            invalidateSelf();
            y1();
        }
    }

    public ColorStateList K0() {
        return this.f17678T;
    }

    @Deprecated
    public void K1(float f7) {
        if (this.f17680V != f7) {
            this.f17680V = f7;
            setShapeAppearanceModel(E().w(f7));
        }
    }

    public void K2(int i7) {
        J2(this.f17716z0.getResources().getDimension(i7));
    }

    public float L0() {
        return this.f17692b1 ? J() : this.f17680V;
    }

    @Deprecated
    public void L1(int i7) {
        K1(this.f17716z0.getResources().getDimension(i7));
    }

    public void L2(float f7) {
        C2755d c2755dL1 = l1();
        if (c2755dL1 != null) {
            c2755dL1.l(f7);
            this.f17664G0.f().setTextSize(f7);
            a();
        }
    }

    public float M0() {
        return this.f17715y0;
    }

    public void M1(float f7) {
        if (this.f17715y0 != f7) {
            this.f17715y0 = f7;
            invalidateSelf();
            y1();
        }
    }

    public void M2(float f7) {
        if (this.f17711u0 != f7) {
            this.f17711u0 = f7;
            invalidateSelf();
            y1();
        }
    }

    public Drawable N0() {
        Drawable drawable = this.f17691b0;
        if (drawable != null) {
            return C2731a.q(drawable);
        }
        return null;
    }

    public void N1(int i7) {
        M1(this.f17716z0.getResources().getDimension(i7));
    }

    public void N2(int i7) {
        M2(this.f17716z0.getResources().getDimension(i7));
    }

    public float O0() {
        return this.f17694d0;
    }

    public void O1(Drawable drawable) {
        Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fP0 = p0();
            this.f17691b0 = drawable != null ? C2731a.r(drawable).mutate() : null;
            float fP02 = p0();
            T2(drawableN0);
            if (R2()) {
                n0(this.f17691b0);
            }
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public void O2(boolean z7) {
        if (this.V0 != z7) {
            this.V0 = z7;
            U2();
            onStateChange(getState());
        }
    }

    public ColorStateList P0() {
        return this.f17693c0;
    }

    public void P1(int i7) {
        O1(C2473a.b(this.f17716z0, i7));
    }

    boolean P2() {
        return this.f17688Z0;
    }

    public float Q0() {
        return this.f17679U;
    }

    public void Q1(float f7) {
        if (this.f17694d0 != f7) {
            float fP0 = p0();
            this.f17694d0 = f7;
            float fP02 = p0();
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public float R0() {
        return this.f17708r0;
    }

    public void R1(int i7) {
        Q1(this.f17716z0.getResources().getDimension(i7));
    }

    public ColorStateList S0() {
        return this.f17681W;
    }

    public void S1(ColorStateList colorStateList) {
        this.f17695e0 = true;
        if (this.f17693c0 != colorStateList) {
            this.f17693c0 = colorStateList;
            if (R2()) {
                C2731a.o(this.f17691b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float T0() {
        return this.f17683X;
    }

    public void T1(int i7) {
        S1(C2473a.a(this.f17716z0, i7));
    }

    public Drawable U0() {
        Drawable drawable = this.f17697g0;
        if (drawable != null) {
            return C2731a.q(drawable);
        }
        return null;
    }

    public void U1(int i7) {
        V1(this.f17716z0.getResources().getBoolean(i7));
    }

    public CharSequence V0() {
        return this.f17701k0;
    }

    public void V1(boolean z7) {
        if (this.f17689a0 != z7) {
            boolean zR2 = R2();
            this.f17689a0 = z7;
            boolean zR22 = R2();
            if (zR2 != zR22) {
                if (zR22) {
                    n0(this.f17691b0);
                } else {
                    T2(this.f17691b0);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public float W0() {
        return this.f17714x0;
    }

    public void W1(float f7) {
        if (this.f17679U != f7) {
            this.f17679U = f7;
            invalidateSelf();
            y1();
        }
    }

    public float X0() {
        return this.f17700j0;
    }

    public void X1(int i7) {
        W1(this.f17716z0.getResources().getDimension(i7));
    }

    public float Y0() {
        return this.f17713w0;
    }

    public void Y1(float f7) {
        if (this.f17708r0 != f7) {
            this.f17708r0 = f7;
            invalidateSelf();
            y1();
        }
    }

    public int[] Z0() {
        return this.U0;
    }

    public void Z1(int i7) {
        Y1(this.f17716z0.getResources().getDimension(i7));
    }

    @Override
    public void a() {
        y1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.f17699i0;
    }

    public void a2(ColorStateList colorStateList) {
        if (this.f17681W != colorStateList) {
            this.f17681W = colorStateList;
            if (this.f17692b1) {
                i0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b1(RectF rectF) {
        s0(getBounds(), rectF);
    }

    public void b2(int i7) {
        a2(C2473a.a(this.f17716z0, i7));
    }

    public void c2(float f7) {
        if (this.f17683X != f7) {
            this.f17683X = f7;
            this.f17658A0.setStrokeWidth(f7);
            if (this.f17692b1) {
                super.j0(f7);
            }
            invalidateSelf();
        }
    }

    public void d2(int i7) {
        c2(this.f17716z0.getResources().getDimension(i7));
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i7 = this.f17673P0;
        int iA = i7 < 255 ? C2445a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i7) : 0;
        D0(canvas, bounds);
        A0(canvas, bounds);
        if (this.f17692b1) {
            super.draw(canvas);
        }
        C0(canvas, bounds);
        F0(canvas, bounds);
        B0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f17688Z0) {
            H0(canvas, bounds);
        }
        E0(canvas, bounds);
        G0(canvas, bounds);
        if (this.f17673P0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public TextUtils.TruncateAt e1() {
        return this.f17686Y0;
    }

    public C2395h f1() {
        return this.f17707q0;
    }

    public void f2(Drawable drawable) {
        Drawable drawableU0 = U0();
        if (drawableU0 != drawable) {
            float fT0 = t0();
            this.f17697g0 = drawable != null ? C2731a.r(drawable).mutate() : null;
            if (C2884b.f23671a) {
                V2();
            }
            float fT02 = t0();
            T2(drawableU0);
            if (S2()) {
                n0(this.f17697g0);
            }
            invalidateSelf();
            if (fT0 != fT02) {
                y1();
            }
        }
    }

    public float g1() {
        return this.f17710t0;
    }

    public void g2(CharSequence charSequence) {
        if (this.f17701k0 != charSequence) {
            this.f17701k0 = C2962a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        return this.f17673P0;
    }

    @Override
    public ColorFilter getColorFilter() {
        return this.f17674Q0;
    }

    @Override
    public int getIntrinsicHeight() {
        return (int) this.f17679U;
    }

    @Override
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f17708r0 + p0() + this.f17711u0 + this.f17664G0.g(k1().toString()) + this.f17712v0 + t0() + this.f17715y0), this.f17690a1);
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void getOutline(Outline outline) {
        if (this.f17692b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f17680V);
        } else {
            outline.setRoundRect(bounds, this.f17680V);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.f17709s0;
    }

    public void h2(float f7) {
        if (this.f17714x0 != f7) {
            this.f17714x0 = f7;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public ColorStateList i1() {
        return this.f17685Y;
    }

    public void i2(int i7) {
        h2(this.f17716z0.getResources().getDimension(i7));
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override
    public boolean isStateful() {
        return u1(this.f17676S) || u1(this.f17678T) || u1(this.f17681W) || (this.V0 && u1(this.f17682W0)) || w1(this.f17664G0.e()) || x0() || v1(this.f17691b0) || v1(this.f17704n0) || u1(this.f17677S0);
    }

    public C2395h j1() {
        return this.f17706p0;
    }

    public void j2(int i7) {
        f2(C2473a.b(this.f17716z0, i7));
    }

    public CharSequence k1() {
        return this.f17687Z;
    }

    public void k2(float f7) {
        if (this.f17700j0 != f7) {
            this.f17700j0 = f7;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public C2755d l1() {
        return this.f17664G0.e();
    }

    public void l2(int i7) {
        k2(this.f17716z0.getResources().getDimension(i7));
    }

    public float m1() {
        return this.f17712v0;
    }

    public void m2(float f7) {
        if (this.f17713w0 != f7) {
            this.f17713w0 = f7;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public float n1() {
        return this.f17711u0;
    }

    public void n2(int i7) {
        m2(this.f17716z0.getResources().getDimension(i7));
    }

    public boolean o2(int[] iArr) {
        if (Arrays.equals(this.U0, iArr)) {
            return false;
        }
        this.U0 = iArr;
        if (S2()) {
            return z1(getState(), iArr);
        }
        return false;
    }

    @Override
    public boolean onLayoutDirectionChanged(int i7) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (R2()) {
            zOnLayoutDirectionChanged |= C2731a.m(this.f17691b0, i7);
        }
        if (Q2()) {
            zOnLayoutDirectionChanged |= C2731a.m(this.f17704n0, i7);
        }
        if (S2()) {
            zOnLayoutDirectionChanged |= C2731a.m(this.f17697g0, i7);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override
    protected boolean onLevelChange(int i7) {
        boolean zOnLevelChange = super.onLevelChange(i7);
        if (R2()) {
            zOnLevelChange |= this.f17691b0.setLevel(i7);
        }
        if (Q2()) {
            zOnLevelChange |= this.f17704n0.setLevel(i7);
        }
        if (S2()) {
            zOnLevelChange |= this.f17697g0.setLevel(i7);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        if (this.f17692b1) {
            super.onStateChange(iArr);
        }
        return z1(iArr, Z0());
    }

    float p0() {
        if (R2() || Q2()) {
            return this.f17709s0 + d1() + this.f17710t0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.V0;
    }

    public void p2(ColorStateList colorStateList) {
        if (this.f17699i0 != colorStateList) {
            this.f17699i0 = colorStateList;
            if (S2()) {
                C2731a.o(this.f17697g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void q2(int i7) {
        p2(C2473a.a(this.f17716z0, i7));
    }

    public boolean r1() {
        return this.f17702l0;
    }

    public void r2(boolean z7) {
        if (this.f17696f0 != z7) {
            boolean zS2 = S2();
            this.f17696f0 = z7;
            boolean zS22 = S2();
            if (zS2 != zS22) {
                if (zS22) {
                    n0(this.f17697g0);
                } else {
                    T2(this.f17697g0);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public boolean s1() {
        return v1(this.f17697g0);
    }

    public void s2(InterfaceC0155a interfaceC0155a) {
        this.f17684X0 = new WeakReference<>(interfaceC0155a);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override
    public void setAlpha(int i7) {
        if (this.f17673P0 != i7) {
            this.f17673P0 = i7;
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f17674Q0 != colorFilter) {
            this.f17674Q0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (this.f17677S0 != colorStateList) {
            this.f17677S0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.T0 != mode) {
            this.T0 = mode;
            this.f17675R0 = d.l(this, this.f17677S0, mode);
            invalidateSelf();
        }
    }

    @Override
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        if (R2()) {
            visible |= this.f17691b0.setVisible(z7, z8);
        }
        if (Q2()) {
            visible |= this.f17704n0.setVisible(z7, z8);
        }
        if (S2()) {
            visible |= this.f17697g0.setVisible(z7, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    float t0() {
        if (S2()) {
            return this.f17713w0 + this.f17700j0 + this.f17714x0;
        }
        return 0.0f;
    }

    public boolean t1() {
        return this.f17696f0;
    }

    public void t2(TextUtils.TruncateAt truncateAt) {
        this.f17686Y0 = truncateAt;
    }

    public void u2(C2395h c2395h) {
        this.f17707q0 = c2395h;
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(int i7) {
        u2(C2395h.c(this.f17716z0, i7));
    }

    Paint.Align w0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f17687Z != null) {
            float fP0 = this.f17708r0 + p0() + this.f17711u0;
            if (C2731a.f(this) == 0) {
                pointF.x = rect.left + fP0;
            } else {
                pointF.x = rect.right - fP0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - v0();
        }
        return align;
    }

    public void w2(float f7) {
        if (this.f17710t0 != f7) {
            float fP0 = p0();
            this.f17710t0 = f7;
            float fP02 = p0();
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public void x2(int i7) {
        w2(this.f17716z0.getResources().getDimension(i7));
    }

    protected void y1() {
        InterfaceC0155a interfaceC0155a = this.f17684X0.get();
        if (interfaceC0155a != null) {
            interfaceC0155a.a();
        }
    }

    public void y2(float f7) {
        if (this.f17709s0 != f7) {
            float fP0 = p0();
            this.f17709s0 = f7;
            float fP02 = p0();
            invalidateSelf();
            if (fP0 != fP02) {
                y1();
            }
        }
    }

    public void z2(int i7) {
        y2(this.f17716z0.getResources().getDimension(i7));
    }
}
