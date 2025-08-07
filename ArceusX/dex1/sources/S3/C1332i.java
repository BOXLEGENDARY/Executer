package S3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class C1332i implements Iterator {

    final Iterator f6957d;

    final Collection f6958e;

    final C1343j f6959i;

    C1332i(C1343j c1343j, Iterator it) {
        this.f6959i = c1343j;
        this.f6958e = c1343j.f6966e;
        this.f6957d = it;
    }

    final void a() {
        this.f6959i.zzb();
        if (this.f6959i.f6966e != this.f6958e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        a();
        return this.f6957d.hasNext();
    }

    @Override
    public final Object next() {
        a();
        return this.f6957d.next();
    }

    @Override
    public final void remove() {
        this.f6957d.remove();
        AbstractC1376m abstractC1376m = this.f6959i.f6969w;
        abstractC1376m.f7018v--;
        this.f6959i.e();
    }

    C1332i(C1343j c1343j) {
        this.f6959i = c1343j;
        Collection collection = c1343j.f6966e;
        this.f6958e = collection;
        this.f6957d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
