package K3;

import java.util.Arrays;
import java.util.Set;

public abstract class E extends AbstractC0496w implements Set {

    private transient A f1775e;

    E() {
    }

    private static E l(int i7, Object... objArr) {
        if (i7 == 0) {
            return U.f1811B;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new Z(obj);
        }
        int iN = n(i7);
        Object[] objArr2 = new Object[iN];
        int i8 = iN - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            Q.a(obj2, i11);
            int iHashCode = obj2.hashCode();
            int iA = C0494v.a(iHashCode);
            while (true) {
                int i12 = iA & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new Z(obj4);
        }
        if (n(i10) < iN / 2) {
            return l(i10, objArr);
        }
        if (i10 <= 0) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new U(objArr, i9, objArr2, i8, i10);
    }

    static int n(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static E q(Object obj, Object obj2) {
        return l(2, obj, obj2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof E) && m() && ((E) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Y.a(this);
    }

    @Override
    public abstract AbstractC0460d0 iterator();

    boolean m() {
        return false;
    }

    public A o() {
        A a2 = this.f1775e;
        if (a2 != null) {
            return a2;
        }
        A aP = p();
        this.f1775e = aP;
        return aP;
    }

    A p() {
        Object[] array = toArray();
        int i7 = A.f1764i;
        return A.n(array, array.length);
    }
}
