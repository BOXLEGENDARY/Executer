package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import n3.C2651i;
import u3.C2928b;

public final class ServiceConnectionC2310y3 implements ServiceConnection, b.a, b.InterfaceC0152b {

    private volatile boolean f17112d;

    private volatile C2214f1 f17113e;

    final C2315z3 f17114i;

    protected ServiceConnectionC2310y3(C2315z3 c2315z3) {
        this.f17114i = c2315z3;
    }

    @Override
    public final void E0(int i7) throws IllegalStateException {
        C2651i.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f17114i.f16818a.b().q().a("Service connection suspended");
        this.f17114i.f16818a.a().z(new RunnableC2300w3(this));
    }

    @Override
    public final void O0(ConnectionResult connectionResult) throws IllegalStateException {
        C2651i.e("MeasurementServiceConnection.onConnectionFailed");
        C2234j1 c2234j1E = this.f17114i.f16818a.E();
        if (c2234j1E != null) {
            c2234j1E.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f17112d = false;
            this.f17113e = null;
        }
        this.f17114i.f16818a.a().z(new RunnableC2305x3(this));
    }

    @Override
    public final void V0(Bundle bundle) {
        C2651i.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C2651i.l(this.f17113e);
                this.f17114i.f16818a.a().z(new RunnableC2295v3(this, this.f17113e.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f17113e = null;
                this.f17112d = false;
            }
        }
    }

    public final void b(Intent intent) {
        this.f17114i.h();
        Context contextF = this.f17114i.f16818a.f();
        C2928b c2928bB = C2928b.b();
        synchronized (this) {
            try {
                if (this.f17112d) {
                    this.f17114i.f16818a.b().v().a("Connection attempt already in progress");
                    return;
                }
                this.f17114i.f16818a.b().v().a(GObvYfBKohxpYX.dtrJhTC);
                this.f17112d = true;
                c2928bB.a(contextF, intent, this.f17114i.f17123c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.f17114i.h();
        Context contextF = this.f17114i.f16818a.f();
        synchronized (this) {
            try {
                if (this.f17112d) {
                    this.f17114i.f16818a.b().v().a("Connection attempt already in progress");
                    return;
                }
                if (this.f17113e != null && (this.f17113e.f() || this.f17113e.a())) {
                    this.f17114i.f16818a.b().v().a("Already awaiting connection attempt");
                    return;
                }
                this.f17113e = new C2214f1(contextF, Looper.getMainLooper(), this, this);
                this.f17114i.f16818a.b().v().a("Connecting to remote service");
                this.f17112d = true;
                C2651i.l(this.f17113e);
                this.f17113e.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f17113e != null && (this.f17113e.a() || this.f17113e.f())) {
            this.f17113e.i();
        }
        this.f17113e = null;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2651i.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f17112d = false;
                this.f17114i.f16818a.b().r().a("Service connected with null binder");
                return;
            }
            W3.d z02 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    z02 = iInterfaceQueryLocalInterface instanceof W3.d ? (W3.d) iInterfaceQueryLocalInterface : new Z0(iBinder);
                    this.f17114i.f16818a.b().v().a("Bound to IMeasurementService interface");
                } else {
                    this.f17114i.f16818a.b().r().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f17114i.f16818a.b().r().a("Service connect failed to get IMeasurementService");
            }
            if (z02 == null) {
                this.f17112d = false;
                try {
                    C2928b.b().c(this.f17114i.f16818a.f(), this.f17114i.f17123c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f17114i.f16818a.a().z(new RunnableC2285t3(this, z02));
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        C2651i.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f17114i.f16818a.b().q().a("Service disconnected");
        this.f17114i.f16818a.a().z(new RunnableC2290u3(this, componentName));
    }
}
