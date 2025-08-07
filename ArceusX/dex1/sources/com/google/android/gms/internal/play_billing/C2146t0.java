package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

final class C2146t0 extends AbstractC2158v0 implements Serializable {

    static final C2146t0 f16149d = new C2146t0();

    private C2146t0() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
