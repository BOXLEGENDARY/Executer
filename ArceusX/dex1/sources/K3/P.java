package K3;

import java.io.Serializable;

final class P extends S implements Serializable {

    static final P f1801d = new P();

    private P() {
    }

    @Override
    public final S a() {
        return W.f1821d;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
