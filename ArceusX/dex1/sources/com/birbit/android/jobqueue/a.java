package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.CancelResult;
import com.birbit.android.jobqueue.callback.JobManagerCallback;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    final k2.f f13662a;

    private final k2.c f13664c;

    private final Timer f13666e;

    private final AtomicInteger f13665d = new AtomicInteger(0);

    private final AtomicBoolean f13667f = new AtomicBoolean(false);

    private final CopyOnWriteArrayList<JobManagerCallback> f13663b = new CopyOnWriteArrayList<>();

    class RunnableC0146a implements Runnable {

        class C0147a extends k2.d {

            long f13669a = Long.MIN_VALUE;

            C0147a() {
            }

            @Override
            public void a(k2.b bVar) {
                k2.g gVar = bVar.f21257a;
                if (gVar == k2.g.CALLBACK) {
                    a.this.f((l2.b) bVar);
                    this.f13669a = a.this.f13666e.nanoTime();
                    return;
                }
                if (gVar == k2.g.CANCEL_RESULT_CALLBACK) {
                    a.this.e((l2.d) bVar);
                    this.f13669a = a.this.f13666e.nanoTime();
                    return;
                }
                if (gVar != k2.g.COMMAND) {
                    if (gVar == k2.g.f21288z) {
                        ((l2.h) bVar).c().onResult(0);
                        return;
                    }
                    return;
                }
                l2.e eVar = (l2.e) bVar;
                int iD = eVar.d();
                if (iD == 1) {
                    a.this.f13662a.stop();
                    a.this.f13667f.set(false);
                } else if (iD == 3) {
                    eVar.c().run();
                }
            }

            @Override
            public void b() {
            }

            @Override
            public void c() {
            }
        }

        RunnableC0146a() {
        }

        @Override
        public void run() {
            a.this.f13662a.consume(new C0147a());
        }
    }

    public a(k2.c cVar, Timer timer) {
        this.f13666e = timer;
        this.f13662a = new k2.f(timer, cVar, "jq_callback");
        this.f13664c = cVar;
    }

    public void e(l2.d dVar) {
        dVar.c().onCancelled(dVar.d());
        t();
    }

    public void f(l2.b bVar) {
        int iF = bVar.f();
        if (iF == 1) {
            l(bVar.c());
            return;
        }
        if (iF == 2) {
            r(bVar.c(), bVar.d());
            return;
        }
        if (iF == 3) {
            n(bVar.c(), bVar.g(), bVar.e());
        } else if (iF == 4) {
            p(bVar.c());
        } else {
            if (iF != 5) {
                return;
            }
            i(bVar.c(), bVar.d());
        }
    }

    private boolean g() {
        return this.f13665d.get() > 0;
    }

    private void i(e eVar, int i7) {
        Iterator<JobManagerCallback> it = this.f13663b.iterator();
        while (it.hasNext()) {
            it.next().onAfterJobRun(eVar, i7);
        }
    }

    private void l(e eVar) {
        Iterator<JobManagerCallback> it = this.f13663b.iterator();
        while (it.hasNext()) {
            it.next().onJobAdded(eVar);
        }
    }

    private void n(e eVar, boolean z7, Throwable th) {
        Iterator<JobManagerCallback> it = this.f13663b.iterator();
        while (it.hasNext()) {
            it.next().onJobCancelled(eVar, z7, th);
        }
    }

    private void p(e eVar) {
        Iterator<JobManagerCallback> it = this.f13663b.iterator();
        while (it.hasNext()) {
            it.next().onDone(eVar);
        }
    }

    private void r(e eVar, int i7) {
        Iterator<JobManagerCallback> it = this.f13663b.iterator();
        while (it.hasNext()) {
            it.next().onJobRun(eVar, i7);
        }
    }

    private void s() {
        try {
            new Thread(new RunnableC0146a(), "job-manager-callbacks").start();
        } catch (InternalError e7) {
            C2491a.d(e7, "Cannot start a thread. Looks like app is shutting down.See issue #294 for details.", new Object[0]);
        }
    }

    private void t() {
        if (this.f13667f.getAndSet(true)) {
            return;
        }
        s();
    }

    public void h(e eVar, int i7) {
        if (g()) {
            l2.b bVar = (l2.b) this.f13664c.a(l2.b.class);
            bVar.i(eVar, 5, i7);
            this.f13662a.post(bVar);
        }
    }

    public void j(CancelResult cancelResult, CancelResult.AsyncCancelCallback asyncCancelCallback) {
        l2.d dVar = (l2.d) this.f13664c.a(l2.d.class);
        dVar.e(asyncCancelCallback, cancelResult);
        this.f13662a.post(dVar);
        t();
    }

    public void k(e eVar) {
        if (g()) {
            l2.b bVar = (l2.b) this.f13664c.a(l2.b.class);
            bVar.h(eVar, 1);
            this.f13662a.post(bVar);
        }
    }

    public void m(e eVar, boolean z7, Throwable th) {
        if (g()) {
            l2.b bVar = (l2.b) this.f13664c.a(l2.b.class);
            bVar.j(eVar, 3, z7, th);
            this.f13662a.post(bVar);
        }
    }

    public void o(e eVar) {
        if (g()) {
            l2.b bVar = (l2.b) this.f13664c.a(l2.b.class);
            bVar.h(eVar, 4);
            this.f13662a.post(bVar);
        }
    }

    public void q(e eVar, int i7) {
        if (g()) {
            l2.b bVar = (l2.b) this.f13664c.a(l2.b.class);
            bVar.i(eVar, 2, i7);
            this.f13662a.post(bVar);
        }
    }
}
