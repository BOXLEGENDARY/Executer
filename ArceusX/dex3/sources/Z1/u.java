package Z1;

import a2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class u {
    static c.a a = c.a.a("k");

    static <T> List<c2.a<T>> a(a2.c cVar, P1.d dVar, float f, M<T> m, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.h0() == c.b.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.f();
        while (cVar.u()) {
            if (cVar.n0(a) != 0) {
                cVar.H0();
            } else if (cVar.h0() == c.b.BEGIN_ARRAY) {
                cVar.e();
                if (cVar.h0() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, dVar, f, m, false, z));
                } else {
                    while (cVar.u()) {
                        arrayList.add(t.c(cVar, dVar, f, m, true, z));
                    }
                }
                cVar.j();
            } else {
                arrayList.add(t.c(cVar, dVar, f, m, false, z));
            }
        }
        cVar.m();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends c2.a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            c2.a<T> aVar = list.get(i2);
            i2++;
            c2.a<T> aVar2 = list.get(i2);
            aVar.h = Float.valueOf(aVar2.g);
            if (aVar.c == null && (t = aVar2.b) != null) {
                aVar.c = t;
                if (aVar instanceof S1.i) {
                    ((S1.i) aVar).i();
                }
            }
        }
        c2.a<T> aVar3 = list.get(i);
        if ((aVar3.b == null || aVar3.c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
