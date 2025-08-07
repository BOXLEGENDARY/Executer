package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class m {

    private Object f14312a;

    private boolean f14313b = false;

    final b f14314c;

    public m(b bVar, Object obj) {
        this.f14314c = bVar;
        this.f14312a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f14312a;
                if (this.f14313b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f14313b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f14312a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f14314c.f14277K) {
            this.f14314c.f14277K.remove(this);
        }
    }
}
