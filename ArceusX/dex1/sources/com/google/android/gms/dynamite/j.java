package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class j implements DynamiteModule.b {
    j() {
    }

    @Override
    public final DynamiteModule.b.C0153b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int iA;
        DynamiteModule.b.C0153b c0153b = new DynamiteModule.b.C0153b();
        int iB = aVar.b(context, str);
        c0153b.f14437a = iB;
        int i7 = 1;
        int i8 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0153b.f14438b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0153b.f14438b = iA;
        }
        int i9 = c0153b.f14437a;
        if (i9 == 0) {
            if (iA == 0) {
                i7 = 0;
            }
            c0153b.f14439c = i7;
            return c0153b;
        }
        i8 = i9;
        if (iA < i8) {
            i7 = -1;
        }
        c0153b.f14439c = i7;
        return c0153b;
    }
}
