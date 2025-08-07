package R1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public class i extends a {
    private final S1.a<PointF, PointF> A;
    private S1.q B;
    private final String r;
    private final boolean s;
    private final g0.h<LinearGradient> t;
    private final g0.h<RadialGradient> u;
    private final RectF v;
    private final W1.g w;
    private final int x;
    private final S1.a<W1.d, W1.d> y;
    private final S1.a<PointF, PointF> z;

    public i(com.airbnb.lottie.a aVar, X1.b bVar, W1.f fVar) {
        super(aVar, bVar, fVar.b().c(), fVar.g().c(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.t = new g0.h<>();
        this.u = new g0.h<>();
        this.v = new RectF();
        this.r = fVar.j();
        this.w = fVar.f();
        this.s = fVar.n();
        this.x = (int) (aVar.q().d() / 32.0f);
        S1.a<W1.d, W1.d> aVarA = fVar.e().a();
        this.y = aVarA;
        aVarA.a(this);
        bVar.h(aVarA);
        S1.a<PointF, PointF> aVarA2 = fVar.l().a();
        this.z = aVarA2;
        aVarA2.a(this);
        bVar.h(aVarA2);
        S1.a<PointF, PointF> aVarA3 = fVar.d().a();
        this.A = aVarA3;
        aVarA3.a(this);
        bVar.h(aVarA3);
    }

    private int[] i(int[] iArr) {
        S1.q qVar = this.B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.z.f() * this.x);
        int iRound2 = Math.round(this.A.f() * this.x);
        int iRound3 = Math.round(this.y.f() * this.x);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient k() {
        long j = j();
        LinearGradient linearGradient = (LinearGradient) this.t.d(j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFH = this.z.h();
        PointF pointFH2 = this.A.h();
        W1.d dVarH = this.y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, i(dVarH.a()), dVarH.b(), Shader.TileMode.CLAMP);
        this.t.h(j, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient l() {
        long j = j();
        RadialGradient radialGradient = (RadialGradient) this.u.d(j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFH = this.z.h();
        PointF pointFH2 = this.A.h();
        W1.d dVarH = this.y.h();
        int[] iArrI = i(dVarH.a());
        float[] fArrB = dVarH.b();
        RadialGradient radialGradient2 = new RadialGradient(pointFH.x, pointFH.y, (float) Math.hypot(pointFH2.x - r7, pointFH2.y - r8), iArrI, fArrB, Shader.TileMode.CLAMP);
        this.u.h(j, radialGradient2);
        return radialGradient2;
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.s) {
            return;
        }
        c(this.v, matrix, false);
        Shader shaderK = this.w == W1.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.i.setShader(shaderK);
        super.f(canvas, matrix, i);
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == P1.j.L) {
            S1.q qVar = this.B;
            if (qVar != null) {
                this.f.F(qVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            S1.q qVar2 = new S1.q(cVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f.h(this.B);
        }
    }

    @Override
    public String getName() {
        return this.r;
    }
}
