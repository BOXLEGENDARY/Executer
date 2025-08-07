package K3;

import java.util.Map;

abstract class D extends E {
    D() {
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = r().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Y.a(r().c());
    }

    @Override
    final boolean m() {
        return false;
    }

    abstract C r();

    @Override
    public final int size() {
        return r().size();
    }
}
