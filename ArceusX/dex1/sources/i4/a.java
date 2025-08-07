package i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import i4.d;

public final class a {

    class C0195a extends AnimatorListenerAdapter {

        final d f21070a;

        C0195a(d dVar) {
            this.f21070a = dVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f21070a.b();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f21070a.a();
        }
    }

    public static Animator a(d dVar, float f7, float f8, float f9) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.f21074a, (TypeEvaluator) d.b.f21072b, (Object[]) new d.e[]{new d.e(f7, f8, f9)});
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f7, (int) f8, revealInfo.f21078c, f9);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener b(d dVar) {
        return new C0195a(dVar);
    }
}
