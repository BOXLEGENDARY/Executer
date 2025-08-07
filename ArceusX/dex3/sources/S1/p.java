package S1;

import S1.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

public class p {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private a<PointF, PointF> f;
    private a<?, PointF> g;
    private a<c2.d, c2.d> h;
    private a<Float, Float> i;
    private a<Integer, Integer> j;
    private d k;
    private d l;
    private a<?, Float> m;
    private a<?, Float> n;

    public p(V1.l lVar) {
        this.f = lVar.c() == null ? null : lVar.c().a();
        this.g = lVar.f() == null ? null : lVar.f().a();
        this.h = lVar.h() == null ? null : lVar.h().a();
        this.i = lVar.g() == null ? null : lVar.g().a();
        d dVar = lVar.i() == null ? null : (d) lVar.i().a();
        this.k = dVar;
        if (dVar != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = lVar.j() == null ? null : (d) lVar.j().a();
        if (lVar.e() != null) {
            this.j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.m = lVar.k().a();
        } else {
            this.m = null;
        }
        if (lVar.d() != null) {
            this.n = lVar.d().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public void a(X1.b bVar) {
        bVar.h(this.j);
        bVar.h(this.m);
        bVar.h(this.n);
        bVar.h(this.f);
        bVar.h(this.g);
        bVar.h(this.h);
        bVar.h(this.i);
        bVar.h(this.k);
        bVar.h(this.l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<c2.d, c2.d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t, c2.c<T> cVar) {
        if (t == P1.j.f) {
            a<PointF, PointF> aVar = this.f;
            if (aVar == null) {
                this.f = new q(cVar, new PointF());
                return true;
            }
            aVar.n(cVar);
            return true;
        }
        if (t == P1.j.g) {
            a<?, PointF> aVar2 = this.g;
            if (aVar2 == null) {
                this.g = new q(cVar, new PointF());
                return true;
            }
            aVar2.n(cVar);
            return true;
        }
        if (t == P1.j.h) {
            a<?, PointF> aVar3 = this.g;
            if (aVar3 instanceof n) {
                ((n) aVar3).r(cVar);
                return true;
            }
        }
        if (t == P1.j.i) {
            a<?, PointF> aVar4 = this.g;
            if (aVar4 instanceof n) {
                ((n) aVar4).s(cVar);
                return true;
            }
        }
        if (t == P1.j.o) {
            a<c2.d, c2.d> aVar5 = this.h;
            if (aVar5 == null) {
                this.h = new q(cVar, new c2.d());
                return true;
            }
            aVar5.n(cVar);
            return true;
        }
        if (t == P1.j.p) {
            a<Float, Float> aVar6 = this.i;
            if (aVar6 == null) {
                this.i = new q(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.n(cVar);
            return true;
        }
        if (t == P1.j.c) {
            a<Integer, Integer> aVar7 = this.j;
            if (aVar7 == null) {
                this.j = new q(cVar, 100);
                return true;
            }
            aVar7.n(cVar);
            return true;
        }
        if (t == P1.j.C) {
            a<?, Float> aVar8 = this.m;
            if (aVar8 == null) {
                this.m = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.n(cVar);
            return true;
        }
        if (t == P1.j.D) {
            a<?, Float> aVar9 = this.n;
            if (aVar9 == null) {
                this.n = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.n(cVar);
            return true;
        }
        if (t == P1.j.q) {
            if (this.k == null) {
                this.k = new d(Collections.singletonList(new c2.a(Float.valueOf(0.0f))));
            }
            this.k.n(cVar);
            return true;
        }
        if (t != P1.j.r) {
            return false;
        }
        if (this.l == null) {
            this.l = new d(Collections.singletonList(new c2.a(Float.valueOf(0.0f))));
        }
        this.l.n(cVar);
        return true;
    }

    public a<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        PointF pointFH;
        this.a.reset();
        a<?, PointF> aVar = this.g;
        if (aVar != null && (pointFH = aVar.h()) != null) {
            float f = pointFH.x;
            if (f != 0.0f || pointFH.y != 0.0f) {
                this.a.preTranslate(f, pointFH.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).p();
            if (fFloatValue != 0.0f) {
                this.a.preRotate(fFloatValue);
            }
        }
        if (this.k != null) {
            float fCos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.p()) + 90.0f));
            float fSin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.p()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        a<c2.d, c2.d> aVar3 = this.h;
        if (aVar3 != null) {
            c2.d dVarH = aVar3.h();
            if (dVarH.b() != 1.0f || dVarH.c() != 1.0f) {
                this.a.preScale(dVarH.b(), dVarH.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            PointF pointFH2 = aVar4.h();
            float f3 = pointFH2.x;
            if (f3 != 0.0f || pointFH2.y != 0.0f) {
                this.a.preTranslate(-f3, -pointFH2.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f) {
        a<?, PointF> aVar = this.g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<c2.d, c2.d> aVar2 = this.h;
        c2.d dVarH = aVar2 == null ? null : aVar2.h();
        this.a.reset();
        if (pointFH != null) {
            this.a.preTranslate(pointFH.x * f, pointFH.y * f);
        }
        if (dVarH != null) {
            double d = f;
            this.a.preScale((float) Math.pow(dVarH.b(), d), (float) Math.pow(dVarH.c(), d));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            this.a.preRotate(fFloatValue * f, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.a;
    }

    public a<?, Integer> h() {
        return this.j;
    }

    public a<?, Float> i() {
        return this.m;
    }

    public void j(float f) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.m(f);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.m(f);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.m(f);
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.m(f);
        }
        a<?, PointF> aVar5 = this.g;
        if (aVar5 != null) {
            aVar5.m(f);
        }
        a<c2.d, c2.d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.m(f);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.m(f);
        }
        d dVar = this.k;
        if (dVar != null) {
            dVar.m(f);
        }
        d dVar2 = this.l;
        if (dVar2 != null) {
            dVar2.m(f);
        }
    }
}
