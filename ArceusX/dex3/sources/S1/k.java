package S1;

import android.graphics.PointF;
import java.util.List;

public class k extends g<PointF> {
    private final PointF i;

    public k(List<c2.a<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override
    public PointF i(c2.a<PointF> aVar, float f) {
        return j(aVar, f, f, f);
    }

    @Override
    public PointF j(c2.a<PointF> aVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.b;
        if (pointF3 == null || (pointF = aVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        c2.c<A> cVar = this.e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.g, aVar.h.floatValue(), pointF4, pointF5, f, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.i;
        float f4 = pointF4.x;
        float f5 = f4 + (f2 * (pointF5.x - f4));
        float f6 = pointF4.y;
        pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
        return this.i;
    }
}
