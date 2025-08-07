package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class C2069g0 {

    Object[] f16054a = new Object[8];

    int f16055b = 0;

    C2063f0 f16056c;

    public final C2069g0 a(Object obj, Object obj2) {
        int i7 = this.f16055b + 1;
        Object[] objArr = this.f16054a;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.f16054a = Arrays.copyOf(objArr, Y.a(length, i8));
        }
        L.b(obj, obj2);
        Object[] objArr2 = this.f16054a;
        int i9 = this.f16055b;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f16055b = i9 + 1;
        return this;
    }

    public final AbstractC2075h0 b() {
        C2063f0 c2063f0 = this.f16056c;
        if (c2063f0 != null) {
            throw c2063f0.a();
        }
        G0 g0H = G0.h(this.f16055b, this.f16054a, this);
        C2063f0 c2063f02 = this.f16056c;
        if (c2063f02 == null) {
            return g0H;
        }
        throw c2063f02.a();
    }
}
