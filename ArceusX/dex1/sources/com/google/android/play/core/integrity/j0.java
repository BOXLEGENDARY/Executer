package com.google.android.play.core.integrity;

import H4.C0435h;
import android.content.Context;

final class j0 {

    private static e0 f18857a;

    static synchronized e0 a(Context context) {
        try {
            if (f18857a == null) {
                d0 d0Var = new d0(null);
                d0Var.b(C0435h.a(context));
                f18857a = d0Var.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18857a;
    }
}
