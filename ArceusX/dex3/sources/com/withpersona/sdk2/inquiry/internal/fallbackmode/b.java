package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;

public final class b implements C9.d<I8.a> {
    private final a a;
    private final C9.h<d> b;
    private final C9.h<f.a> c;

    public b(a aVar, C9.h<d> hVar, C9.h<f.a> hVar2) {
        this.a = aVar;
        this.b = hVar;
        this.c = hVar2;
    }

    public static I8.a a(a aVar, d dVar, f.a aVar2) {
        return (I8.a) C9.g.d(aVar.a(dVar, aVar2));
    }

    public static b b(a aVar, C9.h<d> hVar, C9.h<f.a> hVar2) {
        return new b(aVar, hVar, hVar2);
    }

    public I8.a get() {
        return a(this.a, (d) this.b.get(), (f.a) this.c.get());
    }
}
