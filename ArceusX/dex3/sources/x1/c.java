package X1;

import P1.j;
import S1.q;
import X1.e;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends b {
    private S1.a<Float, Float> B;
    private final List<b> C;
    private final RectF D;
    private final RectF E;
    private final Paint F;

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(com.airbnb.lottie.a aVar, e eVar, List<e> list, P1.d dVar) {
        int i;
        b bVar;
        super(aVar, eVar);
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Paint();
        V1.b bVarU = eVar.u();
        if (bVarU != null) {
            S1.a<Float, Float> aVarA = bVarU.a();
            this.B = aVarA;
            h(aVarA);
            this.B.a(this);
        } else {
            this.B = null;
        }
        g0.h hVar = new g0.h(dVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarT = b.t(this, eVar2, aVar, dVar);
            if (bVarT != null) {
                hVar.h(bVarT.x().d(), bVarT);
                if (bVar2 != null) {
                    bVar2.H(bVarT);
                    bVar2 = null;
                } else {
                    this.C.add(0, bVarT);
                    int i2 = a.a[eVar2.h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        bVar2 = bVarT;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < hVar.k(); i++) {
            b bVar3 = (b) hVar.d(hVar.g(i));
            if (bVar3 != null && (bVar = (b) hVar.d(bVar3.x().j())) != null) {
                bVar3.J(bVar);
            }
        }
    }

    @Override
    protected void G(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            this.C.get(i2).d(eVar, i, list, eVar2);
        }
    }

    @Override
    public void I(boolean z) {
        super.I(z);
        Iterator<b> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().I(z);
        }
    }

    @Override
    public void K(float f) {
        super.K(f);
        if (this.B != null) {
            f = ((this.B.h().floatValue() * this.o.b().i()) - this.o.b().p()) / (this.n.q().e() + 0.01f);
        }
        if (this.B == null) {
            f -= this.o.r();
        }
        if (this.o.v() != 0.0f && !"__container".equals(this.o.i())) {
            f /= this.o.v();
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).K(f);
        }
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.D.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.C.get(size).c(this.D, this.m, true);
            rectF.union(this.D);
        }
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == j.E) {
            if (cVar == null) {
                S1.a<Float, Float> aVar = this.B;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.B = qVar;
            qVar.a(this);
            h(this.B);
        }
    }

    @Override
    void s(Canvas canvas, Matrix matrix, int i) {
        P1.c.a("CompositionLayer#draw");
        this.E.set(0.0f, 0.0f, this.o.l(), this.o.k());
        matrix.mapRect(this.E);
        boolean z = this.n.J() && this.C.size() > 1 && i != 255;
        if (z) {
            this.F.setAlpha(i);
            b2.h.m(canvas, this.E, this.F);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            if (!this.E.isEmpty() ? canvas.clipRect(this.E) : true) {
                this.C.get(size).f(canvas, matrix, i);
            }
        }
        canvas.restore();
        P1.c.b("CompositionLayer#draw");
    }
}
