package Z1;

import a2.c;
import android.graphics.Path;
import com.roblox.client.personasdk.R;
import java.io.IOException;
import java.util.Collections;

class p {
    private static final c.a a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final c.a b = c.a.a("p", "k");

    static W1.e a(a2.c cVar, P1.d dVar) throws IOException {
        V1.d dVarH = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strU = null;
        W1.g gVar = null;
        V1.c cVarG = null;
        V1.f fVarI = null;
        V1.f fVarI2 = null;
        boolean zY = false;
        while (cVar.u()) {
            switch (cVar.n0(a)) {
                case 0:
                    strU = cVar.U();
                    break;
                case 1:
                    cVar.f();
                    int iK = -1;
                    while (cVar.u()) {
                        int iN0 = cVar.n0(b);
                        if (iN0 == 0) {
                            iK = cVar.K();
                        } else if (iN0 != 1) {
                            cVar.t0();
                            cVar.H0();
                        } else {
                            cVarG = C0432d.g(cVar, dVar, iK);
                        }
                    }
                    cVar.m();
                    break;
                case 2:
                    dVarH = C0432d.h(cVar, dVar);
                    break;
                case 3:
                    gVar = cVar.K() == 1 ? W1.g.LINEAR : W1.g.RADIAL;
                    break;
                case 4:
                    fVarI = C0432d.i(cVar, dVar);
                    break;
                case 5:
                    fVarI2 = C0432d.i(cVar, dVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    fillType = cVar.K() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    zY = cVar.y();
                    break;
                default:
                    cVar.t0();
                    cVar.H0();
                    break;
            }
        }
        return new W1.e(strU, gVar, fillType, cVarG, dVarH == null ? new V1.d(Collections.singletonList(new c2.a(100))) : dVarH, fVarI, fVarI2, null, null, zY);
    }
}
