package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C1926m4 extends AbstractC1861e3<Long> implements RandomAccess, Z3, F4 {

    private static final C1926m4 f15212v;

    private long[] f15213e;

    private int f15214i;

    static {
        C1926m4 c1926m4 = new C1926m4(new long[0], 0);
        f15212v = c1926m4;
        c1926m4.zzb();
    }

    C1926m4() {
        this(new long[10], 0);
    }

    private final void H(int i7) {
        if (i7 < 0 || i7 >= this.f15214i) {
            throw new IndexOutOfBoundsException(j(i7));
        }
    }

    public static C1926m4 e() {
        return f15212v;
    }

    private final String j(int i7) {
        int i8 = this.f15214i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override
    public final Z3 h(int i7) {
        if (i7 >= this.f15214i) {
            return new C1926m4(Arrays.copyOf(this.f15213e, i7), this.f15214i);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f15214i)) {
            throw new IndexOutOfBoundsException(j(i7));
        }
        long[] jArr = this.f15213e;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.f15213e, i7, jArr2, i7 + 1, this.f15214i - i7);
            this.f15213e = jArr2;
        }
        this.f15213e[i7] = jLongValue;
        this.f15214i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        C1838b4.e(collection);
        if (!(collection instanceof C1926m4)) {
            return super.addAll(collection);
        }
        C1926m4 c1926m4 = (C1926m4) collection;
        int i7 = c1926m4.f15214i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15214i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f15213e;
        if (i9 > jArr.length) {
            this.f15213e = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(c1926m4.f15213e, 0, this.f15213e, this.f15214i, c1926m4.f15214i);
        this.f15214i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1926m4)) {
            return super.equals(obj);
        }
        C1926m4 c1926m4 = (C1926m4) obj;
        if (this.f15214i != c1926m4.f15214i) {
            return false;
        }
        long[] jArr = c1926m4.f15213e;
        for (int i7 = 0; i7 < this.f15214i; i7++) {
            if (this.f15213e[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j7) {
        d();
        int i7 = this.f15214i;
        long[] jArr = this.f15213e;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f15213e = jArr2;
        }
        long[] jArr3 = this.f15213e;
        int i8 = this.f15214i;
        this.f15214i = i8 + 1;
        jArr3[i8] = j7;
    }

    @Override
    public final Object get(int i7) {
        H(i7);
        return Long.valueOf(this.f15213e[i7]);
    }

    @Override
    public final int hashCode() {
        int iC = 1;
        for (int i7 = 0; i7 < this.f15214i; i7++) {
            iC = (iC * 31) + C1838b4.c(this.f15213e[i7]);
        }
        return iC;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i7 = this.f15214i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15213e[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i7) {
        d();
        H(i7);
        long[] jArr = this.f15213e;
        long j7 = jArr[i7];
        if (i7 < this.f15214i - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f15214i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f15213e;
        System.arraycopy(jArr, i8, jArr, i7, this.f15214i - i8);
        this.f15214i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        H(i7);
        long[] jArr = this.f15213e;
        long j7 = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j7);
    }

    @Override
    public final int size() {
        return this.f15214i;
    }

    @Override
    public final long y(int i7) {
        H(i7);
        return this.f15213e[i7];
    }

    private C1926m4(long[] jArr, int i7) {
        this.f15213e = jArr;
        this.f15214i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
