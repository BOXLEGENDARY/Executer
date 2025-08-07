package com.google.android.gms.internal.play_billing;

public final class C2152u0 {
    static Object a(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i7);
    }

    static Object[] b(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            a(objArr[i8], i8);
        }
        return objArr;
    }
}
