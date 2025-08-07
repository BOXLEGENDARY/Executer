package O3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class F extends D implements List {

    final G f2758y;

    F(G g7, Object obj, List list, D d7) {
        super(g7, obj, list, d7);
        this.f2758y = g7;
    }

    @Override
    public final void add(int i7, Object obj) {
        zzb();
        boolean zIsEmpty = this.f2742e.isEmpty();
        ((List) this.f2742e).add(i7, obj);
        this.f2758y.f2764v++;
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
        boolean zAddAll = ((List) this.f2742e).addAll(i7, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f2742e.size();
        this.f2758y.f2764v += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override
    public final Object get(int i7) {
        zzb();
        return ((List) this.f2742e).get(i7);
    }

    @Override
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f2742e).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f2742e).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        zzb();
        return new E(this);
    }

    @Override
    public final Object remove(int i7) {
        zzb();
        Object objRemove = ((List) this.f2742e).remove(i7);
        G g7 = this.f2758y;
        g7.f2764v--;
        e();
        return objRemove;
    }

    @Override
    public final Object set(int i7, Object obj) {
        zzb();
        return ((List) this.f2742e).set(i7, obj);
    }

    @Override
    public final List subList(int i7, int i8) {
        zzb();
        List listSubList = ((List) this.f2742e).subList(i7, i8);
        D d7 = this.f2743i;
        if (d7 == null) {
            d7 = this;
        }
        return this.f2758y.h(this.f2741d, listSubList, d7);
    }

    @Override
    public final ListIterator listIterator(int i7) {
        zzb();
        return new E(this, i7);
    }
}
