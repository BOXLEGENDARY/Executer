package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

final class C2 implements InterfaceC2027z2 {

    private static C2 f14680c;

    private final Context f14681a;

    private final ContentObserver f14682b;

    private C2() {
        this.f14681a = null;
        this.f14682b = null;
    }

    static C2 a(Context context) {
        C2 c2;
        synchronized (C2.class) {
            try {
                if (f14680c == null) {
                    f14680c = androidx.core.content.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2(context) : new C2();
                }
                c2 = f14680c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2;
    }

    static synchronized void d() {
        Context context;
        try {
            C2 c2 = f14680c;
            if (c2 != null && (context = c2.f14681a) != null && c2.f14682b != null) {
                context.getContentResolver().unregisterContentObserver(f14680c.f14682b);
            }
            f14680c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final String u(final String str) {
        if (this.f14681a == null) {
            return null;
        }
        try {
            return (String) C2011x2.a(new InterfaceC2019y2() {
                @Override
                public final Object zza() {
                    return this.f14648a.c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e7) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e7);
            return null;
        }
    }

    final String c(String str) {
        return C1948p2.a(this.f14681a.getContentResolver(), str, null);
    }

    private C2(Context context) {
        this.f14681a = context;
        B2 b2 = new B2(this, null);
        this.f14682b = b2;
        context.getContentResolver().registerContentObserver(C1948p2.f15244a, true, b2);
    }
}
