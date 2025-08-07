package com.google.android.gms.measurement;

import W3.v;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.E3;

public final class AppMeasurementService extends Service implements v {

    private E3<AppMeasurementService> f16239d;

    private final E3<AppMeasurementService> a() {
        if (this.f16239d == null) {
            this.f16239d = new E3<>(this);
        }
        return this.f16239d;
    }

    @Override
    public final boolean e(int i7) {
        return stopSelfResult(i7);
    }

    @Override
    public final void f(Intent intent) {
        P0.a.b(intent);
    }

    @Override
    public final void g(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return a().b(intent);
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
    public int onStartCommand(Intent intent, int i7, int i8) throws IllegalStateException {
        a().a(intent, i7, i8);
        return 2;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
