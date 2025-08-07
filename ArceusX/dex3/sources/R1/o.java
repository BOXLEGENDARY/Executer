package R1;

import S1.a;
import W1.r;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

public class o implements a.b, k, m {
    private final String c;
    private final boolean d;
    private final com.airbnb.lottie.a e;
    private final S1.a<?, PointF> f;
    private final S1.a<?, PointF> g;
    private final S1.a<?, Float> h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final b i = new b();

    public o(com.airbnb.lottie.a aVar, X1.b bVar, W1.k kVar) {
        this.c = kVar.c();
        this.d = kVar.f();
        this.e = aVar;
        S1.a<PointF, PointF> aVarA = kVar.d().a();
        this.f = aVarA;
        S1.a<PointF, PointF> aVarA2 = kVar.e().a();
        this.g = aVarA2;
        S1.a<Float, Float> aVarA3 = kVar.b().a();
        this.h = aVarA3;
        bVar.h(aVarA);
        bVar.h(aVarA2);
        bVar.h(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    private void e() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override
    public void a() {
        e();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.i.a(sVar);
                    sVar.d(this);
                }
            }
        }
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        if (t == P1.j.l) {
            this.g.n(cVar);
        } else if (t == P1.j.n) {
            this.f.n(cVar);
        } else if (t == P1.j.m) {
            this.h.n(cVar);
        }
    }

    @Override
    public String getName() {
        return this.c;
    }

    @Override
    public Path getPath() {
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF pointFH = this.g.h();
        float f = pointFH.x / 2.0f;
        float f2 = pointFH.y / 2.0f;
        S1.a<?, Float> aVar = this.h;
        float fP = aVar == null ? 0.0f : ((S1.d) aVar).p();
        float fMin = Math.min(f, f2);
        if (fP > fMin) {
            fP = fMin;
        }
        PointF pointFH2 = this.f.h();
        this.a.moveTo(pointFH2.x + f, (pointFH2.y - f2) + fP);
        this.a.lineTo(pointFH2.x + f, (pointFH2.y + f2) - fP);
        if (fP > 0.0f) {
            RectF rectF = this.b;
            float f3 = pointFH2.x;
            float f4 = fP * 2.0f;
            float f5 = pointFH2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointFH2.x - f) + fP, pointFH2.y + f2);
        if (fP > 0.0f) {
            RectF rectF2 = this.b;
            float f6 = pointFH2.x;
            float f7 = pointFH2.y;
            float f10 = fP * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f10, (f6 - f) + f10, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointFH2.x - f, (pointFH2.y - f2) + fP);
        if (fP > 0.0f) {
            RectF rectF3 = this.b;
            float f11 = pointFH2.x;
            float f12 = pointFH2.y;
            float f13 = fP * 2.0f;
            rectF3.set(f11 - f, f12 - f2, (f11 - f) + f13, (f12 - f2) + f13);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointFH2.x + f) - fP, pointFH2.y - f2);
        if (fP > 0.0f) {
            RectF rectF4 = this.b;
            float f14 = pointFH2.x;
            float f15 = fP * 2.0f;
            float f16 = pointFH2.y;
            rectF4.set((f14 + f) - f15, f16 - f2, f14 + f, (f16 - f2) + f15);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.j = true;
        return this.a;
    }
}
