package O3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class C0818y extends AbstractC0742r0 {

    final transient Map f3640i;

    final G f3641v;

    C0818y(G g7, Map map) {
        this.f3641v = g7;
        this.f3640i = map;
    }

    @Override
    protected final Set a() {
        return new C0796w(this);
    }

    @Override
    public final Collection get(Object obj) {
        Collection collection = (Collection) C0753s0.a(this.f3640i, obj);
        if (collection == null) {
            return null;
        }
        return this.f3641v.e(obj, collection);
    }

    @Override
    public final void clear() {
        G g7 = this.f3641v;
        if (this.f3640i == g7.f2763i) {
            g7.l();
        } else {
            C0677l0.a(new C0807x(this));
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        return C0753s0.b(this.f3640i, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f3640i.equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f3640i.hashCode();
    }

    @Override
    public final Set keySet() {
        return this.f3641v.C();
    }

    @Override
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f3640i.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionD = this.f3641v.d();
        collectionD.addAll(collection);
        this.f3641v.f2764v -= collection.size();
        collection.clear();
        return collectionD;
    }

    @Override
    public final int size() {
        return this.f3640i.size();
    }

    @Override
    public final String toString() {
        return this.f3640i.toString();
    }
}
