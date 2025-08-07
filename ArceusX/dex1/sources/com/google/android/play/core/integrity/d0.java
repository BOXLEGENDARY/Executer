package com.google.android.play.core.integrity;

import android.content.Context;

final class d0 implements h0 {

    private Context f18827a;

    d0(z4.h hVar) {
    }

    @Override
    public final e0 a() {
        H4.C.a(this.f18827a, Context.class);
        return new e0(this.f18827a, null);
    }

    public final d0 b(Context context) {
        context.getClass();
        this.f18827a = context;
        return this;
    }
}
