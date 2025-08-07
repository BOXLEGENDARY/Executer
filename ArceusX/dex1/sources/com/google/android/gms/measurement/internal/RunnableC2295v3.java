package com.google.android.gms.measurement.internal;

final class RunnableC2295v3 implements Runnable {

    final W3.d f17068d;

    final ServiceConnectionC2310y3 f17069e;

    RunnableC2295v3(ServiceConnectionC2310y3 serviceConnectionC2310y3, W3.d dVar) {
        this.f17069e = serviceConnectionC2310y3;
        this.f17068d = dVar;
    }

    @Override
    public final void run() {
        synchronized (this.f17069e) {
            try {
                this.f17069e.f17112d = false;
                if (!this.f17069e.f17114i.z()) {
                    this.f17069e.f17114i.f16818a.b().q().a("Connected to remote service");
                    this.f17069e.f17114i.x(this.f17068d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
