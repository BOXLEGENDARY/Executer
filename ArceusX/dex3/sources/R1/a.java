package R1;

import S1.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements a.b, k, e {
    private final com.airbnb.lottie.a e;
    protected final X1.b f;
    private final float[] h;
    final Paint i;
    private final S1.a<?, Float> j;
    private final S1.a<?, Integer> k;
    private final List<S1.a<?, Float>> l;
    private final S1.a<?, Float> m;
    private S1.a<ColorFilter, ColorFilter> n;
    private S1.a<Float, Float> o;
    float p;
    private S1.c q;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final List<b> g = new ArrayList();

    private static final class b {
        private final List<m> a;
        private final s b;

        private b(s sVar) {
            this.a = new ArrayList();
            this.b = sVar;
        }
    }

    a(com.airbnb.lottie.a aVar, X1.b bVar, Paint.Cap cap, Paint.Join join, float f, V1.d dVar, V1.b bVar2, List<V1.b> list, V1.b bVar3) {
        Q1.a aVar2 = new Q1.a(1);
        this.i = aVar2;
        this.p = 0.0f;
        this.e = aVar;
        this.f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.k = dVar.a();
        this.j = bVar2.a();
        if (bVar3 == null) {
            this.m = null;
        } else {
            this.m = bVar3.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        bVar.h(this.k);
        bVar.h(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            bVar.h(this.l.get(i2));
        }
        S1.a<?, Float> aVar3 = this.m;
        if (aVar3 != null) {
            bVar.h(aVar3);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        S1.a<?, Float> aVar4 = this.m;
        if (aVar4 != null) {
            aVar4.a(this);
        }
        if (bVar.u() != null) {
            S1.a<Float, Float> aVarA = bVar.u().a().a();
            this.o = aVarA;
            aVarA.a(this);
            bVar.h(this.o);
        }
        if (bVar.w() != null) {
            this.q = new S1.c(this, bVar, bVar.w());
        }
    }

    private void e(Matrix matrix) {
        P1.c.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            P1.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float fG = b2.h.g(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.h[i] = this.l.get(i).h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i] = fArr3[i] * fG;
        }
        S1.a<?, Float> aVar = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, aVar == null ? 0.0f : fG * aVar.h().floatValue()));
        P1.c.b("StrokeContent#applyDashPattern");
    }

    private void h(android.graphics.Canvas r13, R1.a.b r14, android.graphics.Matrix r15) {
        throw new UnsupportedOperationException("Method not decompiled: R1.a.h(android.graphics.Canvas, R1.a$b, android.graphics.Matrix):void");
    }

    @Override
    public void a() {
        this.e.invalidateSelf();
    }

    @Override
    public void b(java.util.List<R1.c> r8, java.util.List<R1.c> r9) {
        throw new UnsupportedOperationException("Method not decompiled: R1.a.b(java.util.List, java.util.List):void");
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        P1.c.a("StrokeContent#getBounds");
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = this.g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((m) bVar.a.get(i2)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float fP = ((S1.d) this.j).p();
        RectF rectF2 = this.d;
        float f = fP / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        P1.c.b("StrokeContent#getBounds");
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        P1.c.a("StrokeContent#draw");
        if (b2.h.h(matrix)) {
            P1.c.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(b2.g.d((int) ((((i / 255.0f) * ((S1.f) this.k).p()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((S1.d) this.j).p() * b2.h.g(matrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            P1.c.b("StrokeContent#draw");
            return;
        }
        e(matrix);
        S1.a<ColorFilter, ColorFilter> aVar = this.n;
        if (aVar != null) {
            this.i.setColorFilter(aVar.h());
        }
        S1.a<Float, Float> aVar2 = this.o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.i.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                this.i.setMaskFilter(this.f.v(fFloatValue));
            }
            this.p = fFloatValue;
        }
        S1.c cVar = this.q;
        if (cVar != null) {
            cVar.b(this.i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            if (bVar.b != null) {
                h(canvas, bVar, matrix);
            } else {
                P1.c.a("StrokeContent#buildPath");
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((m) bVar.a.get(size)).getPath(), matrix);
                }
                P1.c.b("StrokeContent#buildPath");
                P1.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.b, this.i);
                P1.c.b("StrokeContent#drawPath");
            }
        }
        P1.c.b("StrokeContent#draw");
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        S1.c cVar2;
        S1.c cVar3;
        S1.c cVar4;
        S1.c cVar5;
        S1.c cVar6;
        if (t == P1.j.d) {
            this.k.n(cVar);
            return;
        }
        if (t == P1.j.s) {
            this.j.n(cVar);
            return;
        }
        if (t == P1.j.K) {
            S1.a<ColorFilter, ColorFilter> aVar = this.n;
            if (aVar != null) {
                this.f.F(aVar);
            }
            if (cVar == null) {
                this.n = null;
                return;
            }
            S1.q qVar = new S1.q(cVar);
            this.n = qVar;
            qVar.a(this);
            this.f.h(this.n);
            return;
        }
        if (t == P1.j.j) {
            S1.a<Float, Float> aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            S1.q qVar2 = new S1.q(cVar);
            this.o = qVar2;
            qVar2.a(this);
            this.f.h(this.o);
            return;
        }
        if (t == P1.j.e && (cVar6 = this.q) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t == P1.j.G && (cVar5 = this.q) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t == P1.j.H && (cVar4 = this.q) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t == P1.j.I && (cVar3 = this.q) != null) {
            cVar3.e(cVar);
        } else {
            if (t != P1.j.J || (cVar2 = this.q) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }
}
