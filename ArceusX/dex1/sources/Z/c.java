package Z;

import C.I;
import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import C.N0;
import C.R0;
import S.C1230l;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

public class c implements InterfaceC0334j0 {

    private static final Map<Integer, C1230l> f8177f;

    private final InterfaceC0334j0 f8178c;

    private final I f8179d;

    private final R0 f8180e;

    static {
        HashMap map = new HashMap();
        f8177f = map;
        map.put(1, C1230l.f6341f);
        map.put(8, C1230l.f6339d);
        map.put(6, C1230l.f6338c);
        map.put(5, C1230l.f6337b);
        map.put(4, C1230l.f6336a);
        map.put(0, C1230l.f6340e);
    }

    public c(InterfaceC0334j0 interfaceC0334j0, I i7, R0 r02) {
        this.f8178c = interfaceC0334j0;
        this.f8179d = i7;
        this.f8180e = r02;
    }

    private boolean c(int i7) {
        C1230l c1230l = f8177f.get(Integer.valueOf(i7));
        if (c1230l == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f8180e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.d(this.f8179d, c1230l) && !d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(N0 n02) {
        return (n02 instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) n02).b();
    }

    @Override
    public boolean a(int i7) {
        return this.f8178c.a(i7) && c(i7);
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        if (a(i7)) {
            return this.f8178c.b(i7);
        }
        return null;
    }
}
