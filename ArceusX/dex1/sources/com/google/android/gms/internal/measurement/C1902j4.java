package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class C1902j4 extends AbstractC1918l4 {

    private static final Class<?> f15196c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    C1902j4(C1894i4 c1894i4) {
        super(null);
    }

    @Override
    final void a(Object obj, long j7) {
        Object objUnmodifiableList;
        List list = (List) C1895i5.k(obj, j7);
        if (list instanceof InterfaceC1886h4) {
            objUnmodifiableList = ((InterfaceC1886h4) list).b();
        } else {
            if (f15196c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof F4) && (list instanceof InterfaceC1830a4)) {
                InterfaceC1830a4 interfaceC1830a4 = (InterfaceC1830a4) list;
                if (interfaceC1830a4.a()) {
                    interfaceC1830a4.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C1895i5.x(obj, j7, objUnmodifiableList);
    }

    @Override
    final <E> void b(Object obj, Object obj2, long j7) {
        C1878g4 c1878g4;
        List list = (List) C1895i5.k(obj2, j7);
        int size = list.size();
        List listH = (List) C1895i5.k(obj, j7);
        if (listH.isEmpty()) {
            listH = listH instanceof InterfaceC1886h4 ? new C1878g4(size) : ((listH instanceof F4) && (listH instanceof InterfaceC1830a4)) ? ((InterfaceC1830a4) listH).h(size) : new ArrayList(size);
            C1895i5.x(obj, j7, listH);
        } else {
            if (f15196c.isAssignableFrom(listH.getClass())) {
                ArrayList arrayList = new ArrayList(listH.size() + size);
                arrayList.addAll(listH);
                C1895i5.x(obj, j7, arrayList);
                c1878g4 = arrayList;
            } else if (listH instanceof C1855d5) {
                C1878g4 c1878g42 = new C1878g4(listH.size() + size);
                c1878g42.addAll(c1878g42.size(), (C1855d5) listH);
                C1895i5.x(obj, j7, c1878g42);
                c1878g4 = c1878g42;
            } else if ((listH instanceof F4) && (listH instanceof InterfaceC1830a4)) {
                InterfaceC1830a4 interfaceC1830a4 = (InterfaceC1830a4) listH;
                if (!interfaceC1830a4.a()) {
                    listH = interfaceC1830a4.h(listH.size() + size);
                    C1895i5.x(obj, j7, listH);
                }
            }
            listH = c1878g4;
        }
        int size2 = listH.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listH.addAll(list);
        }
        if (size2 > 0) {
            list = listH;
        }
        C1895i5.x(obj, j7, list);
    }
}
