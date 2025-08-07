package L3;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class n {

    private final ConcurrentHashMap<q, List<Throwable>> f2056a = new ConcurrentHashMap<>(16, 0.75f, 10);

    private final ReferenceQueue<Throwable> f2057b = new ReferenceQueue<>();

    n() {
    }

    public final List<Throwable> a(Throwable th, boolean z7) {
        Reference<? extends Throwable> referencePoll = this.f2057b.poll();
        while (referencePoll != null) {
            this.f2056a.remove(referencePoll);
            referencePoll = this.f2057b.poll();
        }
        List<Throwable> list = this.f2056a.get(new q(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f2056a.putIfAbsent(new q(th, this.f2057b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
