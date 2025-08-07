package K3;

import java.util.Iterator;

final class U extends E {

    private static final Object[] f1810A;

    static final U f1811B;

    final transient Object[] f1812i;

    private final transient int f1813v;

    final transient Object[] f1814w;

    private final transient int f1815y;

    private final transient int f1816z;

    static {
        Object[] objArr = new Object[0];
        f1810A = objArr;
        f1811B = new U(objArr, 0, objArr, 0, 0);
    }

    U(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f1812i = objArr;
        this.f1813v = i7;
        this.f1814w = objArr2;
        this.f1815y = i8;
        this.f1816z = i9;
    }

    @Override
    public final boolean contains(Object obj) {
        Object[] objArr = this.f1814w;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = C0494v.a(obj.hashCode());
        while (true) {
            int i7 = iA & this.f1815y;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i7 + 1;
        }
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f1812i, 0, objArr, 0, this.f1816z);
        return this.f1816z;
    }

    @Override
    final int e() {
        return this.f1816z;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.f1813v;
    }

    @Override
    public final Iterator iterator() {
        return o().listIterator(0);
    }

    @Override
    public final AbstractC0460d0 iterator() {
        return o().listIterator(0);
    }

    @Override
    final Object[] k() {
        return this.f1812i;
    }

    @Override
    final boolean m() {
        return true;
    }

    @Override
    final A p() {
        return A.n(this.f1812i, this.f1816z);
    }

    @Override
    public final int size() {
        return this.f1816z;
    }
}
