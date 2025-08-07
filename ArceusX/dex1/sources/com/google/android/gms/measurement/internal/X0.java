package com.google.android.gms.measurement.internal;

public final class X0<V> {

    private static final Object f16560h = new Object();

    private final String f16561a;

    private final V0<V> f16562b;

    private final V f16563c;

    private final V f16564d;

    private final Object f16565e = new Object();

    private volatile V f16566f = null;

    private volatile V f16567g = null;

    X0(String str, Object obj, Object obj2, V0 v02, W3.b bVar) {
        this.f16561a = str;
        this.f16563c = obj;
        this.f16564d = obj2;
        this.f16562b = v02;
    }

    public final V a(V v7) {
        synchronized (this.f16565e) {
        }
        if (v7 != null) {
            return v7;
        }
        if (W0.f16552a == null) {
            return this.f16563c;
        }
        synchronized (f16560h) {
            try {
                if (C2192b.a()) {
                    return this.f16567g == null ? this.f16563c : this.f16567g;
                }
                try {
                    for (X0 x02 : Y0.f16606a) {
                        if (C2192b.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V vZza = null;
                        try {
                            V0<V> v02 = x02.f16562b;
                            if (v02 != null) {
                                vZza = v02.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f16560h) {
                            x02.f16567g = vZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                V0<V> v03 = this.f16562b;
                if (v03 == null) {
                    return this.f16563c;
                }
                try {
                    return v03.zza();
                } catch (IllegalStateException unused3) {
                    return this.f16563c;
                } catch (SecurityException unused4) {
                    return this.f16563c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f16561a;
    }
}
