package l0;

import java.util.ArrayList;
import k0.C2510d;

public class b {
    static void a(l0.f r37, k0.C2510d r38, int r39, int r40, l0.c r41) {
        throw new UnsupportedOperationException("Method not decompiled: l0.b.a(l0.f, k0.d, int, int, l0.c):void");
    }

    public static void b(f fVar, C2510d c2510d, ArrayList<e> arrayList, int i7) {
        int i8;
        c[] cVarArr;
        int i9;
        if (i7 == 0) {
            i8 = fVar.f21682N0;
            cVarArr = fVar.f21685Q0;
            i9 = 0;
        } else {
            i8 = fVar.f21683O0;
            cVarArr = fVar.f21684P0;
            i9 = 2;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f21543a)) {
                a(fVar, c2510d, i7, i9, cVar);
            }
        }
    }
}
