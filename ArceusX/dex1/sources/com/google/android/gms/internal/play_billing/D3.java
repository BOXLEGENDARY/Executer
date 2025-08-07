package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class D3 extends AbstractC2047c2 implements RandomAccess {

    private static final Object[] f15788v;

    private static final D3 f15789w;

    private Object[] f15790e;

    private int f15791i;

    static {
        Object[] objArr = new Object[0];
        f15788v = objArr;
        f15789w = new D3(objArr, 0, false);
    }

    D3() {
        this(f15788v, 0, true);
    }

    private final void H(int i7) {
        if (i7 < 0 || i7 >= this.f15791i) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    public static D3 e() {
        return f15789w;
    }

    private static int j(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f15791i;
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        d();
        if (i7 < 0 || i7 > (i8 = this.f15791i)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.f15790e;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[j(length)];
            System.arraycopy(this.f15790e, 0, objArr2, 0, i7);
            System.arraycopy(this.f15790e, i7, objArr2, i9, this.f15791i - i7);
            this.f15790e = objArr2;
        }
        this.f15790e[i7] = obj;
        this.f15791i++;
        ((AbstractList) this).modCount++;
    }

    final void g(int i7) {
        int length = this.f15790e.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f15790e = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = j(length);
        }
        this.f15790e = Arrays.copyOf(this.f15790e, length);
    }

    @Override
    public final Object get(int i7) {
        H(i7);
        return this.f15790e[i7];
    }

    @Override
    public final V2 h(int i7) {
        if (i7 >= this.f15791i) {
            return new D3(i7 == 0 ? f15788v : Arrays.copyOf(this.f15790e, i7), this.f15791i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Object remove(int i7) {
        d();
        H(i7);
        Object[] objArr = this.f15790e;
        Object obj = objArr[i7];
        if (i7 < this.f15791i - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f15791i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i7, Object obj) {
        d();
        H(i7);
        Object[] objArr = this.f15790e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.f15791i;
    }

    private D3(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f15790e = objArr;
        this.f15791i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        d();
        int i7 = this.f15791i;
        int length = this.f15790e.length;
        if (i7 == length) {
            this.f15790e = Arrays.copyOf(this.f15790e, j(length));
        }
        Object[] objArr = this.f15790e;
        int i8 = this.f15791i;
        this.f15791i = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
