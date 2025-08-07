package R1;

import S1.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class d implements e, m, a.b, U1.f {
    private final Paint a;
    private final RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<c> h;
    private final com.airbnb.lottie.a i;
    private List<m> j;
    private S1.p k;

    public d(com.airbnb.lottie.a aVar, X1.b bVar, W1.o oVar) {
        this(aVar, bVar, oVar.c(), oVar.d(), e(aVar, bVar, oVar.b()), h(oVar.b()));
    }

    private static List<c> e(com.airbnb.lottie.a aVar, X1.b bVar, List<W1.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            c cVarA = list.get(i).a(aVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static V1.l h(List<W1.c> list) {
        for (int i = 0; i < list.size(); i++) {
            W1.c cVar = list.get(i);
            if (cVar instanceof V1.l) {
                return (V1.l) cVar;
            }
        }
        return null;
    }

    private boolean k() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void a() {
        this.i.invalidateSelf();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            cVar.b(arrayList, this.h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        S1.p pVar = this.k;
        if (pVar != null) {
            this.c.preConcat(pVar.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        if (eVar.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i)) {
                int iE = i + eVar.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    c cVar = this.h.get(i2);
                    if (cVar instanceof U1.f) {
                        ((U1.f) cVar).d(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        S1.p pVar = this.k;
        if (pVar != null) {
            this.c.preConcat(pVar.f());
            i = (int) (((((this.k.h() == null ? 100 : this.k.h().h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.J() && k() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(this.b, this.c, true);
            this.a.setAlpha(i);
            b2.h.m(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        S1.p pVar = this.k;
        if (pVar != null) {
            pVar.c(t, cVar);
        }
    }

    @Override
    public String getName() {
        return this.f;
    }

    @Override
    public Path getPath() {
        this.c.reset();
        S1.p pVar = this.k;
        if (pVar != null) {
            this.c.set(pVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof m) {
                this.d.addPath(((m) cVar).getPath(), this.c);
            }
        }
        return this.d;
    }

    List<m> i() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                c cVar = this.h.get(i);
                if (cVar instanceof m) {
                    this.j.add((m) cVar);
                }
            }
        }
        return this.j;
    }

    Matrix j() {
        S1.p pVar = this.k;
        if (pVar != null) {
            return pVar.f();
        }
        this.c.reset();
        return this.c;
    }

    d(com.airbnb.lottie.a aVar, X1.b bVar, String str, boolean z, List<c> list, V1.l lVar) {
        this.a = new Q1.a();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = aVar;
        this.g = z;
        this.h = list;
        if (lVar != null) {
            S1.p pVarB = lVar.b();
            this.k = pVarB;
            pVarB.a(bVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
