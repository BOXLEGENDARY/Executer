package R3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class F extends AbstractMap implements Serializable {

    private static final Object f5194C = new Object();

    private transient Set f5195A;

    private transient Collection f5196B;

    private transient Object f5197d;

    transient int[] f5198e;

    transient Object[] f5199i;

    transient Object[] f5200v;

    private transient int f5201w;

    private transient int f5202y;

    private transient Set f5203z;

    F(int i7) {
        r(12);
    }

    public final Object A(Object obj) {
        if (t()) {
            return f5194C;
        }
        int iX = x();
        Object obj2 = this.f5197d;
        obj2.getClass();
        int iB = G.b(obj, null, iX, obj2, C(), a(), null);
        if (iB == -1) {
            return f5194C;
        }
        Object obj3 = b()[iB];
        s(iB, iX);
        this.f5202y--;
        q();
        return obj3;
    }

    private final void B(int i7) {
        this.f5201w = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.f5201w & (-32));
    }

    public final int[] C() {
        int[] iArr = this.f5198e;
        iArr.getClass();
        return iArr;
    }

    public final Object[] a() {
        Object[] objArr = this.f5199i;
        objArr.getClass();
        return objArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f5200v;
        objArr.getClass();
        return objArr;
    }

    static int d(F f7) {
        int i7 = f7.f5202y;
        f7.f5202y = i7 - 1;
        return i7;
    }

    static Object j(F f7, int i7) {
        return f7.a()[i7];
    }

    static Object m(F f7, int i7) {
        return f7.b()[i7];
    }

    static Object n(F f7) {
        Object obj = f7.f5197d;
        obj.getClass();
        return obj;
    }

    static void p(F f7, int i7, Object obj) {
        f7.b()[i7] = obj;
    }

    public final int x() {
        return (1 << (this.f5201w & 31)) - 1;
    }

    public final int y(Object obj) {
        if (t()) {
            return -1;
        }
        int iA = H.a(obj);
        int iX = x();
        Object obj2 = this.f5197d;
        obj2.getClass();
        int iC = G.c(obj2, iA & iX);
        if (iC != 0) {
            int i7 = ~iX;
            int i8 = iA & i7;
            do {
                int i9 = iC - 1;
                int i10 = C()[i9];
                if ((i10 & i7) == i8 && Q6.a(obj, a()[i9])) {
                    return i9;
                }
                iC = i10 & iX;
            } while (iC != 0);
        }
        return -1;
    }

    private final int z(int i7, int i8, int i9, int i10) {
        Object objD = G.d(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            G.e(objD, i9 & i11, i10 + 1);
        }
        Object obj = this.f5197d;
        obj.getClass();
        int[] iArrC = C();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iC = G.c(obj, i12);
            while (iC != 0) {
                int i13 = iC - 1;
                int i14 = iArrC[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iC2 = G.c(objD, i16);
                G.e(objD, i16, iC);
                iArrC[i13] = ((~i11) & i15) | (iC2 & i11);
                iC = i14 & i7;
            }
        }
        this.f5197d = objD;
        B(i11);
        return i11;
    }

    @Override
    public final void clear() {
        if (t()) {
            return;
        }
        q();
        Map mapO = o();
        if (mapO != null) {
            this.f5201w = C1148q0.a(size(), 3, 1073741823);
            mapO.clear();
            this.f5197d = null;
            this.f5202y = 0;
            return;
        }
        Arrays.fill(a(), 0, this.f5202y, (Object) null);
        Arrays.fill(b(), 0, this.f5202y, (Object) null);
        Object obj = this.f5197d;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(C(), 0, this.f5202y, 0);
        this.f5202y = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapO = o();
        return mapO != null ? mapO.containsKey(obj) : y(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f5202y; i7++) {
            if (Q6.a(obj, b()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        Set set = this.f5195A;
        if (set != null) {
            return set;
        }
        C1212z c1212z = new C1212z(this);
        this.f5195A = c1212z;
        return c1212z;
    }

    @Override
    public final Object get(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.get(obj);
        }
        int iY = y(obj);
        if (iY == -1) {
            return null;
        }
        return b()[iY];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    final int i(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f5202y) {
            return i8;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        Set set = this.f5203z;
        if (set != null) {
            return set;
        }
        C c2 = new C(this);
        this.f5203z = c2;
        return c2;
    }

    final Map o() {
        Object obj = this.f5197d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (t()) {
            C1035c.d(t(), "Arrays already allocated");
            int i7 = this.f5201w;
            int iMax = Math.max(i7 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f5197d = G.d(iMax2);
            B(iMax2 - 1);
            this.f5198e = new int[i7];
            this.f5199i = new Object[i7];
            this.f5200v = new Object[i7];
        }
        Map mapO = o();
        if (mapO != null) {
            return mapO.put(obj, obj2);
        }
        int[] iArrC = C();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int i8 = this.f5202y;
        int i9 = i8 + 1;
        int iA = H.a(obj);
        int iX = x();
        int i10 = iA & iX;
        Object obj3 = this.f5197d;
        obj3.getClass();
        int iC = G.c(obj3, i10);
        if (iC != 0) {
            int i11 = ~iX;
            int i12 = iA & i11;
            int i13 = 0;
            while (true) {
                int i14 = iC - 1;
                int i15 = iArrC[i14];
                int i16 = i15 & i11;
                if (i16 == i12 && Q6.a(obj, objArrA[i14])) {
                    Object obj4 = objArrB[i14];
                    objArrB[i14] = obj2;
                    return obj4;
                }
                int i17 = i15 & iX;
                i13++;
                if (i17 != 0) {
                    iC = i17;
                } else {
                    if (i13 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(x() + 1, 1.0f);
                        int iH = h();
                        while (iH >= 0) {
                            linkedHashMap.put(a()[iH], b()[iH]);
                            iH = i(iH);
                        }
                        this.f5197d = linkedHashMap;
                        this.f5198e = null;
                        this.f5199i = null;
                        this.f5200v = null;
                        q();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i9 > iX) {
                        iX = z(iX, G.a(iX), iA, i8);
                    } else {
                        iArrC[i14] = (i9 & iX) | i16;
                    }
                }
            }
        } else if (i9 > iX) {
            iX = z(iX, G.a(iX), iA, i8);
        } else {
            Object obj5 = this.f5197d;
            obj5.getClass();
            G.e(obj5, i10, i9);
        }
        int length = C().length;
        if (i9 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f5198e = Arrays.copyOf(C(), iMin);
            this.f5199i = Arrays.copyOf(a(), iMin);
            this.f5200v = Arrays.copyOf(b(), iMin);
        }
        C()[i8] = (~iX) & iA;
        a()[i8] = obj;
        b()[i8] = obj2;
        this.f5202y = i9;
        q();
        return null;
    }

    final void q() {
        this.f5201w += 32;
    }

    final void r(int i7) {
        this.f5201w = C1148q0.a(12, 1, 1073741823);
    }

    @Override
    public final Object remove(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.remove(obj);
        }
        Object objA = A(obj);
        if (objA == f5194C) {
            return null;
        }
        return objA;
    }

    final void s(int i7, int i8) {
        Object obj = this.f5197d;
        obj.getClass();
        int[] iArrC = C();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrA[i7] = null;
            objArrB[i7] = null;
            iArrC[i7] = 0;
            return;
        }
        Object obj2 = objArrA[i9];
        objArrA[i7] = obj2;
        objArrB[i7] = objArrB[i9];
        objArrA[i9] = null;
        objArrB[i9] = null;
        iArrC[i7] = iArrC[i9];
        iArrC[i9] = 0;
        int iA = H.a(obj2) & i8;
        int iC = G.c(obj, iA);
        if (iC == size) {
            G.e(obj, iA, i7 + 1);
            return;
        }
        while (true) {
            int i10 = iC - 1;
            int i11 = iArrC[i10];
            int i12 = i11 & i8;
            if (i12 == size) {
                iArrC[i10] = ((i7 + 1) & i8) | (i11 & (~i8));
                return;
            }
            iC = i12;
        }
    }

    @Override
    public final int size() {
        Map mapO = o();
        return mapO != null ? mapO.size() : this.f5202y;
    }

    final boolean t() {
        return this.f5197d == null;
    }

    @Override
    public final Collection values() {
        Collection collection = this.f5196B;
        if (collection != null) {
            return collection;
        }
        E e7 = new E(this);
        this.f5196B = e7;
        return e7;
    }
}
