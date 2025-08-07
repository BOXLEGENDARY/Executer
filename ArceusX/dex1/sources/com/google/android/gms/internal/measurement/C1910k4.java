package com.google.android.gms.internal.measurement;

final class C1910k4 extends AbstractC1918l4 {
    C1910k4(C1894i4 c1894i4) {
        super(null);
    }

    @Override
    final void a(Object obj, long j7) {
        ((InterfaceC1830a4) C1895i5.k(obj, j7)).zzb();
    }

    @Override
    final <E> void b(Object obj, Object obj2, long j7) {
        InterfaceC1830a4 interfaceC1830a4H = (InterfaceC1830a4) C1895i5.k(obj, j7);
        InterfaceC1830a4 interfaceC1830a4 = (InterfaceC1830a4) C1895i5.k(obj2, j7);
        int size = interfaceC1830a4H.size();
        int size2 = interfaceC1830a4.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1830a4H.a()) {
                interfaceC1830a4H = interfaceC1830a4H.h(size2 + size);
            }
            interfaceC1830a4H.addAll(interfaceC1830a4);
        }
        if (size > 0) {
            interfaceC1830a4 = interfaceC1830a4H;
        }
        C1895i5.x(obj, j7, interfaceC1830a4);
    }
}
