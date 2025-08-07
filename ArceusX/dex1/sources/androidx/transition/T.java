package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1733q;

public abstract class T extends AbstractC1733q {

    private static final String[] f12235h0 = {"android:visibility:visibility", "android:visibility:parent"};

    private int f12236g0 = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final View f12237a;

        private final int f12238b;

        private final ViewGroup f12239c;

        private final boolean f12240d;

        private boolean f12241e;

        boolean f12242f = false;

        a(View view, int i7, boolean z7) {
            this.f12237a = view;
            this.f12238b = i7;
            this.f12239c = (ViewGroup) view.getParent();
            this.f12240d = z7;
            i(true);
        }

        private void h() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f12242f) {
                F.f(this.f12237a, this.f12238b);
                ViewGroup viewGroup = this.f12239c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z7) {
            ViewGroup viewGroup;
            if (!this.f12240d || this.f12241e == z7 || (viewGroup = this.f12239c) == null) {
                return;
            }
            this.f12241e = z7;
            E.b(viewGroup, z7);
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(false);
            if (this.f12242f) {
                return;
            }
            F.f(this.f12237a, this.f12238b);
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            abstractC1733q.a0(this);
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(true);
            if (this.f12242f) {
                return;
            }
            F.f(this.f12237a, 0);
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f12242f = true;
        }

        @Override
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h();
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
        }

        @Override
        public void onAnimationStart(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z7) {
                return;
            }
            h();
        }

        @Override
        public void onAnimationStart(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z7) {
                F.f(this.f12237a, 0);
                ViewGroup viewGroup = this.f12239c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final ViewGroup f12243a;

        private final View f12244b;

        private final View f12245c;

        private boolean f12246d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f12243a = viewGroup;
            this.f12244b = view;
            this.f12245c = view2;
        }

        private void h() {
            this.f12245c.setTag(C1728l.f12324a, null);
            this.f12243a.getOverlay().remove(this.f12244b);
            this.f12246d = false;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            abstractC1733q.a0(this);
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
            if (this.f12246d) {
                h();
            }
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override
        public void onAnimationPause(Animator animator) {
            this.f12243a.getOverlay().remove(this.f12244b);
        }

        @Override
        public void onAnimationResume(Animator animator) {
            if (this.f12244b.getParent() == null) {
                this.f12243a.getOverlay().add(this.f12244b);
            } else {
                T.this.cancel();
            }
        }

        @Override
        public void onAnimationStart(Animator animator, boolean z7) {
            if (z7) {
                this.f12245c.setTag(C1728l.f12324a, this.f12244b);
                this.f12243a.getOverlay().add(this.f12244b);
                this.f12246d = true;
            }
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            h();
        }
    }

    private static class c {

        boolean f12248a;

        boolean f12249b;

        int f12250c;

        int f12251d;

        ViewGroup f12252e;

        ViewGroup f12253f;

        c() {
        }
    }

    private void o0(B b2) {
        b2.f12209a.put("android:visibility:visibility", Integer.valueOf(b2.f12210b.getVisibility()));
        b2.f12209a.put("android:visibility:parent", b2.f12210b.getParent());
        int[] iArr = new int[2];
        b2.f12210b.getLocationOnScreen(iArr);
        b2.f12209a.put("android:visibility:screenLocation", iArr);
    }

    private c p0(B b2, B b3) {
        c cVar = new c();
        cVar.f12248a = false;
        cVar.f12249b = false;
        if (b2 == null || !b2.f12209a.containsKey("android:visibility:visibility")) {
            cVar.f12250c = -1;
            cVar.f12252e = null;
        } else {
            cVar.f12250c = ((Integer) b2.f12209a.get("android:visibility:visibility")).intValue();
            cVar.f12252e = (ViewGroup) b2.f12209a.get("android:visibility:parent");
        }
        if (b3 == null || !b3.f12209a.containsKey("android:visibility:visibility")) {
            cVar.f12251d = -1;
            cVar.f12253f = null;
        } else {
            cVar.f12251d = ((Integer) b3.f12209a.get("android:visibility:visibility")).intValue();
            cVar.f12253f = (ViewGroup) b3.f12209a.get("android:visibility:parent");
        }
        if (b2 != null && b3 != null) {
            int i7 = cVar.f12250c;
            int i8 = cVar.f12251d;
            if (i7 == i8 && cVar.f12252e == cVar.f12253f) {
                return cVar;
            }
            if (i7 != i8) {
                if (i7 == 0) {
                    cVar.f12249b = false;
                    cVar.f12248a = true;
                } else if (i8 == 0) {
                    cVar.f12249b = true;
                    cVar.f12248a = true;
                }
            } else if (cVar.f12253f == null) {
                cVar.f12249b = false;
                cVar.f12248a = true;
            } else if (cVar.f12252e == null) {
                cVar.f12249b = true;
                cVar.f12248a = true;
            }
        } else if (b2 == null && cVar.f12251d == 0) {
            cVar.f12249b = true;
            cVar.f12248a = true;
        } else if (b3 == null && cVar.f12250c == 0) {
            cVar.f12249b = false;
            cVar.f12248a = true;
        }
        return cVar;
    }

    @Override
    public String[] J() {
        return f12235h0;
    }

    @Override
    public boolean M(B b2, B b3) {
        if (b2 == null && b3 == null) {
            return false;
        }
        if (b2 != null && b3 != null && b3.f12209a.containsKey("android:visibility:visibility") != b2.f12209a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarP0 = p0(b2, b3);
        if (cVarP0.f12248a) {
            return cVarP0.f12250c == 0 || cVarP0.f12251d == 0;
        }
        return false;
    }

    @Override
    public void g(B b2) {
        o0(b2);
    }

    @Override
    public void j(B b2) {
        o0(b2);
    }

    @Override
    public Animator o(ViewGroup viewGroup, B b2, B b3) {
        c cVarP0 = p0(b2, b3);
        if (!cVarP0.f12248a) {
            return null;
        }
        if (cVarP0.f12252e == null && cVarP0.f12253f == null) {
            return null;
        }
        return cVarP0.f12249b ? r0(viewGroup, b2, cVarP0.f12250c, b3, cVarP0.f12251d) : t0(viewGroup, b2, cVarP0.f12250c, b3, cVarP0.f12251d);
    }

    public abstract Animator q0(ViewGroup viewGroup, View view, B b2, B b3);

    public Animator r0(ViewGroup viewGroup, B b2, int i7, B b3, int i8) {
        if ((this.f12236g0 & 1) != 1 || b3 == null) {
            return null;
        }
        if (b2 == null) {
            View view = (View) b3.f12210b.getParent();
            if (p0(x(view, false), L(view, false)).f12248a) {
                return null;
            }
        }
        return q0(viewGroup, b3.f12210b, b2, b3);
    }

    public abstract Animator s0(ViewGroup viewGroup, View view, B b2, B b3);

    public android.animation.Animator t0(android.view.ViewGroup r18, androidx.transition.B r19, int r20, androidx.transition.B r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.T.t0(android.view.ViewGroup, androidx.transition.B, int, androidx.transition.B, int):android.animation.Animator");
    }

    public void u0(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f12236g0 = i7;
    }
}
