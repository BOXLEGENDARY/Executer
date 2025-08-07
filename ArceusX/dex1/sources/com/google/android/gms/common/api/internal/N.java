package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import m3.InterfaceC2575f;

public abstract class N extends LifecycleCallback implements DialogInterface.OnCancelListener {

    protected volatile boolean f14098e;

    protected final AtomicReference f14099i;

    private final Handler f14100v;

    protected final C1818c f14101w;

    N(InterfaceC2575f interfaceC2575f, C1818c c1818c) {
        super(interfaceC2575f);
        this.f14099i = new AtomicReference(null);
        this.f14100v = new I3.j(Looper.getMainLooper());
        this.f14101w = c1818c;
    }

    public final void l(ConnectionResult connectionResult, int i7) {
        this.f14099i.set(null);
        m(connectionResult, i7);
    }

    public final void o() {
        this.f14099i.set(null);
        n();
    }

    private static final int p(K k7) {
        if (k7 == null) {
            return -1;
        }
        return k7.a();
    }

    @Override
    public final void e(int i7, int i8, Intent intent) {
        K k7 = (K) this.f14099i.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int iG = this.f14101w.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (k7 == null) {
                        return;
                    }
                    if (k7.b().l() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            o();
            return;
        } else if (i8 == 0) {
            if (k7 != null) {
                l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, k7.b().toString()), p(k7));
                return;
            }
            return;
        }
        if (k7 != null) {
            l(k7.b(), k7.a());
        }
    }

    @Override
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f14099i.set(bundle.getBoolean("resolving_error", false) ? new K(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override
    public final void i(Bundle bundle) {
        super.i(bundle);
        K k7 = (K) this.f14099i.get();
        if (k7 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", k7.a());
        bundle.putInt("failed_status", k7.b().l());
        bundle.putParcelable("failed_resolution", k7.b().o());
    }

    @Override
    public void j() {
        super.j();
        this.f14098e = true;
    }

    @Override
    public void k() {
        super.k();
        this.f14098e = false;
    }

    protected abstract void m(ConnectionResult connectionResult, int i7);

    protected abstract void n();

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((K) this.f14099i.get()));
    }

    public final void s(ConnectionResult connectionResult, int i7) {
        AtomicReference atomicReference;
        K k7 = new K(connectionResult, i7);
        do {
            atomicReference = this.f14099i;
            if (a0.g.a(atomicReference, null, k7)) {
                this.f14100v.post(new M(this, k7));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
