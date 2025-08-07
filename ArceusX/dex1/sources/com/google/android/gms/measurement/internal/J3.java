package com.google.android.gms.measurement.internal;

final class J3 {

    private I3 f16349a;

    final O3 f16350b;

    J3(O3 o32) {
        this.f16350b = o32;
    }

    final void a(long j7) {
        this.f16349a = new I3(this, this.f16350b.f16818a.c().a(), j7);
        this.f16350b.f16451c.postDelayed(this.f16349a, 2000L);
    }

    final void b() {
        this.f16350b.h();
        if (this.f16349a != null) {
            this.f16350b.f16451c.removeCallbacks(this.f16349a);
        }
        this.f16350b.f16818a.F().f17095q.a(false);
    }
}
