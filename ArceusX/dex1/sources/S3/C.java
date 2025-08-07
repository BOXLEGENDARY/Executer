package S3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class C extends AbstractMap implements Serializable {

    private static final Object f6403C = new Object();

    private transient Set f6404A;

    private transient Collection f6405B;

    private transient Object f6406d;

    transient int[] f6407e;

    transient Object[] f6408i;

    transient Object[] f6409v;

    private transient int f6410w;

    private transient int f6411y;

    private transient Set f6412z;

    C(int i7) {
        t(12);
    }

    public final int A(Object obj) {
        if (v()) {
            return -1;
        }
        int iA = E.a(obj);
        int iZ = z();
        Object obj2 = this.f6406d;
        Objects.requireNonNull(obj2);
        int iC = D.c(obj2, iA & iZ);
        if (iC != 0) {
            int i7 = ~iZ;
            int i8 = iA & i7;
            do {
                int i9 = iC - 1;
                int i10 = a()[i9];
                if ((i10 & i7) == i8 && T9.a(obj, b()[i9])) {
                    return i9;
                }
                iC = i10 & iZ;
            } while (iC != 0);
        }
        return -1;
    }

    private final int B(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object objD = D.d(i8);
        if (i10 != 0) {
            D.e(objD, i9 & i11, i10 + 1);
        }
        Object obj = this.f6406d;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iC = D.c(obj, i12);
            while (iC != 0) {
                int i13 = iC - 1;
                int i14 = iArrA[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iC2 = D.c(objD, i16);
                D.e(objD, i16, iC);
                iArrA[i13] = ((~i11) & i15) | (iC2 & i11);
                iC = i14 & i7;
            }
        }
        this.f6406d = objD;
        D(i11);
        return i11;
    }

    public final Object C(Object obj) {
        if (!v()) {
            int iZ = z();
            Object obj2 = this.f6406d;
            Objects.requireNonNull(obj2);
            int iB = D.b(obj, null, iZ, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                u(iB, iZ);
                this.f6411y--;
                s();
                return obj3;
            }
        }
        return f6403C;
    }

    private final void D(int i7) {
        this.f6410w = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.f6410w & (-32));
    }

    public final int[] a() {
        int[] iArr = this.f6407e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f6408i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f6409v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static Object k(C c2, int i7) {
        return c2.b()[i7];
    }

    static Object m(C c2) {
        Object obj = c2.f6406d;
        Objects.requireNonNull(obj);
        return obj;
    }

    static Object n(C c2, int i7) {
        return c2.c()[i7];
    }

    static void r(C c2, int i7, Object obj) {
        c2.c()[i7] = obj;
    }

    public final int z() {
        return (1 << (this.f6410w & 31)) - 1;
    }

    @Override
    public final void clear() {
        if (v()) {
            return;
        }
        s();
        Map mapP = p();
        if (mapP != null) {
            this.f6410w = C1453t0.a(size(), 3, 1073741823);
            mapP.clear();
            this.f6406d = null;
            this.f6411y = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f6411y, (Object) null);
        Arrays.fill(c(), 0, this.f6411y, (Object) null);
        Object obj = this.f6406d;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f6411y, 0);
        this.f6411y = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapP = p();
        return mapP != null ? mapP.containsKey(obj) : A(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f6411y; i7++) {
            if (T9.a(obj, c()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        Set set = this.f6404A;
        if (set != null) {
            return set;
        }
        C1474v c1474v = new C1474v(this);
        this.f6404A = c1474v;
        return c1474v;
    }

    @Override
    public final Object get(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.get(obj);
        }
        int iA = A(obj);
        if (iA == -1) {
            return null;
        }
        return c()[iA];
    }

    final int i() {
        return isEmpty() ? -1 : 0;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    final int j(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f6411y) {
            return i8;
        }
        return -1;
    }

    @Override
    public final Set keySet() {
        Set set = this.f6412z;
        if (set != null) {
            return set;
        }
        C1506y c1506y = new C1506y(this);
        this.f6412z = c1506y;
        return c1506y;
    }

    final Map p() {
        Object obj = this.f6406d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (v()) {
            U9.d(v(), "Arrays already allocated");
            int i7 = this.f6410w;
            int iMax = Math.max(i7 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f6406d = D.d(iMax2);
            D(iMax2 - 1);
            this.f6407e = new int[i7];
            this.f6408i = new Object[i7];
            this.f6409v = new Object[i7];
        }
        Map mapP = p();
        if (mapP != null) {
            return mapP.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i8 = this.f6411y;
        int i9 = i8 + 1;
        int iA = E.a(obj);
        int iZ = z();
        int i10 = iA & iZ;
        Object obj3 = this.f6406d;
        Objects.requireNonNull(obj3);
        int iC = D.c(obj3, i10);
        if (iC != 0) {
            int i11 = ~iZ;
            int i12 = iA & i11;
            int i13 = 0;
            while (true) {
                int i14 = iC - 1;
                int i15 = iArrA[i14];
                int i16 = i15 & i11;
                if (i16 == i12 && T9.a(obj, objArrB[i14])) {
                    Object obj4 = objArrC[i14];
                    objArrC[i14] = obj2;
                    return obj4;
                }
                int i17 = i15 & iZ;
                i13++;
                if (i17 != 0) {
                    iC = i17;
                } else {
                    if (i13 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(z() + 1, 1.0f);
                        int i18 = i();
                        while (i18 >= 0) {
                            linkedHashMap.put(b()[i18], c()[i18]);
                            i18 = j(i18);
                        }
                        this.f6406d = linkedHashMap;
                        this.f6407e = null;
                        this.f6408i = null;
                        this.f6409v = null;
                        s();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i9 > iZ) {
                        iZ = B(iZ, D.a(iZ), iA, i8);
                    } else {
                        iArrA[i14] = (i9 & iZ) | i16;
                    }
                }
            }
        } else if (i9 > iZ) {
            iZ = B(iZ, D.a(iZ), iA, i8);
        } else {
            Object obj5 = this.f6406d;
            Objects.requireNonNull(obj5);
            D.e(obj5, i10, i9);
        }
        int length = a().length;
        if (i9 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f6407e = Arrays.copyOf(a(), iMin);
            this.f6408i = Arrays.copyOf(b(), iMin);
            this.f6409v = Arrays.copyOf(c(), iMin);
        }
        a()[i8] = (~iZ) & iA;
        b()[i8] = obj;
        c()[i8] = obj2;
        this.f6411y = i9;
        s();
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.remove(obj);
        }
        Object objC = C(obj);
        if (objC == f6403C) {
            return null;
        }
        return objC;
    }

    final void s() {
        this.f6410w += 32;
    }

    @Override
    public final int size() {
        Map mapP = p();
        return mapP != null ? mapP.size() : this.f6411y;
    }

    final void t(int i7) {
        this.f6410w = C1453t0.a(i7, 1, 1073741823);
    }

    final void u(int i7, int i8) {
        Object obj = this.f6406d;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrB[i7] = null;
            objArrC[i7] = null;
            iArrA[i7] = 0;
            return;
        }
        int i10 = i7 + 1;
        Object obj2 = objArrB[i9];
        objArrB[i7] = obj2;
        objArrC[i7] = objArrC[i9];
        objArrB[i9] = null;
        objArrC[i9] = null;
        iArrA[i7] = iArrA[i9];
        iArrA[i9] = 0;
        int iA = E.a(obj2) & i8;
        int iC = D.c(obj, iA);
        if (iC == size) {
            D.e(obj, iA, i10);
            return;
        }
        while (true) {
            int i11 = iC - 1;
            int i12 = iArrA[i11];
            int i13 = i12 & i8;
            if (i13 == size) {
                iArrA[i11] = (i12 & (~i8)) | (i8 & i10);
                return;
            }
            iC = i13;
        }
    }

    final boolean v() {
        return this.f6406d == null;
    }

    @Override
    public final Collection values() {
        Collection collection = this.f6405B;
        if (collection != null) {
            return collection;
        }
        A a2 = new A(this);
        this.f6405B = a2;
        return a2;
    }
}
