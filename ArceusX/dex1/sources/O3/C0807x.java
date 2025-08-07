package O3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C0807x implements Iterator {

    final Iterator f3632d;

    Collection f3633e;

    final C0818y f3634i;

    C0807x(C0818y c0818y) {
        this.f3634i = c0818y;
        this.f3632d = c0818y.f3640i.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f3632d.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f3632d.next();
        this.f3633e = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C0589d0(key, this.f3634i.f3641v.e(key, (Collection) entry.getValue()));
    }

    @Override
    public final void remove() {
        r.e(this.f3633e != null, "no calls to next() since the last call to remove()");
        this.f3632d.remove();
        this.f3634i.f3641v.f2764v -= this.f3633e.size();
        this.f3633e.clear();
        this.f3633e = null;
    }
}
