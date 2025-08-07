package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import n3.C2637M;
import n3.C2651i;
import u3.C2928b;

final class v extends d {

    private final HashMap f14330f = new HashMap();

    private final Context f14331g;

    private volatile Handler f14332h;

    private final u f14333i;

    private final C2928b f14334j;

    private final long f14335k;

    private final long f14336l;

    private volatile Executor f14337m;

    v(Context context, Looper looper, Executor executor) {
        u uVar = new u(this, null);
        this.f14333i = uVar;
        this.f14331g = context.getApplicationContext();
        this.f14332h = new J3.i(looper, uVar);
        this.f14334j = C2928b.b();
        this.f14335k = 5000L;
        this.f14336l = 300000L;
        this.f14337m = executor;
    }

    @Override
    protected final void d(C2637M c2637m, ServiceConnection serviceConnection, String str) {
        C2651i.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14330f) {
            try {
                t tVar = (t) this.f14330f.get(c2637m);
                if (tVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c2637m.toString());
                }
                if (!tVar.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c2637m.toString());
                }
                tVar.f(serviceConnection, str);
                if (tVar.i()) {
                    this.f14332h.sendMessageDelayed(this.f14332h.obtainMessage(0, c2637m), this.f14335k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    protected final boolean f(C2637M c2637m, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        C2651i.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14330f) {
            try {
                t tVar = (t) this.f14330f.get(c2637m);
                if (executor == null) {
                    executor = this.f14337m;
                }
                if (tVar == null) {
                    tVar = new t(this, c2637m);
                    tVar.d(serviceConnection, serviceConnection, str);
                    tVar.e(str, executor);
                    this.f14330f.put(c2637m, tVar);
                } else {
                    this.f14332h.removeMessages(0, c2637m);
                    if (tVar.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c2637m.toString());
                    }
                    tVar.d(serviceConnection, serviceConnection, str);
                    int iA = tVar.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(tVar.b(), tVar.c());
                    } else if (iA == 2) {
                        tVar.e(str, executor);
                    }
                }
                zJ = tVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
