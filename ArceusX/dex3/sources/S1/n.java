package S1;

import android.graphics.PointF;
import java.util.Collections;

public class n extends a<PointF, PointF> {
    private final PointF i;
    private final PointF j;
    private final a<Float, Float> k;
    private final a<Float, Float> l;
    protected c2.c<Float> m;
    protected c2.c<Float> n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = aVar;
        this.l = aVar2;
        m(f());
    }

    @Override
    public void m(float f) {
        this.k.m(f);
        this.l.m(f);
        this.i.set(this.k.h().floatValue(), this.l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override
    public PointF i(c2.a<PointF> aVar, float f) {
        Float fB;
        c2.a<Float> aVarB;
        c2.a<Float> aVarB2;
        Float fB2 = null;
        if (this.m == null || (aVarB2 = this.k.b()) == null) {
            fB = null;
        } else {
            float fD = this.k.d();
            Float f2 = aVarB2.h;
            c2.c<Float> cVar = this.m;
            float f3 = aVarB2.g;
            fB = cVar.b(f3, f2 == null ? f3 : f2.floatValue(), aVarB2.b, aVarB2.c, f, f, fD);
        }
        if (this.n != null && (aVarB = this.l.b()) != null) {
            float fD2 = this.l.d();
            Float f4 = aVarB.h;
            c2.c<Float> cVar2 = this.n;
            float f5 = aVarB.g;
            fB2 = cVar2.b(f5, f4 == null ? f5 : f4.floatValue(), aVarB.b, aVarB.c, f, f, fD2);
        }
        if (fB == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.j;
    }

    public void r(c2.c<Float> cVar) {
        c2.c<Float> cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(c2.c<Float> cVar) {
        c2.c<Float> cVar2 = this.n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
