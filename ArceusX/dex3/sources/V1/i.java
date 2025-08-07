package V1;

import android.graphics.PointF;
import java.util.List;

public class i implements m<PointF, PointF> {
    private final b a;
    private final b b;

    public i(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override
    public S1.a<PointF, PointF> a() {
        return new S1.n(this.a.a(), this.b.a());
    }

    @Override
    public List<c2.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
