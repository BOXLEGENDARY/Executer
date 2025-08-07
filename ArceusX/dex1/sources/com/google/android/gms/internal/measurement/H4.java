package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class H4<E> extends AbstractC1861e3<E> implements RandomAccess {

    private static final H4<Object> f14780v;

    private E[] f14781e;

    private int f14782i;

    static {
        H4<Object> h42 = new H4<>(new Object[0], 0);
        f14780v = h42;
        h42.zzb();
    }

    private H4(E[] eArr, int i7) {
        this.f14781e = eArr;
        this.f14782i = i7;
    }

    public static <E> H4<E> e() {
        return (H4<E>) f14780v;
    }

    private final String g(int i7) {
        int i8 = this.f14782i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f14782i) {
            throw new IndexOutOfBoundsException(g(i7));
        }
    }

    @Override
    public final void add(int i7, E e7) {
        int i8;
        d();
        if (i7 < 0 || i7 > (i8 = this.f14782i)) {
            throw new IndexOutOfBoundsException(g(i7));
        }
        E[] eArr = this.f14781e;
        if (i8 < eArr.length) {
            System.arraycopy(eArr, i7, eArr, i7 + 1, i8 - i7);
        } else {
            E[] eArr2 = (E[]) new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i7);
            System.arraycopy(this.f14781e, i7, eArr2, i7 + 1, this.f14782i - i7);
            this.f14781e = eArr2;
        }
        this.f14781e[i7] = e7;
        this.f14782i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final E get(int i7) {
        j(i7);
        return this.f14781e[i7];
    }

    @Override
    public final InterfaceC1830a4 h(int i7) {
        if (i7 >= this.f14782i) {
            return new H4(Arrays.copyOf(this.f14781e, i7), this.f14782i);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final E remove(int i7) {
        d();
        j(i7);
        E[] eArr = this.f14781e;
        E e7 = eArr[i7];
        if (i7 < this.f14782i - 1) {
            System.arraycopy(eArr, i7 + 1, eArr, i7, (r2 - i7) - 1);
        }
        this.f14782i--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override
    public final E set(int i7, E e7) {
        d();
        j(i7);
        E[] eArr = this.f14781e;
        E e8 = eArr[i7];
        eArr[i7] = e7;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override
    public final int size() {
        return this.f14782i;
    }

    @Override
    public final boolean add(E e7) {
        d();
        int i7 = this.f14782i;
        E[] eArr = this.f14781e;
        if (i7 == eArr.length) {
            this.f14781e = (E[]) Arrays.copyOf(eArr, ((i7 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14781e;
        int i8 = this.f14782i;
        this.f14782i = i8 + 1;
        eArr2[i8] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }
}
