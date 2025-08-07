package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class l implements DynamiteModule.b.a {

    private final int f14441a;

    public l(int i7, int i8) {
        this.f14441a = i7;
    }

    @Override
    public final int a(Context context, String str, boolean z7) {
        return 0;
    }

    @Override
    public final int b(Context context, String str) {
        return this.f14441a;
    }
}
