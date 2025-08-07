package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.AbstractC1733q;

class D {
    static Animator a(View view, B b2, int i7, int i8, float f7, float f8, float f9, float f10, TimeInterpolator timeInterpolator, AbstractC1733q abstractC1733q) {
        float f11;
        float f12;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) b2.f12210b.getTag(C1728l.f12329f)) != null) {
            f11 = (r7[0] - i7) + translationX;
            f12 = (r7[1] - i8) + translationY;
        } else {
            f11 = f7;
            f12 = f8;
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
        if (f11 == f9 && f12 == f10) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f9), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f12, f10));
        a aVar = new a(view, b2.f12210b, translationX, translationY);
        abstractC1733q.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class a extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final View f12216a;

        private final View f12217b;

        private int[] f12218c;

        private float f12219d;

        private float f12220e;

        private final float f12221f;

        private final float f12222g;

        private boolean f12223h;

        a(View view, View view2, float f7, float f8) {
            this.f12217b = view;
            this.f12216a = view2;
            this.f12221f = f7;
            this.f12222g = f8;
            int i7 = C1728l.f12329f;
            int[] iArr = (int[]) view2.getTag(i7);
            this.f12218c = iArr;
            if (iArr != null) {
                view2.setTag(i7, null);
            }
        }

        private void h() {
            if (this.f12218c == null) {
                this.f12218c = new int[2];
            }
            this.f12217b.getLocationOnScreen(this.f12218c);
            this.f12216a.setTag(C1728l.f12329f, this.f12218c);
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            h();
            this.f12219d = this.f12217b.getTranslationX();
            this.f12220e = this.f12217b.getTranslationY();
            this.f12217b.setTranslationX(this.f12221f);
            this.f12217b.setTranslationY(this.f12222g);
        }

        @Override
        public void c(AbstractC1733q abstractC1733q, boolean z7) {
            if (this.f12223h) {
                return;
            }
            this.f12216a.setTag(C1728l.f12329f, null);
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            c(abstractC1733q, false);
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
            this.f12223h = true;
            this.f12217b.setTranslationX(this.f12221f);
            this.f12217b.setTranslationY(this.f12222g);
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            this.f12217b.setTranslationX(this.f12219d);
            this.f12217b.setTranslationY(this.f12220e);
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f12223h = true;
            this.f12217b.setTranslationX(this.f12221f);
            this.f12217b.setTranslationY(this.f12222g);
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            this.f12217b.setTranslationX(this.f12221f);
            this.f12217b.setTranslationY(this.f12222g);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
