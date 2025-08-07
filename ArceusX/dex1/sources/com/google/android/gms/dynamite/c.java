package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class c implements DynamiteModule.b.a {
    c() {
    }

    @Override
    public final int a(Context context, String str, boolean z7) throws DynamiteModule.a {
        return DynamiteModule.f(context, str, z7);
    }

    @Override
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
