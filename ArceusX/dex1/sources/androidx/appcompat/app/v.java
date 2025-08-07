package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

final class v {
    private static u0.i a(u0.i iVar, u0.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i7 = 0;
        while (i7 < iVar.f() + iVar2.f()) {
            Locale localeC = i7 < iVar.f() ? iVar.c(i7) : iVar2.c(i7 - iVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i7++;
        }
        return u0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static u0.i b(u0.i iVar, u0.i iVar2) {
        return (iVar == null || iVar.e()) ? u0.i.d() : a(iVar, iVar2);
    }
}
