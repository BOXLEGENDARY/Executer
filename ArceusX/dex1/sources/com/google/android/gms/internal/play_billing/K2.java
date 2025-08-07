package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class K2 extends AbstractC2047c2 implements RandomAccess, V2, B3 {

    private static final float[] f15886v;

    private float[] f15887e;

    private int f15888i;

    static {
        float[] fArr = new float[0];
        f15886v = fArr;
        new K2(fArr, 0, false);
    }

    K2() {
        this(f15886v, 0, true);
    }

    private static int k(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String l(int i7) {
        return "Index:" + i7 + ", Size:" + this.f15888i;
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f15888i) {
            throw new IndexOutOfBoundsException(l(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f15888i)) {
            throw new IndexOutOfBoundsException(l(i7));
        }
        int i9 = i7 + 1;
        float[] fArr = this.f15887e;
        int length = fArr.length;
        if (i8 < length) {
            System.arraycopy(fArr, i7, fArr, i9, i8 - i7);
        } else {
            float[] fArr2 = new float[k(length)];
            System.arraycopy(this.f15887e, 0, fArr2, 0, i7);
            System.arraycopy(this.f15887e, i7, fArr2, i9, this.f15888i - i7);
            this.f15887e = fArr2;
        }
        this.f15887e[i7] = fFloatValue;
        this.f15888i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = W2.f15951b;
        collection.getClass();
        if (!(collection instanceof K2)) {
            return super.addAll(collection);
        }
        K2 k22 = (K2) collection;
        int i7 = k22.f15888i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15888i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.f15887e;
        if (i9 > fArr.length) {
            this.f15887e = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(k22.f15887e, 0, this.f15887e, this.f15888i, k22.f15888i);
        this.f15888i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final float e(int i7) {
        m(i7);
        return this.f15887e[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2)) {
            return super.equals(obj);
        }
        K2 k22 = (K2) obj;
        if (this.f15888i != k22.f15888i) {
            return false;
        }
        float[] fArr = k22.f15887e;
        for (int i7 = 0; i7 < this.f15888i; i7++) {
            if (Float.floatToIntBits(this.f15887e[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f7) {
        d();
        int i7 = this.f15888i;
        int length = this.f15887e.length;
        if (i7 == length) {
            float[] fArr = new float[k(length)];
            System.arraycopy(this.f15887e, 0, fArr, 0, this.f15888i);
            this.f15887e = fArr;
        }
        float[] fArr2 = this.f15887e;
        int i8 = this.f15888i;
        this.f15888i = i8 + 1;
        fArr2[i8] = f7;
    }

    @Override
    public final Object get(int i7) {
        m(i7);
        return Float.valueOf(this.f15887e[i7]);
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f15888i) {
            return new K2(i7 == 0 ? f15886v : Arrays.copyOf(this.f15887e, i7), this.f15888i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.f15888i; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f15887e[i7]);
        }
        return iFloatToIntBits;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i7 = this.f15888i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15887e[i8] == fFloatValue) {
                return i8;
            }
        }
        return -1;
    }

    final void j(int i7) {
        int length = this.f15887e.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f15887e = new float[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = k(length);
        }
        this.f15887e = Arrays.copyOf(this.f15887e, length);
    }

    @Override
    public final Object remove(int i7) {
        d();
        m(i7);
        float[] fArr = this.f15887e;
        float f7 = fArr[i7];
        if (i7 < this.f15888i - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (r2 - i7) - 1);
        }
        this.f15888i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f15887e;
        System.arraycopy(fArr, i8, fArr, i7, this.f15888i - i8);
        this.f15888i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        m(i7);
        float[] fArr = this.f15887e;
        float f7 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f7);
    }

    @Override
    public final int size() {
        return this.f15888i;
    }

    private K2(float[] fArr, int i7, boolean z7) {
        super(z7);
        this.f15887e = fArr;
        this.f15888i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
