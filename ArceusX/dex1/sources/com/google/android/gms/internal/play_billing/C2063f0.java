package com.google.android.gms.internal.play_billing;

final class C2063f0 {

    private final Object f16047a;

    private final Object f16048b;

    private final Object f16049c;

    C2063f0(Object obj, Object obj2, Object obj3) {
        this.f16047a = obj;
        this.f16048b = obj2;
        this.f16049c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f16049c;
        Object obj2 = this.f16048b;
        Object obj3 = this.f16047a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
