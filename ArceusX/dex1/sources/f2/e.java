package f2;

import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class e {

    private ArrayList<String> f20484a;

    private final TreeSet<String> f20485b = new TreeSet<>();

    private final Map<String, Long> f20486c = new HashMap();

    private long f20487d = Long.MAX_VALUE;

    private final Timer f20488e;

    public e(Timer timer) {
        this.f20488e = timer;
    }

    private long c() {
        long jLongValue = Long.MAX_VALUE;
        for (Long l7 : this.f20486c.values()) {
            if (l7.longValue() < jLongValue) {
                jLongValue = l7.longValue();
            }
        }
        return jLongValue;
    }

    public synchronized void a(String str) {
        if (str == null) {
            return;
        }
        if (this.f20485b.add(str)) {
            this.f20484a = null;
        }
    }

    public synchronized void b(String str, long j7) {
        C2491a.b("add group delay to %s until %s", str, Long.valueOf(j7));
        Long l7 = this.f20486c.get(str);
        if (l7 == null || l7.longValue() <= j7) {
            this.f20486c.put(str, Long.valueOf(j7));
            this.f20487d = c();
            this.f20484a = null;
        }
    }

    public Long d() {
        long j7 = this.f20487d;
        if (j7 == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j7);
    }

    public synchronized Collection<String> e() {
        try {
            long jNanoTime = this.f20488e.nanoTime();
            if (this.f20484a == null || jNanoTime > this.f20487d) {
                if (this.f20486c.isEmpty()) {
                    this.f20484a = new ArrayList<>(this.f20485b);
                    this.f20487d = Long.MAX_VALUE;
                } else {
                    TreeSet treeSet = new TreeSet((SortedSet) this.f20485b);
                    Iterator<Map.Entry<String, Long>> it = this.f20486c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Long> next = it.next();
                        if (next.getValue().longValue() <= jNanoTime) {
                            it.remove();
                        } else if (!treeSet.contains(next.getKey())) {
                            treeSet.add(next.getKey());
                        }
                    }
                    this.f20484a = new ArrayList<>(treeSet);
                    this.f20487d = c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20484a;
    }

    public synchronized void f(String str) {
        if (str == null) {
            return;
        }
        if (this.f20485b.remove(str)) {
            this.f20484a = null;
        }
    }
}
