package com.google.android.gms.measurement.internal;

final class RunnableC2285t3 implements Runnable {

    final W3.d f17037d;

    final ServiceConnectionC2310y3 f17038e;

    RunnableC2285t3(ServiceConnectionC2310y3 serviceConnectionC2310y3, W3.d dVar) {
        this.f17038e = serviceConnectionC2310y3;
        this.f17037d = dVar;
    }

    @Override
    public final void run() {
        synchronized (this.f17038e) {
            try {
                this.f17038e.f17112d = false;
                if (!this.f17038e.f17114i.z()) {
                    this.f17038e.f17114i.f16818a.b().v().a("Connected to service");
                    this.f17038e.f17114i.x(this.f17037d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
