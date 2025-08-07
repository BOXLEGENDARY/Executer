package R3;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class C1067g extends X {

    final C1083i f5531d;

    C1067g(C1083i c1083i) {
        this.f5531d = c1083i;
    }

    @Override
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f5531d.f5575i.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    final Map d() {
        return this.f5531d;
    }

    @Override
    public final Iterator iterator() {
        return new C1075h(this.f5531d);
    }

    @Override
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC1147q.p(this.f5531d.f5576v, entry.getKey());
        return true;
    }
}
