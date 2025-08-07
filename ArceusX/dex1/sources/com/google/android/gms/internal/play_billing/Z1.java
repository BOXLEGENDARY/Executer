package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2035a2;
import com.google.android.gms.internal.play_billing.Z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class Z1<MessageType extends AbstractC2035a2<MessageType, BuilderType>, BuilderType extends Z1<MessageType, BuilderType>> implements InterfaceC2149t3 {
    private static void b(List list, int i7) {
        String str = "Element at index " + (list.size() - i7) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i7) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    protected static void d(Iterable iterable, List list) {
        byte[] bArr = W2.f15951b;
        iterable.getClass();
        if (iterable instanceof InterfaceC2066f3) {
            List listZza = ((InterfaceC2066f3) iterable).zza();
            InterfaceC2066f3 interfaceC2066f3 = (InterfaceC2066f3) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2066f3.size() - size) + " is null.";
                    int size2 = interfaceC2066f3.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        interfaceC2066f3.remove(size2);
                    }
                } else if (obj instanceof AbstractC2131q2) {
                    interfaceC2066f3.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    AbstractC2131q2.o(bArr2, 0, bArr2.length);
                    interfaceC2066f3.zzb();
                } else {
                    interfaceC2066f3.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof B3) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof D3) {
                ((D3) list).g(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    b(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i7 = 0; i7 < size5; i7++) {
            Object obj3 = list2.get(i7);
            if (obj3 == null) {
                b(list, size4);
            }
            list.add(obj3);
        }
    }
}
