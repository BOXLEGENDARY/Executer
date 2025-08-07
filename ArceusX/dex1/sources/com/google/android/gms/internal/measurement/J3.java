package com.google.android.gms.internal.measurement;

final class J3 {

    private static final H3<?> f14800a = new I3();

    private static final H3<?> f14801b;

    static {
        H3<?> h32 = null;
        try {
            h32 = (H3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f14801b = h32;
    }

    static H3<?> a() {
        H3<?> h32 = f14801b;
        if (h32 != null) {
            return h32;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static H3<?> b() {
        return f14800a;
    }
}
