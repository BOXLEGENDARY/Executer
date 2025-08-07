package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    @Override
    public final DynamiteModule.b.C0153b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0153b c0153b = new DynamiteModule.b.C0153b();
        int iA = aVar.a(context, str, false);
        c0153b.f14438b = iA;
        c0153b.f14439c = iA != 0 ? 1 : 0;
        return c0153b;
    }
}
