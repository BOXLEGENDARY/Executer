package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C2184z2 extends AbstractC2047c2 implements RandomAccess, V2, B3 {

    private static final double[] f16196v;

    private double[] f16197e;

    private int f16198i;

    static {
        double[] dArr = new double[0];
        f16196v = dArr;
        new C2184z2(dArr, 0, false);
    }

    C2184z2() {
        this(f16196v, 0, true);
    }

    private static int k(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String l(int i7) {
        return "Index:" + i7 + ", Size:" + this.f16198i;
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f16198i) {
            throw new IndexOutOfBoundsException(l(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f16198i)) {
            throw new IndexOutOfBoundsException(l(i7));
        }
        int i9 = i7 + 1;
        double[] dArr = this.f16197e;
        int length = dArr.length;
        if (i8 < length) {
            System.arraycopy(dArr, i7, dArr, i9, i8 - i7);
        } else {
            double[] dArr2 = new double[k(length)];
            System.arraycopy(this.f16197e, 0, dArr2, 0, i7);
            System.arraycopy(this.f16197e, i7, dArr2, i9, this.f16198i - i7);
            this.f16197e = dArr2;
        }
        this.f16197e[i7] = dDoubleValue;
        this.f16198i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = W2.f15951b;
        collection.getClass();
        if (!(collection instanceof C2184z2)) {
            return super.addAll(collection);
        }
        C2184z2 c2184z2 = (C2184z2) collection;
        int i7 = c2184z2.f16198i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f16198i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.f16197e;
        if (i9 > dArr.length) {
            this.f16197e = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(c2184z2.f16197e, 0, this.f16197e, this.f16198i, c2184z2.f16198i);
        this.f16198i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final double e(int i7) {
        m(i7);
        return this.f16197e[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2184z2)) {
            return super.equals(obj);
        }
        C2184z2 c2184z2 = (C2184z2) obj;
        if (this.f16198i != c2184z2.f16198i) {
            return false;
        }
        double[] dArr = c2184z2.f16197e;
        for (int i7 = 0; i7 < this.f16198i; i7++) {
            if (Double.doubleToLongBits(this.f16197e[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d7) {
        d();
        int i7 = this.f16198i;
        int length = this.f16197e.length;
        if (i7 == length) {
            double[] dArr = new double[k(length)];
            System.arraycopy(this.f16197e, 0, dArr, 0, this.f16198i);
            this.f16197e = dArr;
        }
        double[] dArr2 = this.f16197e;
        int i8 = this.f16198i;
        this.f16198i = i8 + 1;
        dArr2[i8] = d7;
    }

    @Override
    public final Object get(int i7) {
        m(i7);
        return Double.valueOf(this.f16197e[i7]);
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f16198i) {
            return new C2184z2(i7 == 0 ? f16196v : Arrays.copyOf(this.f16197e, i7), this.f16198i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f16198i; i8++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f16197e[i8]);
            byte[] bArr = W2.f15951b;
            i7 = (i7 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i7 = this.f16198i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f16197e[i8] == dDoubleValue) {
                return i8;
            }
        }
        return -1;
    }

    final void j(int i7) {
        int length = this.f16197e.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f16197e = new double[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = k(length);
        }
        this.f16197e = Arrays.copyOf(this.f16197e, length);
    }

    @Override
    public final Object remove(int i7) {
        d();
        m(i7);
        double[] dArr = this.f16197e;
        double d7 = dArr[i7];
        if (i7 < this.f16198i - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.f16198i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f16197e;
        System.arraycopy(dArr, i8, dArr, i7, this.f16198i - i8);
        this.f16198i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        m(i7);
        double[] dArr = this.f16197e;
        double d7 = dArr[i7];
        dArr[i7] = dDoubleValue;
        return Double.valueOf(d7);
    }

    @Override
    public final int size() {
        return this.f16198i;
    }

    private C2184z2(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.f16197e = dArr;
        this.f16198i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
