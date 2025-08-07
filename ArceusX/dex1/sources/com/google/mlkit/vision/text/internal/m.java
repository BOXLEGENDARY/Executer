package com.google.mlkit.vision.text.internal;

import S3.C1440r9;
import S3.C9;
import android.content.Context;
import com.google.android.gms.common.C1819d;
import o5.AbstractC2688e;
import o5.C2692i;

public final class m extends AbstractC2688e {

    private final C2692i f19362b;

    public m(C2692i c2692i) {
        this.f19362b = c2692i;
    }

    @Override
    protected final Object a(Object obj) {
        z5.d dVar = (z5.d) obj;
        C1440r9 c1440r9B = C9.b(dVar.c());
        Context contextB = this.f19362b.b();
        return new c(c1440r9B, (C1819d.f().a(contextB) >= 204700000 || dVar.g()) ? new e(contextB, dVar, c1440r9B) : new f(contextB), dVar);
    }
}
