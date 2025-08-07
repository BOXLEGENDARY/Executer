package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.C1640s;
import androidx.core.view.Z;
import com.appsflyer.R;
import d4.C2388a;
import k4.C2517a;
import r4.C2752a;
import r4.C2755d;
import s0.C2870a;

public final class a {

    private static final boolean f18053t0 = false;

    private static final Paint f18054u0 = null;

    private Typeface f18055A;

    private Typeface f18056B;

    private Typeface f18057C;

    private C2752a f18058D;

    private C2752a f18059E;

    private CharSequence f18061G;

    private CharSequence f18062H;

    private boolean f18063I;

    private boolean f18065K;

    private Bitmap f18066L;

    private Paint f18067M;

    private float f18068N;

    private float f18069O;

    private float f18070P;

    private float f18071Q;

    private float f18072R;

    private int f18073S;

    private int[] f18074T;

    private boolean f18075U;

    private final TextPaint f18076V;

    private final TextPaint f18077W;

    private TimeInterpolator f18078X;

    private TimeInterpolator f18079Y;

    private float f18080Z;

    private final View f18081a;

    private float f18082a0;

    private float f18083b;

    private float f18084b0;

    private boolean f18085c;

    private ColorStateList f18086c0;

    private float f18087d;

    private float f18088d0;

    private float f18089e;

    private float f18090e0;

    private int f18091f;

    private float f18092f0;

    private final Rect f18093g;

    private ColorStateList f18094g0;

    private final Rect f18095h;

    private float f18096h0;

    private final RectF f18097i;

    private float f18098i0;

    private float f18100j0;

    private StaticLayout f18102k0;

    private float f18104l0;

    private float f18106m0;

    private ColorStateList f18107n;

    private float f18108n0;

    private ColorStateList f18109o;

    private CharSequence f18110o0;

    private int f18111p;

    private float f18113q;

    private float f18115r;

    private float f18117s;

    private float f18119t;

    private float f18120u;

    private float f18121v;

    private Typeface f18122w;

    private Typeface f18123x;

    private Typeface f18124y;

    private Typeface f18125z;

    private int f18099j = 16;

    private int f18101k = 16;

    private float f18103l = 15.0f;

    private float f18105m = 15.0f;

    private TextUtils.TruncateAt f18060F = TextUtils.TruncateAt.END;

    private boolean f18064J = true;

    private int f18112p0 = 1;

    private float f18114q0 = 0.0f;

    private float f18116r0 = 1.0f;

    private int f18118s0 = l.f18150n;

    class C0160a implements C2752a.InterfaceC0221a {
        C0160a() {
        }

