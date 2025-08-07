package i2;

import com.birbit.android.jobqueue.JobQueue;
import com.birbit.android.jobqueue.c;
import com.birbit.android.jobqueue.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

public class a implements JobQueue {

    private final TreeSet<f> f21061a = new TreeSet<>(new C0194a());

    private final Map<String, f> f21062b = new HashMap();

    private final AtomicLong f21063c = new AtomicLong(0);

    private final List<String> f21064d = new ArrayList();

    private final long f21065e;

    class C0194a implements Comparator<f> {
        C0194a() {
        }

        private int b(int i7, int i8) {
            if (i7 > i8) {
                return -1;
            }
            return i8 > i7 ? 1 : 0;
        }

        private int c(long j7, long j8) {
            if (j7 > j8) {
                return -1;
            }
            return j8 > j7 ? 1 : 0;
        }

        @Override
        public int compare(f fVar, f fVar2) {
            if (fVar.g().d().equals(fVar2.g().d())) {
                return 0;
            }
            int iB = b(fVar.h(), fVar2.h());
            if (iB != 0) {
                return iB;
            }
            int i7 = -c(fVar.a(), fVar2.a());
            return i7 != 0 ? i7 : -c(fVar.f().longValue(), fVar2.f().longValue());
        }
    }

    public a(h2.a aVar, long j7) {
        this.f21065e = j7;
    }

    private static boolean a(f fVar, c cVar, boolean z7) {
        if (cVar.f() < fVar.b() && ((!z7 || !fVar.o()) && cVar.e() < fVar.i())) {
            return false;
        }
        if (cVar.i() != null && fVar.c() > cVar.i().longValue()) {
            return false;
        }
        if ((fVar.d() != null && cVar.c().contains(fVar.d())) || cVar.d().contains(fVar.e())) {
            return false;
        }
        if (cVar.g() != null) {
            return (fVar.m() == null || cVar.h().isEmpty() || !cVar.g().c(cVar.h(), fVar.m())) ? false : true;
        }
        return true;
    }

    @Override
    public void clear() {
        this.f21061a.clear();
        this.f21062b.clear();
    }

    @Override
    public int count() {
        return this.f21061a.size();
    }

    @Override
    public int countReadyJobs(c cVar) {
        this.f21064d.clear();
        Iterator<f> it = this.f21061a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            f next = it.next();
            String strD = next.d();
            if (strD == null || !this.f21064d.contains(strD)) {
                if (a(next, cVar, false)) {
                    i7++;
                    if (strD != null) {
                        this.f21064d.add(strD);
                    }
                }
            }
        }
        this.f21064d.clear();
        return i7;
    }

    @Override
    public f findJobById(String str) {
        return this.f21062b.get(str);
    }

    @Override
    public Set<f> findJobs(c cVar) {
        HashSet hashSet = new HashSet();
        Iterator<f> it = this.f21061a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (a(next, cVar, false)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    @Override
    public Long getNextJobDelayUntilNs(c cVar) {
        Iterator<f> it = this.f21061a.iterator();
        Long lValueOf = null;
        while (it.hasNext()) {
            f next = it.next();
            if (a(next, cVar, true)) {
                boolean z7 = next.p() && a(next, cVar, false);
                boolean zO = next.o();
                long jMin = zO == z7 ? Math.min(next.b(), next.c()) : zO ? next.b() : next.c();
                if (lValueOf == null || jMin < lValueOf.longValue()) {
                    lValueOf = Long.valueOf(jMin);
                }
            }
        }
        return lValueOf;
    }

    @Override
    public boolean insert(f fVar) {
        fVar.A(this.f21063c.incrementAndGet());
        if (this.f21062b.get(fVar.e()) != null) {
            throw new IllegalArgumentException("cannot add a job with the same id twice");
        }
        this.f21062b.put(fVar.e(), fVar);
        this.f21061a.add(fVar);
        return true;
    }

    @Override
    public boolean insertOrReplace(f fVar) {
        if (fVar.f() == null) {
            return insert(fVar);
        }
        f fVar2 = this.f21062b.get(fVar.e());
        if (fVar2 != null) {
            remove(fVar2);
        }
        this.f21062b.put(fVar.e(), fVar);
        this.f21061a.add(fVar);
        return true;
    }

    @Override
    public f nextJobAndIncRunCount(c cVar) {
        Iterator<f> it = this.f21061a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (a(next, cVar, false)) {
                remove(next);
                next.C(next.k() + 1);
                next.D(this.f21065e);
                return next;
            }
        }
        return null;
    }

    @Override
    public void onJobCancelled(f fVar) {
        remove(fVar);
    }

    @Override
    public void remove(f fVar) {
        this.f21062b.remove(fVar.e());
        this.f21061a.remove(fVar);
    }

    @Override
    public void substitute(f fVar, f fVar2) {
        remove(fVar2);
        insert(fVar);
    }
}
