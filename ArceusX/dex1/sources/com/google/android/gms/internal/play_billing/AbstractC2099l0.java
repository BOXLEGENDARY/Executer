package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractC2099l0 extends Z implements Set {

    private transient AbstractC2057e0 f16082e;

    AbstractC2099l0() {
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

    public static AbstractC2099l0 r(int i7, Object... objArr) {
        if (i7 == 0) {
            return H0.f15808B;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new K0(obj);
        }
        int iN = n(i7);
        Object[] objArr2 = new Object[iN];
        int i8 = iN - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            C2152u0.a(obj2, i11);
            int iHashCode = obj2.hashCode();
            int iA = W.a(iHashCode);
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
            Objects.requireNonNull(obj4);
            return new K0(obj4);
        }
        if (n(i10) < iN / 2) {
            return r(i10, objArr);
        }
        int length = objArr.length;
        if (i10 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new H0(objArr, i9, objArr2, i8, i10);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2099l0) && q() && ((AbstractC2099l0) obj).q() && hashCode() != obj.hashCode()) {
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
        return J0.a(this);
    }

    @Override
    public AbstractC2057e0 j() {
        AbstractC2057e0 abstractC2057e0 = this.f16082e;
        if (abstractC2057e0 != null) {
            return abstractC2057e0;
        }
        AbstractC2057e0 abstractC2057e0O = o();
        this.f16082e = abstractC2057e0O;
        return abstractC2057e0O;
    }

    @Override
    public abstract N0 iterator();

    AbstractC2057e0 o() {
        Object[] array = toArray();
        int i7 = AbstractC2057e0.f16029i;
        return AbstractC2057e0.p(array, array.length);
    }

    boolean q() {
        return false;
    }
}
