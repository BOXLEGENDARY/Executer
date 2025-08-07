package Z1;

import X1.e;
import a2.c;
import android.graphics.Rect;
import com.roblox.client.personasdk.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class w {
    private static final c.a a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static c.a b = c.a.a("id", "layers", "w", "h", "p", "u");
    private static final c.a c = c.a.a("list");
    private static final c.a d = c.a.a("cm", "tm", "dr");

    public static P1.d a(a2.c cVar) throws IOException {
        HashMap map;
        ArrayList arrayList;
        a2.c cVar2 = cVar;
        float fE = b2.h.e();
        g0.h<X1.e> hVar = new g0.h<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        g0.l<U1.d> lVar = new g0.l<>();
        P1.d dVar = new P1.d();
        cVar.f();
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        int iK = 0;
        int iK2 = 0;
        while (cVar.u()) {
            switch (cVar2.n0(a)) {
                case 0:
                    iK = cVar.K();
                    continue;
                    cVar2 = cVar;
                case 1:
                    iK2 = cVar.K();
                    continue;
                    cVar2 = cVar;
                case 2:
                    fA = (float) cVar.A();
                    continue;
                    cVar2 = cVar;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fA2 = ((float) cVar.A()) - 0.01f;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fA3 = (float) cVar.A();
                    break;
                case 5:
                    String[] strArrSplit = cVar.U().split("\\.");
                    if (!b2.h.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        dVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    cVar2 = cVar;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    e(cVar2, dVar, arrayList2, hVar);
                    continue;
                    cVar2 = cVar;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    b(cVar2, dVar, map2, map3);
                    continue;
                    cVar2 = cVar;
                case R.styleable.LottieAnimationView_lottie_loop:
                    d(cVar2, map4);
                    continue;
                    cVar2 = cVar;
                case R.styleable.LottieAnimationView_lottie_progress:
                    c(cVar2, dVar, lVar);
                    continue;
                    cVar2 = cVar;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    f(cVar2, arrayList3);
                    continue;
                    cVar2 = cVar;
                default:
                    cVar.t0();
                    cVar.H0();
                    continue;
                    cVar2 = cVar;
            }
            map4 = map;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        dVar.s(new Rect(0, 0, (int) (iK * fE), (int) (iK2 * fE)), fA, fA2, fA3, arrayList2, hVar, map2, map3, lVar, map4, arrayList3);
        return dVar;
    }

    private static void b(a2.c cVar, P1.d dVar, Map<String, List<X1.e>> map, Map<String, P1.f> map2) throws IOException {
        cVar.e();
        while (cVar.u()) {
            ArrayList arrayList = new ArrayList();
            g0.h hVar = new g0.h();
            cVar.f();
            int iK = 0;
            int iK2 = 0;
            String strU = null;
            String strU2 = null;
            String strU3 = null;
            while (cVar.u()) {
                int iN0 = cVar.n0(b);
                if (iN0 == 0) {
                    strU = cVar.U();
                } else if (iN0 == 1) {
                    cVar.e();
                    while (cVar.u()) {
                        X1.e eVarB = v.b(cVar, dVar);
                        hVar.h(eVarB.d(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.j();
                } else if (iN0 == 2) {
                    iK = cVar.K();
                } else if (iN0 == 3) {
                    iK2 = cVar.K();
                } else if (iN0 == 4) {
                    strU2 = cVar.U();
                } else if (iN0 != 5) {
                    cVar.t0();
                    cVar.H0();
                } else {
                    strU3 = cVar.U();
                }
            }
            cVar.m();
            if (strU2 != null) {
                P1.f fVar = new P1.f(iK, iK2, strU, strU2, strU3);
                map2.put(fVar.d(), fVar);
            } else {
                map.put(strU, arrayList);
            }
        }
        cVar.j();
    }

    private static void c(a2.c cVar, P1.d dVar, g0.l<U1.d> lVar) throws IOException {
        cVar.e();
        while (cVar.u()) {
            U1.d dVarA = C0441m.a(cVar, dVar);
            lVar.h(dVarA.hashCode(), dVarA);
        }
        cVar.j();
    }

    private static void d(a2.c cVar, Map<String, U1.c> map) throws IOException {
        cVar.f();
        while (cVar.u()) {
            if (cVar.n0(c) != 0) {
                cVar.t0();
                cVar.H0();
            } else {
                cVar.e();
                while (cVar.u()) {
                    U1.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.j();
            }
        }
        cVar.m();
    }

    private static void e(a2.c cVar, P1.d dVar, List<X1.e> list, g0.h<X1.e> hVar) throws IOException {
        cVar.e();
        int i = 0;
        while (cVar.u()) {
            X1.e eVarB = v.b(cVar, dVar);
            if (eVarB.f() == e.a.IMAGE) {
                i++;
            }
            list.add(eVarB);
            hVar.h(eVarB.d(), eVarB);
            if (i > 4) {
                b2.d.c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.j();
    }

    private static void f(a2.c cVar, List<U1.h> list) throws IOException {
        cVar.e();
        while (cVar.u()) {
            cVar.f();
            float fA = 0.0f;
            String strU = null;
            float fA2 = 0.0f;
            while (cVar.u()) {
                int iN0 = cVar.n0(d);
                if (iN0 == 0) {
                    strU = cVar.U();
                } else if (iN0 == 1) {
                    fA = (float) cVar.A();
                } else if (iN0 != 2) {
                    cVar.t0();
                    cVar.H0();
                } else {
                    fA2 = (float) cVar.A();
                }
            }
            cVar.m();
            list.add(new U1.h(strU, fA, fA2));
        }
        cVar.j();
    }
}
