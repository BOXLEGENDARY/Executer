package S3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class C1365l extends C1343j implements List {

    final AbstractC1376m f7001y;

    C1365l(AbstractC1376m abstractC1376m, Object obj, List list, C1343j c1343j) {
        super(abstractC1376m, obj, list, c1343j);
        this.f7001y = abstractC1376m;
    }

    @Override
    public final void add(int i7, Object obj) {
        zzb();
        boolean zIsEmpty = this.f6966e.isEmpty();
        ((List) this.f6966e).add(i7, obj);
        this.f7001y.f7018v++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f6966e).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f6966e.size();
        this.f7001y.f7018v += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override
    public final Object get(int i7) {
        zzb();
        return ((List) this.f6966e).get(i7);
    }

    @Override
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f6966e).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f6966e).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        zzb();
        return new C1354k(this);
    }

    @Override
    public final Object remove(int i7) {
        zzb();
        Object objRemove = ((List) this.f6966e).remove(i7);
        AbstractC1376m abstractC1376m = this.f7001y;
        abstractC1376m.f7018v--;
        e();
        return objRemove;
    }

    @Override
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.f6966e).set(i7, obj);
    }

    @Override
    public final List subList(int i7, int i8) {
        zzb();
        List listSubList = ((List) this.f6966e).subList(i7, i8);
        C1343j c1343j = this.f6967i;
        if (c1343j == null) {
            c1343j = this;
        }
        return this.f7001y.i(this.f6965d, listSubList, c1343j);
    }

    @Override
    public final ListIterator listIterator(int i7) {
        zzb();
        return new C1354k(this, i7);
    }
}
