package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import androidx.core.view.c1;

public class s {

    class a implements I {

        final c f18177d;

        final d f18178e;

        a(c cVar, d dVar) {
            this.f18177d = cVar;
            this.f18178e = dVar;
        }

        @Override
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f18177d.a(view, windowInsetsCompat, new d(this.f18178e));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            Z.k0(view);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d dVar);
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view, c cVar) {
        Z.B0(view, new a(cVar, new d(Z.E(view), view.getPaddingTop(), Z.D(view), view.getPaddingBottom())));
        m(view);
    }

    public static float d(Context context, int i7) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    public static Integer e(View view) {
        ColorStateList colorStateListG = com.google.android.material.drawable.d.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager f(View view) {
        return (InputMethodManager) androidx.core.content.a.j(view.getContext(), InputMethodManager.class);
    }

    public static float g(View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += Z.u((View) parent);
        }
        return fU;
    }

    public static boolean h(View view) {
        return Z.z(view) == 1;
    }

    public static PorterDuff.Mode j(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void k(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            l(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void l(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void m(View view) {
        if (Z.Q(view)) {
            Z.k0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void n(final View view, final boolean z7) {
        view.requestFocus();
        view.post(new Runnable() {
            @Override
            public final void run() {
                s.o(view, z7);
            }
        });
    }

    public static void o(View view, boolean z7) {
        c1 c1VarJ;
        if (!z7 || (c1VarJ = Z.J(view)) == null) {
            f(view).showSoftInput(view, 1);
        } else {
            c1VarJ.e(WindowInsetsCompat.Type.ime());
        }
    }

    public static class d {

        public int f18179a;

        public int f18180b;

        public int f18181c;

        public int f18182d;

        public d(int i7, int i8, int i9, int i10) {
            this.f18179a = i7;
            this.f18180b = i8;
            this.f18181c = i9;
            this.f18182d = i10;
        }

        public d(d dVar) {
            this.f18179a = dVar.f18179a;
            this.f18180b = dVar.f18180b;
            this.f18181c = dVar.f18181c;
            this.f18182d = dVar.f18182d;
        }
    }
}
