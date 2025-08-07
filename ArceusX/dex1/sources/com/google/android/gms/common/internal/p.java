package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import n3.C2651i;

public final class p extends j {

    public final IBinder f14319g;

    final b f14320h;

    public p(b bVar, int i7, IBinder iBinder, Bundle bundle) {
        super(bVar, i7, bundle);
        this.f14320h = bVar;
        this.f14319g = iBinder;
    }

    @Override
    protected final void f(ConnectionResult connectionResult) {
        if (this.f14320h.f14281O != null) {
            this.f14320h.f14281O.O0(connectionResult);
        }
        this.f14320h.L(connectionResult);
    }

    @Override
    protected final boolean g() throws RemoteException {
        try {
            IBinder iBinder = this.f14319g;
            C2651i.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f14320h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f14320h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceS = this.f14320h.s(this.f14319g);
            if (iInterfaceS == null || !(b.g0(this.f14320h, 2, 4, iInterfaceS) || b.g0(this.f14320h, 3, 4, iInterfaceS))) {
                return false;
            }
            this.f14320h.f14285S = null;
            b bVar = this.f14320h;
            Bundle bundleX = bVar.x();
            if (bVar.f14280N == null) {
                return true;
            }
            this.f14320h.f14280N.V0(bundleX);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
