package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class U3 extends AbstractC1861e3<Integer> implements RandomAccess, Y3, F4 {

    private static final U3 f15047v;

    private int[] f15048e;

    private int f15049i;

    static {
        U3 u32 = new U3(new int[0], 0);
        f15047v = u32;
        u32.zzb();
    }

    U3() {
        this(new int[10], 0);
    }

    public static U3 g() {
        return f15047v;
    }

    private final String k(int i7) {
        int i8 = this.f15049i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f15049i) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f15049i)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int[] iArr = this.f15048e;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f15048e, i7, iArr2, i7 + 1, this.f15049i - i7);
            this.f15048e = iArr2;
        }
        this.f15048e[i7] = iIntValue;
        this.f15049i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        C1838b4.e(collection);
        if (!(collection instanceof U3)) {
            return super.addAll(collection);
        }
        U3 u32 = (U3) collection;
        int i7 = u32.f15049i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15049i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f15048e;
        if (i9 > iArr.length) {
            this.f15048e = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(u32.f15048e, 0, this.f15048e, this.f15049i, u32.f15049i);
        this.f15049i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i7) {
        l(i7);
        return this.f15048e[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U3)) {
            return super.equals(obj);
        }
        U3 u32 = (U3) obj;
        if (this.f15049i != u32.f15049i) {
            return false;
        }
        int[] iArr = u32.f15048e;
        for (int i7 = 0; i7 < this.f15049i; i7++) {
            if (this.f15048e[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i7) {
        l(i7);
        return Integer.valueOf(this.f15048e[i7]);
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f15049i; i8++) {
            i7 = (i7 * 31) + this.f15048e[i8];
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f15049i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15048e[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    public final void j(int i7) {
        d();
        int i8 = this.f15049i;
        int[] iArr = this.f15048e;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f15048e = iArr2;
        }
        int[] iArr3 = this.f15048e;
        int i9 = this.f15049i;
        this.f15049i = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override
    public final Object remove(int i7) {
        d();
        l(i7);
        int[] iArr = this.f15048e;
        int i8 = iArr[i7];
        if (i7 < this.f15049i - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f15049i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15048e;
        System.arraycopy(iArr, i8, iArr, i7, this.f15049i - i8);
        this.f15049i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        l(i7);
        int[] iArr = this.f15048e;
        int i8 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i8);
    }

    @Override
    public final int size() {
        return this.f15049i;
    }

    @Override
    public final Y3 h(int i7) {
        if (i7 >= this.f15049i) {
            return new U3(Arrays.copyOf(this.f15048e, i7), this.f15049i);
        }
        throw new IllegalArgumentException();
    }

    private U3(int[] iArr, int i7) {
        this.f15048e = iArr;
        this.f15049i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
