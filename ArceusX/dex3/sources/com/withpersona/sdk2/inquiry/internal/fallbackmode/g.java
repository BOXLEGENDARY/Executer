package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;

public final class g {
    private final C9.h<w> a;
    private final C9.h<Context> b;
    private final C9.h<i.a> c;

    public g(C9.h<w> hVar, C9.h<Context> hVar2, C9.h<i.a> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static g a(C9.h<w> hVar, C9.h<Context> hVar2, C9.h<i.a> hVar3) {
        return new g(hVar, hVar2, hVar3);
    }

    public static f c(w wVar, Context context, i.a aVar, int i) {
        return new f(wVar, context, aVar, i);
    }

    public f b(int i) {
        return c((w) this.a.get(), (Context) this.b.get(), (i.a) this.c.get(), i);
    }
}
