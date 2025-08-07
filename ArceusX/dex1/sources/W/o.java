package w;

import C.X0;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import r.C2739a;

public class o {

    public static final Rational f24211a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, X0.b bVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f24211a)) {
            return;
        }
        C2739a.C0218a c0218a = new C2739a.C0218a();
        c0218a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0218a.a());
    }
}
