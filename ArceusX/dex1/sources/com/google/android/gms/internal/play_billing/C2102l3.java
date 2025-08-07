package com.google.android.gms.internal.play_billing;

final class C2102l3 implements InterfaceC2143s3 {

    private final InterfaceC2143s3[] f16085a;

    C2102l3(InterfaceC2143s3... interfaceC2143s3Arr) {
        this.f16085a = interfaceC2143s3Arr;
    }

    @Override
    public final InterfaceC2137r3 a(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            InterfaceC2143s3 interfaceC2143s3 = this.f16085a[i7];
            if (interfaceC2143s3.b(cls)) {
                return interfaceC2143s3.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override
    public final boolean b(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.f16085a[i7].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
