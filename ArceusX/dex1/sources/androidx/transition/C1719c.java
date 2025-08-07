package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1733q;

public class C1719c extends AbstractC1733q {

    private static final String[] f12288g0 = {"android:clipBounds:clip"};

    static final Rect f12289h0 = new Rect();

    private static class a extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final Rect f12290a;

        private final Rect f12291b;

        private final View f12292c;

        a(View view, Rect rect, Rect rect2) {
            this.f12292c = view;
            this.f12290a = rect;
            this.f12291b = rect2;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            Rect clipBounds = this.f12292c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = C1719c.f12289h0;
            }
            this.f12292c.setTag(C1728l.f12325b, clipBounds);
            this.f12292c.setClipBounds(this.f12291b);
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            View view = this.f12292c;
            int i7 = C1728l.f12325b;
            this.f12292c.setClipBounds((Rect) view.getTag(i7));
            this.f12292c.setTag(i7, null);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                this.f12292c.setClipBounds(this.f12290a);
            } else {
                this.f12292c.setClipBounds(this.f12291b);
            }
        }
    }

    private void o0(B b2, boolean z7) {
        View view = b2.f12210b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z7 ? (Rect) view.getTag(C1728l.f12325b) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f12289h0 ? clipBounds : null;
        b2.f12209a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            b2.f12209a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override
    public String[] J() {
        return f12288g0;
    }

    @Override
    public void g(B b2) {
        o0(b2, false);
    }

    @Override
    public void j(B b2) {
        o0(b2, true);
    }

    @Override
    public Animator o(ViewGroup viewGroup, B b2, B b3) {
        if (b2 == null || b3 == null || !b2.f12209a.containsKey("android:clipBounds:clip") || !b3.f12209a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) b2.f12209a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) b3.f12209a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) b2.f12209a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) b3.f12209a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        b3.f12210b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(b3.f12210b, (Property<View, V>) F.f12227c, (TypeEvaluator) new C1729m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(b3.f12210b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        a(aVar);
        return objectAnimatorOfObject;
    }
}
