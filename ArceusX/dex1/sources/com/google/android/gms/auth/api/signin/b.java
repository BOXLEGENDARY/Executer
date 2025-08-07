package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import e3.C2419a;
import j3.m;
import l3.AbstractC2531f;
import m3.C2570a;
import n3.C2650h;

@Deprecated
public class b extends AbstractC2531f<GoogleSignInOptions> {

    private static final f f14013k = new f(null);

    static int f14014l = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C2419a.f20406b, googleSignInOptions, new AbstractC2531f.a.C0205a().c(new C2570a()).a());
    }

    private final synchronized int F() {
        int i7;
        try {
            i7 = f14014l;
            if (i7 == 1) {
                Context contextV = v();
                C1818c c1818cN = C1818c.n();
                int iH = c1818cN.h(contextV, 12451000);
                if (iH == 0) {
                    i7 = 4;
                    f14014l = 4;
                } else if (c1818cN.b(contextV, iH, null) != null || DynamiteModule.a(contextV, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f14014l = 2;
                } else {
                    i7 = 3;
                    f14014l = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }

    public Task<Void> E() {
        return C2650h.b(m.a(m(), v(), F() == 3));
    }

    public Task<Void> j() {
        return C2650h.b(m.b(m(), v(), F() == 3));
    }
}
