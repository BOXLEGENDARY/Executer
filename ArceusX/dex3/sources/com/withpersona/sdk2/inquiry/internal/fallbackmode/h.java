package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;

public final class h implements f.a {
    private final g a;

    h(g gVar) {
        this.a = gVar;
    }

    public static C9.h<f.a> b(g gVar) {
        return C9.e.a(new h(gVar));
    }

    @Override
    public f a(int i) {
        return this.a.b(i);
    }
}
