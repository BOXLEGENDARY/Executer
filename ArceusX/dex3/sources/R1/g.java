package R1;

import S1.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class g implements e, a.b, k {
    private final Path a;
    private final Paint b;
    private final X1.b c;
    private final String d;
    private final boolean e;
    private final List<m> f;
    private final S1.a<Integer, Integer> g;
    private final S1.a<Integer, Integer> h;
    private S1.a<ColorFilter, ColorFilter> i;
    private final com.airbnb.lottie.a j;
    private S1.a<Float, Float> k;
    float l;
    private S1.c m;

    public g(com.airbnb.lottie.a aVar, X1.b bVar, W1.n nVar) {
        Path path = new Path();
        this.a = path;
        this.b = new Q1.a(1);
        this.f = new ArrayList();
        this.c = bVar;
        this.d = nVar.d();
        this.e = nVar.f();
        this.j = aVar;
        if (bVar.u() != null) {
            S1.a<Float, Float> aVarA = bVar.u().a().a();
            this.k = aVarA;
            aVarA.a(this);
            bVar.h(this.k);
        }
        if (bVar.w() != null) {
            this.m = new S1.c(this, bVar, bVar.w());
        }
        if (nVar.b() == null || nVar.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(nVar.c());
        S1.a<Integer, Integer> aVarA2 = nVar.b().a();
        this.g = aVarA2;
        aVarA2.a(this);
        bVar.h(aVarA2);
        S1.a<Integer, Integer> aVarA3 = nVar.e().a();
        this.h = aVarA3;
        aVarA3.a(this);
        bVar.h(aVarA3);
    }

    @Override
    public void a() {
        this.j.invalidateSelf();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof m) {
                this.f.add((m) cVar);
            }
        }
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).getPath(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        P1.c.a("FillContent#draw");
        this.b.setColor((b2.g.d((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((S1.b) this.g).p() & 16777215));
        S1.a<ColorFilter, ColorFilter> aVar = this.i;
        if (aVar != null) {
            this.b.setColorFilter(aVar.h());
        }
        S1.a<Float, Float> aVar2 = this.k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                this.b.setMaskFilter(this.c.v(fFloatValue));
            }
            this.l = fFloatValue;
        }
        S1.c cVar = this.m;
        if (cVar != null) {
            cVar.b(this.b);
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        P1.c.b("FillContent#draw");
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        S1.c cVar2;
        S1.c cVar3;
        S1.c cVar4;
        S1.c cVar5;
        S1.c cVar6;
        if (t == P1.j.a) {
            this.g.n(cVar);
            return;
        }
        if (t == P1.j.d) {
            this.h.n(cVar);
            return;
        }
        if (t == P1.j.K) {
            S1.a<ColorFilter, ColorFilter> aVar = this.i;
            if (aVar != null) {
                this.c.F(aVar);
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            S1.q qVar = new S1.q(cVar);
            this.i = qVar;
            qVar.a(this);
            this.c.h(this.i);
            return;
        }
        if (t == P1.j.j) {
            S1.a<Float, Float> aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            S1.q qVar2 = new S1.q(cVar);
            this.k = qVar2;
            qVar2.a(this);
            this.c.h(this.k);
            return;
        }
        if (t == P1.j.e && (cVar6 = this.m) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t == P1.j.G && (cVar5 = this.m) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t == P1.j.H && (cVar4 = this.m) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t == P1.j.I && (cVar3 = this.m) != null) {
            cVar3.e(cVar);
        } else {
            if (t != P1.j.J || (cVar2 = this.m) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override
    public String getName() {
        return this.d;
    }
}
