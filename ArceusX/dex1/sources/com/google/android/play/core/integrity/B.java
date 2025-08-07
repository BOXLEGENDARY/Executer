package com.google.android.play.core.integrity;

import H4.C0437j;
import a4.C1574k;
import android.content.Context;

final class B extends H4.V {

    final Context f18778e;

    final J f18779i;

    B(J j7, C1574k c1574k, Context context) {
        super(c1574k);
        this.f18778e = context;
        this.f18779i = j7;
    }

    @Override
    protected final void b() {
        this.f18779i.f18799c.e(Integer.valueOf(C0437j.a(this.f18778e)));
    }
}
