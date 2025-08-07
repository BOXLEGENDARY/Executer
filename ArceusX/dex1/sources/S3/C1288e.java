package S3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class C1288e extends AbstractC1278d0 {

    final transient Map f6914i;

    final AbstractC1376m f6915v;

    C1288e(AbstractC1376m abstractC1376m, Map map) {
        this.f6915v = abstractC1376m;
        this.f6914i = map;
    }

    @Override
    protected final Set a() {
        return new C1266c(this);
    }

    @Override
    public final void clear() {
        AbstractC1376m abstractC1376m = this.f6915v;
        if (this.f6914i == abstractC1376m.f7017i) {
            abstractC1376m.o();
        } else {
            Q.a(new C1277d(this));
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        return C1289e0.b(this.f6914i, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f6914i.equals(obj);
    }

    @Override
    public final Object get(Object obj) {
        Collection collection = (Collection) C1289e0.a(this.f6914i, obj);
        if (collection == null) {
            return null;
        }
        return this.f6915v.f(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.f6914i.hashCode();
    }

    @Override
    public final Set keySet() {
        return this.f6915v.l();
    }

    @Override
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f6914i.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionE = this.f6915v.e();
        collectionE.addAll(collection);
        this.f6915v.f7018v -= collection.size();
        collection.clear();
        return collectionE;
    }

    @Override
    public final int size() {
        return this.f6914i.size();
    }

    @Override
    public final String toString() {
        return this.f6914i.toString();
    }
}
