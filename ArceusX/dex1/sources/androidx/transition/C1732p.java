package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class C1732p extends T {

    private static final TimeInterpolator f12339k0 = new DecelerateInterpolator();

    private static final TimeInterpolator f12340l0 = new AccelerateInterpolator();

    private static final g f12341m0 = new a();

    private static final g f12342n0 = new b();

    private static final g f12343o0 = new c();

    private static final g f12344p0 = new d();

    private static final g f12345q0 = new e();

    private static final g f12346r0 = new f();

    private g f12347i0 = f12346r0;

    private int f12348j0 = 80;

    class a extends h {
        a() {
            super(null);
        }

        @Override
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class b extends h {
        b() {
            super(null);
        }

        @Override
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class c extends i {
        c() {
            super(null);
        }

        @Override
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    class d extends h {
        d() {
            super(null);
        }

        @Override
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class e extends h {
        e() {
            super(null);
        }

        @Override
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class f extends i {
        f() {
            super(null);
        }

        @Override
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        @Override
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        h(a aVar) {
            this();
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        @Override
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        i(a aVar) {
            this();
        }
    }

    public C1732p(int i7) {
        v0(i7);
    }

    private void o0(B b2) {
        int[] iArr = new int[2];
        b2.f12210b.getLocationOnScreen(iArr);
        b2.f12209a.put("android:slide:screenPosition", iArr);
    }

    @Override
    public void g(B b2) {
        super.g(b2);
        o0(b2);
    }

    @Override
    public void j(B b2) {
        super.j(b2);
        o0(b2);
    }

    @Override
    public Animator q0(ViewGroup viewGroup, View view, B b2, B b3) {
        if (b3 == null) {
            return null;
        }
        int[] iArr = (int[]) b3.f12209a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return D.a(view, b3, iArr[0], iArr[1], this.f12347i0.b(viewGroup, view), this.f12347i0.a(viewGroup, view), translationX, translationY, f12339k0, this);
    }

    @Override
    public Animator s0(ViewGroup viewGroup, View view, B b2, B b3) {
        if (b2 == null) {
            return null;
        }
        int[] iArr = (int[]) b2.f12209a.get("android:slide:screenPosition");
        return D.a(view, b2, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f12347i0.b(viewGroup, view), this.f12347i0.a(viewGroup, view), f12340l0, this);
    }

    public void v0(int i7) {
        if (i7 == 3) {
            this.f12347i0 = f12341m0;
        } else if (i7 == 5) {
            this.f12347i0 = f12344p0;
        } else if (i7 == 48) {
            this.f12347i0 = f12343o0;
        } else if (i7 == 80) {
            this.f12347i0 = f12346r0;
        } else if (i7 == 8388611) {
            this.f12347i0 = f12342n0;
        } else {
            if (i7 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f12347i0 = f12345q0;
        }
        this.f12348j0 = i7;
        C1731o c1731o = new C1731o();
        c1731o.j(i7);
        k0(c1731o);
    }
}
