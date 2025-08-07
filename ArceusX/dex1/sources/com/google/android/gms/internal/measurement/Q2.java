package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import g0.C2457a;
import java.util.Iterator;
import java.util.Map;

public final class Q2 implements InterfaceC2027z2 {

    private static final Map<String, Q2> f15005b = new C2457a();

    private final SharedPreferences f15006a;

    static Q2 a(Context context, String str) {
        Q2 q22;
        if (C1956q2.a()) {
            throw null;
        }
        synchronized (Q2.class) {
            try {
                q22 = f15005b.get(null);
                if (q22 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q22;
    }

    static synchronized void b() {
        Map<String, Q2> map = f15005b;
        Iterator<Q2> it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = it.next().f15006a;
            throw null;
        }
        map.clear();
    }

    @Override
    public final Object u(String str) {
        throw null;
    }
}
