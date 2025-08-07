package R3;

import Z.tNT.PexNRiLSd;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1091j implements Iterator {

    Map.Entry f5595d;

    final Iterator f5596e;

    final C1099k f5597i;

    C1091j(C1099k c1099k, Iterator it) {
        this.f5597i = c1099k;
        this.f5596e = it;
    }

    @Override
    public final boolean hasNext() {
        return this.f5596e.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5596e.next();
        this.f5595d = entry;
        return entry.getKey();
    }

    @Override
    public final void remove() {
        C1035c.d(this.f5595d != null, PexNRiLSd.Wzx);
        Collection collection = (Collection) this.f5595d.getValue();
        this.f5596e.remove();
        AbstractC1147q.j(this.f5597i.f5626e, collection.size());
        collection.clear();
        this.f5595d = null;
    }
}
