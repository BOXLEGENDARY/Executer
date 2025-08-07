package com.google.android.gms.internal.measurement;

final class E4 {

    private static final D4 f14711a;

    private static final D4 f14712b;

    static {
        D4 d42 = null;
        try {
            d42 = (D4) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14711a = d42;
        f14712b = new D4();
    }

    static D4 a() {
        return f14711a;
    }

    static D4 b() {
        return f14712b;
    }
}
