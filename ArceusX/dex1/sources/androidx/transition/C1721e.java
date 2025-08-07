package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1733q;

public class C1721e extends T {

    private static class a extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final View f12301a;

        private boolean f12302b = false;

        a(View view) {
            this.f12301a = view;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            this.f12301a.setTag(C1728l.f12328e, Float.valueOf(this.f12301a.getVisibility() == 0 ? F.b(this.f12301a) : 0.0f));
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void f(AbstractC1733q abstractC1733q, boolean z7) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            this.f12301a.setTag(C1728l.f12328e, null);
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            F.e(this.f12301a, 1.0f);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            if (this.f12301a.hasOverlappingRendering() && this.f12301a.getLayerType() == 0) {
                this.f12302b = true;
                this.f12301a.setLayerType(2, null);
            }
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f12302b) {
                this.f12301a.setLayerType(0, null);
            }
            if (z7) {
                return;
            }
            F.e(this.f12301a, 1.0f);
            F.a(this.f12301a);
        }
    }

    public C1721e(int i7) {
        u0(i7);
    }

    private Animator v0(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        F.e(view, f7);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, F.f12226b, f8);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        C().a(aVar);
        return objectAnimatorOfFloat;
    }

    private static float w0(B b2, float f7) {
        Float f8;
        return (b2 == null || (f8 = (Float) b2.f12209a.get("android:fade:transitionAlpha")) == null) ? f7 : f8.floatValue();
    }

    @Override
    public void j(B b2) {
        super.j(b2);
        Float fValueOf = (Float) b2.f12210b.getTag(C1728l.f12328e);
        if (fValueOf == null) {
            fValueOf = b2.f12210b.getVisibility() == 0 ? Float.valueOf(F.b(b2.f12210b)) : Float.valueOf(0.0f);
        }
        b2.f12209a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override
    public Animator q0(ViewGroup viewGroup, View view, B b2, B b3) {
        F.c(view);
        return v0(view, w0(b2, 0.0f), 1.0f);
    }

    @Override
    public Animator s0(ViewGroup viewGroup, View view, B b2, B b3) {
        F.c(view);
        Animator animatorV0 = v0(view, w0(b2, 1.0f), 0.0f);
        if (animatorV0 == null) {
            F.e(view, w0(b3, 1.0f));
        }
        return animatorV0;
    }

    public C1721e() {
    }
}
