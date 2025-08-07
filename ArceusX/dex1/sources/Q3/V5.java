package Q3;

import java.util.Iterator;

final class V5 extends Q5 {

    private final transient P5 f4228i;

    private final transient N5 f4229v;

    V5(P5 p52, N5 n52) {
        this.f4228i = p52;
        this.f4229v = n52;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f4228i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f4229v.d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return this.f4229v.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f4228i.size();
    }
}
