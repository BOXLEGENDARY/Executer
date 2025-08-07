package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.L;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;

class C1664i {
    private static int a(Fragment fragment, boolean z7, boolean z8) {
        return z8 ? z7 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z7 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static a b(Context context, Fragment fragment, boolean z7, boolean z8) throws Resources.NotFoundException {
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z7, z8);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i7 = M0.b.f2346c;
            if (viewGroup.getTag(i7) != null) {
                fragment.mContainer.setTag(i7, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z7, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z7, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z7);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e8) {
                    if (zEquals) {
                        throw e8;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i7) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i7, boolean z7) {
        if (i7 == 4097) {
            return z7 ? M0.a.f2342e : M0.a.f2343f;
        }
        if (i7 == 8194) {
            return z7 ? M0.a.f2338a : M0.a.f2339b;
        }
        if (i7 == 8197) {
            return z7 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i7 == 4099) {
            return z7 ? M0.a.f2340c : M0.a.f2341d;
        }
        if (i7 != 4100) {
            return -1;
        }
        return z7 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {

        public final Animation f11200a;

        public final Animator f11201b;

        a(Animation animation) {
            this.f11200a = animation;
            this.f11201b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f11200a = null;
            this.f11201b = animator;
            if (animator == null) {
                throw new IllegalStateException(sMlEMqrxoGI.vrRZBwAjqroQvtY);
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        private final ViewGroup f11202d;

        private final View f11203e;

        private boolean f11204i;

        private boolean f11205v;

        private boolean f11206w;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f11206w = true;
            this.f11202d = viewGroup;
            this.f11203e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f11206w = true;
            if (this.f11204i) {
                return !this.f11205v;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f11204i = true;
                L.a(this.f11202d, this);
            }
            return true;
        }

        @Override
        public void run() {
            if (this.f11204i || !this.f11206w) {
                this.f11202d.endViewTransition(this.f11203e);
                this.f11205v = true;
            } else {
                this.f11206w = false;
                this.f11202d.post(this);
            }
        }

        @Override
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f11206w = true;
            if (this.f11204i) {
                return !this.f11205v;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f11204i = true;
                L.a(this.f11202d, this);
            }
            return true;
        }
    }
}
