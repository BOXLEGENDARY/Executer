package R1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

public class r extends a {
    private final X1.b r;
    private final String s;
    private final boolean t;
    private final S1.a<Integer, Integer> u;
    private S1.a<ColorFilter, ColorFilter> v;

    public r(com.airbnb.lottie.a aVar, X1.b bVar, W1.q qVar) {
        super(aVar, bVar, qVar.b().c(), qVar.e().c(), qVar.g(), qVar.i(), qVar.j(), qVar.f(), qVar.d());
        this.r = bVar;
        this.s = qVar.h();
        this.t = qVar.k();
        S1.a<Integer, Integer> aVarA = qVar.c().a();
        this.u = aVarA;
        aVarA.a(this);
        bVar.h(aVarA);
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((S1.b) this.u).p());
        S1.a<ColorFilter, ColorFilter> aVar = this.v;
        if (aVar != null) {
            this.i.setColorFilter(aVar.h());
        }
        super.f(canvas, matrix, i);
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == P1.j.b) {
            this.u.n(cVar);
            return;
        }
        if (t == P1.j.K) {
            S1.a<ColorFilter, ColorFilter> aVar = this.v;
            if (aVar != null) {
                this.r.F(aVar);
            }
            if (cVar == null) {
                this.v = null;
                return;
            }
            S1.q qVar = new S1.q(cVar);
            this.v = qVar;
            qVar.a(this);
            this.r.h(this.u);
        }
    }

    @Override
    public String getName() {
        return this.s;
    }
}
