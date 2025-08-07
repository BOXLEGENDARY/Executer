package Z1;

import W1.q;
import a2.c;
import com.roblox.client.personasdk.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class q {
    private static final c.a a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final c.a b = c.a.a("p", "k");
    private static final c.a c = c.a.a("n", "v");

    static W1.f a(a2.c cVar, P1.d dVar) throws IOException {
        String str;
        V1.c cVar2;
        ArrayList arrayList = new ArrayList();
        float fA = 0.0f;
        String strU = null;
        W1.g gVar = null;
        V1.c cVarG = null;
        V1.f fVarI = null;
        V1.f fVarI2 = null;
        V1.b bVarE = null;
        q.b bVar = null;
        q.c cVar3 = null;
        V1.b bVar2 = null;
        boolean zY = false;
        V1.d dVar2 = null;
        while (cVar.u()) {
            switch (cVar.n0(a)) {
                case 0:
                    strU = cVar.U();
                    continue;
                case 1:
                    str = strU;
                    cVar.f();
                    int iK = -1;
                    while (cVar.u()) {
                        int iN0 = cVar.n0(b);
                        if (iN0 != 0) {
                            cVar2 = cVarG;
                            if (iN0 != 1) {
                                cVar.t0();
                                cVar.H0();
                            } else {
                                cVarG = C0432d.g(cVar, dVar, iK);
                            }
                        } else {
                            cVar2 = cVarG;
                            iK = cVar.K();
                        }
                        cVarG = cVar2;
                    }
                    cVar.m();
                    break;
                case 2:
                    dVar2 = C0432d.h(cVar, dVar);
                    continue;
                case 3:
                    str = strU;
                    gVar = cVar.K() == 1 ? W1.g.LINEAR : W1.g.RADIAL;
                    break;
                case 4:
                    fVarI = C0432d.i(cVar, dVar);
                    continue;
                case 5:
                    fVarI2 = C0432d.i(cVar, dVar);
                    continue;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    bVarE = C0432d.e(cVar, dVar);
                    continue;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str = strU;
                    bVar = q.b.values()[cVar.K() - 1];
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str = strU;
                    cVar3 = q.c.values()[cVar.K() - 1];
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str = strU;
                    fA = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    zY = cVar.y();
                    continue;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    cVar.e();
                    while (cVar.u()) {
                        cVar.f();
                        String strU2 = null;
                        V1.b bVarE2 = null;
                        while (cVar.u()) {
                            int iN02 = cVar.n0(c);
                            if (iN02 != 0) {
                                V1.b bVar3 = bVar2;
                                if (iN02 != 1) {
                                    cVar.t0();
                                    cVar.H0();
                                } else {
                                    bVarE2 = C0432d.e(cVar, dVar);
                                }
                                bVar2 = bVar3;
                            } else {
                                strU2 = cVar.U();
                            }
                        }
                        V1.b bVar4 = bVar2;
                        cVar.m();
                        if (strU2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strU2.equals("d") || strU2.equals("g")) {
                                dVar.u(true);
                                arrayList.add(bVarE2);
                            }
                            bVar2 = bVar4;
                        }
                    }
                    V1.b bVar5 = bVar2;
                    cVar.j();
                    if (arrayList.size() == 1) {
                        arrayList.add((V1.b) arrayList.get(0));
                    }
                    bVar2 = bVar5;
                    continue;
                    break;
                default:
                    cVar.t0();
                    cVar.H0();
                    continue;
            }
            strU = str;
        }
        String str2 = strU;
        if (dVar2 == null) {
            dVar2 = new V1.d(Collections.singletonList(new c2.a(100)));
        }
        return new W1.f(str2, gVar, cVarG, dVar2, fVarI, fVarI2, bVarE, bVar, cVar3, fA, arrayList, bVar2, zY);
    }
}
