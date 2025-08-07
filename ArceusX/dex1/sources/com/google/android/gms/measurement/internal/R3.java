package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

public final class R3 extends T3 {

    private final AlarmManager f16476d;

    private AbstractC2242l f16477e;

    private Integer f16478f;

    protected R3(c4 c4Var) {
        super(c4Var);
        this.f16476d = (AlarmManager) this.f16818a.f().getSystemService("alarm");
    }

    private final int o() {
        if (this.f16478f == null) {
            String strValueOf = String.valueOf(this.f16818a.f().getPackageName());
            this.f16478f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f16478f.intValue();
    }

    private final PendingIntent p() {
        Context contextF = this.f16818a.f();
        return com.google.android.gms.internal.measurement.W.a(contextF, 0, new Intent().setClassName(contextF, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.W.f15056a);
    }

    private final AbstractC2242l q() {
        if (this.f16477e == null) {
            this.f16477e = new Q3(this, this.f16519b.b0());
        }
        return this.f16477e;
    }

    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f16818a.f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    @Override
    protected final boolean l() {
        AlarmManager alarmManager = this.f16476d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        r();
        return false;
    }

    public final void m() {
        i();
        this.f16818a.b().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f16476d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        r();
    }

    public final void n(long j7) {
        i();
        this.f16818a.d();
        Context contextF = this.f16818a.f();
        if (!i4.X(contextF)) {
            this.f16818a.b().q().a("Receiver not registered/enabled");
        }
        if (!i4.Y(contextF, false)) {
            this.f16818a.b().q().a("Service not registered/enabled");
        }
        m();
        this.f16818a.b().v().b("Scheduling upload, millis", Long.valueOf(j7));
        this.f16818a.c().b();
        this.f16818a.z();
        if (j7 < Math.max(0L, Y0.f16654y.a(null).longValue()) && !q().e()) {
            q().d(j7);
        }
        this.f16818a.d();
        Context contextF2 = this.f16818a.f();
        ComponentName componentName = new ComponentName(contextF2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iO = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.X.a(contextF2, new JobInfo.Builder(iO, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
