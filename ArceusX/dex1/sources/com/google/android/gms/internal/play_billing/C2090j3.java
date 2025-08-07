package com.google.android.gms.internal.play_billing;

import Za.qhkq.dHkZSUxHu;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C2090j3 extends AbstractC2047c2 implements RandomAccess, V2, B3 {

    private static final long[] f16076v;

    private long[] f16077e;

    private int f16078i;

    static {
        long[] jArr = new long[0];
        f16076v = jArr;
        new C2090j3(jArr, 0, false);
    }

    C2090j3() {
        this(f16076v, 0, true);
    }

    private static int k(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String l(int i7) {
        return "Index:" + i7 + ", Size:" + this.f16078i;
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f16078i) {
            throw new IndexOutOfBoundsException(l(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f16078i)) {
            throw new IndexOutOfBoundsException(l(i7));
        }
        int i9 = i7 + 1;
        long[] jArr = this.f16077e;
        int length = jArr.length;
        if (i8 < length) {
            System.arraycopy(jArr, i7, jArr, i9, i8 - i7);
        } else {
            long[] jArr2 = new long[k(length)];
            System.arraycopy(this.f16077e, 0, jArr2, 0, i7);
            System.arraycopy(this.f16077e, i7, jArr2, i9, this.f16078i - i7);
            this.f16077e = jArr2;
        }
        this.f16077e[i7] = jLongValue;
        this.f16078i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = W2.f15951b;
        collection.getClass();
        if (!(collection instanceof C2090j3)) {
            return super.addAll(collection);
        }
        C2090j3 c2090j3 = (C2090j3) collection;
        int i7 = c2090j3.f16078i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f16078i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f16077e;
        if (i9 > jArr.length) {
            this.f16077e = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(c2090j3.f16077e, 0, this.f16077e, this.f16078i, c2090j3.f16078i);
        this.f16078i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i7) {
        m(i7);
        return this.f16077e[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2090j3)) {
            return super.equals(obj);
        }
        C2090j3 c2090j3 = (C2090j3) obj;
        if (this.f16078i != c2090j3.f16078i) {
            return false;
        }
        long[] jArr = c2090j3.f16077e;
        for (int i7 = 0; i7 < this.f16078i; i7++) {
            if (this.f16077e[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j7) {
        d();
        int i7 = this.f16078i;
        int length = this.f16077e.length;
        if (i7 == length) {
            long[] jArr = new long[k(length)];
            System.arraycopy(this.f16077e, 0, jArr, 0, this.f16078i);
            this.f16077e = jArr;
        }
        long[] jArr2 = this.f16077e;
        int i8 = this.f16078i;
        this.f16078i = i8 + 1;
        jArr2[i8] = j7;
    }

    @Override
    public final Object get(int i7) {
        m(i7);
        return Long.valueOf(this.f16077e[i7]);
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f16078i) {
            return new C2090j3(i7 == 0 ? f16076v : Arrays.copyOf(this.f16077e, i7), this.f16078i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f16078i; i8++) {
            long j7 = this.f16077e[i8];
            byte[] bArr = W2.f15951b;
            i7 = (i7 * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i7 = this.f16078i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f16077e[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    final void j(int i7) {
        int length = this.f16077e.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f16077e = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = k(length);
        }
        this.f16077e = Arrays.copyOf(this.f16077e, length);
    }

    @Override
    public final Object remove(int i7) {
        d();
        m(i7);
        long[] jArr = this.f16077e;
        long j7 = jArr[i7];
        if (i7 < this.f16078i - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f16078i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(dHkZSUxHu.kXJTSKOSFeltxBp);
        }
        long[] jArr = this.f16077e;
        System.arraycopy(jArr, i8, jArr, i7, this.f16078i - i8);
        this.f16078i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        m(i7);
        long[] jArr = this.f16077e;
        long j7 = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j7);
    }

    @Override
    public final int size() {
        return this.f16078i;
    }

    private C2090j3(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.f16077e = jArr;
        this.f16078i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
