package com.google.android.play.core.integrity;

import H4.C0434g;
import a4.C1574k;

abstract class I extends H4.V {

    final J f18796e;

    I(J j7, C1574k c1574k) {
        super(c1574k);
        this.f18796e = j7;
    }

    @Override
    public final void a(Exception exc) {
        if (!(exc instanceof C0434g)) {
            super.a(exc);
        } else if (J.j(this.f18796e)) {
            super.a(new C2319b(-2, exc));
        } else {
            super.a(new C2319b(-9, exc));
        }
    }
}
