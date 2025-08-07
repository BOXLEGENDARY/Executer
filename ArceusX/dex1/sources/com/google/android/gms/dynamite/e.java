package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.b {
    e() {
    }

    @Override
    public final DynamiteModule.b.C0153b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0153b c0153b = new DynamiteModule.b.C0153b();
        int iB = aVar.b(context, str);
        c0153b.f14437a = iB;
        if (iB != 0) {
            c0153b.f14439c = -1;
        } else {
            int iA = aVar.a(context, str, true);
            c0153b.f14438b = iA;
            if (iA != 0) {
                c0153b.f14439c = 1;
            }
        }
        return c0153b;
    }
}
