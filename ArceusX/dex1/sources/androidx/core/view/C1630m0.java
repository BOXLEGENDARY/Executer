package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class C1630m0 {

    private e f10673a;

    public static abstract class b {

        WindowInsets f10676a;

        private final int f10677b;

        public b(int i7) {
            this.f10677b = i7;
        }

        public final int a() {
            return this.f10677b;
        }

        public void b(C1630m0 c1630m0) {
        }

        public void c(C1630m0 c1630m0) {
        }

        public abstract WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<C1630m0> list);

        public abstract a e(C1630m0 c1630m0, a aVar);
    }

    private static class c extends e {

        private static final Interpolator f10678e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        private static final Interpolator f10679f = new O0.a();

        private static final Interpolator f10680g = new DecelerateInterpolator();

        private static class a implements View.OnApplyWindowInsetsListener {

            final b f10681a;

            private WindowInsetsCompat f10682b;

            class C0089a implements ValueAnimator.AnimatorUpdateListener {

                final C1630m0 f10683a;

                final WindowInsetsCompat f10684b;

                final WindowInsetsCompat f10685c;

                final int f10686d;

                final View f10687e;

                C0089a(C1630m0 c1630m0, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i7, View view) {
                    this.f10683a = c1630m0;
                    this.f10684b = windowInsetsCompat;
                    this.f10685c = windowInsetsCompat2;
                    this.f10686d = i7;
                    this.f10687e = view;
                }

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f10683a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f10687e, c.o(this.f10684b, this.f10685c, this.f10683a.b(), this.f10686d), Collections.singletonList(this.f10683a));
                }
            }

            class b extends AnimatorListenerAdapter {

                final C1630m0 f10689a;

                final View f10690b;

                b(C1630m0 c1630m0, View view) {
                    this.f10689a = c1630m0;
                    this.f10690b = view;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    this.f10689a.e(1.0f);
                    c.i(this.f10690b, this.f10689a);
                }
            }

            class RunnableC0090c implements Runnable {

                final View f10692d;

                final C1630m0 f10693e;

                final a f10694i;

                final ValueAnimator f10695v;

                RunnableC0090c(View view, C1630m0 c1630m0, a aVar, ValueAnimator valueAnimator) {
                    this.f10692d = view;
                    this.f10693e = c1630m0;
                    this.f10694i = aVar;
                    this.f10695v = valueAnimator;
                }

                @Override
                public void run() {
                    c.l(this.f10692d, this.f10693e, this.f10694i);
                    this.f10695v.start();
                }
            }

            a(View view, b bVar) {
                this.f10681a = bVar;
                WindowInsetsCompat windowInsetsCompatF = Z.F(view);
                this.f10682b = windowInsetsCompatF != null ? new WindowInsetsCompat.Builder(windowInsetsCompatF).build() : null;
            }

            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iE;
                if (!view.isLaidOut()) {
                    this.f10682b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.f10682b == null) {
                    this.f10682b = Z.F(view);
                }
                if (this.f10682b == null) {
                    this.f10682b = windowInsetsCompat;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if ((bVarN == null || !Objects.equals(bVarN.f10676a, windowInsets)) && (iE = c.e(windowInsetsCompat, this.f10682b)) != 0) {
                    WindowInsetsCompat windowInsetsCompat2 = this.f10682b;
                    C1630m0 c1630m0 = new C1630m0(iE, c.g(iE, windowInsetsCompat, windowInsetsCompat2), 160L);
                    c1630m0.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1630m0.a());
                    a aVarF = c.f(windowInsetsCompat, windowInsetsCompat2, iE);
                    c.j(view, c1630m0, windowInsets, false);
                    duration.addUpdateListener(new C0089a(c1630m0, windowInsetsCompat, windowInsetsCompat2, iE, view));
                    duration.addListener(new b(c1630m0, view));
                    L.a(view, new RunnableC0090c(view, c1630m0, aVarF, duration));
                    this.f10682b = windowInsetsCompat;
                    return c.m(view, windowInsets);
                }
                return c.m(view, windowInsets);
            }
        }

        c(int i7, Interpolator interpolator, long j7) {
            super(i7, interpolator, j7);
        }

        static int e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i7 = 0;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if (!windowInsetsCompat.getInsets(i8).equals(windowInsetsCompat2.getInsets(i8))) {
                    i7 |= i8;
                }
            }
            return i7;
        }

        static a f(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i7) {
            Insets insets = windowInsetsCompat.getInsets(i7);
            Insets insets2 = windowInsetsCompat2.getInsets(i7);
            return new a(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        static Interpolator g(int i7, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            return (i7 & 8) != 0 ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.ime()).bottom ? f10678e : f10679f : f10680g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C1630m0 c1630m0) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.b(c1630m0);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    i(viewGroup.getChildAt(i7), c1630m0);
                }
            }
        }

        static void j(View view, C1630m0 c1630m0, WindowInsets windowInsets, boolean z7) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f10676a = windowInsets;
                if (!z7) {
                    bVarN.c(c1630m0);
                    z7 = bVarN.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    j(viewGroup.getChildAt(i7), c1630m0, windowInsets, z7);
                }
            }
        }

        static void k(View view, WindowInsetsCompat windowInsetsCompat, List<C1630m0> list) {
            b bVarN = n(view);
            if (bVarN != null) {
                windowInsetsCompat = bVarN.d(windowInsetsCompat, list);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    k(viewGroup.getChildAt(i7), windowInsetsCompat, list);
                }
            }
        }

        static void l(View view, C1630m0 c1630m0, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.e(c1630m0, aVar);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    l(viewGroup.getChildAt(i7), c1630m0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(o0.e.f22336L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(o0.e.f22343S);
            if (tag instanceof a) {
                return ((a) tag).f10681a;
            }
            return null;
        }

        static WindowInsetsCompat o(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f7, int i7) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) == 0) {
                    builder.setInsets(i8, windowInsetsCompat.getInsets(i8));
                } else {
                    Insets insets = windowInsetsCompat.getInsets(i8);
                    Insets insets2 = windowInsetsCompat2.getInsets(i8);
                    float f8 = 1.0f - f7;
                    builder.setInsets(i8, WindowInsetsCompat.insetInsets(insets, (int) (((insets.left - insets2.left) * f8) + 0.5d), (int) (((insets.top - insets2.top) * f8) + 0.5d), (int) (((insets.right - insets2.right) * f8) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f8) + 0.5d)));
                }
            }
            return builder.build();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(o0.e.f22336L);
            if (bVar == null) {
                view.setTag(o0.e.f22343S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(o0.e.f22343S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    private static class e {

        private final int f10702a;

        private float f10703b;

        private final Interpolator f10704c;

        private final long f10705d;

        e(int i7, Interpolator interpolator, long j7) {
            this.f10702a = i7;
            this.f10704c = interpolator;
            this.f10705d = j7;
        }

        public long a() {
            return this.f10705d;
        }

        public float b() {
            Interpolator interpolator = this.f10704c;
            return interpolator != null ? interpolator.getInterpolation(this.f10703b) : this.f10703b;
        }

        public int c() {
            return this.f10702a;
        }

        public void d(float f7) {
            this.f10703b = f7;
        }
    }

    public C1630m0(int i7, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10673a = new d(i7, interpolator, j7);
        } else {
            this.f10673a = new c(i7, interpolator, j7);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C1630m0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1630m0(windowInsetsAnimation);
    }

    public long a() {
        return this.f10673a.a();
    }

    public float b() {
        return this.f10673a.b();
    }

    public int c() {
        return this.f10673a.c();
    }

    public void e(float f7) {
        this.f10673a.d(f7);
    }

    private static class d extends e {

        private final WindowInsetsAnimation f10697e;

        private static class a extends WindowInsetsAnimation$Callback {

            private final b f10698a;

            private List<C1630m0> f10699b;

            private ArrayList<C1630m0> f10700c;

            private final HashMap<WindowInsetsAnimation, C1630m0> f10701d;

            a(b bVar) {
                super(bVar.a());
                this.f10701d = new HashMap<>();
                this.f10698a = bVar;
            }

            private C1630m0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C1630m0 c1630m0 = this.f10701d.get(windowInsetsAnimation);
                if (c1630m0 != null) {
                    return c1630m0;
                }
                C1630m0 c1630m0F = C1630m0.f(windowInsetsAnimation);
                this.f10701d.put(windowInsetsAnimation, c1630m0F);
                return c1630m0F;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f10698a.b(a(windowInsetsAnimation));
                this.f10701d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f10698a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C1630m0> arrayList = this.f10700c;
                if (arrayList == null) {
                    ArrayList<C1630m0> arrayList2 = new ArrayList<>(list.size());
                    this.f10700c = arrayList2;
                    this.f10699b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = C1651x0.a(list.get(size));
                    C1630m0 c1630m0A = a(windowInsetsAnimationA);
                    c1630m0A.e(windowInsetsAnimationA.getFraction());
                    this.f10700c.add(c1630m0A);
                }
                return this.f10698a.d(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.f10699b).toWindowInsets();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f10698a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f10697e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C1645u0.a();
            return C1643t0.a(aVar.a().toPlatformInsets(), aVar.b().toPlatformInsets());
        }

        public static Insets f(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getUpperBound());
        }

        public static Insets g(WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override
        public long a() {
            return this.f10697e.getDurationMillis();
        }

        @Override
        public float b() {
            return this.f10697e.getInterpolatedFraction();
        }

        @Override
        public int c() {
            return this.f10697e.getTypeMask();
        }

        @Override
        public void d(float f7) {
            this.f10697e.setFraction(f7);
        }

        d(int i7, Interpolator interpolator, long j7) {
            this(C1641s0.a(i7, interpolator, j7));
        }
    }

    public static final class a {

        private final Insets f10674a;

        private final Insets f10675b;

        public a(Insets insets, Insets insets2) {
            this.f10674a = insets;
            this.f10675b = insets2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public Insets a() {
            return this.f10674a;
        }

        public Insets b() {
            return this.f10675b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f10674a + " upper=" + this.f10675b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f10674a = d.g(bounds);
            this.f10675b = d.f(bounds);
        }
    }

    private C1630m0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10673a = new d(windowInsetsAnimation);
        }
    }
}
