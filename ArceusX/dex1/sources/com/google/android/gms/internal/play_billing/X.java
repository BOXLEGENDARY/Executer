package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

class X extends Y {

    Object[] f15952a;

    int f15953b;

    boolean f15954c;

    X(int i7) {
        L.a(i7, "initialCapacity");
        this.f15952a = new Object[i7];
        this.f15953b = 0;
    }

    private final void d(int i7) {
        int length = this.f15952a.length;
        int iA = Y.a(length, this.f15953b + i7);
        if (iA > length || this.f15954c) {
            this.f15952a = Arrays.copyOf(this.f15952a, iA);
            this.f15954c = false;
        }
    }

    public final X b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f15952a;
        int i7 = this.f15953b;
        this.f15953b = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    final void c(Object[] objArr, int i7) {
        C2152u0.b(objArr, i7);
        d(i7);
        System.arraycopy(objArr, 0, this.f15952a, this.f15953b, i7);
        this.f15953b += i7;
    }
}
