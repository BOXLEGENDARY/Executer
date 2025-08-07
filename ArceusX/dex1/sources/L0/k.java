package l0;

import k0.C2510d;
import l0.e;

public class k {

    static boolean[] f21741a = new boolean[3];

    static void a(f fVar, C2510d c2510d, e eVar) {
        eVar.f21640n = -1;
        eVar.f21642o = -1;
        e.b bVar = fVar.f21606S[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f21606S[0] == e.b.f21671v) {
            int i7 = eVar.f21595H.f21571g;
            int iT = fVar.T() - eVar.f21597J.f21571g;
            d dVar = eVar.f21595H;
            dVar.f21573i = c2510d.q(dVar);
            d dVar2 = eVar.f21597J;
            dVar2.f21573i = c2510d.q(dVar2);
            c2510d.f(eVar.f21595H.f21573i, i7);
            c2510d.f(eVar.f21597J.f21573i, iT);
            eVar.f21640n = 2;
            eVar.B0(i7, iT);
        }
        if (fVar.f21606S[1] == bVar2 || eVar.f21606S[1] != e.b.f21671v) {
            return;
        }
        int i8 = eVar.f21596I.f21571g;
        int iX = fVar.x() - eVar.f21598K.f21571g;
        d dVar3 = eVar.f21596I;
        dVar3.f21573i = c2510d.q(dVar3);
        d dVar4 = eVar.f21598K;
        dVar4.f21573i = c2510d.q(dVar4);
        c2510d.f(eVar.f21596I.f21573i, i8);
        c2510d.f(eVar.f21598K.f21573i, iX);
        if (eVar.f21623e0 > 0 || eVar.S() == 8) {
            d dVar5 = eVar.f21599L;
            dVar5.f21573i = c2510d.q(dVar5);
            c2510d.f(eVar.f21599L.f21573i, eVar.f21623e0 + i8);
        }
        eVar.f21642o = 2;
        eVar.S0(i8, iX);
    }

    public static final boolean b(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
