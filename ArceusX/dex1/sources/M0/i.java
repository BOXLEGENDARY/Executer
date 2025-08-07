package m0;

import java.util.ArrayList;
import l0.e;

public class i {
    public static o a(l0.e eVar, int i7, ArrayList<o> arrayList, o oVar) {
        int iE1;
        int i8 = i7 == 0 ? eVar.f21587A0 : eVar.f21589B0;
        if (i8 != -1 && (oVar == null || i8 != oVar.f21956b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i9);
                if (oVar2.c() == i8) {
                    if (oVar != null) {
                        oVar.g(i7, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof l0.j) && (iE1 = ((l0.j) eVar).e1(i7)) != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i10);
                    if (oVar3.c() == iE1) {
                        oVar = oVar3;
                        break;
                    }
                    i10++;
                }
            }
            if (oVar == null) {
                oVar = new o(i7);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof l0.h) {
                l0.h hVar = (l0.h) eVar;
                hVar.d1().c(hVar.e1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i7 == 0) {
                eVar.f21587A0 = oVar.c();
                eVar.f21595H.c(i7, arrayList, oVar);
                eVar.f21597J.c(i7, arrayList, oVar);
            } else {
                eVar.f21589B0 = oVar.c();
                eVar.f21596I.c(i7, arrayList, oVar);
                eVar.f21599L.c(i7, arrayList, oVar);
                eVar.f21598K.c(i7, arrayList, oVar);
            }
            eVar.f21602O.c(i7, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i7) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = arrayList.get(i8);
            if (i7 == oVar.f21956b) {
                return oVar;
            }
        }
        return null;
    }

    public static boolean c(l0.f r16, m0.C2558b.InterfaceC0209b r17) {
        throw new UnsupportedOperationException("Method not decompiled: m0.i.c(l0.f, m0.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.f21671v && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.f21671v && bVar2 != bVar5));
    }
}
