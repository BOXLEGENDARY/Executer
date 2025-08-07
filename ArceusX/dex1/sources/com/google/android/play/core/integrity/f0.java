package com.google.android.play.core.integrity;

import android.content.Context;

final class f0 implements InterfaceC2336t {

    private Context f18835a;

    f0(z4.j jVar) {
    }

    @Override
    public final InterfaceC2337u a() {
        H4.C.a(this.f18835a, Context.class);
        return new g0(this.f18835a, null);
    }

    public final f0 b(Context context) {
        context.getClass();
        this.f18835a = context;
        return this;
    }
}
