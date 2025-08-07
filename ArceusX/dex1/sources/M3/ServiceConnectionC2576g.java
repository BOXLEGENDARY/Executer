package m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.Set;
import l3.C2526a;
import n3.C2651i;

public final class ServiceConnectionC2576g implements C2526a.f, ServiceConnection {

    private IBinder f22025A;

    private boolean f22026B;

    private String f22027C;

    private String f22028D;

    private final String f22029d;

    private final String f22030e;

    private final ComponentName f22031i;

    private final Context f22032v;

    private final InterfaceC2572c f22033w;

    private final Handler f22034y;

    private final InterfaceC2577h f22035z;

    private final void s() {
        if (Thread.currentThread() != this.f22034y.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override
    public final boolean a() {
        s();
        return this.f22025A != null;
    }

    @Override
    public final Set<Scope> c() {
        return Collections.emptySet();
    }

    @Override
    public final void d(com.google.android.gms.common.internal.e eVar, Set<Scope> set) {
    }

    @Override
    public final void e(String str) {
        s();
        this.f22027C = str;
        i();
    }

    @Override
    public final boolean f() {
        s();
        return this.f22026B;
    }

    @Override
    public final String g() {
        String str = this.f22029d;
        if (str != null) {
            return str;
        }
        C2651i.l(this.f22031i);
        return this.f22031i.getPackageName();
    }

    @Override
    public final void h(b.c cVar) {
        s();
        String.valueOf(this.f22025A);
        if (a()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f22031i;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f22029d).setAction(this.f22030e);
            }
            boolean zBindService = this.f22032v.bindService(intent, this, com.google.android.gms.common.internal.d.a());
            this.f22026B = zBindService;
            if (!zBindService) {
                this.f22025A = null;
                this.f22035z.O0(new ConnectionResult(16));
            }
            String.valueOf(this.f22025A);
        } catch (SecurityException e7) {
            this.f22026B = false;
            this.f22025A = null;
            throw e7;
        }
    }

    @Override
    public final void i() {
        s();
        String.valueOf(this.f22025A);
        try {
            this.f22032v.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f22026B = false;
        this.f22025A = null;
    }

    @Override
    public final void j(b.e eVar) {
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final Feature[] m() {
        return new Feature[0];
    }

    @Override
    public final String n() {
        return this.f22027C;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f22034y.post(new Runnable() {
            @Override
            public final void run() {
                this.f22042d.q(iBinder);
            }
        });
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22034y.post(new Runnable() {
            @Override
            public final void run() {
                this.f22041d.p();
            }
        });
    }

    final void p() {
        this.f22026B = false;
        this.f22025A = null;
        this.f22033w.E0(1);
    }

    final void q(IBinder iBinder) {
        this.f22026B = false;
        this.f22025A = iBinder;
        String.valueOf(iBinder);
        this.f22033w.V0(new Bundle());
    }

    public final void r(String str) {
        this.f22028D = str;
    }
}
