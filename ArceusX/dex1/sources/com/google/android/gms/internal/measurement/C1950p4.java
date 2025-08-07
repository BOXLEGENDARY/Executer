package com.google.android.gms.internal.measurement;

final class C1950p4 implements K4 {

    private static final InterfaceC2005w4 f15257b = new C1934n4();

    private final InterfaceC2005w4 f15258a;

    public C1950p4() {
        InterfaceC2005w4 interfaceC2005w4;
        P3 p3C = P3.c();
        try {
            interfaceC2005w4 = (InterfaceC2005w4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC2005w4 = f15257b;
        }
        C1942o4 c1942o4 = new C1942o4(p3C, interfaceC2005w4);
        C1838b4.f(c1942o4, "messageInfoFactory");
        this.f15258a = c1942o4;
    }

    private static boolean b(InterfaceC1989u4 interfaceC1989u4) {
        return interfaceC1989u4.a() == 1;
    }

    @Override
    public final <T> J4<T> a(Class<T> cls) {
        L4.g(cls);
        InterfaceC1989u4 interfaceC1989u4A = this.f15258a.a(cls);
        return interfaceC1989u4A.zzb() ? T3.class.isAssignableFrom(cls) ? C4.j(L4.b(), J3.b(), interfaceC1989u4A.zza()) : C4.j(L4.b0(), J3.a(), interfaceC1989u4A.zza()) : T3.class.isAssignableFrom(cls) ? b(interfaceC1989u4A) ? B4.F(cls, interfaceC1989u4A, E4.b(), AbstractC1918l4.d(), L4.b(), J3.b(), C1981t4.b()) : B4.F(cls, interfaceC1989u4A, E4.b(), AbstractC1918l4.d(), L4.b(), null, C1981t4.b()) : b(interfaceC1989u4A) ? B4.F(cls, interfaceC1989u4A, E4.a(), AbstractC1918l4.c(), L4.b0(), J3.a(), C1981t4.a()) : B4.F(cls, interfaceC1989u4A, E4.a(), AbstractC1918l4.c(), L4.a(), null, C1981t4.a());
    }
}
