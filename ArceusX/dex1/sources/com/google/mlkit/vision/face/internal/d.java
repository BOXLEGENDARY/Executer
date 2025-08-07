package com.google.mlkit.vision.face.internal;

import R3.C1130n6;
import R3.y6;
import android.content.Context;
import com.google.android.gms.common.C1819d;
import o5.AbstractC2688e;
import o5.C2692i;
import w5.C2976e;

public final class d extends AbstractC2688e {

    private final C2692i f19314b;

    public d(C2692i c2692i) {
        this.f19314b = c2692i;
    }

    @Override
    protected final Object a(Object obj) {
        C2976e c2976e = (C2976e) obj;
        Context contextB = this.f19314b.b();
        C1130n6 c1130n6B = y6.b(h.b());
        return new g(y6.b(h.b()), c2976e, (a.a(contextB) || C1819d.f().a(contextB) >= 204500000) ? new a(contextB, c2976e, c1130n6B) : new j(contextB, c2976e, c1130n6B));
    }
}
