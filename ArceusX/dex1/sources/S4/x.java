package S4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class x<T> implements c5.b<Set<T>> {

    private volatile Set<T> f7385b = null;

    private volatile Set<c5.b<T>> f7384a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<c5.b<T>> collection) {
        this.f7384a.addAll(collection);
    }

    static x<?> b(Collection<c5.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<c5.b<T>> it = this.f7384a.iterator();
            while (it.hasNext()) {
                this.f7385b.add(it.next().get());
            }
            this.f7384a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(c5.b<T> bVar) {
        try {
            if (this.f7385b == null) {
                this.f7384a.add(bVar);
            } else {
                this.f7385b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public Set<T> get() {
        if (this.f7385b == null) {
            synchronized (this) {
                try {
                    if (this.f7385b == null) {
                        this.f7385b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f7385b);
    }
}
