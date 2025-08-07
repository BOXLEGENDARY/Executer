package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1845c3;
import com.google.android.gms.internal.measurement.AbstractC1853d3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import w7.Jld.EZYiRMRTxKdo;

public abstract class AbstractC1853d3<MessageType extends AbstractC1853d3<MessageType, BuilderType>, BuilderType extends AbstractC1845c3<MessageType, BuilderType>> implements InterfaceC2021y4 {
    protected int zzb = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        C1838b4.e(iterable);
        if (iterable instanceof InterfaceC1886h4) {
            List<?> listF = ((InterfaceC1886h4) iterable).f();
            InterfaceC1886h4 interfaceC1886h4 = (InterfaceC1886h4) list;
            int size = list.size();
            for (Object obj : listF) {
                if (obj == null) {
                    int size2 = interfaceC1886h4.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = interfaceC1886h4.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        interfaceC1886h4.remove(size3);
                    }
                } else if (obj instanceof AbstractC1980t3) {
                    interfaceC1886h4.i((AbstractC1980t3) obj);
                } else {
                    interfaceC1886h4.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof F4) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (T t7 : iterable) {
            if (t7 == null) {
                int size5 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5 - size4);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t7);
            }
        }
    }

    @Override
    public final AbstractC1980t3 d() {
        try {
            int iA = a();
            AbstractC1980t3 abstractC1980t3 = AbstractC1980t3.f15325e;
            byte[] bArr = new byte[iA];
            B3 b3C = B3.c(bArr);
            b(b3C);
            b3C.d();
            return new C1964r3(bArr);
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    int f() {
        throw null;
    }

    void i(int i7) {
        throw null;
    }

    public final byte[] j() {
        try {
            byte[] bArr = new byte[a()];
            B3 b3C = B3.c(bArr);
            b(b3C);
            b3C.d();
            return bArr;
        } catch (IOException e7) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append(EZYiRMRTxKdo.ArrErb);
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e7);
        }
    }
}
