package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Resources;
import android.view.View;
import c4.C1746b;
import c4.C1751g;

class e {

    private static final int[] f17269a = {R.attr.stateListAnimator};

    static void a(View view, float f7) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(C1751g.f12897a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j7 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C1746b.f12732a0, -C1746b.f12734b0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j7));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f7).setDuration(j7));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
