package X;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;
import n.InterfaceC2621a;
import z.C3043d0;

public class m0 extends Z implements k0 {

    public static final InterfaceC2621a<i0, k0> f7861d = new InterfaceC2621a() {
        @Override
        public final Object apply(Object obj) {
            return m0.m((i0) obj);
        }
    };

    private final MediaCodecInfo.VideoCapabilities f7862c;

    m0(MediaCodecInfo mediaCodecInfo, String str) throws d0 {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f7813b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f7862c = videoCapabilities;
    }

    public static m0 l(i0 i0Var) throws d0 {
        return new m0(Y.a.c(i0Var), i0Var.c());
    }

    public static k0 m(i0 i0Var) {
        try {
            return Z.d.l(l(i0Var), null);
        } catch (d0 e7) {
            C3043d0.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e7);
            return null;
        }
    }

    private static IllegalArgumentException n(Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override
    public int b() {
        return this.f7862c.getWidthAlignment();
    }

    @Override
    public Range<Integer> c() {
        return this.f7862c.getBitrateRange();
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public Range<Integer> e(int i7) {
        try {
            return this.f7862c.getSupportedWidthsFor(i7);
        } catch (Throwable th) {
            throw n(th);
        }
    }

    @Override
    public Range<Integer> f(int i7) {
        try {
            return this.f7862c.getSupportedHeightsFor(i7);
        } catch (Throwable th) {
            throw n(th);
        }
    }

    @Override
    public int g() {
        return this.f7862c.getHeightAlignment();
    }

    @Override
    public Range<Integer> h() {
        return this.f7862c.getSupportedWidths();
    }

    @Override
    public boolean i(int i7, int i8) {
        return this.f7862c.isSizeSupported(i7, i8);
    }

    @Override
    public Range<Integer> j() {
        return this.f7862c.getSupportedHeights();
    }
}
