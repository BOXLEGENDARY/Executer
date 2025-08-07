package O3;

import java.util.Iterator;
import java.util.Map;

final class C0819y0 extends AbstractC0666k0 {

    private final transient AbstractC0655j0 f3642i;

    private final transient Object[] f3643v;

    private final transient int f3644w = 1;

    C0819y0(AbstractC0655j0 abstractC0655j0, Object[] objArr, int i7, int i8) {
        this.f3642i = abstractC0655j0;
        this.f3643v = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3642i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return l().d(objArr, i7);
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final F0 iterator() {
        return l().listIterator(0);
    }

    @Override
    final AbstractC0633h0 m() {
        return new C0808x0(this);
    }

    @Override
    public final int size() {
        return this.f3644w;
    }
}
