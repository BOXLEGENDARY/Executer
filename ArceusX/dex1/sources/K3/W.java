package K3;

import java.io.Serializable;

final class W extends S implements Serializable {

    static final W f1821d = new W();

    private W() {
    }

    @Override
    public final S a() {
        return P.f1801d;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
