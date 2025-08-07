package R1;

import S1.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class h implements e, a.b, k {

    @NonNull
    private final String a;
    private final boolean b;
    private final X1.b c;
    private final g0.h<LinearGradient> d = new g0.h<>();
    private final g0.h<RadialGradient> e = new g0.h<>();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List<m> i;
    private final W1.g j;
    private final S1.a<W1.d, W1.d> k;
    private final S1.a<Integer, Integer> l;
    private final S1.a<PointF, PointF> m;
    private final S1.a<PointF, PointF> n;
    private S1.a<ColorFilter, ColorFilter> o;
    private S1.q p;
    private final com.airbnb.lottie.a q;
    private final int r;
    private S1.a<Float, Float> s;
    float t;
    private S1.c u;

    public h(com.airbnb.lottie.a aVar, X1.b bVar, W1.e eVar) {
        Path path = new Path();
        this.f = path;
        this.g = new Q1.a(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = bVar;
        this.a = eVar.f();
        this.b = eVar.i();
        this.q = aVar;
        this.j = eVar.e();
        path.setFillType(eVar.c());
        this.r = (int) (aVar.q().d() / 32.0f);
        S1.a<W1.d, W1.d> aVarA = eVar.d().a();
        this.k = aVarA;
        aVarA.a(this);
        bVar.h(aVarA);
        S1.a<Integer, Integer> aVarA2 = eVar.g().a();
        this.l = aVarA2;
        aVarA2.a(this);
        bVar.h(aVarA2);
        S1.a<PointF, PointF> aVarA3 = eVar.h().a();
        this.m = aVarA3;
        aVarA3.a(this);
        bVar.h(aVarA3);
        S1.a<PointF, PointF> aVarA4 = eVar.b().a();
        this.n = aVarA4;
        aVarA4.a(this);
        bVar.h(aVarA4);
        if (bVar.u() != null) {
            S1.a<Float, Float> aVarA5 = bVar.u().a().a();
            this.s = aVarA5;
            aVarA5.a(this);
            bVar.h(this.s);
        }
        if (bVar.w() != null) {
            this.u = new S1.c(this, bVar, bVar.w());
        }
    }

    private int[] e(int[] iArr) {
        S1.q qVar = this.p;
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

    private int h() {
        int iRound = Math.round(this.m.f() * this.r);
        int iRound2 = Math.round(this.n.f() * this.r);
        int iRound3 = Math.round(this.k.f() * this.r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient i() {
        long jH = h();
        LinearGradient linearGradient = (LinearGradient) this.d.d(jH);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFH = this.m.h();
        PointF pointFH2 = this.n.h();
        W1.d dVarH = this.k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, e(dVarH.a()), dVarH.b(), Shader.TileMode.CLAMP);
        this.d.h(jH, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient j() {
        long jH = h();
        RadialGradient radialGradient = (RadialGradient) this.e.d(jH);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFH = this.m.h();
        PointF pointFH2 = this.n.h();
        W1.d dVarH = this.k.h();
        int[] iArrE = e(dVarH.a());
        float[] fArrB = dVarH.b();
        float f = pointFH.x;
        float f2 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f, pointFH2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrE, fArrB, Shader.TileMode.CLAMP);
        this.e.h(jH, radialGradient2);
        return radialGradient2;
    }

    @Override
    public void a() {
        this.q.invalidateSelf();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof m) {
                this.i.add((m) cVar);
            }
        }
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).getPath(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.b) {
            return;
        }
        P1.c.a("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).getPath(), matrix);
        }
        this.f.computeBounds(this.h, false);
        Shader shaderI = this.j == W1.g.LINEAR ? i() : j();
        shaderI.setLocalMatrix(matrix);
        this.g.setShader(shaderI);
        S1.a<ColorFilter, ColorFilter> aVar = this.o;
        if (aVar != null) {
            this.g.setColorFilter(aVar.h());
        }
        S1.a<Float, Float> aVar2 = this.s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.g.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                this.g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        S1.c cVar = this.u;
        if (cVar != null) {
            cVar.b(this.g);
        }
        this.g.setAlpha(b2.g.d((int) ((((i / 255.0f) * this.l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        P1.c.b("GradientFillContent#draw");
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        S1.c cVar2;
        S1.c cVar3;
        S1.c cVar4;
        S1.c cVar5;
        S1.c cVar6;
        if (t == P1.j.d) {
            this.l.n(cVar);
            return;
        }
        if (t == P1.j.K) {
            S1.a<ColorFilter, ColorFilter> aVar = this.o;
            if (aVar != null) {
                this.c.F(aVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            S1.q qVar = new S1.q(cVar);
            this.o = qVar;
            qVar.a(this);
            this.c.h(this.o);
            return;
        }
        if (t == P1.j.L) {
            S1.q qVar2 = this.p;
            if (qVar2 != null) {
                this.c.F(qVar2);
            }
            if (cVar == null) {
                this.p = null;
                return;
            }
            this.d.a();
            this.e.a();
            S1.q qVar3 = new S1.q(cVar);
            this.p = qVar3;
            qVar3.a(this);
            this.c.h(this.p);
            return;
        }
        if (t == P1.j.j) {
            S1.a<Float, Float> aVar2 = this.s;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            S1.q qVar4 = new S1.q(cVar);
            this.s = qVar4;
            qVar4.a(this);
            this.c.h(this.s);
            return;
        }
        if (t == P1.j.e && (cVar6 = this.u) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t == P1.j.G && (cVar5 = this.u) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t == P1.j.H && (cVar4 = this.u) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t == P1.j.I && (cVar3 = this.u) != null) {
            cVar3.e(cVar);
        } else {
            if (t != P1.j.J || (cVar2 = this.u) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override
    public String getName() {
        return this.a;
    }
}
