package X1;

import P1.j;
import S1.q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

public class d extends b {
    private final Paint B;
    private final Rect C;
    private final Rect D;
    private S1.a<ColorFilter, ColorFilter> E;
    private S1.a<Bitmap, Bitmap> F;

    d(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
        this.B = new Q1.a(3);
        this.C = new Rect();
        this.D = new Rect();
    }

    private Bitmap N() {
        Bitmap bitmapH;
        S1.a<Bitmap, Bitmap> aVar = this.F;
        return (aVar == null || (bitmapH = aVar.h()) == null) ? this.n.u(this.o.m()) : bitmapH;
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        if (N() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * b2.h.e(), r3.getHeight() * b2.h.e());
            this.m.mapRect(rectF);
        }
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == j.K) {
            if (cVar == null) {
                this.E = null;
                return;
            } else {
                this.E = new q(cVar);
                return;
            }
        }
        if (t == j.N) {
            if (cVar == null) {
                this.F = null;
            } else {
                this.F = new q(cVar);
            }
        }
    }

    @Override
    public void s(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapN = N();
        if (bitmapN == null || bitmapN.isRecycled()) {
            return;
        }
        float fE = b2.h.e();
        this.B.setAlpha(i);
        S1.a<ColorFilter, ColorFilter> aVar = this.E;
        if (aVar != null) {
            this.B.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.C.set(0, 0, bitmapN.getWidth(), bitmapN.getHeight());
        this.D.set(0, 0, (int) (bitmapN.getWidth() * fE), (int) (bitmapN.getHeight() * fE));
        canvas.drawBitmap(bitmapN, this.C, this.D, this.B);
        canvas.restore();
    }
}
