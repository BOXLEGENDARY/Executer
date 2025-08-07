package com.google.android.gms.measurement;

import W3.v;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.E3;

public final class AppMeasurementJobService extends JobService implements v {

    private E3<AppMeasurementJobService> f16237d;

    private final E3<AppMeasurementJobService> a() {
        if (this.f16237d == null) {
            this.f16237d = new E3<>(this);
        }
        return this.f16237d;
    }

    @Override
    public final boolean e(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void f(Intent intent) {
    }

    @Override
    public final void g(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        a().e();
    }

    @Override
    public void onDestroy() {
        a().f();
        super.onDestroy();
    }

    @Override
    public void onRebind(Intent intent) {
        a().g(intent);
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) throws IllegalStateException {
        a().i(jobParameters);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
