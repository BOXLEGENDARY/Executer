package com.google.android.gms.measurement.internal;

import W3.v;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import n3.C2651i;

public final class E3<T extends Context & W3.v> {

    private final T f16293a;

    public E3(T t7) {
        C2651i.l(t7);
        this.f16293a = t7;
    }

    private final C2234j1 k() {
        return N1.H(this.f16293a, null, null).b();
    }

    public final int a(final Intent intent, int i7, final int i8) throws IllegalStateException {
        N1 n1H = N1.H(this.f16293a, null, null);
        final C2234j1 c2234j1B = n1H.b();
        if (intent == null) {
            c2234j1B.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n1H.d();
        c2234j1B.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() {
                @Override
                public final void run() {
                    this.f16267d.c(i8, c2234j1B, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().r().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2220g2(c4.e0(this.f16293a), null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    final void c(int i7, C2234j1 c2234j1, Intent intent) {
        if (this.f16293a.e(i7)) {
            c2234j1.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            k().v().a("Completed wakeful intent.");
            this.f16293a.f(intent);
        }
    }

    final void d(C2234j1 c2234j1, JobParameters jobParameters) {
        c2234j1.v().a("AppMeasurementJobService processed last upload request.");
        this.f16293a.g(jobParameters, false);
    }

    public final void e() {
        N1 n1H = N1.H(this.f16293a, null, null);
        C2234j1 c2234j1B = n1H.b();
        n1H.d();
        c2234j1B.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        N1 n1H = N1.H(this.f16293a, null, null);
        C2234j1 c2234j1B = n1H.b();
        n1H.d();
        c2234j1B.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().r().a("onRebind called with null intent");
        } else {
            k().v().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) throws IllegalStateException {
        c4 c4VarE0 = c4.e0(this.f16293a);
        c4VarE0.a().z(new D3(this, c4VarE0, runnable));
    }

    public final boolean i(final JobParameters jobParameters) throws IllegalStateException {
        N1 n1H = N1.H(this.f16293a, null, null);
        final C2234j1 c2234j1B = n1H.b();
        String string = jobParameters.getExtras().getString("action");
        n1H.d();
        c2234j1B.v().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new Runnable() {
            @Override
            public final void run() {
                this.f16277d.d(c2234j1B, jobParameters);
            }
        });
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().r().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
