package z;

import android.graphics.PointF;
import android.view.Display;

public final class C3069y extends AbstractC3051h0 {

    private final float f24766b;

    private final float f24767c;

    private final Display f24768d;

    private final InterfaceC3060o f24769e;

    public C3069y(Display display, InterfaceC3060o interfaceC3060o, float f7, float f8) {
        this.f24766b = f7;
        this.f24767c = f8;
        this.f24768d = display;
        this.f24769e = interfaceC3060o;
    }

    private int f(boolean z7) {
        try {
            int iL = this.f24769e.l(this.f24768d.getRotation());
            return z7 ? (360 - iL) % 360 : iL;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override
    protected PointF a(float f7, float f8) {
        float f9 = this.f24766b;
        float f10 = this.f24767c;
        boolean z7 = this.f24769e.h() == 0;
        int iF = f(z7);
        if (iF != 90 && iF != 270) {
            f8 = f7;
            f7 = f8;
            f10 = f9;
            f9 = f10;
        }
        if (iF == 90) {
            f7 = f9 - f7;
        } else if (iF == 180) {
            f8 = f10 - f8;
            f7 = f9 - f7;
        } else if (iF == 270) {
            f8 = f10 - f8;
        }
        if (z7) {
            f8 = f10 - f8;
        }
        return new PointF(f8 / f10, f7 / f9);
    }
}
