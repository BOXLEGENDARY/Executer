package S3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1277d implements Iterator {

    final Iterator f6905d;

    Collection f6906e;

    final C1288e f6907i;

    C1277d(C1288e c1288e) {
        this.f6907i = c1288e;
        this.f6905d = c1288e.f6914i.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f6905d.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f6905d.next();
        this.f6906e = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new I(key, this.f6907i.f6915v.f(key, (Collection) entry.getValue()));
    }

    @Override
    public final void remove() {
        U9.d(this.f6906e != null, "no calls to next() since the last call to remove()");
        this.f6905d.remove();
        this.f6907i.f6915v.f7018v -= this.f6906e.size();
        this.f6906e.clear();
        this.f6906e = null;
    }
}
