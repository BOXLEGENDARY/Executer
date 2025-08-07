package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    private AnimatorSet f18749b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f18749b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override
    protected boolean H(View view, View view2, boolean z7, boolean z8) {
        AnimatorSet animatorSet = this.f18749b;
        boolean z9 = animatorSet != null;
        if (z9) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetJ = J(view, view2, z7, z9);
        this.f18749b = animatorSetJ;
        animatorSetJ.addListener(new a());
        this.f18749b.start();
        if (!z8) {
            this.f18749b.end();
        }
        return true;
    }

    protected abstract AnimatorSet J(View view, View view2, boolean z7, boolean z8);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
