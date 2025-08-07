package S1;

import java.util.List;

public class l extends g<c2.d> {
    private final c2.d i;

    public l(List<c2.a<c2.d>> list) {
        super(list);
        this.i = new c2.d();
    }

    @Override
    public c2.d i(c2.a<c2.d> aVar, float f) {
        c2.d dVar;
        c2.d dVar2;
        c2.d dVar3 = aVar.b;
        if (dVar3 == null || (dVar = aVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c2.d dVar4 = dVar3;
        c2.d dVar5 = dVar;
        c2.c<A> cVar = this.e;
        if (cVar != 0 && (dVar2 = (c2.d) cVar.b(aVar.g, aVar.h.floatValue(), dVar4, dVar5, f, e(), f())) != null) {
            return dVar2;
        }
        this.i.d(b2.g.k(dVar4.b(), dVar5.b(), f), b2.g.k(dVar4.c(), dVar5.c(), f));
        return this.i;
    }
}
