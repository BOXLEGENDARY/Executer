package W;

import C.InterfaceC0336k0;
import C.h1;
import S.AbstractC1229k;
import U.g;
import W.f;
import X.i0;
import X.j0;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.C3043d0;
import z.C3070z;

public final class c {

    private static final Map<String, Map<Integer, j0>> f7618a;

    private static final h1 f7619b;

    static {
        HashMap map = new HashMap();
        f7618a = map;
        f7619b = h1.UPTIME;
        HashMap map2 = new HashMap();
        j0 j0Var = j0.f7856a;
        map2.put(1, j0Var);
        j0 j0Var2 = j0.f7858c;
        map2.put(2, j0Var2);
        j0 j0Var3 = j0.f7859d;
        map2.put(4096, j0Var3);
        map2.put(8192, j0Var3);
        HashMap map3 = new HashMap();
        map3.put(1, j0Var);
        map3.put(2, j0Var2);
        map3.put(4096, j0Var3);
        map3.put(8192, j0Var3);
        HashMap map4 = new HashMap();
        map4.put(1, j0Var);
        map4.put(4, j0Var2);
        map4.put(4096, j0Var3);
        map4.put(16384, j0Var3);
        map4.put(2, j0Var);
        map4.put(8, j0Var2);
        map4.put(8192, j0Var3);
        map4.put(32768, j0Var3);
        HashMap map5 = new HashMap();
        map5.put(256, j0Var2);
        map5.put(512, j0.f7857b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    private static String a(C3070z c3070z) {
        int iB = c3070z.b();
        if (iB == 1) {
            return "video/avc";
        }
        if (iB == 3 || iB == 4 || iB == 5) {
            return "video/hevc";
        }
        if (iB == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + c3070z + "\nNo supported default mime type available.");
    }

    public static j0 b(String str, int i7) {
        j0 j0Var;
        Map<Integer, j0> map = f7618a.get(str);
        if (map != null && (j0Var = map.get(Integer.valueOf(i7))) != null) {
            return j0Var;
        }
        C3043d0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i7)));
        return j0.f7856a;
    }

    public static i0 c(f fVar, h1 h1Var, S.i0 i0Var, Size size, C3070z c3070z, Range<Integer> range) {
        InterfaceC0336k0.c cVarD = fVar.d();
        return (i0) (cVarD != null ? new e(fVar.a(), h1Var, i0Var, size, cVarD, c3070z, range) : new d(fVar.a(), h1Var, i0Var, size, c3070z, range)).get();
    }

    public static f d(AbstractC1229k abstractC1229k, C3070z c3070z, g gVar) {
        InterfaceC0336k0.c next;
        x0.g.j(c3070z.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c3070z + "]");
        String strF = AbstractC1229k.f(abstractC1229k.c());
        if (gVar != null) {
            Set<Integer> setC = Y.b.c(c3070z);
            Set<Integer> setB = Y.b.b(c3070z);
            Iterator<InterfaceC0336k0.c> it = gVar.d().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (setC.contains(Integer.valueOf(next.g())) && setB.contains(Integer.valueOf(next.b()))) {
                    String strI = next.i();
                    if (Objects.equals(strF, strI)) {
                        C3043d0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strF + "]");
                    } else if (abstractC1229k.c() == -1) {
                        C3043d0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strF + ", dynamic range: " + c3070z + "]");
                    }
                    strF = strI;
                    break;
                }
            }
            next = null;
        } else {
            next = null;
        }
        if (next == null) {
            if (abstractC1229k.c() == -1) {
                strF = a(c3070z);
            }
            if (gVar == null) {
                C3043d0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strF + ", dynamic range: " + c3070z + "]");
            } else {
                C3043d0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strF + ", dynamic range: " + c3070z + "]");
            }
        }
        f.a aVarC = f.c(strF);
        if (next != null) {
            aVarC.c(next);
        }
        return aVarC.b();
    }

    public static int e(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, Range<Integer> range) {
        int iDoubleValue = (int) (i7 * new Rational(i8, i9).doubleValue() * new Rational(i10, i11).doubleValue() * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue());
        String str = C3043d0.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(iDoubleValue)) : BuildConfig.FLAVOR;
        if (!S.i0.f6333b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (C3043d0.f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        C3043d0.a("VideoConfigUtil", str);
        return iDoubleValue;
    }

    public static i0 f(InterfaceC0336k0.c cVar) {
        return i0.d().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(f7619b).a();
    }
}
