package E4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class q0 {

    protected final Set f1163a = new HashSet();

    public final synchronized void a(B4.a aVar) {
        this.f1163a.add(aVar);
    }

    public final synchronized void b(B4.a aVar) {
        this.f1163a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f1163a.iterator();
        while (it.hasNext()) {
            ((B4.a) it.next()).a(obj);
        }
    }
}
