package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import z.AbstractC3051h0;

class r extends AbstractC3051h0 {

    static final PointF f9703e = new PointF(2.0f, 2.0f);

    private final m f9704b;

    private Rect f9705c = null;

    private Matrix f9706d;

    r(m mVar) {
        this.f9704b = mVar;
    }

    @Override
    protected PointF a(float f7, float f8) {
        float[] fArr = {f7, f8};
        synchronized (this) {
            try {
                Matrix matrix = this.f9706d;
                if (matrix == null) {
                    return f9703e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(Size size, int i7) {
        Rect rect;
        E.p.a();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f9705c) != null) {
                    this.f9706d = this.f9704b.c(size, i7, rect);
                    return;
                }
                this.f9706d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(Rect rect) {
        e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f9705c = rect;
        }
    }
}
