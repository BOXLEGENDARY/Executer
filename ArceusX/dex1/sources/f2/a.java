package f2;

import android.content.Context;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a extends Scheduler {

    public static final long f20462h = TimeUnit.SECONDS.toMillis(900);

    final long f20463c;

    final long f20464d;

    private final Scheduler f20465e;

    private final List<b> f20466f;

    private final Timer f20467g;

    class C0187a implements Scheduler.Callback {
        C0187a() {
        }

        @Override
        public boolean start(m2.a aVar) {
            a.this.j(aVar);
            return a.this.e(aVar);
        }

        @Override
        public boolean stop(m2.a aVar) {
            return a.this.f(aVar);
        }
    }

    private static class b {

        final long f20469a;

        final Long f20470b;

        final m2.a f20471c;

        public b(long j7, Long l7, m2.a aVar) {
            this.f20469a = j7;
            this.f20470b = l7;
            this.f20471c = aVar;
        }
    }

    public a(Scheduler scheduler, Timer timer) {
        this(scheduler, timer, f20462h);
    }

    private boolean h(m2.a aVar) {
        Long lValueOf;
        long jNanoTime = this.f20467g.nanoTime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanos = timeUnit.toNanos(aVar.a()) + jNanoTime;
        Long lValueOf2 = null;
        Long lValueOf3 = aVar.c() == null ? null : Long.valueOf(timeUnit.toNanos(aVar.c().longValue()) + jNanoTime);
        synchronized (this.f20466f) {
            try {
                Iterator<b> it = this.f20466f.iterator();
                while (it.hasNext()) {
                    if (i(it.next(), aVar, nanos, lValueOf3)) {
                        return false;
                    }
                }
                long jA = aVar.a();
                long j7 = this.f20463c;
                long j8 = ((jA / j7) + 1) * j7;
                aVar.e(j8);
                if (aVar.c() != null) {
                    long jLongValue = aVar.c().longValue();
                    long j9 = this.f20463c;
                    lValueOf = Long.valueOf(((jLongValue / j9) + 1) * j9);
                    aVar.g(lValueOf);
                } else {
                    lValueOf = null;
                }
                List<b> list = this.f20466f;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long nanos2 = timeUnit2.toNanos(j8) + jNanoTime;
                if (lValueOf != null) {
                    lValueOf2 = Long.valueOf(jNanoTime + timeUnit2.toNanos(lValueOf.longValue()));
                }
                list.add(new b(nanos2, lValueOf2, aVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean i(b bVar, m2.a aVar, long j7, Long l7) {
        if (bVar.f20471c.b() != aVar.b()) {
            return false;
        }
        if (l7 != null) {
            Long l8 = bVar.f20470b;
            if (l8 == null) {
                return false;
            }
            long jLongValue = l8.longValue() - l7.longValue();
            if (jLongValue < 1 || jLongValue > this.f20464d) {
                return false;
            }
        } else if (bVar.f20470b != null) {
            return false;
        }
        long j8 = bVar.f20469a - j7;
        return j8 > 0 && j8 <= this.f20464d;
    }

    public void j(m2.a aVar) {
        synchronized (this.f20466f) {
            try {
                for (int size = this.f20466f.size() - 1; size >= 0; size--) {
                    if (this.f20466f.get(size).f20471c.d().equals(aVar.d())) {
                        this.f20466f.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void a() {
        synchronized (this.f20466f) {
            this.f20466f.clear();
        }
        this.f20465e.a();
    }

    @Override
    public void b(Context context, Scheduler.Callback callback) {
        super.b(context, callback);
        this.f20465e.b(context, new C0187a());
    }

    @Override
    public void c(m2.a aVar, boolean z7) {
        j(aVar);
        this.f20465e.c(aVar, false);
        if (z7) {
            d(aVar);
        }
    }

    @Override
    public void d(m2.a aVar) {
        if (h(aVar)) {
            this.f20465e.d(aVar);
        }
    }

    public a(Scheduler scheduler, Timer timer, long j7) {
        this.f20466f = new ArrayList();
        this.f20465e = scheduler;
        this.f20467g = timer;
        this.f20463c = j7;
        this.f20464d = TimeUnit.MILLISECONDS.toNanos(j7);
    }
}
