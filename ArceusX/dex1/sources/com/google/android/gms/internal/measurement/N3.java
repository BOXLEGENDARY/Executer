package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class N3 extends AbstractC1861e3<Float> implements RandomAccess, InterfaceC1830a4, F4 {

    private static final N3 f14902v;

    private float[] f14903e;

    private int f14904i;

    static {
        N3 n32 = new N3(new float[0], 0);
        f14902v = n32;
        n32.zzb();
    }

    N3() {
        this(new float[10], 0);
    }

    private final String g(int i7) {
        int i8 = this.f14904i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f14904i) {
            throw new IndexOutOfBoundsException(g(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f14904i)) {
            throw new IndexOutOfBoundsException(g(i7));
        }
        float[] fArr = this.f14903e;
        if (i8 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i7 + 1, i8 - i7);
        } else {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            System.arraycopy(this.f14903e, i7, fArr2, i7 + 1, this.f14904i - i7);
            this.f14903e = fArr2;
        }
        this.f14903e[i7] = fFloatValue;
        this.f14904i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        C1838b4.e(collection);
        if (!(collection instanceof N3)) {
            return super.addAll(collection);
        }
        N3 n32 = (N3) collection;
        int i7 = n32.f14904i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f14904i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.f14903e;
        if (i9 > fArr.length) {
            this.f14903e = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(n32.f14903e, 0, this.f14903e, this.f14904i, n32.f14904i);
        this.f14904i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f7) {
        d();
        int i7 = this.f14904i;
        float[] fArr = this.f14903e;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[((i7 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.f14903e = fArr2;
        }
        float[] fArr3 = this.f14903e;
        int i8 = this.f14904i;
        this.f14904i = i8 + 1;
        fArr3[i8] = f7;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N3)) {
            return super.equals(obj);
        }
        N3 n32 = (N3) obj;
        if (this.f14904i != n32.f14904i) {
            return false;
        }
        float[] fArr = n32.f14903e;
        for (int i7 = 0; i7 < this.f14904i; i7++) {
            if (Float.floatToIntBits(this.f14903e[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i7) {
        j(i7);
        return Float.valueOf(this.f14903e[i7]);
    }

    @Override
    public final InterfaceC1830a4 h(int i7) {
        if (i7 >= this.f14904i) {
            return new N3(Arrays.copyOf(this.f14903e, i7), this.f14904i);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.f14904i; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f14903e[i7]);
        }
        return iFloatToIntBits;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i7 = this.f14904i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f14903e[i8] == fFloatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i7) {
        d();
        j(i7);
        float[] fArr = this.f14903e;
        float f7 = fArr[i7];
        if (i7 < this.f14904i - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (r2 - i7) - 1);
        }
        this.f14904i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14903e;
        System.arraycopy(fArr, i8, fArr, i7, this.f14904i - i8);
        this.f14904i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        j(i7);
        float[] fArr = this.f14903e;
        float f7 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f7);
    }

    @Override
    public final int size() {
        return this.f14904i;
    }

    private N3(float[] fArr, int i7) {
        this.f14903e = fArr;
        this.f14904i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
