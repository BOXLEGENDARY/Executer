package com.google.android.gms.internal.measurement;

abstract class AbstractC1918l4 {

    private static final AbstractC1918l4 f15204a;

    private static final AbstractC1918l4 f15205b;

    static {
        C1894i4 c1894i4 = null;
        f15204a = new C1902j4(c1894i4);
        f15205b = new C1910k4(c1894i4);
    }

    AbstractC1918l4(C1894i4 c1894i4) {
    }

    static AbstractC1918l4 c() {
        return f15204a;
    }

    static AbstractC1918l4 d() {
        return f15205b;
    }

    abstract void a(Object obj, long j7);

    abstract <L> void b(Object obj, Object obj2, long j7);
}
