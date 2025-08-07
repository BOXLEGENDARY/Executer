package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import n3.C2637M;
import n3.InterfaceC2640P;

final class t implements ServiceConnection, InterfaceC2640P {

    private final Map f14322d = new HashMap();

    private int f14323e = 2;

    private boolean f14324i;

    private IBinder f14325v;

    private final C2637M f14326w;

    private ComponentName f14327y;

    final v f14328z;

    public t(v vVar, C2637M c2637m) {
        this.f14328z = vVar;
        this.f14326w = c2637m;
    }

    public final int a() {
        return this.f14323e;
    }

    public final ComponentName b() {
        return this.f14327y;
    }

    public final IBinder c() {
        return this.f14325v;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f14322d.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f14323e = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (v3.m.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            v vVar = this.f14328z;
            boolean zD = vVar.f14334j.d(vVar.f14331g, str, this.f14326w.b(vVar.f14331g), this, 4225, executor);
            this.f14324i = zD;
            if (zD) {
                this.f14328z.f14332h.sendMessageDelayed(this.f14328z.f14332h.obtainMessage(1, this.f14326w), this.f14328z.f14336l);
            } else {
                this.f14323e = 2;
                try {
                    v vVar2 = this.f14328z;
                    vVar2.f14334j.c(vVar2.f14331g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f14322d.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f14328z.f14332h.removeMessages(1, this.f14326w);
        v vVar = this.f14328z;
        vVar.f14334j.c(vVar.f14331g, this);
        this.f14324i = false;
        this.f14323e = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f14322d.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f14322d.isEmpty();
    }

    public final boolean j() {
        return this.f14324i;
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f14328z.f14330f) {
            try {
                this.f14328z.f14332h.removeMessages(1, this.f14326w);
                this.f14325v = iBinder;
                this.f14327y = componentName;
                Iterator it = this.f14322d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f14323e = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14328z.f14330f) {
            try {
                this.f14328z.f14332h.removeMessages(1, this.f14326w);
                this.f14325v = null;
                this.f14327y = componentName;
                Iterator it = this.f14322d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f14323e = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
