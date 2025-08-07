package V1;

import android.graphics.PointF;
import java.util.List;

public class e implements m<PointF, PointF> {
    private final List<c2.a<PointF>> a;

    public e(List<c2.a<PointF>> list) {
        this.a = list;
    }

    @Override
    public S1.a<PointF, PointF> a() {
        return this.a.get(0).h() ? new S1.k(this.a) : new S1.j(this.a);
    }

    @Override
    public List<c2.a<PointF>> b() {
        return this.a;
    }

    @Override
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).h();
    }
}
