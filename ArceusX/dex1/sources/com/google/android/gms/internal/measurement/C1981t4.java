package com.google.android.gms.internal.measurement;

final class C1981t4 {

    private static final C1973s4 f15329a;

    private static final C1973s4 f15330b;

    static {
        C1973s4 c1973s4 = null;
        try {
            c1973s4 = (C1973s4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15329a = c1973s4;
        f15330b = new C1973s4();
    }

    static C1973s4 a() {
        return f15329a;
    }

    static C1973s4 b() {
        return f15330b;
    }
}
