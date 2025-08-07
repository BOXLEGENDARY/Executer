package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C2077h2 extends AbstractC2047c2 implements RandomAccess, V2, B3 {

    private static final boolean[] f16064v;

    private boolean[] f16065e;

    private int f16066i;

    static {
        boolean[] zArr = new boolean[0];
        f16064v = zArr;
        new C2077h2(zArr, 0, false);
    }

    C2077h2() {
        this(f16064v, 0, true);
    }

    private final void H(int i7) {
        if (i7 < 0 || i7 >= this.f16066i) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    private static int j(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f16066i;
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f16066i)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        boolean[] zArr = this.f16065e;
        int length = zArr.length;
        if (i8 < length) {
            System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[j(length)];
            System.arraycopy(this.f16065e, 0, zArr2, 0, i7);
            System.arraycopy(this.f16065e, i7, zArr2, i9, this.f16066i - i7);
            this.f16065e = zArr2;
        }
        this.f16065e[i7] = zBooleanValue;
        this.f16066i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = W2.f15951b;
        collection.getClass();
        if (!(collection instanceof C2077h2)) {
            return super.addAll(collection);
        }
        C2077h2 c2077h2 = (C2077h2) collection;
        int i7 = c2077h2.f16066i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f16066i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.f16065e;
        if (i9 > zArr.length) {
            this.f16065e = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(c2077h2.f16065e, 0, this.f16065e, this.f16066i, c2077h2.f16066i);
        this.f16066i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z7) {
        d();
        int i7 = this.f16066i;
        int length = this.f16065e.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[j(length)];
            System.arraycopy(this.f16065e, 0, zArr, 0, this.f16066i);
            this.f16065e = zArr;
        }
        boolean[] zArr2 = this.f16065e;
        int i8 = this.f16066i;
        this.f16066i = i8 + 1;
        zArr2[i8] = z7;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2077h2)) {
            return super.equals(obj);
        }
        C2077h2 c2077h2 = (C2077h2) obj;
        if (this.f16066i != c2077h2.f16066i) {
            return false;
        }
        boolean[] zArr = c2077h2.f16065e;
        for (int i7 = 0; i7 < this.f16066i; i7++) {
            if (this.f16065e[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i7) {
        H(i7);
        return this.f16065e[i7];
    }

    @Override
    public final Object get(int i7) {
        H(i7);
        return Boolean.valueOf(this.f16065e[i7]);
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f16066i) {
            return new C2077h2(i7 == 0 ? f16064v : Arrays.copyOf(this.f16065e, i7), this.f16066i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int iA = 1;
        for (int i7 = 0; i7 < this.f16066i; i7++) {
            iA = (iA * 31) + W2.a(this.f16065e[i7]);
        }
        return iA;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.f16066i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f16065e[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i7) {
        d();
        H(i7);
        boolean[] zArr = this.f16065e;
        boolean z7 = zArr[i7];
        if (i7 < this.f16066i - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.f16066i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f16065e;
        System.arraycopy(zArr, i8, zArr, i7, this.f16066i - i8);
        this.f16066i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        H(i7);
        boolean[] zArr = this.f16065e;
        boolean z7 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override
    public final int size() {
        return this.f16066i;
    }

    private C2077h2(boolean[] zArr, int i7, boolean z7) {
        super(z7);
        this.f16065e = zArr;
        this.f16066i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
