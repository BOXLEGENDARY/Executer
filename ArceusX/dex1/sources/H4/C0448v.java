package H4;

import java.util.Iterator;

final class C0448v extends AbstractC0446t {

    private static final Object[] f1625w;

    static final C0448v f1626y;

    final transient Object[] f1627i;

    final transient Object[] f1628v;

    static {
        Object[] objArr = new Object[0];
        f1625w = objArr;
        f1626y = new C0448v(objArr, 0, objArr, 0, 0);
    }

    C0448v(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f1627i = objArr;
        this.f1628v = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f1628v.length;
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f1627i, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    final int e() {
        return 0;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    final Object[] j() {
        return this.f1627i;
    }

    @Override
    public final AbstractC0449w iterator() {
        return l().listIterator(0);
    }

    @Override
    final AbstractC0445s m() {
        int i7 = AbstractC0445s.f1621i;
        return C0447u.f1623w;
    }

    @Override
    final boolean o() {
        return true;
    }

    @Override
    public final int size() {
        return 0;
    }
}
