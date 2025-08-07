package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

abstract class M0 implements Runnable {

    final long f14828d;

    final long f14829e;

    final boolean f14830i;

    final W0 f14831v;

    M0(W0 w02, boolean z7) {
        this.f14831v = w02;
        this.f14828d = w02.f15059b.a();
        this.f14829e = w02.f15059b.b();
        this.f14830i = z7;
    }

    abstract void a() throws RemoteException;

    protected void b() {
    }

    @Override
    public final void run() {
        if (this.f14831v.f15064g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e7) {
            this.f14831v.j(e7, false, this.f14830i);
            b();
        }
    }
}
