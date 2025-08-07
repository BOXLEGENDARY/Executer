package com.google.android.play.core.integrity;

import H4.C0435h;
import android.content.Context;

final class C2338v {

    private static InterfaceC2337u f18879a;

    static synchronized InterfaceC2337u a(Context context) {
        try {
            if (f18879a == null) {
                f0 f0Var = new f0(null);
                f0Var.b(C0435h.a(context));
                f18879a = f0Var.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18879a;
    }
}
