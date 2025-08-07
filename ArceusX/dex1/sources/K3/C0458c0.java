package K3;

import java.util.Comparator;
import java.util.SortedSet;

final class C0458c0 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = P.f1801d;
            }
        } else {
            if (!(iterable instanceof InterfaceC0454a0)) {
                return false;
            }
            comparator2 = ((InterfaceC0454a0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
