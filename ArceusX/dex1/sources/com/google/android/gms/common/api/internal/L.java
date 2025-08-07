package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class L extends m3.r {

    final Dialog f14093a;

    final M f14094b;

    L(M m7, Dialog dialog) {
        this.f14094b = m7;
        this.f14093a = dialog;
    }

    @Override
    public final void a() {
        this.f14094b.f14097e.o();
        if (this.f14093a.isShowing()) {
            this.f14093a.dismiss();
        }
    }
}
