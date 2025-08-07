package O3;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class C0796w extends AbstractC0710o0 {

    final C0818y f3619d;

    C0796w(C0818y c0818y) {
        this.f3619d = c0818y;
    }

    @Override
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f3619d.f3640i.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    final Map d() {
        return this.f3619d;
    }

    @Override
    public final Iterator iterator() {
        return new C0807x(this.f3619d);
    }

    @Override
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C0818y c0818y = this.f3619d;
        G.k(c0818y.f3641v, entry.getKey());
        return true;
    }
}
