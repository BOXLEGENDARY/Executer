package X1;

import P1.j;
import S1.q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public class h extends b {
    private final RectF B;
    private final Paint C;
    private final float[] D;
    private final Path E;
    private final e F;
    private S1.a<ColorFilter, ColorFilter> G;

    h(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
        this.B = new RectF();
        Q1.a aVar2 = new Q1.a();
        this.C = aVar2;
        this.D = new float[8];
        this.E = new Path();
        this.F = eVar;
        aVar2.setAlpha(0);
        aVar2.setStyle(Paint.Style.FILL);
        aVar2.setColor(eVar.o());
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.B.set(0.0f, 0.0f, this.F.q(), this.F.p());
        this.m.mapRect(this.B);
        rectF.set(this.B);
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == j.K) {
            if (cVar == null) {
                this.G = null;
            } else {
                this.G = new q(cVar);
            }
        }
    }

    @Override
    public void s(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.F.o());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.v.h() == null ? 100 : this.v.h().h().intValue())) / 100.0f) * 255.0f);
        this.C.setAlpha(iIntValue);
        S1.a<ColorFilter, ColorFilter> aVar = this.G;
        if (aVar != null) {
            this.C.setColorFilter(aVar.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.F.q();
            float[] fArr2 = this.D;
            fArr2[3] = 0.0f;
            fArr2[4] = this.F.q();
            this.D[5] = this.F.p();
            float[] fArr3 = this.D;
            fArr3[6] = 0.0f;
            fArr3[7] = this.F.p();
            matrix.mapPoints(this.D);
            this.E.reset();
            Path path = this.E;
            float[] fArr4 = this.D;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.E;
            float[] fArr5 = this.D;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.E;
            float[] fArr6 = this.D;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.E;
            float[] fArr7 = this.D;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.E;
            float[] fArr8 = this.D;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.E.close();
            canvas.drawPath(this.E, this.C);
        }
    }
}
