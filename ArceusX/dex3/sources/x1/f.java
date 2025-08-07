package X1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

public class f extends b {
    f(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    void s(Canvas canvas, Matrix matrix, int i) {
    }
}
