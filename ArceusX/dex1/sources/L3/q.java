package L3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class q extends WeakReference<Throwable> {

    private final int f2060a;

    public q(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f2060a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == q.class) {
            if (this == obj) {
                return true;
            }
            q qVar = (q) obj;
            if (this.f2060a == qVar.f2060a && get() == qVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2060a;
    }
}
