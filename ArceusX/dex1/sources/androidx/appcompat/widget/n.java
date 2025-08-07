package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.Z;
import g.C2456j;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p0.h;

class n {

    private final TextView f9303a;

    private TintInfo f9304b;

    private TintInfo f9305c;

    private TintInfo f9306d;

    private TintInfo f9307e;

    private TintInfo f9308f;

    private TintInfo f9309g;

    private TintInfo f9310h;

    private final o f9311i;

    private int f9312j = 0;

    private int f9313k = -1;

    private Typeface f9314l;

    private boolean f9315m;

    class a extends h.f {

        final int f9316a;

        final int f9317b;

        final WeakReference f9318c;

        a(int i7, int i8, WeakReference weakReference) {
            this.f9316a = i7;
            this.f9317b = i8;
            this.f9318c = weakReference;
        }

        @Override
        public void f(int i7) {
        }

        @Override
        public void g(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f9316a) != -1) {
                typeface = f.a(typeface, i7, (this.f9317b & 2) != 0);
            }
            n.this.n(this.f9318c, typeface);
        }
    }

    class b implements Runnable {

        final TextView f9320d;

        final Typeface f9321e;

        final int f9322i;

        b(TextView textView, Typeface typeface, int i7) {
            this.f9320d = textView;
            this.f9321e = typeface;
            this.f9322i = i7;
        }

        @Override
        public void run() {
            this.f9320d.setTypeface(this.f9321e, this.f9322i);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        static void c(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i7, boolean z7) {
            return Typeface.create(typeface, i7, z7);
        }
    }

    n(TextView textView) {
        this.f9303a = textView;
        this.f9311i = new o(textView);
    }

    private void B(int i7, float f7) {
        this.f9311i.t(i7, f7);
    }

    private void C(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.f9312j = tintTypedArray.getInt(C2456j.X2, this.f9312j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int i8 = tintTypedArray.getInt(C2456j.a3, -1);
            this.f9313k = i8;
            if (i8 != -1) {
                this.f9312j &= 2;
            }
        }
        int i9 = C2456j.Z2;
        if (!tintTypedArray.hasValue(i9) && !tintTypedArray.hasValue(C2456j.b3)) {
            int i10 = C2456j.W2;
            if (tintTypedArray.hasValue(i10)) {
                this.f9315m = false;
                int i11 = tintTypedArray.getInt(i10, 1);
                if (i11 == 1) {
                    this.f9314l = Typeface.SANS_SERIF;
                    return;
                } else if (i11 == 2) {
                    this.f9314l = Typeface.SERIF;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f9314l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9314l = null;
        int i12 = C2456j.b3;
        if (tintTypedArray.hasValue(i12)) {
            i9 = i12;
        }
        int i13 = this.f9313k;
        int i14 = this.f9312j;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i9, this.f9312j, new a(i13, i14, new WeakReference(this.f9303a)));
                if (font != null) {
                    if (i7 < 28 || this.f9313k == -1) {
                        this.f9314l = font;
                    } else {
                        this.f9314l = f.a(Typeface.create(font, 0), this.f9313k, (this.f9312j & 2) != 0);
                    }
                }
                this.f9315m = this.f9314l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9314l != null || (string = tintTypedArray.getString(i9)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9313k == -1) {
            this.f9314l = Typeface.create(string, this.f9312j);
        } else {
            this.f9314l = f.a(Typeface.create(string, 0), this.f9313k, (this.f9312j & 2) != 0);
        }
    }

    private void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.f9303a.getDrawableState());
    }

    private static TintInfo d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i7) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i7);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f9303a);
            TextView textView = this.f9303a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f9303a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f9303a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f9303a.getCompoundDrawables();
        TextView textView3 = this.f9303a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        TintInfo tintInfo = this.f9310h;
        this.f9304b = tintInfo;
        this.f9305c = tintInfo;
        this.f9306d = tintInfo;
        this.f9307e = tintInfo;
        this.f9308f = tintInfo;
        this.f9309g = tintInfo;
    }

    void A(int i7, float f7) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || l()) {
            return;
        }
        B(i7, f7);
    }

    void b() {
        if (this.f9304b != null || this.f9305c != null || this.f9306d != null || this.f9307e != null) {
            Drawable[] compoundDrawables = this.f9303a.getCompoundDrawables();
            a(compoundDrawables[0], this.f9304b);
            a(compoundDrawables[1], this.f9305c);
            a(compoundDrawables[2], this.f9306d);
            a(compoundDrawables[3], this.f9307e);
        }
        if (this.f9308f == null && this.f9309g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f9303a);
        a(drawableArrA[0], this.f9308f);
        a(drawableArrA[2], this.f9309g);
    }

    void c() {
        this.f9311i.a();
    }

    int e() {
        return this.f9311i.f();
    }

    int f() {
        return this.f9311i.g();
    }

    int g() {
        return this.f9311i.h();
    }

    int[] h() {
        return this.f9311i.i();
    }

    int i() {
        return this.f9311i.j();
    }

    ColorStateList j() {
        TintInfo tintInfo = this.f9310h;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    PorterDuff.Mode k() {
        TintInfo tintInfo = this.f9310h;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    boolean l() {
        return this.f9311i.n();
    }

    void m(android.util.AttributeSet r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f9315m) {
            this.f9314l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (Z.Q(textView)) {
                    textView.post(new b(textView, typeface, this.f9312j));
                } else {
                    textView.setTypeface(typeface, this.f9312j);
                }
            }
        }
    }

    void o(boolean z7, int i7, int i8, int i9, int i10) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i7) {
        String string;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i7, C2456j.U2);
        int i8 = C2456j.f20807d3;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
            s(tintTypedArrayObtainStyledAttributes.getBoolean(i8, false));
        }
        int i9 = C2456j.V2;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i9, -1) == 0) {
            this.f9303a.setTextSize(0, 0.0f);
        }
        C(context, tintTypedArrayObtainStyledAttributes);
        int i10 = C2456j.c3;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i10) && (string = tintTypedArrayObtainStyledAttributes.getString(i10)) != null) {
            e.d(this.f9303a, string);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.f9314l;
        if (typeface != null) {
            this.f9303a.setTypeface(typeface, this.f9312j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        A0.a.e(editorInfo, textView.getText());
    }

    void s(boolean z7) {
        this.f9303a.setAllCaps(z7);
    }

    void t(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        this.f9311i.p(i7, i8, i9, i10);
    }

    void u(int[] iArr, int i7) throws IllegalArgumentException {
        this.f9311i.q(iArr, i7);
    }

    void v(int i7) {
        this.f9311i.r(i7);
    }

    void w(ColorStateList colorStateList) {
        if (this.f9310h == null) {
            this.f9310h = new TintInfo();
        }
        TintInfo tintInfo = this.f9310h;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f9310h == null) {
            this.f9310h = new TintInfo();
        }
        TintInfo tintInfo = this.f9310h;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        z();
    }
}
