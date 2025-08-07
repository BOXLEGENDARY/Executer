package R1;

import S1.a;
import W1.r;
import java.util.ArrayList;
import java.util.List;

public class s implements c, a.b {
    private final String a;
    private final boolean b;
    private final List<a.b> c = new ArrayList();
    private final r.a d;
    private final S1.a<?, Float> e;
    private final S1.a<?, Float> f;
    private final S1.a<?, Float> g;

    public s(X1.b bVar, W1.r rVar) {
        this.a = rVar.c();
        this.b = rVar.g();
        this.d = rVar.f();
        S1.a<Float, Float> aVarA = rVar.e().a();
        this.e = aVarA;
        S1.a<Float, Float> aVarA2 = rVar.b().a();
        this.f = aVarA2;
        S1.a<Float, Float> aVarA3 = rVar.d().a();
        this.g = aVarA3;
        bVar.h(aVarA);
        bVar.h(aVarA2);
        bVar.h(aVarA3);
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
    }

    @Override
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a();
        }
    }

    @Override
    public void b(List<c> list, List<c> list2) {
    }

    void d(a.b bVar) {
        this.c.add(bVar);
    }

    public S1.a<?, Float> e() {
        return this.f;
    }

    public S1.a<?, Float> g() {
        return this.g;
    }

    public S1.a<?, Float> h() {
        return this.e;
    }

    r.a i() {
        return this.d;
    }

    public boolean j() {
        return this.b;
    }
}
