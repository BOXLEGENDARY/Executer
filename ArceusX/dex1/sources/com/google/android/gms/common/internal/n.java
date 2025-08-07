package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import n3.AbstractBinderC2629E;
import n3.C2651i;

public final class n extends AbstractBinderC2629E {

    private b f14315d;

    private final int f14316e;

    public n(b bVar, int i7) {
        this.f14315d = bVar;
        this.f14316e = i7;
    }

    @Override
    public final void S3(int i7, IBinder iBinder, Bundle bundle) {
        C2651i.m(this.f14315d, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f14315d.N(i7, iBinder, bundle, this.f14316e);
        this.f14315d = null;
    }

    @Override
    public final void o6(int i7, IBinder iBinder, zzk zzkVar) {
        b bVar = this.f14315d;
        C2651i.m(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C2651i.l(zzkVar);
        b.c0(bVar, zzkVar);
        S3(i7, iBinder, zzkVar.f14350d);
    }

    @Override
    public final void r0(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
