package com.google.mlkit.vision.barcode.internal;

import O3.C0828y9;
import O3.K9;
import android.content.Context;
import com.google.android.gms.common.C1819d;
import o5.AbstractC2688e;
import o5.C2692i;
import q5.C2735b;

public final class f extends AbstractC2688e {

    private final C2692i f19252b;

    public f(C2692i c2692i) {
        this.f19252b = c2692i;
    }

    @Override
    protected final Object a(Object obj) {
        C2735b c2735b = (C2735b) obj;
        Context contextB = this.f19252b.b();
        C0828y9 c0828y9B = K9.b(b.d());
        return new i(this.f19252b, c2735b, (k.c(contextB) || C1819d.f().a(contextB) >= 204500000) ? new k(contextB, c2735b, c0828y9B) : new l(contextB, c2735b, c0828y9B), c0828y9B);
    }
}
