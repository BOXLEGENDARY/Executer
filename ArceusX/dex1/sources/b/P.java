package B;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import z.T;

class P {

    private final int f152a;

    private final T.g f153b;

    private final Rect f154c;

    private final int f155d;

    private final int f156e;

    private final Matrix f157f;

    private final V f158g;

    private final String f159h;

    final com.google.common.util.concurrent.p<Void> f161j;

    private int f162k = -1;

    private final List<Integer> f160i = new ArrayList();

    P(C.U u7, T.g gVar, Rect rect, int i7, int i8, Matrix matrix, V v7, com.google.common.util.concurrent.p<Void> pVar, int i9) {
        this.f152a = i9;
        this.f153b = gVar;
        this.f156e = i8;
        this.f155d = i7;
        this.f154c = rect;
        this.f157f = matrix;
        this.f158g = v7;
        this.f159h = String.valueOf(u7.hashCode());
        List<C.W> listA = u7.a();
        Objects.requireNonNull(listA);
        Iterator<C.W> it = listA.iterator();
        while (it.hasNext()) {
            this.f160i.add(Integer.valueOf(it.next().Z()));
        }
        this.f161j = pVar;
    }

    com.google.common.util.concurrent.p<Void> a() {
        return this.f161j;
    }

    Rect b() {
        return this.f154c;
    }

    int c() {
        return this.f156e;
    }

    T.g d() {
        return this.f153b;
    }

    public int e() {
        return this.f152a;
    }

    int f() {
        return this.f155d;
    }

    Matrix g() {
        return this.f157f;
    }

    List<Integer> h() {
        return this.f160i;
    }

    String i() {
        return this.f159h;
    }

    boolean j() {
        return this.f158g.d();
    }

    boolean k() {
        return d() == null;
    }

    void l(z.U u7) {
        this.f158g.f(u7);
    }

    void m(int i7) {
        if (this.f162k != i7) {
            this.f162k = i7;
            this.f158g.a(i7);
        }
    }

    void n() {
        this.f158g.c();
    }

    public void o(androidx.camera.core.n nVar) {
        this.f158g.i(nVar);
    }

    public void p(T.h hVar) {
        this.f158g.h(hVar);
    }

    void q() {
        if (this.f162k != -1) {
            m(100);
        }
        this.f158g.e();
    }

    public void r(Bitmap bitmap) {
        this.f158g.b(bitmap);
    }

    public void s(z.U u7) {
        this.f158g.g(u7);
    }
}
