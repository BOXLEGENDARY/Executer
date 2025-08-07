package Z1;

import U1.b;
import a2.c;
import com.roblox.client.personasdk.R;
import java.io.IOException;

public class C0437i implements M<U1.b> {
    public static final C0437i a = new C0437i();
    private static final c.a b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C0437i() {
    }

    @Override
    public U1.b a(a2.c cVar, float f) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.f();
        b.a aVar2 = aVar;
        String strU = null;
        String strU2 = null;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iK = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zY = true;
        while (cVar.u()) {
            switch (cVar.n0(b)) {
                case 0:
                    strU = cVar.U();
                    break;
                case 1:
                    strU2 = cVar.U();
                    break;
                case 2:
                    fA = (float) cVar.A();
                    break;
                case 3:
                    int iK2 = cVar.K();
                    aVar2 = b.a.CENTER;
                    if (iK2 <= aVar2.ordinal() && iK2 >= 0) {
                        aVar2 = b.a.values()[iK2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iK = cVar.K();
                    break;
                case 5:
                    fA2 = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    fA3 = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    iD = s.d(cVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    iD2 = s.d(cVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    fA4 = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    zY = cVar.y();
                    break;
                default:
                    cVar.t0();
                    cVar.H0();
                    break;
            }
        }
        cVar.m();
        return new U1.b(strU, strU2, fA, aVar2, iK, fA2, fA3, iD, iD2, fA4, zY);
    }
}