        @Override
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f18081a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f18076V = textPaint;
        this.f18077W = new TextPaint(textPaint);
        this.f18095h = new Rect();
        this.f18093g = new Rect();
        this.f18097i = new RectF();
        this.f18089e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f18103l);
        textPaint.setTypeface(this.f18125z);
        textPaint.setLetterSpacing(this.f18098i0);
    }

    private void B(float f7) {
        if (this.f18085c) {
            this.f18097i.set(f7 < this.f18089e ? this.f18093g : this.f18095h);
            return;
        }
        this.f18097i.left = G(this.f18093g.left, this.f18095h.left, f7, this.f18078X);
        this.f18097i.top = G(this.f18113q, this.f18115r, f7, this.f18078X);
        this.f18097i.right = G(this.f18093g.right, this.f18095h.right, f7, this.f18078X);
        this.f18097i.bottom = G(this.f18093g.bottom, this.f18095h.bottom, f7, this.f18078X);
    }

    private static boolean C(float f7, float f8) {
        return Math.abs(f7 - f8) < 1.0E-5f;
    }

    private boolean D() {
        return Z.z(this.f18081a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z7) {
        return (z7 ? w0.r.f24262d : w0.r.f24261c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f7, float f8, float f9, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f9 = timeInterpolator.getInterpolation(f9);
        }
        return C2388a.a(f7, f8, f9);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i7, int i8, int i9, int i10) {
        return rect.left == i7 && rect.top == i8 && rect.right == i9 && rect.bottom == i10;
    }

    private void Q(float f7) {
        this.f18106m0 = f7;
        Z.e0(this.f18081a);
    }

    private boolean U(Typeface typeface) {
        C2752a c2752a = this.f18059E;
        if (c2752a != null) {
            c2752a.c();
        }
        if (this.f18124y == typeface) {
            return false;
        }
        this.f18124y = typeface;
        Typeface typefaceB = r4.j.b(this.f18081a.getContext().getResources().getConfiguration(), typeface);
        this.f18123x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f18124y;
        }
        this.f18122w = typefaceB;
        return true;
    }

    private void Y(float f7) {
        this.f18108n0 = f7;
        Z.e0(this.f18081a);
    }

    private static int a(int i7, int i8, float f7) {
        float f8 = 1.0f - f7;
        return Color.argb(Math.round((Color.alpha(i7) * f8) + (Color.alpha(i8) * f7)), Math.round((Color.red(i7) * f8) + (Color.red(i8) * f7)), Math.round((Color.green(i7) * f8) + (Color.green(i8) * f7)), Math.round((Color.blue(i7) * f8) + (Color.blue(i8) * f7)));
    }

    private void b(boolean z7) {
        StaticLayout staticLayout;
        i(1.0f, z7);
        CharSequence charSequence = this.f18062H;
        if (charSequence != null && (staticLayout = this.f18102k0) != null) {
            this.f18110o0 = TextUtils.ellipsize(charSequence, this.f18076V, staticLayout.getWidth(), this.f18060F);
        }
        CharSequence charSequence2 = this.f18110o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f18104l0 = I(this.f18076V, charSequence2);
        } else {
            this.f18104l0 = 0.0f;
        }
        int iB = C1640s.b(this.f18101k, this.f18063I ? 1 : 0);
        int i7 = iB & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i7 == 48) {
            this.f18115r = this.f18095h.top;
        } else if (i7 != 80) {
            this.f18115r = this.f18095h.centerY() - ((this.f18076V.descent() - this.f18076V.ascent()) / 2.0f);
        } else {
            this.f18115r = this.f18095h.bottom + this.f18076V.ascent();
        }
        int i8 = iB & 8388615;
        if (i8 == 1) {
            this.f18119t = this.f18095h.centerX() - (this.f18104l0 / 2.0f);
        } else if (i8 != 5) {
            this.f18119t = this.f18095h.left;
        } else {
            this.f18119t = this.f18095h.right - this.f18104l0;
        }
        i(0.0f, z7);
        float height = this.f18102k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f18102k0;
        if (staticLayout2 == null || this.f18112p0 <= 1) {
            CharSequence charSequence3 = this.f18062H;
            if (charSequence3 != null) {
                fI = I(this.f18076V, charSequence3);
            }
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f18102k0;
        this.f18111p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = C1640s.b(this.f18099j, this.f18063I ? 1 : 0);
        int i9 = iB2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i9 == 48) {
            this.f18113q = this.f18093g.top;
        } else if (i9 != 80) {
            this.f18113q = this.f18093g.centerY() - (height / 2.0f);
        } else {
            this.f18113q = (this.f18093g.bottom - height) + this.f18076V.descent();
        }
        int i10 = iB2 & 8388615;
        if (i10 == 1) {
            this.f18117s = this.f18093g.centerX() - (fI / 2.0f);
        } else if (i10 != 5) {
            this.f18117s = this.f18093g.left;
        } else {
            this.f18117s = this.f18093g.right - fI;
        }
        j();
        d0(this.f18083b);
    }

    private boolean b0(Typeface typeface) {
        C2752a c2752a = this.f18058D;
        if (c2752a != null) {
            c2752a.c();
        }
        if (this.f18056B == typeface) {
            return false;
        }
        this.f18056B = typeface;
        Typeface typefaceB = r4.j.b(this.f18081a.getContext().getResources().getConfiguration(), typeface);
        this.f18055A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f18056B;
        }
        this.f18125z = typefaceB;
        return true;
    }

    private void c() {
        g(this.f18083b);
    }

    private float d(float f7) {
        float f8 = this.f18089e;
        return f7 <= f8 ? C2388a.b(1.0f, 0.0f, this.f18087d, f8, f7) : C2388a.b(0.0f, 1.0f, f8, 1.0f, f7);
    }

    private void d0(float f7) {
        h(f7);
        boolean z7 = f18053t0 && this.f18068N != 1.0f;
        this.f18065K = z7;
        if (z7) {
            n();
        }
        Z.e0(this.f18081a);
    }

    private float e() {
        float f7 = this.f18087d;
        return f7 + ((1.0f - f7) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f18064J ? F(charSequence, zD) : zD;
    }

    private void g(float f7) {
        float f8;
        B(f7);
        if (!this.f18085c) {
            this.f18120u = G(this.f18117s, this.f18119t, f7, this.f18078X);
            this.f18121v = G(this.f18113q, this.f18115r, f7, this.f18078X);
            d0(f7);
            f8 = f7;
        } else if (f7 < this.f18089e) {
            this.f18120u = this.f18117s;
            this.f18121v = this.f18113q;
            d0(0.0f);
            f8 = 0.0f;
        } else {
            this.f18120u = this.f18119t;
            this.f18121v = this.f18115r - Math.max(0, this.f18091f);
            d0(1.0f);
            f8 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C2388a.f20313b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f7, timeInterpolator));
        Y(G(1.0f, 0.0f, f7, timeInterpolator));
        if (this.f18109o != this.f18107n) {
            this.f18076V.setColor(a(v(), t(), f8));
        } else {
            this.f18076V.setColor(t());
        }
        int i7 = Build.VERSION.SDK_INT;
        float f9 = this.f18096h0;
        float f10 = this.f18098i0;
        if (f9 != f10) {
            this.f18076V.setLetterSpacing(G(f10, f9, f7, timeInterpolator));
        } else {
            this.f18076V.setLetterSpacing(f9);
        }
        this.f18070P = G(this.f18088d0, this.f18080Z, f7, null);
        this.f18071Q = G(this.f18090e0, this.f18082a0, f7, null);
        this.f18072R = G(this.f18092f0, this.f18084b0, f7, null);
        int iA = a(u(this.f18094g0), u(this.f18086c0), f7);
        this.f18073S = iA;
        this.f18076V.setShadowLayer(this.f18070P, this.f18071Q, this.f18072R, iA);
        if (this.f18085c) {
            this.f18076V.setAlpha((int) (d(f7) * this.f18076V.getAlpha()));
            if (i7 >= 31) {
                TextPaint textPaint = this.f18076V;
                textPaint.setShadowLayer(this.f18070P, this.f18071Q, this.f18072R, C2517a.a(this.f18073S, textPaint.getAlpha()));
            }
        }
        Z.e0(this.f18081a);
    }

    private void h(float f7) {
        i(f7, false);
    }

    private void i(float f7, boolean z7) {
        float f8;
        float f9;
        Typeface typeface;
        if (this.f18061G == null) {
            return;
        }
        float fWidth = this.f18095h.width();
        float fWidth2 = this.f18093g.width();
        if (C(f7, 1.0f)) {
            f8 = this.f18105m;
            f9 = this.f18096h0;
            this.f18068N = 1.0f;
            typeface = this.f18122w;
        } else {
            float f10 = this.f18103l;
            float f11 = this.f18098i0;
            Typeface typeface2 = this.f18125z;
            if (C(f7, 0.0f)) {
                this.f18068N = 1.0f;
            } else {
                this.f18068N = G(this.f18103l, this.f18105m, f7, this.f18079Y) / this.f18103l;
            }
            float f12 = this.f18105m / this.f18103l;
            fWidth = (z7 || this.f18085c || fWidth2 * f12 <= fWidth) ? fWidth2 : Math.min(fWidth / f12, fWidth2);
            f8 = f10;
            f9 = f11;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z8 = this.f18069O != f8;
            boolean z9 = this.f18100j0 != f9;
            boolean z10 = this.f18057C != typeface;
            StaticLayout staticLayout = this.f18102k0;
            boolean z11 = z8 || z9 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z10 || this.f18075U;
            this.f18069O = f8;
            this.f18100j0 = f9;
            this.f18057C = typeface;
            this.f18075U = false;
            this.f18076V.setLinearText(this.f18068N != 1.0f);
            z = z11;
        }
        if (this.f18062H == null || z) {
            this.f18076V.setTextSize(this.f18069O);
            this.f18076V.setTypeface(this.f18057C);
            this.f18076V.setLetterSpacing(this.f18100j0);
            this.f18063I = f(this.f18061G);
            StaticLayout staticLayoutK = k(j0() ? this.f18112p0 : 1, fWidth, this.f18063I);
            this.f18102k0 = staticLayoutK;
            this.f18062H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f18066L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f18066L = null;
        }
    }

    private boolean j0() {
        return this.f18112p0 > 1 && (!this.f18063I || this.f18085c) && !this.f18065K;
    }

    private StaticLayout k(int i7, float f7, boolean z7) {
        return (StaticLayout) x0.g.g(l.b(this.f18061G, this.f18076V, (int) f7).d(this.f18060F).g(z7).c(i7 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i7).h(this.f18114q0, this.f18116r0).e(this.f18118s0).j(null).a());
    }

    private void m(Canvas canvas, float f7, float f8) {
        int alpha = this.f18076V.getAlpha();
        canvas.translate(f7, f8);
        if (!this.f18085c) {
            this.f18076V.setAlpha((int) (this.f18108n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f18076V;
                textPaint.setShadowLayer(this.f18070P, this.f18071Q, this.f18072R, C2517a.a(this.f18073S, textPaint.getAlpha()));
            }
            this.f18102k0.draw(canvas);
        }
        if (!this.f18085c) {
            this.f18076V.setAlpha((int) (this.f18106m0 * alpha));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            TextPaint textPaint2 = this.f18076V;
            textPaint2.setShadowLayer(this.f18070P, this.f18071Q, this.f18072R, C2517a.a(this.f18073S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f18102k0.getLineBaseline(0);
        CharSequence charSequence = this.f18110o0;
        float f9 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f9, this.f18076V);
        if (i7 >= 31) {
            this.f18076V.setShadowLayer(this.f18070P, this.f18071Q, this.f18072R, this.f18073S);
        }
        if (this.f18085c) {
            return;
        }
        String strTrim = this.f18110o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f18076V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f18102k0.getLineEnd(0), str.length()), 0.0f, f9, (Paint) this.f18076V);
    }

    private void n() {
        if (this.f18066L != null || this.f18093g.isEmpty() || TextUtils.isEmpty(this.f18062H)) {
            return;
        }
        g(0.0f);
        int width = this.f18102k0.getWidth();
        int height = this.f18102k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f18066L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f18102k0.draw(new Canvas(this.f18066L));
        if (this.f18067M == null) {
            this.f18067M = new Paint(3);
        }
    }

    private float r(int i7, int i8) {
        return (i8 == 17 || (i8 & 7) == 1) ? (i7 / 2.0f) - (this.f18104l0 / 2.0f) : ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) ? this.f18063I ? this.f18095h.left : this.f18095h.right - this.f18104l0 : this.f18063I ? this.f18095h.right - this.f18104l0 : this.f18095h.left;
    }

    private float s(RectF rectF, int i7, int i8) {
        return (i8 == 17 || (i8 & 7) == 1) ? (i7 / 2.0f) + (this.f18104l0 / 2.0f) : ((i8 & 8388613) == 8388613 || (i8 & 5) == 5) ? this.f18063I ? rectF.left + this.f18104l0 : this.f18095h.right : this.f18063I ? this.f18095h.right : rectF.left + this.f18104l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f18074T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f18107n);
    }

    private Layout.Alignment y() {
        int iB = C1640s.b(this.f18099j, this.f18063I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f18063I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f18063I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f18105m);
        textPaint.setTypeface(this.f18122w);
        textPaint.setLetterSpacing(this.f18096h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f18109o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f18107n) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f18124y;
            if (typeface != null) {
                this.f18123x = r4.j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f18056B;
            if (typeface2 != null) {
                this.f18055A = r4.j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f18123x;
            if (typeface3 == null) {
                typeface3 = this.f18124y;
            }
            this.f18122w = typeface3;
            Typeface typeface4 = this.f18055A;
            if (typeface4 == null) {
                typeface4 = this.f18056B;
            }
            this.f18125z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z7) {
        if ((this.f18081a.getHeight() <= 0 || this.f18081a.getWidth() <= 0) && !z7) {
            return;
        }
        b(z7);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f18109o == colorStateList && this.f18107n == colorStateList) {
            return;
        }
        this.f18109o = colorStateList;
        this.f18107n = colorStateList;
        J();
    }

    public void N(int i7, int i8, int i9, int i10) {
        if (L(this.f18095h, i7, i8, i9, i10)) {
            return;
        }
        this.f18095h.set(i7, i8, i9, i10);
        this.f18075U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i7) {
        C2755d c2755d = new C2755d(this.f18081a.getContext(), i7);
        if (c2755d.i() != null) {
            this.f18109o = c2755d.i();
        }
        if (c2755d.j() != 0.0f) {
            this.f18105m = c2755d.j();
        }
        ColorStateList colorStateList = c2755d.f22899c;
        if (colorStateList != null) {
            this.f18086c0 = colorStateList;
        }
        this.f18082a0 = c2755d.f22904h;
        this.f18084b0 = c2755d.f22905i;
        this.f18080Z = c2755d.f22906j;
        this.f18096h0 = c2755d.f22908l;
        C2752a c2752a = this.f18059E;
        if (c2752a != null) {
            c2752a.c();
        }
        this.f18059E = new C2752a(new C0160a(), c2755d.e());
        c2755d.h(this.f18081a.getContext(), this.f18059E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f18109o != colorStateList) {
            this.f18109o = colorStateList;
            J();
        }
    }

    public void S(int i7) {
        if (this.f18101k != i7) {
            this.f18101k = i7;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i7, int i8, int i9, int i10) {
        if (L(this.f18093g, i7, i8, i9, i10)) {
            return;
        }
        this.f18093g.set(i7, i8, i9, i10);
        this.f18075U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f7) {
        if (this.f18098i0 != f7) {
            this.f18098i0 = f7;
            J();
        }
    }

    public void Z(int i7) {
        if (this.f18099j != i7) {
            this.f18099j = i7;
            J();
        }
    }

    public void a0(float f7) {
        if (this.f18103l != f7) {
            this.f18103l = f7;
            J();
        }
    }

    public void c0(float f7) {
        float fB = C2870a.b(f7, 0.0f, 1.0f);
        if (fB != this.f18083b) {
            this.f18083b = fB;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f18078X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f18074T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f18061G, charSequence)) {
            this.f18061G = charSequence;
            this.f18062H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f18079Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f18062H == null || this.f18097i.width() <= 0.0f || this.f18097i.height() <= 0.0f) {
            return;
        }
        this.f18076V.setTextSize(this.f18069O);
        float f7 = this.f18120u;
        float f8 = this.f18121v;
        boolean z7 = this.f18065K && this.f18066L != null;
        float f9 = this.f18068N;
        if (f9 != 1.0f && !this.f18085c) {
            canvas.scale(f9, f9, f7, f8);
        }
        if (z7) {
            canvas.drawBitmap(this.f18066L, f7, f8, this.f18067M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f18085c && this.f18083b <= this.f18089e)) {
            canvas.translate(f7, f8);
            this.f18102k0.draw(canvas);
        } else {
            m(canvas, this.f18120u - this.f18102k0.getLineStart(0), f8);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i7, int i8) {
        this.f18063I = f(this.f18061G);
        rectF.left = Math.max(r(i7, i8), this.f18095h.left);
        rectF.top = this.f18095h.top;
        rectF.right = Math.min(s(rectF, i7, i8), this.f18095h.right);
        rectF.bottom = this.f18095h.top + q();
    }

    public ColorStateList p() {
        return this.f18109o;
    }

    public float q() {
        z(this.f18077W);
        return -this.f18077W.ascent();
    }

    public int t() {
        return u(this.f18109o);
    }

    public float w() {
        A(this.f18077W);
        return -this.f18077W.ascent();
    }

    public float x() {
        return this.f18083b;
    }
}
