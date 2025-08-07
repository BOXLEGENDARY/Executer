package Z1;

import a2.c;
import android.graphics.PointF;
import com.roblox.client.personasdk.R;
import java.io.IOException;

public class C0431c {
    private static final c.a a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final c.a b = c.a.a("k");

    private static boolean a(V1.e eVar) {
        return eVar == null || (eVar.c() && eVar.b().get(0).b.equals(0.0f, 0.0f));
    }

    private static boolean b(V1.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof V1.i) && mVar.c() && mVar.b().get(0).b.equals(0.0f, 0.0f));
    }

    private static boolean c(V1.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((c2.a) bVar.b().get(0)).b).floatValue() == 0.0f);
    }

    private static boolean d(V1.g gVar) {
        return gVar == null || (gVar.c() && ((c2.d) ((c2.a) gVar.b().get(0)).b).a(1.0f, 1.0f));
    }

    private static boolean e(V1.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((c2.a) bVar.b().get(0)).b).floatValue() == 0.0f);
    }

    private static boolean f(V1.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((c2.a) bVar.b().get(0)).b).floatValue() == 0.0f);
    }

    public static V1.l g(a2.c cVar, P1.d dVar) throws IOException {
        boolean z;
        boolean z2 = false;
        boolean z3 = cVar.h0() == c.b.BEGIN_OBJECT;
        if (z3) {
            cVar.f();
        }
        V1.b bVar = null;
        V1.e eVarA = null;
        V1.m<PointF, PointF> mVarB = null;
        V1.g gVarJ = null;
        V1.b bVarF = null;
        V1.b bVarF2 = null;
        V1.d dVarH = null;
        V1.b bVarF3 = null;
        V1.b bVarF4 = null;
        while (cVar.u()) {
            switch (cVar.n0(a)) {
                case 0:
                    boolean z4 = z2;
                    cVar.f();
                    while (cVar.u()) {
                        if (cVar.n0(b) != 0) {
                            cVar.t0();
                            cVar.H0();
                        } else {
                            eVarA = C0429a.a(cVar, dVar);
                        }
                    }
                    cVar.m();
                    z2 = z4;
                    continue;
                case 1:
                    mVarB = C0429a.b(cVar, dVar);
                    continue;
                case 2:
                    gVarJ = C0432d.j(cVar, dVar);
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVarH = C0432d.h(cVar, dVar);
                    continue;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    bVarF3 = C0432d.f(cVar, dVar, z2);
                    continue;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    bVarF4 = C0432d.f(cVar, dVar, z2);
                    continue;
                case R.styleable.LottieAnimationView_lottie_loop:
                    bVarF = C0432d.f(cVar, dVar, z2);
                    continue;
                case R.styleable.LottieAnimationView_lottie_progress:
                    bVarF2 = C0432d.f(cVar, dVar, z2);
                    continue;
                default:
                    cVar.t0();
                    cVar.H0();
                    continue;
            }
            V1.b bVarF5 = C0432d.f(cVar, dVar, z2);
            if (bVarF5.b().isEmpty()) {
                bVarF5.b().add(new c2.a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
            } else {
                if (((c2.a) bVarF5.b().get(0)).b == 0) {
                    z = false;
                    bVarF5.b().set(0, new c2.a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(dVar.f())));
                }
                z2 = z;
                bVar = bVarF5;
            }
            z = false;
            z2 = z;
            bVar = bVarF5;
        }
        if (z3) {
            cVar.m();
        }
        V1.e eVar = a(eVarA) ? null : eVarA;
        V1.m<PointF, PointF> mVar = b(mVarB) ? null : mVarB;
        V1.b bVar2 = c(bVar) ? null : bVar;
        if (d(gVarJ)) {
            gVarJ = null;
        }
        return new V1.l(eVar, mVar, gVarJ, bVar2, dVarH, bVarF3, bVarF4, f(bVarF) ? null : bVarF, e(bVarF2) ? null : bVarF2);
    }
}
