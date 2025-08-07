package Z;

import X.k0;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.HashSet;
import java.util.Set;
import x0.g;
import z.C3043d0;

public class d implements k0 {

    private final k0 f8181a;

    private final Range<Integer> f8182b;

    private final Range<Integer> f8183c;

    private final Set<Size> f8184d;

    private d(k0 k0Var) {
        HashSet hashSet = new HashSet();
        this.f8184d = hashSet;
        this.f8181a = k0Var;
        int iB = k0Var.b();
        this.f8182b = Range.create(Integer.valueOf(iB), Integer.valueOf(((int) Math.ceil(4096.0d / iB)) * iB));
        int iG = k0Var.g();
        this.f8183c = Range.create(Integer.valueOf(iG), Integer.valueOf(((int) Math.ceil(2160.0d / iG)) * iG));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f());
    }

    private void k(Size size) {
        this.f8184d.add(size);
    }

    public static k0 l(k0 k0Var, Size size) {
        if (!(k0Var instanceof d)) {
            if (androidx.camera.video.internal.compat.quirk.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                k0Var = new d(k0Var);
            } else if (size != null && !k0Var.a(size.getWidth(), size.getHeight())) {
                C3043d0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, k0Var.h(), k0Var.j()));
                k0Var = new d(k0Var);
            }
        }
        if (size != null && (k0Var instanceof d)) {
            ((d) k0Var).k(size);
        }
        return k0Var;
    }

    @Override
    public int b() {
        return this.f8181a.b();
    }

    @Override
    public Range<Integer> c() {
        return this.f8181a.c();
    }

    @Override
    public boolean d() {
        return this.f8181a.d();
    }

    @Override
    public Range<Integer> e(int i7) {
        g.b(this.f8183c.contains((Range<Integer>) Integer.valueOf(i7)) && i7 % this.f8181a.g() == 0, "Not supported height: " + i7 + " which is not in " + this.f8183c + " or can not be divided by alignment " + this.f8181a.g());
        return this.f8182b;
    }

    @Override
    public Range<Integer> f(int i7) {
        g.b(this.f8182b.contains((Range<Integer>) Integer.valueOf(i7)) && i7 % this.f8181a.b() == 0, "Not supported width: " + i7 + " which is not in " + this.f8182b + " or can not be divided by alignment " + this.f8181a.b());
        return this.f8183c;
    }

    @Override
    public int g() {
        return this.f8181a.g();
    }

    @Override
    public Range<Integer> h() {
        return this.f8182b;
    }

    @Override
    public boolean i(int i7, int i8) {
        if (this.f8181a.i(i7, i8)) {
            return true;
        }
        for (Size size : this.f8184d) {
            if (size.getWidth() == i7 && size.getHeight() == i8) {
                return true;
            }
        }
        return this.f8182b.contains((Range<Integer>) Integer.valueOf(i7)) && this.f8183c.contains((Range<Integer>) Integer.valueOf(i8)) && i7 % this.f8181a.b() == 0 && i8 % this.f8181a.g() == 0;
    }

    @Override
    public Range<Integer> j() {
        return this.f8183c;
    }
}
