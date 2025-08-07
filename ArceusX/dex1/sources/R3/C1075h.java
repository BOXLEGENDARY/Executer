package R3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1075h implements Iterator {

    final Iterator f5552d;

    Collection f5553e;

    final C1083i f5554i;

    C1075h(C1083i c1083i) {
        this.f5554i = c1083i;
        this.f5552d = c1083i.f5575i.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f5552d.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5552d.next();
        this.f5553e = (Collection) entry.getValue();
        C1083i c1083i = this.f5554i;
        Object key = entry.getKey();
        return new L(key, c1083i.f5576v.f(key, (Collection) entry.getValue()));
    }

    @Override
    public final void remove() {
        C1035c.d(this.f5553e != null, "no calls to next() since the last call to remove()");
        this.f5552d.remove();
        AbstractC1147q.j(this.f5554i.f5576v, this.f5553e.size());
        this.f5553e.clear();
        this.f5553e = null;
    }
}
