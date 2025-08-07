package S1;

import java.util.List;

public class d extends g<Float> {
    public d(List<c2.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(c2.a<Float> aVar, float f) {
        Float f2;
        if (aVar.b == null || aVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c2.c<A> cVar = this.e;
        return (cVar == 0 || (f2 = (Float) cVar.b(aVar.g, aVar.h.floatValue(), aVar.b, aVar.c, f, e(), f())) == null) ? b2.g.k(aVar.f(), aVar.c(), f) : f2.floatValue();
    }

    @Override
    public Float i(c2.a<Float> aVar, float f) {
        return Float.valueOf(q(aVar, f));
    }
}
