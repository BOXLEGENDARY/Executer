package com.google.android.gms.common.api.internal;

import m3.C2567H;

final class P {

    final BasePendingResult f14102a;

    P(BasePendingResult basePendingResult, C2567H c2567h) {
        this.f14102a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.k(this.f14102a.f14076h);
        super.finalize();
    }
}
