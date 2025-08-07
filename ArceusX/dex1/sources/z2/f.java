package z2;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import z2.c;

public abstract class f {

    public static class a {

        private C2.a f24797a;

        private Map<q2.d, b> f24798b = new HashMap();

        public a a(q2.d dVar, b bVar) {
            this.f24798b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f24797a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f24798b.keySet().size() < q2.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<q2.d, b> map = this.f24798b;
            this.f24798b = new HashMap();
            return f.d(this.f24797a, map);
        }

        public a c(C2.a aVar) {
            this.f24797a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j7);

            public abstract a c(Set<c> set);

            public abstract a d(long j7);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i7, long j7) {
        return (long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(C2.a aVar, Map<q2.d, b> map) {
        return new z2.b(aVar, map);
    }

    public static f f(C2.a aVar) {
        return b().a(q2.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(q2.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(q2.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, q2.d dVar, long j7, int i7) {
        builder.setMinimumLatency(g(dVar, j7, i7));
        j(builder, h().get(dVar).c());
        return builder;
    }

    abstract C2.a e();

    public long g(q2.d dVar, long j7, int i7) {
        long jA = j7 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i7, bVar.b()), jA), bVar.d());
    }

    abstract Map<q2.d, b> h();
}
