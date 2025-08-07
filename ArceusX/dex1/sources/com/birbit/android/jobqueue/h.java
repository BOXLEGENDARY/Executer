package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.di.DependencyInjector;
import com.birbit.android.jobqueue.f;
import com.birbit.android.jobqueue.network.NetworkEventProvider;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l2.j;
import l2.k;

class h implements Runnable, NetworkEventProvider.Listener {

    private final k2.c f13764A;

    final d f13765B;

    private List<com.birbit.android.jobqueue.b> f13766C;

    private List<m2.a> f13767D;

    final com.birbit.android.jobqueue.a f13769F;

    final k2.e f13773J;

    Scheduler f13774K;

    final Timer f13775d;

    private final Context f13776e;

    private final long f13777i;

    final JobQueue f13778v;

    final JobQueue f13779w;

    private final NetworkUtil f13780y;

    private final DependencyInjector f13781z;

    final c f13768E = new c();

    private boolean f13770G = true;

    private boolean f13771H = false;

    private boolean f13772I = true;

    class a extends k2.d {
        a() {
        }

        @Override
        public void a(k2.b bVar) {
            boolean z7 = true;
            h.this.f13772I = true;
            switch (b.f13783a[bVar.f21257a.ordinal()]) {
                case 1:
                    h.this.z((l2.a) bVar);
                    break;
                case 2:
                    if (!h.this.f13765B.f((l2.g) bVar)) {
                        h.this.J();
                        break;
                    }
                    break;
                case 3:
                    h.this.D((j) bVar);
                    break;
                case 4:
                    boolean zE = h.this.f13765B.e();
                    l2.f fVar = (l2.f) bVar;
                    h hVar = h.this;
                    if (!zE && fVar.c()) {
                        z7 = false;
                    }
                    hVar.f13772I = z7;
                    break;
                case 5:
                    h.this.A((l2.c) bVar);
                    break;
                case 6:
                    h.this.C((l2.h) bVar);
                    break;
                case 7:
                    h.this.B((l2.e) bVar);
                    break;
                case 8:
                    h.this.E((k) bVar);
                    break;
            }
        }

        @Override
        public void b() {
            C2491a.g("joq idle. running:? %s", Boolean.valueOf(h.this.f13770G));
            if (h.this.f13770G) {
                if (!h.this.f13772I) {
                    C2491a.g("skipping scheduling a new idle callback because looks like last one did not do anything", new Object[0]);
                    return;
                }
                Long lY = h.this.y(true);
                C2491a.b("Job queue idle. next job at: %s", lY);
                if (lY != null) {
                    l2.f fVar = (l2.f) h.this.f13764A.a(l2.f.class);
                    fVar.d(true);
                    h.this.f13773J.postAt(fVar, lY.longValue());
                    return;
                }
                h hVar = h.this;
                if (hVar.f13774K != null && hVar.f13771H && h.this.f13778v.count() == 0) {
                    h.this.f13771H = false;
                    h.this.f13774K.a();
                }
            }
        }
    }

    static class b {

        static final int[] f13783a;

