package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import u5.H;

public final class d {
    private final C9.h<Context> a;
    private final C9.h<H> b;

    public d(C9.h<Context> hVar, C9.h<H> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static d a(C9.h<Context> hVar, C9.h<H> hVar2) {
        return new d(hVar, hVar2);
    }

    public static c c(Context context, H h, Selfie.b bVar) {
        return new c(context, h, bVar);
    }

    public c b(Selfie.b bVar) {
        return c((Context) this.a.get(), (H) this.b.get(), bVar);
    }
}
