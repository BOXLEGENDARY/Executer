package O3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class C implements Iterator {

    final Iterator f2734d;

    final Collection f2735e;

    final D f2736i;

    C(D d7, Iterator it) {
        this.f2736i = d7;
        this.f2735e = d7.f2742e;
        this.f2734d = it;
    }

    final void a() {
        this.f2736i.zzb();
        if (this.f2736i.f2742e != this.f2735e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        a();
        return this.f2734d.hasNext();
    }

    @Override
    public final Object next() {
        a();
        return this.f2734d.next();
    }

    @Override
    public final void remove() {
        this.f2734d.remove();
        G g7 = this.f2736i.f2745w;
        g7.f2764v--;
        this.f2736i.e();
    }

    C(D d7) {
        this.f2736i = d7;
        Collection collection = d7.f2742e;
        this.f2735e = collection;
        this.f2734d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
