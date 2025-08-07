package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import n3.C2637M;
import n3.C2639O;
import n3.C2651i;

final class u implements Handler.Callback {

    final v f14329d;

    u(v vVar, C2639O c2639o) {
        this.f14329d = vVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f14329d.f14330f) {
                try {
                    C2637M c2637m = (C2637M) message.obj;
                    t tVar = (t) this.f14329d.f14330f.get(c2637m);
                    if (tVar != null && tVar.i()) {
                        if (tVar.j()) {
                            tVar.g("GmsClientSupervisor");
                        }
                        this.f14329d.f14330f.remove(c2637m);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f14329d.f14330f) {
            try {
                C2637M c2637m2 = (C2637M) message.obj;
                t tVar2 = (t) this.f14329d.f14330f.get(c2637m2);
                if (tVar2 != null && tVar2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c2637m2), new Exception());
                    ComponentName componentNameB = tVar2.b();
                    if (componentNameB == null) {
                        componentNameB = c2637m2.a();
                    }
                    if (componentNameB == null) {
                        String strC = c2637m2.c();
                        C2651i.l(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    tVar2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
