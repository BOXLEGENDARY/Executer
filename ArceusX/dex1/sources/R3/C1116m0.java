package R3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class C1116m0 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC1052e0) {
            collection = ((InterfaceC1052e0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return c(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    static boolean c(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
