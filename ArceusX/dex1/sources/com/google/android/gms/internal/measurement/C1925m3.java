package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class C1925m3 implements Comparator<AbstractC1980t3> {
    C1925m3() {
    }

    @Override
    public final int compare(AbstractC1980t3 abstractC1980t3, AbstractC1980t3 abstractC1980t32) {
        AbstractC1980t3 abstractC1980t33 = abstractC1980t3;
        AbstractC1980t3 abstractC1980t34 = abstractC1980t32;
        C1909k3 c1909k3 = new C1909k3(abstractC1980t33);
        C1909k3 c1909k32 = new C1909k3(abstractC1980t34);
        while (c1909k3.hasNext() && c1909k32.hasNext()) {
            int iA = C1917l3.a(c1909k3.zza() & 255, c1909k32.zza() & 255);
            if (iA != 0) {
                return iA;
            }
        }
        return C1917l3.a(abstractC1980t33.g(), abstractC1980t34.g());
    }
}
