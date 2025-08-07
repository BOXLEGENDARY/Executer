package R3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class C1139p extends C1123n implements List {

    final AbstractC1147q f5756y;

    C1139p(AbstractC1147q abstractC1147q, Object obj, List list, C1123n c1123n) {
        super(abstractC1147q, obj, list, c1123n);
        this.f5756y = abstractC1147q;
    }

    @Override
    public final void add(int i7, Object obj) {
        zzb();
        boolean zIsEmpty = this.f5692e.isEmpty();
        ((List) this.f5692e).add(i7, obj);
        AbstractC1147q.g(this.f5756y);
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
        boolean zAddAll = ((List) this.f5692e).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        AbstractC1147q.i(this.f5756y, this.f5692e.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override
    public final Object get(int i7) {
        zzb();
        return ((List) this.f5692e).get(i7);
    }

    @Override
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f5692e).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f5692e).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        zzb();
        return new C1131o(this);
    }

    @Override
    public final Object remove(int i7) {
        zzb();
        Object objRemove = ((List) this.f5692e).remove(i7);
        AbstractC1147q.h(this.f5756y);
        e();
        return objRemove;
    }

    @Override
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.f5692e).set(i7, obj);
    }

    @Override
    public final List subList(int i7, int i8) {
        zzb();
        AbstractC1147q abstractC1147q = this.f5756y;
        Object obj = this.f5691d;
        List listSubList = ((List) this.f5692e).subList(i7, i8);
        C1123n c1123n = this.f5693i;
        if (c1123n == null) {
            c1123n = this;
        }
        return abstractC1147q.l(obj, listSubList, c1123n);
    }

    @Override
    public final ListIterator listIterator(int i7) {
        zzb();
        return new C1131o(this, i7);
    }
}
