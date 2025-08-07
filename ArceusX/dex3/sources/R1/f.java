package R1;

import S1.a;
import W1.r;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public class f implements m, a.b, k {
    private final String b;
    private final com.airbnb.lottie.a c;
    private final S1.a<?, PointF> d;
    private final S1.a<?, PointF> e;
    private final W1.b f;
    private boolean h;
    private final Path a = new Path();
    private final b g = new b();

    public f(com.airbnb.lottie.a aVar, X1.b bVar, W1.b bVar2) {
        this.b = bVar2.b();
        this.c = aVar;
        S1.a<PointF, PointF> aVarA = bVar2.d().a();
        this.d = aVarA;
        S1.a<PointF, PointF> aVarA2 = bVar2.c().a();
        this.e = aVarA2;
        this.f = bVar2;
        bVar.h(aVarA);
        bVar.h(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    private void e() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a(sVar);
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
        if (t == P1.j.k) {
            this.d.n(cVar);
        } else if (t == P1.j.n) {
            this.e.n(cVar);
        }
    }

    @Override
    public String getName() {
        return this.b;
    }

    @Override
    public Path getPath() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF pointFH = this.d.h();
        float f = pointFH.x / 2.0f;
        float f2 = pointFH.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f10 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f10, f7, 0.0f);
            float f11 = f4 + 0.0f;
            this.a.cubicTo(f7, f11, f6, f2, 0.0f, f2);
            float f12 = f3 + 0.0f;
            this.a.cubicTo(f12, f2, f, f11, f, 0.0f);
            this.a.cubicTo(f, f10, f12, f5, 0.0f, f5);
        } else {
            float f13 = -f2;
            this.a.moveTo(0.0f, f13);
            float f14 = f3 + 0.0f;
            float f15 = 0.0f - f4;
            this.a.cubicTo(f14, f13, f, f15, f, 0.0f);
            float f16 = f4 + 0.0f;
            this.a.cubicTo(f, f16, f14, f2, 0.0f, f2);
            float f17 = 0.0f - f3;
            float f18 = -f;
            this.a.cubicTo(f17, f2, f18, f16, f18, 0.0f);
            this.a.cubicTo(f18, f15, f17, f13, 0.0f, f13);
        }
        PointF pointFH2 = this.e.h();
        this.a.offset(pointFH2.x, pointFH2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
