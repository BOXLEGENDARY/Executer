package X1;

import W1.o;
import Z1.C0438j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

public class g extends b {
    private final R1.d B;
    private final c C;

    g(com.airbnb.lottie.a aVar, e eVar, c cVar) {
        super(aVar, eVar);
        this.C = cVar;
        R1.d dVar = new R1.d(aVar, this, new o("__container", eVar.n(), false));
        this.B = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override
    protected void G(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        this.B.d(eVar, i, list, eVar2);
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.B.c(rectF, this.m, z);
    }

    @Override
    void s(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.B.f(canvas, matrix, i);
    }

    @Override
    public W1.a u() {
        W1.a aVarU = super.u();
        return aVarU != null ? aVarU : this.C.u();
    }

    @Override
    public C0438j w() {
        C0438j c0438jW = super.w();
        return c0438jW != null ? c0438jW : this.C.w();
    }
}
