package Z1;

import W1.j;
import a2.c;
import android.graphics.PointF;
import com.roblox.client.personasdk.R;
import java.io.IOException;

class C {
    private static final c.a a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    static W1.j a(a2.c cVar, P1.d dVar) throws IOException {
        String strU = null;
        j.a aVarC = null;
        V1.b bVarF = null;
        V1.m<PointF, PointF> mVarB = null;
        V1.b bVarF2 = null;
        V1.b bVarE = null;
        V1.b bVarE2 = null;
        V1.b bVarF3 = null;
        V1.b bVarF4 = null;
        boolean zY = false;
        while (cVar.u()) {
            switch (cVar.n0(a)) {
                case 0:
                    strU = cVar.U();
                    break;
                case 1:
                    aVarC = j.a.c(cVar.K());
                    break;
                case 2:
                    bVarF = C0432d.f(cVar, dVar, false);
                    break;
                case 3:
                    mVarB = C0429a.b(cVar, dVar);
                    break;
                case 4:
                    bVarF2 = C0432d.f(cVar, dVar, false);
                    break;
                case 5:
                    bVarE2 = C0432d.e(cVar, dVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    bVarF4 = C0432d.f(cVar, dVar, false);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    bVarE = C0432d.e(cVar, dVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    bVarF3 = C0432d.f(cVar, dVar, false);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    zY = cVar.y();
                    break;
                default:
                    cVar.t0();
                    cVar.H0();
                    break;
            }
        }
        return new W1.j(strU, aVarC, bVarF, mVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zY);
    }
}
