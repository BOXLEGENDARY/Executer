package com.google.android.gms.common.api.internal;

final class r implements Runnable {

    final s f14170d;

    r(s sVar) {
        this.f14170d = sVar;
    }

    @Override
    public final void run() {
        t tVar = this.f14170d.f14171a;
        tVar.f14179e.e(tVar.f14179e.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
