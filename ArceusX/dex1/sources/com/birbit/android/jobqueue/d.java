package com.birbit.android.jobqueue;

import K0.wJ.BtcVLuo;
import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import l2.j;

class d {

    private final int f13687c;

    private final int f13688d;

    private final long f13689e;

    private final int f13690f;

    private final int f13691g;

    private final h f13693i;

    private final Timer f13694j;

    private final k2.c f13695k;

    final f2.e f13697m;

    private final ThreadFactory f13698n;

    private List<b> f13685a = new ArrayList();

    private final List<b> f13686b = new ArrayList();

    private final CopyOnWriteArrayList<Runnable> f13699o = new CopyOnWriteArrayList<>();

    private final Map<String, f> f13696l = new HashMap();

    private final ThreadGroup f13692h = new ThreadGroup(BtcVLuo.eLVDPQqc);

    static class a {

        static final int[] f13700a;

        static {
            int[] iArr = new int[k2.g.values().length];
            f13700a = iArr;
            try {
                iArr[k2.g.RUN_JOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13700a[k2.g.COMMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b implements Runnable {

        static final MessagePredicate f13701A = new a();

        final k2.f f13702d;

        final MessageQueue f13703e;

        final k2.c f13704i;

        final Timer f13705v;

        boolean f13706w;

        volatile long f13707y;

        final k2.d f13708z = new C0148b();

        static class a implements MessagePredicate {
            a() {
            }

            @Override
            public boolean onMessage(k2.b bVar) {
                return bVar.f21257a == k2.g.COMMAND && ((l2.e) bVar).d() == 2;
            }
        }

        class C0148b extends k2.d {
            C0148b() {
            }

            @Override
            public void a(k2.b bVar) {
                int i7 = a.f13700a[bVar.f21257a.ordinal()];
                if (i7 == 1) {
                    b.this.e((l2.i) bVar);
                    b.this.f();
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    b.this.d((l2.e) bVar);
                }
            }

            @Override
            public void b() {
                C2491a.b("consumer manager on idle", new Object[0]);
                l2.g gVar = (l2.g) b.this.f13704i.a(l2.g.class);
                gVar.f(b.this);
                gVar.e(b.this.f13707y);
                b.this.f13703e.post(gVar);
            }
        }

        public b(MessageQueue messageQueue, k2.f fVar, k2.c cVar, Timer timer) {
            this.f13702d = fVar;
            this.f13704i = cVar;
            this.f13703e = messageQueue;
            this.f13705v = timer;
            this.f13707y = timer.nanoTime();
        }

        public void d(l2.e eVar) {
            int iD = eVar.d();
            if (iD == 1) {
                this.f13702d.stop();
            } else {
                if (iD != 2) {
                    return;
                }
                C2491a.b("Consumer has been poked.", new Object[0]);
            }
        }

        public void e(l2.i iVar) {
            C2491a.b("running job %s", iVar.c().getClass().getSimpleName());
            f fVarC = iVar.c();
            int iW = fVarC.w(fVarC.k(), this.f13705v);
            j jVar = (j) this.f13704i.a(j.class);
            jVar.f(fVarC);
            jVar.g(iW);
            jVar.h(this);
            this.f13707y = this.f13705v.nanoTime();
            this.f13703e.post(jVar);
        }

        public void f() {
            this.f13702d.cancelMessages(f13701A);
        }

        @Override
        public void run() {
            this.f13702d.consume(this.f13708z);
        }
    }

    d(h hVar, Timer timer, k2.c cVar, h2.a aVar) {
        this.f13693i = hVar;
        this.f13694j = timer;
        this.f13695k = cVar;
        this.f13691g = aVar.g();
        this.f13688d = aVar.i();
        this.f13687c = aVar.h();
        this.f13689e = aVar.c() * 1000 * 1000000;
        this.f13690f = aVar.n();
        this.f13698n = aVar.m();
        this.f13697m = new f2.e(timer);
    }

    private void a() {
        Thread thread;
        C2491a.b("adding another consumer", new Object[0]);
        b bVar = new b(this.f13693i.f13773J, new k2.f(this.f13694j, this.f13695k, "consumer"), this.f13695k, this.f13694j);
        ThreadFactory threadFactory = this.f13698n;
        if (threadFactory != null) {
            thread = threadFactory.newThread(bVar);
        } else {
            thread = new Thread(this.f13692h, bVar, "job-queue-worker-" + UUID.randomUUID());
            thread.setPriority(this.f13690f);
        }
        this.f13686b.add(bVar);
        try {
            thread.start();
        } catch (InternalError e7) {
            C2491a.d(e7, "Cannot start a thread. Looks like app is shutting down.See issue #294 for details.", new Object[0]);
        }
    }

    private boolean c(boolean z7) {
        C2491a.b("considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d", Boolean.valueOf(z7), Boolean.valueOf(this.f13693i.K()), Integer.valueOf(this.f13685a.size()));
        if (!this.f13693i.K()) {
            C2491a.b("jobqueue is not running, no consumers will be added", new Object[0]);
            return false;
        }
        if (this.f13685a.size() <= 0) {
            boolean zJ = j();
            C2491a.b("nothing has been poked. are we above load factor? %s", Boolean.valueOf(zJ));
            if (!zJ) {
                return false;
            }
            a();
            return true;
        }
        C2491a.b("there are waiting workers, will poke them instead", new Object[0]);
        for (int size = this.f13685a.size() - 1; size >= 0; size--) {
            b bVarRemove = this.f13685a.remove(size);
            l2.e eVar = (l2.e) this.f13695k.a(l2.e.class);
            eVar.e(2);
            bVarRemove.f13702d.post(eVar);
            if (!z7) {
                break;
            }
        }
        C2491a.b("there were waiting workers, poked them and I'm done", new Object[0]);
        return true;
    }

    private boolean j() {
        int size = this.f13686b.size();
        boolean z7 = false;
        if (size >= this.f13687c) {
            C2491a.b("too many consumers, clearly above load factor %s", Integer.valueOf(size));
            return false;
        }
        int iS = this.f13693i.s();
        int size2 = this.f13696l.size();
        int i7 = iS + size2;
        if (this.f13691g * size < i7 || (size < this.f13688d && size < i7)) {
            z7 = true;
        }
        C2491a.b("check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s running holders: %s. isAbove:%s", Integer.valueOf(size), Integer.valueOf(this.f13688d), Integer.valueOf(this.f13687c), Integer.valueOf(this.f13691g), Integer.valueOf(iS), Integer.valueOf(size2), Boolean.valueOf(z7));
        return z7;
    }

    private Set<String> m(f2.f fVar, String[] strArr, boolean z7) {
        HashSet hashSet = new HashSet();
        for (f fVar2 : this.f13696l.values()) {
            C2491a.b("checking job tag %s. tags of job: %s", fVar2.g(), fVar2.g().i());
            if (fVar2.q() && !fVar2.r() && fVar.e(strArr, fVar2.m())) {
                hashSet.add(fVar2.e());
                if (z7) {
                    fVar2.u();
                } else {
                    fVar2.t();
                }
            }
        }
        return hashSet;
    }

    public boolean b() {
        return this.f13685a.size() == this.f13686b.size();
    }

    public int d() {
        return this.f13686b.size();
    }

    boolean e() {
        return c(true);
    }

    boolean f(l2.g gVar) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList;
        b bVar = (b) gVar.d();
        if (bVar.f13706w) {
            return true;
        }
        boolean zK = this.f13693i.K();
        f fVarW = zK ? this.f13693i.w(this.f13697m.e()) : null;
        if (fVarW != null) {
            bVar.f13706w = true;
            this.f13697m.a(fVarW.d());
            l2.i iVar = (l2.i) this.f13695k.a(l2.i.class);
            iVar.d(fVarW);
            this.f13696l.put(fVarW.g().d(), fVarW);
            if (fVarW.d() != null) {
                this.f13697m.a(fVarW.d());
            }
            bVar.f13702d.post(iVar);
            return true;
        }
        long jC = gVar.c() + this.f13689e;
        C2491a.g("keep alive: %s", Long.valueOf(jC));
        boolean z7 = this.f13686b.size() > this.f13688d;
        boolean z8 = !zK || (z7 && jC < this.f13694j.nanoTime());
        C2491a.g("Consumer idle, will kill? %s. isRunning: %s. too many? %s timeout: %s now: %s", Boolean.valueOf(z8), Boolean.valueOf(zK), Boolean.valueOf(z7), Long.valueOf(jC), Long.valueOf(this.f13694j.nanoTime()));
        if (z8) {
            l2.e eVar = (l2.e) this.f13695k.a(l2.e.class);
            eVar.e(1);
            bVar.f13702d.post(eVar);
            this.f13685a.remove(bVar);
            this.f13686b.remove(bVar);
            C2491a.b("killed consumers. remaining consumers %d", Integer.valueOf(this.f13686b.size()));
            if (this.f13686b.isEmpty() && (copyOnWriteArrayList = this.f13699o) != null) {
                Iterator<Runnable> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        } else {
            if (!this.f13685a.contains(bVar)) {
                this.f13685a.add(bVar);
            }
            if (z7 || !this.f13693i.n()) {
                l2.e eVar2 = (l2.e) this.f13695k.a(l2.e.class);
                eVar2.e(2);
                if (!z7) {
                    jC = this.f13694j.nanoTime() + this.f13689e;
                }
                bVar.f13702d.postAt(eVar2, jC);
                C2491a.b("poke consumer manager at %s", Long.valueOf(jC));
            }
        }
        return false;
    }

    void g(j jVar, f fVar, f2.d dVar) {
        b bVar = (b) jVar.e();
        if (!bVar.f13706w) {
            throw new IllegalStateException("this worker should not have a job");
        }
        bVar.f13706w = false;
        this.f13696l.remove(fVar.g().d());
        if (fVar.d() != null) {
            this.f13697m.f(fVar.d());
            if (dVar == null || !dVar.d() || dVar.a().longValue() <= 0) {
                return;
            }
            this.f13697m.b(fVar.d(), this.f13694j.nanoTime() + (dVar.a().longValue() * 1000000));
        }
    }

    void h() {
        Iterator<b> it = this.f13686b.iterator();
        while (it.hasNext()) {
            k2.f fVar = it.next().f13702d;
            l2.e eVar = (l2.e) this.f13695k.a(l2.e.class);
            eVar.e(2);
            fVar.post(eVar);
        }
        if (this.f13686b.isEmpty()) {
            Iterator<Runnable> it2 = this.f13699o.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        }
    }

    public boolean i(m2.a aVar) {
        for (f fVar : this.f13696l.values()) {
            if (fVar.g().j() && aVar.b() >= fVar.f13733j) {
                return true;
            }
        }
        return false;
    }

    boolean k(String str) {
        return this.f13696l.get(str) != null;
    }

    Set<String> l(f2.f fVar, String[] strArr) {
        return m(fVar, strArr, false);
    }

    Set<String> n(f2.f fVar, String[] strArr) {
        return m(fVar, strArr, true);
    }

    void o() {
        c(false);
    }
}
