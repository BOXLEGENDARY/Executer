package S1;

import java.util.List;

public class b extends g<Integer> {
    public b(List<c2.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(c2.a<Integer> aVar, float f) {
        Integer num;
        if (aVar.b == null || aVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c2.c<A> cVar = this.e;
        return (cVar == 0 || (num = (Integer) cVar.b(aVar.g, aVar.h.floatValue(), aVar.b, aVar.c, f, e(), f())) == null) ? b2.b.c(b2.g.c(f, 0.0f, 1.0f), aVar.b.intValue(), aVar.c.intValue()) : num.intValue();
    }

    @Override
    public Integer i(c2.a<Integer> aVar, float f) {
        return Integer.valueOf(q(aVar, f));
    }
}
