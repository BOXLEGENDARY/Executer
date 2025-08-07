package S1;

import S1.a;
import Z1.C0438j;
import android.graphics.Color;
import android.graphics.Paint;

public class c implements a.b {
    private final a.b a;
    private final S1.a<Integer, Integer> b;
    private final S1.a<Float, Float> c;
    private final S1.a<Float, Float> d;
    private final S1.a<Float, Float> e;
    private final S1.a<Float, Float> f;
    private boolean g = true;

    class a extends c2.c<Float> {
        final c2.c d;

        a(c2.c cVar) {
            this.d = cVar;
        }

        @Override
        public Float a(c2.b<Float> bVar) {
            Float f = (Float) this.d.a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, X1.b bVar2, C0438j c0438j) {
        this.a = bVar;
        S1.a<Integer, Integer> aVarA = c0438j.a().a();
        this.b = aVarA;
        aVarA.a(this);
        bVar2.h(aVarA);
        S1.a<Float, Float> aVarA2 = c0438j.d().a();
        this.c = aVarA2;
        aVarA2.a(this);
        bVar2.h(aVarA2);
        S1.a<Float, Float> aVarA3 = c0438j.b().a();
        this.d = aVarA3;
        aVarA3.a(this);
        bVar2.h(aVarA3);
        S1.a<Float, Float> aVarA4 = c0438j.c().a();
        this.e = aVarA4;
        aVarA4.a(this);
        bVar2.h(aVarA4);
        S1.a<Float, Float> aVarA5 = c0438j.e().a();
        this.f = aVarA5;
        aVarA5.a(this);
        bVar2.h(aVarA5);
    }

    @Override
    public void a() {
        this.g = true;
        this.a.a();
    }

    public void b(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = this.d.h().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.b.h().intValue();
            paint.setShadowLayer(this.f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void c(c2.c<Integer> cVar) {
        this.b.n(cVar);
    }

    public void d(c2.c<Float> cVar) {
        this.d.n(cVar);
    }

    public void e(c2.c<Float> cVar) {
        this.e.n(cVar);
    }

    public void f(c2.c<Float> cVar) {
        if (cVar == null) {
            this.c.n(null);
        } else {
            this.c.n(new a(cVar));
        }
    }

    public void g(c2.c<Float> cVar) {
        this.f.n(cVar);
    }
}
