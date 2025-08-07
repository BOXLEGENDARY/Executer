package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import n3.InterfaceC2647e;

public final class o implements ServiceConnection {

    private final int f14317d;

    final b f14318e;

    public o(b bVar, int i7) {
        this.f14318e = bVar;
        this.f14317d = i7;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f14318e;
        if (iBinder == null) {
            b.d0(bVar, 16);
            return;
        }
        synchronized (bVar.f14273G) {
            try {
                b bVar2 = this.f14318e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.f14274H = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2647e)) ? new k(iBinder) : (InterfaceC2647e) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14318e.e0(0, null, this.f14317d);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14318e.f14273G) {
            this.f14318e.f14274H = null;
        }
        b bVar = this.f14318e;
        int i7 = this.f14317d;
        Handler handler = bVar.f14271E;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
