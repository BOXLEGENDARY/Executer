package com.google.android.gms.internal.measurement;

final class C1942o4 implements InterfaceC2005w4 {

    private final InterfaceC2005w4[] f15221a;

    C1942o4(InterfaceC2005w4... interfaceC2005w4Arr) {
        this.f15221a = interfaceC2005w4Arr;
    }

    @Override
    public final InterfaceC1989u4 a(Class<?> cls) {
        InterfaceC2005w4[] interfaceC2005w4Arr = this.f15221a;
        for (int i7 = 0; i7 < 2; i7++) {
            InterfaceC2005w4 interfaceC2005w4 = interfaceC2005w4Arr[i7];
            if (interfaceC2005w4.b(cls)) {
                return interfaceC2005w4.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override
    public final boolean b(Class<?> cls) {
        InterfaceC2005w4[] interfaceC2005w4Arr = this.f15221a;
        for (int i7 = 0; i7 < 2; i7++) {
            if (interfaceC2005w4Arr[i7].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
