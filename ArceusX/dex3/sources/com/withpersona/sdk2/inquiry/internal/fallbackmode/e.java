package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;

public final class e implements C9.d<d> {
    private final C9.h<FallbackModeService> a;
    private final C9.h<w> b;
    private final C9.h<i.a> c;

    public e(C9.h<FallbackModeService> hVar, C9.h<w> hVar2, C9.h<i.a> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static e a(C9.h<FallbackModeService> hVar, C9.h<w> hVar2, C9.h<i.a> hVar3) {
        return new e(hVar, hVar2, hVar3);
    }

    public static d c(FallbackModeService fallbackModeService, w wVar, i.a aVar) {
        return new d(fallbackModeService, wVar, aVar);
    }

    public d get() {
        return c((FallbackModeService) this.a.get(), (w) this.b.get(), (i.a) this.c.get());
    }
}
