package Z1;

import X1.e;
import a2.c;
import android.graphics.Color;
import android.graphics.Rect;
import com.roblox.client.personasdk.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class v {
    private static final c.a a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    private static final c.a b = c.a.a("d", "a");
    private static final c.a c = c.a.a("ty", "nm");

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static X1.e a(P1.d dVar) {
        Rect rectB = dVar.b();
        return new X1.e(Collections.emptyList(), dVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new V1.l(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }

    public static X1.e b(a2.c cVar, P1.d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.f();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        e.b bVar2 = bVar;
        e.a aVar = null;
        String strU = null;
        V1.l lVarG = null;
        V1.j jVarD = null;
        V1.k kVarA = null;
        V1.b bVarF = null;
        W1.a aVarB = null;
        C0438j c0438jB = null;
        long jK = 0;
        int iK = 0;
        int iK2 = 0;
        int color = 0;
        int iK3 = 0;
        int iK4 = 0;
        boolean zY = false;
        float fA = 1.0f;
        long jK2 = -1;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float f2 = 0.0f;
        String strU2 = "UNSET";
        String strU3 = null;
        while (cVar.u()) {
            switch (cVar.n0(a)) {
                case 0:
                    strU2 = cVar.U();
                    break;
                case 1:
                    jK = cVar.K();
                    break;
                case 2:
                    strU = cVar.U();
                    break;
                case 3:
                    int iK5 = cVar.K();
                    aVar = e.a.UNKNOWN;
                    if (iK5 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[iK5];
                        break;
                    }
                case 4:
                    jK2 = cVar.K();
                    break;
                case 5:
                    iK = (int) (cVar.K() * b2.h.e());
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    iK2 = (int) (cVar.K() * b2.h.e());
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    color = Color.parseColor(cVar.U());
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    lVarG = C0431c.g(cVar, dVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    int iK6 = cVar.K();
                    if (iK6 < e.b.values().length) {
                        bVar2 = e.b.values()[iK6];
                        int i = a.a[bVar2.ordinal()];
                        if (i == 1) {
                            dVar.a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            dVar.a("Unsupported matte type: Luma Inverted");
                        }
                        dVar.r(1);
                        break;
                    } else {
                        dVar.a("Unsupported matte type: " + iK6);
                        break;
                    }
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    cVar.e();
                    while (cVar.u()) {
                        arrayList3.add(x.a(cVar, dVar));
                    }
                    dVar.r(arrayList3.size());
                    cVar.j();
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    cVar.e();
                    while (cVar.u()) {
                        W1.c cVarA = C0436h.a(cVar, dVar);
                        if (cVarA != null) {
                            arrayList4.add(cVarA);
                        }
                    }
                    cVar.j();
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    cVar.f();
                    while (cVar.u()) {
                        int iN0 = cVar.n0(b);
                        if (iN0 == 0) {
                            jVarD = C0432d.d(cVar, dVar);
                        } else if (iN0 != 1) {
                            cVar.t0();
                            cVar.H0();
                        } else {
                            cVar.e();
                            if (cVar.u()) {
                                kVarA = C0430b.a(cVar, dVar);
                            }
                            while (cVar.u()) {
                                cVar.H0();
                            }
                            cVar.j();
                        }
                    }
                    cVar.m();
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    cVar.e();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.u()) {
                        cVar.f();
                        while (cVar.u()) {
                            int iN02 = cVar.n0(c);
                            if (iN02 == 0) {
                                int iK7 = cVar.K();
                                if (iK7 == 29) {
                                    aVarB = C0433e.b(cVar, dVar);
                                } else if (iK7 == 25) {
                                    c0438jB = new C0439k().b(cVar, dVar);
                                }
                            } else if (iN02 != 1) {
                                cVar.t0();
                                cVar.H0();
                            } else {
                                arrayList5.add(cVar.U());
                            }
                        }
                        cVar.m();
                    }
                    cVar.j();
                    dVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    fA = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    fA3 = (float) cVar.A();
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    iK3 = (int) (cVar.K() * b2.h.e());
                    break;
                case 17:
                    iK4 = (int) (cVar.K() * b2.h.e());
                    break;
                case 18:
                    fA2 = (float) cVar.A();
                    break;
                case 19:
                    f2 = (float) cVar.A();
                    break;
                case 20:
                    bVarF = C0432d.f(cVar, dVar, false);
                    break;
                case 21:
                    strU3 = cVar.U();
                    break;
                case 22:
                    zY = cVar.y();
                    break;
                default:
                    cVar.t0();
                    cVar.H0();
                    break;
            }
        }
        cVar.m();
        ArrayList arrayList6 = new ArrayList();
        if (fA2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new c2.a(dVar, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fA2)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f2 <= f) {
            f2 = dVar.f();
        }
        arrayList2.add(new c2.a(dVar, fValueOf, fValueOf, null, fA2, Float.valueOf(f2)));
        arrayList2.add(new c2.a(dVar, fValueOf2, fValueOf2, null, f2, Float.valueOf(Float.MAX_VALUE)));
        if (strU2.endsWith(".ai") || "ai".equals(strU3)) {
            dVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new X1.e(arrayList4, dVar, strU2, jK, aVar, jK2, strU, arrayList, lVarG, iK, iK2, color, fA, fA3, iK3, iK4, jVarD, kVarA, arrayList2, bVar2, bVarF, zY, aVarB, c0438jB);
    }
}
