package com.google.android.gms.internal.play_billing;

final class M2 implements InterfaceC2143s3 {

    private static final M2 f15904a = new M2();

    private M2() {
    }

    public static M2 c() {
        return f15904a;
    }

    @Override
    public final InterfaceC2137r3 a(Class cls) {
        if (!R2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2137r3) R2.q(cls.asSubclass(R2.class)).m(3, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override
    public final boolean b(Class cls) {
        return R2.class.isAssignableFrom(cls);
    }
}
