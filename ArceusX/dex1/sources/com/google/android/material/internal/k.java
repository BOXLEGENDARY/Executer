package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class k {

    private final ArrayList<b> f18143a = new ArrayList<>();

    private b f18144b = null;

    ValueAnimator f18145c = null;

    private final Animator.AnimatorListener f18146d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            k kVar = k.this;
            if (kVar.f18145c == animator) {
                kVar.f18145c = null;
            }
        }
    }

    static class b {

        final int[] f18148a;

        final ValueAnimator f18149b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f18148a = iArr;
            this.f18149b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f18146d);
        this.f18143a.add(bVar);
    }
}
