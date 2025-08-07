package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class BinderC1850d0 extends AbstractBinderC1898j0 {

    private final AtomicReference<Bundle> f15122d = new AtomicReference<>();

    private boolean f15123e;

    public static final <T> T h3(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e7) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e7);
            throw e7;
        }
    }

    public final Bundle O0(long j7) {
        Bundle bundle;
        synchronized (this.f15122d) {
            if (!this.f15123e) {
                try {
                    this.f15122d.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f15122d.get();
        }
        return bundle;
    }

    @Override
    public final void P(Bundle bundle) {
        synchronized (this.f15122d) {
            try {
                try {
                    this.f15122d.set(bundle);
                    this.f15123e = true;
                } finally {
                    this.f15122d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String V0(long j7) {
        return (String) h3(O0(j7), String.class);
    }
}
