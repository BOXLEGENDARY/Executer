package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.CancelResult;
import j2.C2491a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class b {

    private Set<String> f13671a;

    private final f2.f f13672b;

    private final String[] f13673c;

    private final Collection<f> f13674d = new ArrayList();

    private final Collection<f> f13675e = new ArrayList();

    private final CancelResult.AsyncCancelCallback f13676f;

    b(f2.f fVar, String[] strArr, CancelResult.AsyncCancelCallback asyncCancelCallback) {
        this.f13672b = fVar;
        this.f13673c = strArr;
        this.f13676f = asyncCancelCallback;
    }

    void a(h hVar) {
        for (f fVar : this.f13674d) {
            try {
                fVar.v(3);
            } catch (Throwable th) {
                C2491a.d(th, "job's on cancel has thrown an exception. Ignoring...", new Object[0]);
            }
            if (fVar.g().j()) {
                hVar.f13778v.remove(fVar);
            }
        }
        if (this.f13676f != null) {
            ArrayList arrayList = new ArrayList(this.f13674d.size());
            ArrayList arrayList2 = new ArrayList(this.f13675e.size());
            Iterator<f> it = this.f13674d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().g());
            }
            Iterator<f> it2 = this.f13675e.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().g());
            }
            hVar.f13769F.j(new CancelResult(arrayList, arrayList2), this.f13676f);
        }
        for (f fVar2 : this.f13674d) {
            hVar.f13769F.m(fVar2.g(), true, fVar2.n());
        }
    }

    boolean b() {
        return this.f13671a.isEmpty();
    }

    void c(f fVar, int i7) {
        if (this.f13671a.remove(fVar.e())) {
            if (i7 == 3) {
                this.f13674d.add(fVar);
            } else {
                this.f13675e.add(fVar);
            }
        }
    }

    void d(h hVar, d dVar) {
        this.f13671a = dVar.l(this.f13672b, this.f13673c);
        c cVar = hVar.f13768E;
        cVar.a();
        cVar.n(hVar.f13775d.nanoTime());
        cVar.o(this.f13672b);
        cVar.k(this.f13671a);
        cVar.p(this.f13673c);
        cVar.l(true);
        cVar.m(2);
        Set<f> setFindJobs = hVar.f13779w.findJobs(cVar);
        Set<f> setFindJobs2 = hVar.f13778v.findJobs(cVar);
        for (f fVar : setFindJobs) {
            fVar.t();
            this.f13674d.add(fVar);
            hVar.f13779w.onJobCancelled(fVar);
        }
        for (f fVar2 : setFindJobs2) {
            fVar2.t();
            this.f13674d.add(fVar2);
            hVar.f13778v.onJobCancelled(fVar2);
        }
    }
}
