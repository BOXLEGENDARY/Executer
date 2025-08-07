package R3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class C1115m implements Iterator {

    final Iterator f5668d;

    final Collection f5669e;

    final C1123n f5670i;

    C1115m(C1123n c1123n, Iterator it) {
        this.f5670i = c1123n;
        this.f5669e = c1123n.f5692e;
        this.f5668d = it;
    }

    final void a() {
        this.f5670i.zzb();
        if (this.f5670i.f5692e != this.f5669e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        a();
        return this.f5668d.hasNext();
    }

    @Override
    public final Object next() {
        a();
        return this.f5668d.next();
    }

    @Override
    public final void remove() {
        this.f5668d.remove();
        AbstractC1147q.h(this.f5670i.f5695w);
        this.f5670i.e();
    }

    C1115m(C1123n c1123n) {
        this.f5670i = c1123n;
        Collection collection = c1123n.f5692e;
        this.f5669e = collection;
        this.f5668d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
