package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.scheduling.Scheduler;
import java.util.concurrent.TimeUnit;
import l2.k;

public class g {

    public static final long f13757f = TimeUnit.MILLISECONDS.toNanos(10000);

    final h f13758a;

    private final k2.e f13759b;

    private final k2.c f13760c;

    private Thread f13761d;

    private Scheduler f13762e;

    class a implements Scheduler.Callback {
        a() {
        }

        @Override
        public boolean start(m2.a aVar) {
            g.this.e(aVar);
            return true;
        }

        @Override
        public boolean stop(m2.a aVar) {
            g.this.f(aVar);
            return false;
        }
    }

    public g(h2.a aVar) {
        k2.c cVar = new k2.c();
        this.f13760c = cVar;
        k2.e eVar = new k2.e(aVar.o(), cVar);
        this.f13759b = eVar;
        h hVar = new h(aVar, eVar, cVar);
        this.f13758a = hVar;
        this.f13761d = new Thread(hVar, "job-manager");
        if (aVar.l() != null) {
            this.f13762e = aVar.l();
            aVar.l().b(aVar.b(), d());
        }
        this.f13761d.start();
    }

    private Scheduler.Callback d() {
        return new a();
    }

    public void e(m2.a aVar) {
        k kVar = (k) this.f13760c.a(k.class);
        kVar.e(1, aVar);
        this.f13759b.post(kVar);
    }

    public void f(m2.a aVar) {
        k kVar = (k) this.f13760c.a(k.class);
        kVar.e(2, aVar);
        this.f13759b.post(kVar);
    }

    public void c(e eVar) {
        l2.a aVar = (l2.a) this.f13760c.a(l2.a.class);
        aVar.d(eVar);
        this.f13759b.post(aVar);
    }
}
