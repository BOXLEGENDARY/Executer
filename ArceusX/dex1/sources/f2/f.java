package f2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public enum f {
    ALL,
    f20490e;

    public boolean c(Collection<String> collection, Set<String> set) {
        if (this == f20490e) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Iterator<String> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!set.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean e(String[] strArr, Set<String> set) {
        if (this == f20490e) {
            for (String str : strArr) {
                if (set.contains(str)) {
                    return true;
                }
            }
            return false;
        }
        for (String str2 : strArr) {
            if (!set.contains(str2)) {
                return false;
            }
        }
        return true;
    }
}
