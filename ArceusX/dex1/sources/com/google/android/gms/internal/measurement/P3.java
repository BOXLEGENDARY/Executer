package com.google.android.gms.internal.measurement;

final class P3 implements InterfaceC2005w4 {

    private static final P3 f14997a = new P3();

    private P3() {
    }

    public static P3 c() {
        return f14997a;
    }

    @Override
    public final InterfaceC1989u4 a(Class<?> cls) {
        if (!T3.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC1989u4) T3.r(cls.asSubclass(T3.class)).v(3, null, null);
        } catch (Exception e7) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
        }
    }

    @Override
    public final boolean b(Class<?> cls) {
        return T3.class.isAssignableFrom(cls);
    }
}
