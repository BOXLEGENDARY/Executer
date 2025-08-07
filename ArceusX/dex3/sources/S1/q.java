package S1;

import java.util.Collections;

public class q<K, A> extends a<K, A> {
    private final A i;

    public q(c2.c<A> cVar) {
        this(cVar, null);
    }

    @Override
    float c() {
        return 1.0f;
    }

    @Override
    public A h() {
        c2.c<A> cVar = this.e;
        A a = this.i;
        return cVar.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override
    A i(c2.a<K> aVar, float f) {
        return h();
    }

    @Override
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override
    public void m(float f) {
        this.d = f;
    }

    public q(c2.c<A> cVar, A a) {
        super(Collections.emptyList());
        n(cVar);
        this.i = a;
    }
}
