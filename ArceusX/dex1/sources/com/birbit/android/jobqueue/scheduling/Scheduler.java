package com.birbit.android.jobqueue.scheduling;

import android.content.Context;
import m2.a;

public abstract class Scheduler {

    private Callback f13866a;

    private Context f13867b;

    public interface Callback {
        boolean start(a aVar);

        boolean stop(a aVar);
    }

    protected Scheduler() {
    }

    public abstract void a();

    public void b(Context context, Callback callback) {
        this.f13867b = context.getApplicationContext();
        this.f13866a = callback;
    }

    public abstract void c(a aVar, boolean z7);

    public abstract void d(a aVar);

    public final boolean e(a aVar) {
        Callback callback = this.f13866a;
        if (callback != null) {
            return callback.start(aVar);
        }
        throw new IllegalStateException("JobManager callback is not configured");
    }

    public final boolean f(a aVar) {
        Callback callback = this.f13866a;
        if (callback != null) {
            return callback.stop(aVar);
        }
        throw new IllegalStateException("JobManager callback is not configured");
    }
}