        static {
            int[] iArr = new int[k2.g.values().length];
            f13783a = iArr;
            try {
                iArr[k2.g.ADD_JOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13783a[k2.g.JOB_CONSUMER_IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13783a[k2.g.RUN_JOB_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13783a[k2.g.CONSTRAINT_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13783a[k2.g.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13783a[k2.g.f21288z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13783a[k2.g.COMMAND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13783a[k2.g.SCHEDULER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    h(h2.a aVar, k2.e eVar, k2.c cVar) {
        this.f13773J = eVar;
        if (aVar.d() != null) {
            C2491a.f(aVar.d());
        }
        this.f13764A = cVar;
        Timer timerO = aVar.o();
        this.f13775d = timerO;
        this.f13776e = aVar.b();
        long jNanoTime = timerO.nanoTime();
        this.f13777i = jNanoTime;
        Scheduler schedulerL = aVar.l();
        this.f13774K = schedulerL;
        if (schedulerL != null && aVar.a() && !(this.f13774K instanceof f2.a)) {
            this.f13774K = new f2.a(this.f13774K, timerO);
        }
        this.f13778v = aVar.k().createPersistentQueue(aVar, jNanoTime);
        this.f13779w = aVar.k().createNonPersistent(aVar, jNanoTime);
        NetworkUtil networkUtilJ = aVar.j();
        this.f13780y = networkUtilJ;
        this.f13781z = aVar.e();
        if (networkUtilJ instanceof NetworkEventProvider) {
            ((NetworkEventProvider) networkUtilJ).setListener(this);
        }
        this.f13765B = new d(this, timerO, cVar, aVar);
        this.f13769F = new com.birbit.android.jobqueue.a(cVar, timerO);
    }

    public void A(l2.c cVar) {
        com.birbit.android.jobqueue.b bVar = new com.birbit.android.jobqueue.b(cVar.d(), cVar.e(), cVar.c());
        bVar.d(this, this.f13765B);
        if (bVar.b()) {
            bVar.a(this);
            return;
        }
        if (this.f13766C == null) {
            this.f13766C = new ArrayList();
        }
        this.f13766C.add(bVar);
    }

    public void B(l2.e eVar) {
        if (eVar.d() == 1) {
            this.f13773J.stop();
            this.f13773J.clear();
        }
    }

    public void C(l2.h hVar) {
        int iE = hVar.e();
        if (iE == 101) {
            hVar.c().onResult(0);
            return;
        }
        switch (iE) {
            case 0:
                hVar.c().onResult(q());
                return;
            case 1:
                hVar.c().onResult(r(v()));
                return;
            case 2:
                C2491a.b("handling start request...", new Object[0]);
                if (this.f13770G) {
                    return;
                }
                this.f13770G = true;
                this.f13765B.e();
                return;
            case 3:
                C2491a.b("handling stop request...", new Object[0]);
                this.f13770G = false;
                this.f13765B.h();
                return;
            case 4:
                hVar.c().onResult(u(hVar.d()).ordinal());
                return;
            case 5:
                p();
                if (hVar.c() != null) {
                    hVar.c().onResult(0);
                    return;
                }
                return;
            case 6:
                hVar.c().onResult(this.f13765B.d());
                return;
            default:
                throw new IllegalArgumentException("cannot handle public query with type " + hVar.e());
        }
    }

    public void D(l2.j r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.birbit.android.jobqueue.h.D(l2.j):void");
    }

    public void E(k kVar) {
        int iD = kVar.d();
        if (iD == 1) {
            F(kVar.c());
        } else {
            if (iD == 2) {
                G(kVar.c());
                return;
            }
            throw new IllegalArgumentException("Unknown scheduler message with what " + iD);
        }
    }

    private void F(m2.a aVar) {
        if (!K()) {
            Scheduler scheduler = this.f13774K;
            if (scheduler != null) {
                scheduler.c(aVar, true);
                return;
            }
            return;
        }
        if (H(aVar)) {
            if (this.f13767D == null) {
                this.f13767D = new ArrayList();
            }
            this.f13767D.add(aVar);
            this.f13765B.e();
            return;
        }
        Scheduler scheduler2 = this.f13774K;
        if (scheduler2 != null) {
            scheduler2.c(aVar, false);
        }
    }

    private void G(m2.a aVar) {
        List<m2.a> list = this.f13767D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).d().equals(aVar.d())) {
                    list.remove(size);
                }
            }
        }
        if (this.f13774K != null && H(aVar)) {
            this.f13774K.d(aVar);
        }
    }

    private boolean H(m2.a aVar) {
        if (this.f13765B.i(aVar)) {
            return true;
        }
        this.f13768E.a();
        this.f13768E.n(this.f13775d.nanoTime());
        this.f13768E.m(aVar.b());
        return this.f13778v.countReadyJobs(this.f13768E) > 0;
    }

    private void I(f fVar) {
        f2.d dVarJ = fVar.j();
        if (dVarJ == null) {
            L(fVar);
            return;
        }
        if (dVarJ.b() != null) {
            fVar.B(dVarJ.b().intValue());
        }
        long jLongValue = dVarJ.a() != null ? dVarJ.a().longValue() : -1L;
        fVar.z(jLongValue > 0 ? this.f13775d.nanoTime() + (jLongValue * 1000000) : Long.MIN_VALUE);
        L(fVar);
    }

    public void J() {
        List<m2.a> list;
        if (this.f13774K == null || (list = this.f13767D) == null || list.isEmpty() || !this.f13765B.b()) {
            return;
        }
        for (int size = this.f13767D.size() - 1; size >= 0; size--) {
            m2.a aVarRemove = this.f13767D.remove(size);
            this.f13774K.c(aVarRemove, H(aVarRemove));
        }
    }

    private void L(f fVar) {
        if (fVar.r()) {
            C2491a.b("not re-adding cancelled job " + fVar, new Object[0]);
            return;
        }
        if (fVar.g().j()) {
            this.f13778v.insertOrReplace(fVar);
        } else {
            this.f13779w.insertOrReplace(fVar);
        }
    }

    private void M(f fVar) {
        if (fVar.g().j()) {
            this.f13778v.remove(fVar);
        } else {
            this.f13779w.remove(fVar);
        }
        this.f13769F.o(fVar.g());
    }

    private void N(f fVar, long j7) {
        if (this.f13774K == null) {
            return;
        }
        int i7 = fVar.f13733j;
        long jC = fVar.c();
        long jB = fVar.b();
        long millis = jC > j7 ? TimeUnit.NANOSECONDS.toMillis(jC - j7) : 0L;
        Long lValueOf = jB != Long.MAX_VALUE ? Long.valueOf(TimeUnit.NANOSECONDS.toMillis(jB - j7)) : null;
        boolean z7 = false;
        boolean z8 = jC > j7 && millis >= 30000;
        if (lValueOf != null && lValueOf.longValue() >= 30000) {
            z7 = true;
        }
        if (i7 != 0 || z8 || z7) {
            m2.a aVar = new m2.a(UUID.randomUUID().toString());
            aVar.f(i7);
            aVar.e(millis);
            aVar.g(lValueOf);
            this.f13774K.d(aVar);
            this.f13771H = true;
        }
    }

    private void o(f fVar, int i7) {
        try {
            fVar.v(i7);
        } catch (Throwable th) {
            C2491a.d(th, "job's onCancel did throw an exception, ignoring...", new Object[0]);
        }
        this.f13769F.m(fVar.g(), false, fVar.n());
    }

    private void p() {
        this.f13779w.clear();
        this.f13778v.clear();
    }

    private int r(int i7) {
        Collection<String> collectionE = this.f13765B.f13697m.e();
        this.f13768E.a();
        this.f13768E.n(this.f13775d.nanoTime());
        this.f13768E.m(i7);
        this.f13768E.j(collectionE);
        this.f13768E.l(true);
        this.f13768E.q(Long.valueOf(this.f13775d.nanoTime()));
        return this.f13779w.countReadyJobs(this.f13768E) + this.f13778v.countReadyJobs(this.f13768E);
    }

    private f t(String str) {
        if (str == null) {
            return null;
        }
        this.f13768E.a();
        this.f13768E.p(new String[]{str});
        this.f13768E.o(f2.f.f20490e);
        this.f13768E.m(2);
        Set<f> setFindJobs = this.f13779w.findJobs(this.f13768E);
        setFindJobs.addAll(this.f13778v.findJobs(this.f13768E));
        if (setFindJobs.isEmpty()) {
            return null;
        }
        for (f fVar : setFindJobs) {
            if (!this.f13765B.k(fVar.e())) {
                return fVar;
            }
        }
        return setFindJobs.iterator().next();
    }

    private f2.c u(String str) {
        if (this.f13765B.k(str)) {
            return f2.c.RUNNING;
        }
        f fVarFindJobById = this.f13779w.findJobById(str);
        if (fVarFindJobById == null) {
            fVarFindJobById = this.f13778v.findJobById(str);
        }
        if (fVarFindJobById == null) {
            return f2.c.UNKNOWN;
        }
        int iV = v();
        long jNanoTime = this.f13775d.nanoTime();
        if (iV >= fVarFindJobById.f13733j && fVarFindJobById.c() <= jNanoTime) {
            return f2.c.WAITING_READY;
        }
        return f2.c.WAITING_NOT_READY;
    }

    private int v() {
        NetworkUtil networkUtil = this.f13780y;
        if (networkUtil == null) {
            return 2;
        }
        return networkUtil.getNetworkStatus(this.f13776e);
    }

    public void z(l2.a aVar) {
        e eVarC = aVar.c();
        long jNanoTime = this.f13775d.nanoTime();
        f fVarA = new f.b().j(eVarC.e()).h(eVarC).e(eVarC.g()).b(jNanoTime).d(eVarC.c() > 0 ? (eVarC.c() * 1000000) + jNanoTime : Long.MIN_VALUE).f(eVarC.d()).n(eVarC.i()).i(eVarC.j()).l(0).c(eVarC.b() > 0 ? (eVarC.b() * 1000000) + jNanoTime : Long.MAX_VALUE, eVarC.q()).k(eVarC.f13718e).m(Long.MIN_VALUE).a();
        f fVarT = t(eVarC.h());
        boolean z7 = fVarT == null || this.f13765B.k(fVarT.e());
        if (z7) {
            JobQueue jobQueue = eVarC.j() ? this.f13778v : this.f13779w;
            if (fVarT != null) {
                this.f13765B.n(f2.f.f20490e, new String[]{eVarC.h()});
                jobQueue.substitute(fVarA, fVarT);
            } else {
                jobQueue.insert(fVarA);
            }
            if (C2491a.e()) {
                C2491a.b("added job class: %s priority: %d delay: %d group : %s persistent: %s", eVarC.getClass().getSimpleName(), Integer.valueOf(eVarC.e()), Long.valueOf(eVarC.c()), eVarC.g(), Boolean.valueOf(eVarC.j()));
            }
        } else {
            C2491a.b("another job with same singleId: %s was already queued", eVarC.h());
        }
        DependencyInjector dependencyInjector = this.f13781z;
        if (dependencyInjector != null) {
            dependencyInjector.inject(eVarC);
        }
        fVarA.x(this.f13776e);
        fVarA.g().k();
        this.f13769F.k(fVarA.g());
        if (!z7) {
            o(fVarA, 1);
            this.f13769F.o(fVarA.g());
        } else {
            this.f13765B.o();
            if (eVarC.j()) {
                N(fVarA, jNanoTime);
            }
        }
    }

    boolean K() {
        return this.f13770G;
    }

    boolean n() {
        return this.f13780y instanceof NetworkEventProvider;
    }

    @Override
    public void onNetworkChange(int i7) {
        this.f13773J.post((l2.f) this.f13764A.a(l2.f.class));
    }

    int q() {
        return this.f13778v.count() + this.f13779w.count();
    }

    @Override
    public void run() {
        this.f13773J.consume(new a());
    }

    int s() {
        return r(v());
    }

    f w(Collection<String> collection) {
        return x(collection, false);
    }

    f x(Collection<String> collection, boolean z7) {
        boolean z8;
        DependencyInjector dependencyInjector;
        if (!this.f13770G && !z7) {
            return null;
        }
        while (true) {
            f fVarNextJobAndIncRunCount = null;
            while (fVarNextJobAndIncRunCount == null) {
                int iV = v();
                C2491a.g("looking for next job", new Object[0]);
                this.f13768E.a();
                long jNanoTime = this.f13775d.nanoTime();
                this.f13768E.n(jNanoTime);
                this.f13768E.m(iV);
                this.f13768E.j(collection);
                this.f13768E.l(true);
                this.f13768E.q(Long.valueOf(jNanoTime));
                fVarNextJobAndIncRunCount = this.f13779w.nextJobAndIncRunCount(this.f13768E);
                C2491a.g("non persistent result %s", fVarNextJobAndIncRunCount);
                if (fVarNextJobAndIncRunCount == null) {
                    fVarNextJobAndIncRunCount = this.f13778v.nextJobAndIncRunCount(this.f13768E);
                    C2491a.g("persistent result %s", fVarNextJobAndIncRunCount);
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (fVarNextJobAndIncRunCount == null) {
                    return null;
                }
                if (z8 && (dependencyInjector = this.f13781z) != null) {
                    dependencyInjector.inject(fVarNextJobAndIncRunCount.g());
                }
                fVarNextJobAndIncRunCount.x(this.f13776e);
                fVarNextJobAndIncRunCount.y(fVarNextJobAndIncRunCount.b() <= jNanoTime);
                if (fVarNextJobAndIncRunCount.b() > jNanoTime || !fVarNextJobAndIncRunCount.F()) {
                }
            }
            return fVarNextJobAndIncRunCount;
            o(fVarNextJobAndIncRunCount, 7);
            M(fVarNextJobAndIncRunCount);
        }
    }

    Long y(boolean z7) {
        Long lD = this.f13765B.f13697m.d();
        int iV = v();
        Collection<String> collectionE = this.f13765B.f13697m.e();
        this.f13768E.a();
        this.f13768E.n(this.f13775d.nanoTime());
        this.f13768E.m(iV);
        this.f13768E.j(collectionE);
        this.f13768E.l(true);
        Long nextJobDelayUntilNs = this.f13779w.getNextJobDelayUntilNs(this.f13768E);
        Long nextJobDelayUntilNs2 = this.f13778v.getNextJobDelayUntilNs(this.f13768E);
        if (lD == null) {
            lD = null;
        }
        if (nextJobDelayUntilNs != null) {
            lD = Long.valueOf(lD == null ? nextJobDelayUntilNs.longValue() : Math.min(nextJobDelayUntilNs.longValue(), lD.longValue()));
        }
        if (nextJobDelayUntilNs2 != null) {
            lD = Long.valueOf(lD == null ? nextJobDelayUntilNs2.longValue() : Math.min(nextJobDelayUntilNs2.longValue(), lD.longValue()));
        }
        if (!z7 || (this.f13780y instanceof NetworkEventProvider)) {
            return lD;
        }
        long jNanoTime = this.f13775d.nanoTime() + g.f13757f;
        if (lD != null) {
            jNanoTime = Math.min(jNanoTime, lD.longValue());
        }
        return Long.valueOf(jNanoTime);
    }
}
