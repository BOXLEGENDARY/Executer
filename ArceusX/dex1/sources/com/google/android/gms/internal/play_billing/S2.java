package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class S2 extends AbstractC2047c2 implements RandomAccess, U2, B3 {

    private static final int[] f15931v;

    private static final S2 f15932w;

    private int[] f15933e;

    private int f15934i;

    static {
        int[] iArr = new int[0];
        f15931v = iArr;
        f15932w = new S2(iArr, 0, false);
    }

    S2() {
        this(f15931v, 0, true);
    }

    public static S2 g() {
        return f15932w;
    }

    private static int l(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String m(int i7) {
        return "Index:" + i7 + ", Size:" + this.f15934i;
    }

    private final void n(int i7) {
        if (i7 < 0 || i7 >= this.f15934i) {
            throw new IndexOutOfBoundsException(m(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f15934i)) {
            throw new IndexOutOfBoundsException(m(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.f15933e;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[l(length)];
            System.arraycopy(this.f15933e, 0, iArr2, 0, i7);
            System.arraycopy(this.f15933e, i7, iArr2, i9, this.f15934i - i7);
            this.f15933e = iArr2;
        }
        this.f15933e[i7] = iIntValue;
        this.f15934i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = W2.f15951b;
        collection.getClass();
        if (!(collection instanceof S2)) {
            return super.addAll(collection);
        }
        S2 s22 = (S2) collection;
        int i7 = s22.f15934i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15934i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f15933e;
        if (i9 > iArr.length) {
            this.f15933e = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(s22.f15933e, 0, this.f15933e, this.f15934i, s22.f15934i);
        this.f15934i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i7) {
        n(i7);
        return this.f15933e[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2)) {
            return super.equals(obj);
        }
        S2 s22 = (S2) obj;
        if (this.f15934i != s22.f15934i) {
            return false;
        }
        int[] iArr = s22.f15933e;
        for (int i7 = 0; i7 < this.f15934i; i7++) {
            if (this.f15933e[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i7) {
        n(i7);
        return Integer.valueOf(this.f15933e[i7]);
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f15934i) {
            return new S2(i7 == 0 ? f15931v : Arrays.copyOf(this.f15933e, i7), this.f15934i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f15934i; i8++) {
            i7 = (i7 * 31) + this.f15933e[i8];
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f15934i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15933e[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    public final void j(int i7) {
        d();
        int i8 = this.f15934i;
        int length = this.f15933e.length;
        if (i8 == length) {
            int[] iArr = new int[l(length)];
            System.arraycopy(this.f15933e, 0, iArr, 0, this.f15934i);
            this.f15933e = iArr;
        }
        int[] iArr2 = this.f15933e;
        int i9 = this.f15934i;
        this.f15934i = i9 + 1;
        iArr2[i9] = i7;
    }

    final void k(int i7) {
        int length = this.f15933e.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f15933e = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = l(length);
        }
        this.f15933e = Arrays.copyOf(this.f15933e, length);
    }

    @Override
    public final Object remove(int i7) {
        d();
        n(i7);
        int[] iArr = this.f15933e;
        int i8 = iArr[i7];
        if (i7 < this.f15934i - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f15934i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15933e;
        System.arraycopy(iArr, i8, iArr, i7, this.f15934i - i8);
        this.f15934i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        n(i7);
        int[] iArr = this.f15933e;
        int i8 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i8);
    }

    @Override
    public final int size() {
        return this.f15934i;
    }

    private S2(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f15933e = iArr;
        this.f15934i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
