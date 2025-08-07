package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class D3 extends AbstractC1861e3<Double> implements RandomAccess, InterfaceC1830a4, F4 {

    private static final D3 f14694v;

    private double[] f14695e;

    private int f14696i;

    static {
        D3 d32 = new D3(new double[0], 0);
        f14694v = d32;
        d32.zzb();
    }

    D3() {
        this(new double[10], 0);
    }

    private final String g(int i7) {
        int i8 = this.f14696i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f14696i) {
            throw new IndexOutOfBoundsException(g(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f14696i)) {
            throw new IndexOutOfBoundsException(g(i7));
        }
        double[] dArr = this.f14695e;
        if (i8 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i8 - i7);
        } else {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            System.arraycopy(this.f14695e, i7, dArr2, i7 + 1, this.f14696i - i7);
            this.f14695e = dArr2;
        }
        this.f14695e[i7] = dDoubleValue;
        this.f14696i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        C1838b4.e(collection);
        if (!(collection instanceof D3)) {
            return super.addAll(collection);
        }
        D3 d32 = (D3) collection;
        int i7 = d32.f14696i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f14696i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.f14695e;
        if (i9 > dArr.length) {
            this.f14695e = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(d32.f14695e, 0, this.f14695e, this.f14696i, d32.f14696i);
        this.f14696i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d7) {
        d();
        int i7 = this.f14696i;
        double[] dArr = this.f14695e;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[((i7 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.f14695e = dArr2;
        }
        double[] dArr3 = this.f14695e;
        int i8 = this.f14696i;
        this.f14696i = i8 + 1;
        dArr3[i8] = d7;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return super.equals(obj);
        }
        D3 d32 = (D3) obj;
        if (this.f14696i != d32.f14696i) {
            return false;
        }
        double[] dArr = d32.f14695e;
        for (int i7 = 0; i7 < this.f14696i; i7++) {
            if (Double.doubleToLongBits(this.f14695e[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i7) {
        j(i7);
        return Double.valueOf(this.f14695e[i7]);
    }

    @Override
    public final InterfaceC1830a4 h(int i7) {
        if (i7 >= this.f14696i) {
            return new D3(Arrays.copyOf(this.f14695e, i7), this.f14696i);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int iC = 1;
        for (int i7 = 0; i7 < this.f14696i; i7++) {
            iC = (iC * 31) + C1838b4.c(Double.doubleToLongBits(this.f14695e[i7]));
        }
        return iC;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i7 = this.f14696i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f14695e[i8] == dDoubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i7) {
        d();
        j(i7);
        double[] dArr = this.f14695e;
        double d7 = dArr[i7];
        if (i7 < this.f14696i - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.f14696i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f14695e;
        System.arraycopy(dArr, i8, dArr, i7, this.f14696i - i8);
        this.f14696i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        j(i7);
        double[] dArr = this.f14695e;
        double d7 = dArr[i7];
        dArr[i7] = dDoubleValue;
        return Double.valueOf(d7);
    }

    @Override
    public final int size() {
        return this.f14696i;
    }

    private D3(double[] dArr, int i7) {
        this.f14695e = dArr;
        this.f14696i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
