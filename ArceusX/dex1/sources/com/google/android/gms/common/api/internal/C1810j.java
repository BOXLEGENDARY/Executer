package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import l3.AbstractC2535j;

final class C1810j implements AbstractC2535j.a {

    final BasePendingResult f14156a;

    final C1812l f14157b;

    C1810j(C1812l c1812l, BasePendingResult basePendingResult) {
        this.f14157b = c1812l;
        this.f14156a = basePendingResult;
    }

    @Override
    public final void a(Status status) {
        this.f14157b.f14160a.remove(this.f14156a);
    }
}
