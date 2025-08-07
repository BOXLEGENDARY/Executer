package R1;

import S1.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class p implements e, m, j, a.b, k {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final com.airbnb.lottie.a c;
    private final X1.b d;
    private final String e;
    private final boolean f;
    private final S1.a<Float, Float> g;
    private final S1.a<Float, Float> h;
    private final S1.p i;
    private d j;

    public p(com.airbnb.lottie.a aVar, X1.b bVar, W1.l lVar) {
        this.c = aVar;
        this.d = bVar;
        this.e = lVar.c();
        this.f = lVar.f();
        S1.a<Float, Float> aVarA = lVar.b().a();
        this.g = aVarA;
        bVar.h(aVarA);
        aVarA.a(this);
        S1.a<Float, Float> aVarA2 = lVar.d().a();
        this.h = aVarA2;
        bVar.h(aVarA2);
        aVarA2.a(this);
        S1.p pVarB = lVar.e().b();
        this.i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override
    public void a() {
        this.c.invalidateSelf();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        this.j.b(list, list2);
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public void e(ListIterator<c> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.g.h().floatValue();
        float fFloatValue2 = this.h.h().floatValue();
        float fFloatValue3 = this.i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.i.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.g(f + fFloatValue2));
            this.j.f(canvas, this.a, (int) (i * b2.g.k(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        if (this.i.c(t, cVar)) {
            return;
        }
        if (t == P1.j.u) {
            this.g.n(cVar);
        } else if (t == P1.j.v) {
            this.h.n(cVar);
        }
    }

    @Override
    public String getName() {
        return this.e;
    }

    @Override
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float fFloatValue = this.g.h().floatValue();
        float fFloatValue2 = this.h.h().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + fFloatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }
}
