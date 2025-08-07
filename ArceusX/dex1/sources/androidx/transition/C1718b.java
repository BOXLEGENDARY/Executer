package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1733q;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.util.Map;

public class C1718b extends AbstractC1733q {

    private static final String[] f12255h0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    private static final Property<i, PointF> f12256i0 = new a(PointF.class, "topLeft");

    private static final Property<i, PointF> f12257j0 = new C0121b(PointF.class, "bottomRight");

    private static final Property<View, PointF> f12258k0 = new c(PointF.class, "bottomRight");

    private static final Property<View, PointF> f12259l0 = new d(PointF.class, "topLeft");

    private static final Property<View, PointF> f12260m0 = new e(PointF.class, "position");

    private static final C1729m f12261n0 = new C1729m();

    private boolean f12262g0 = false;

    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public PointF get(i iVar) {
            return null;
        }

        @Override
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    class C0121b extends Property<i, PointF> {
        C0121b(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public PointF get(i iVar) {
            return null;
        }

        @Override
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public PointF get(View view) {
            return null;
        }

        @Override
        public void set(View view, PointF pointF) {
            F.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public PointF get(View view) {
            return null;
        }

        @Override
        public void set(View view, PointF pointF) {
            F.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public PointF get(View view) {
            return null;
        }

        @Override
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            F.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class f extends AnimatorListenerAdapter {

        final i f12263a;
        private final i mViewBounds;

        f(i iVar) {
            this.f12263a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final View f12265a;

        private final Rect f12266b;

        private final boolean f12267c;

        private final Rect f12268d;

        private final boolean f12269e;

        private final int f12270f;

        private final int f12271g;

        private final int f12272h;

        private final int f12273i;

        private final int f12274j;

        private final int f12275k;

        private final int f12276l;

        private final int f12277m;

        private boolean f12278n;

        g(View view, Rect rect, boolean z7, Rect rect2, boolean z8, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f12265a = view;
            this.f12266b = rect;
            this.f12267c = z7;
            this.f12268d = rect2;
            this.f12269e = z8;
            this.f12270f = i7;
            this.f12271g = i8;
            this.f12272h = i9;
            this.f12273i = i10;
            this.f12274j = i11;
            this.f12275k = i12;
            this.f12276l = i13;
            this.f12277m = i14;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            this.f12265a.setTag(C1728l.f12325b, this.f12265a.getClipBounds());
            this.f12265a.setClipBounds(this.f12269e ? null : this.f12268d);
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
            this.f12278n = true;
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            View view = this.f12265a;
            int i7 = C1728l.f12325b;
            Rect rect = (Rect) view.getTag(i7);
            this.f12265a.setTag(i7, null);
            this.f12265a.setClipBounds(rect);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f12278n) {
                return;
            }
            Rect rect = null;
            if (z7) {
                if (!this.f12267c) {
                    rect = this.f12266b;
                }
            } else if (!this.f12269e) {
                rect = this.f12268d;
            }
            this.f12265a.setClipBounds(rect);
            if (z7) {
                F.d(this.f12265a, this.f12270f, this.f12271g, this.f12272h, this.f12273i);
            } else {
                F.d(this.f12265a, this.f12274j, this.f12275k, this.f12276l, this.f12277m);
            }
        }

        @Override
        public void onAnimationStart(Animator animator, boolean z7) {
            int iMax = Math.max(this.f12272h - this.f12270f, this.f12276l - this.f12274j);
            int iMax2 = Math.max(this.f12273i - this.f12271g, this.f12277m - this.f12275k);
            int i7 = z7 ? this.f12274j : this.f12270f;
            int i8 = z7 ? this.f12275k : this.f12271g;
            F.d(this.f12265a, i7, i8, iMax + i7, iMax2 + i8);
            this.f12265a.setClipBounds(z7 ? this.f12268d : this.f12266b);
        }
    }

    private static class h extends w {

        boolean f12279a = false;

        final ViewGroup f12280b;

        h(ViewGroup viewGroup) {
            this.f12280b = viewGroup;
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            E.b(this.f12280b, false);
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            if (!this.f12279a) {
                E.b(this.f12280b, false);
            }
            abstractC1733q.a0(this);
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
            E.b(this.f12280b, false);
            this.f12279a = true;
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            E.b(this.f12280b, true);
        }
    }

    private static class i {

        private int f12281a;

        private int f12282b;

        private int f12283c;

        private int f12284d;

        private final View f12285e;

        private int f12286f;

        private int f12287g;

        i(View view) {
            this.f12285e = view;
        }

        private void b() {
            F.d(this.f12285e, this.f12281a, this.f12282b, this.f12283c, this.f12284d);
            this.f12286f = 0;
            this.f12287g = 0;
        }

        void a(PointF pointF) {
            this.f12283c = Math.round(pointF.x);
            this.f12284d = Math.round(pointF.y);
            int i7 = this.f12287g + 1;
            this.f12287g = i7;
            if (this.f12286f == i7) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f12281a = Math.round(pointF.x);
            this.f12282b = Math.round(pointF.y);
            int i7 = this.f12286f + 1;
            this.f12286f = i7;
            if (i7 == this.f12287g) {
                b();
            }
        }
    }

    private void o0(B b2) {
        View view = b2.f12210b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        b2.f12209a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        b2.f12209a.put("android:changeBounds:parent", b2.f12210b.getParent());
        if (this.f12262g0) {
            b2.f12209a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override
    public String[] J() {
        return f12255h0;
    }

    @Override
    public void g(B b2) {
        o0(b2);
    }

    @Override
    public void j(B b2) {
        Rect rect;
        o0(b2);
        if (!this.f12262g0 || (rect = (Rect) b2.f12210b.getTag(C1728l.f12325b)) == null) {
            return;
        }
        b2.f12209a.put("android:changeBounds:clip", rect);
    }

    @Override
    public Animator o(ViewGroup viewGroup, B b2, B b3) {
        int i7;
        View view;
        int i8;
        int i9;
        int i10;
        ObjectAnimator objectAnimatorA;
        int i11;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (b2 == null || b3 == null) {
            return null;
        }
        Map<String, Object> map = b2.f12209a;
        Map<String, Object> map2 = b3.f12209a;
        String str = GObvYfBKohxpYX.uZkU;
        ViewGroup viewGroup2 = (ViewGroup) map.get(str);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = b3.f12210b;
        Rect rect = (Rect) b2.f12209a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) b3.f12209a.get("android:changeBounds:bounds");
        int i12 = rect.left;
        int i13 = rect2.left;
        int i14 = rect.top;
        int i15 = rect2.top;
        int i16 = rect.right;
        int i17 = rect2.right;
        int i18 = rect.bottom;
        int i19 = rect2.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect3 = (Rect) b2.f12209a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) b3.f12209a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i7 = 0;
        } else {
            i7 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        if (this.f12262g0) {
            view = view2;
            F.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            if (i12 == i13 && i14 == i15) {
                i8 = i17;
                i9 = i16;
                i10 = i14;
                objectAnimatorA = null;
            } else {
                i8 = i17;
                i9 = i16;
                i10 = i14;
                objectAnimatorA = C1726j.a(view, f12260m0, z().a(i12, i14, i13, i15));
            }
            boolean z7 = rect3 == null;
            if (z7) {
                i11 = 0;
                rect3 = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
            }
            Rect rect5 = rect3;
            int i24 = rect4 == null ? 1 : i11;
            Rect rect6 = i24 != 0 ? new Rect(i11, i11, i22, i23) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f12261n0, rect5, rect6);
                g gVar = new g(view, rect5, z7, rect6, i24, i12, i10, i9, i18, i13, i15, i8, i19);
                objectAnimatorOfObject.addListener(gVar);
                a(gVar);
            }
            animatorC = A.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            view = view2;
            F.d(view, i12, i14, i16, i18);
            if (i7 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? C1726j.a(view, f12258k0, z().a(i16, i18, i17, i19)) : C1726j.a(view, f12259l0, z().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = C1726j.a(view, f12260m0, z().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = C1726j.a(iVar, f12256i0, z().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = C1726j.a(iVar, f12257j0, z().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            E.b(viewGroup4, true);
            C().a(new h(viewGroup4));
        }
        return animatorC;
    }
}
