package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.C2389b;
import d4.C2396i;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    private final C2396i f18770c;

    private final C2396i f18771d;

    class a extends AnimatorListenerAdapter {

        final boolean f18772a;

        final View f18773b;

        a(boolean z7, View view) {
            this.f18772a = z7;
            this.f18773b = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.f18772a) {
                return;
            }
            this.f18773b.setVisibility(4);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            if (this.f18772a) {
                this.f18773b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f18770c = new C2396i(75L, 150L);
        this.f18771d = new C2396i(0L, 150L);
    }

    private void K(View view, boolean z7, boolean z8, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        C2396i c2396i = z7 ? this.f18770c : this.f18771d;
        if (z7) {
            if (!z8) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c2396i.a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.D(coordinatorLayout, view, motionEvent);
    }

    @Override
    protected AnimatorSet J(View view, View view2, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        K(view2, z7, z8, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C2389b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z7, view2));
        return animatorSet;
    }

    @Override
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18770c = new C2396i(75L, 150L);
        this.f18771d = new C2396i(0L, 150L);
    }
}
