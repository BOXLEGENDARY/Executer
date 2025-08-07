package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class H0 extends AbstractC2099l0 {

    private static final Object[] f15807A;

    static final H0 f15808B;

    final transient Object[] f15809i;

    private final transient int f15810v;

    final transient Object[] f15811w;

    private final transient int f15812y;

    private final transient int f15813z;

    static {
        Object[] objArr = new Object[0];
        f15807A = objArr;
        f15808B = new H0(objArr, 0, objArr, 0, 0);
    }

    H0(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f15809i = objArr;
        this.f15810v = i7;
        this.f15811w = objArr2;
        this.f15812y = i8;
        this.f15813z = i9;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15811w;
            if (objArr.length != 0) {
                int iA = W.a(obj.hashCode());
                while (true) {
                    int i7 = iA & this.f15812y;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f15809i, 0, objArr, 0, this.f15813z);
        return this.f15813z;
    }

    @Override
    final int e() {
        return this.f15813z;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.f15810v;
    }

    @Override
    public final Iterator iterator() {
        return j().listIterator(0);
    }

    @Override
    public final N0 iterator() {
        return j().listIterator(0);
    }

    @Override
    final Object[] m() {
        return this.f15809i;
    }

    @Override
    final AbstractC2057e0 o() {
        return AbstractC2057e0.p(this.f15809i, this.f15813z);
    }

    @Override
    final boolean q() {
        return true;
    }

    @Override
    public final int size() {
        return this.f15813z;
    }
}
