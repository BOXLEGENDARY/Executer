package W1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public class m {
    private final List<U1.a> a;
    private PointF b;
    private boolean c;

    public m(PointF pointF, boolean z, List<U1.a> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    private void e(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public List<U1.a> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(m mVar, m mVar2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = mVar.d() || mVar2.d();
        if (mVar.a().size() != mVar2.a().size()) {
            b2.d.c("Curves must have the same number of control points. Shape 1: " + mVar.a().size() + "\tShape 2: " + mVar2.a().size());
        }
        int iMin = Math.min(mVar.a().size(), mVar2.a().size());
        if (this.a.size() < iMin) {
            for (int size = this.a.size(); size < iMin; size++) {
                this.a.add(new U1.a());
            }
        } else if (this.a.size() > iMin) {
            for (int size2 = this.a.size() - 1; size2 >= iMin; size2--) {
                List<U1.a> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = mVar.b();
        PointF pointFB2 = mVar2.b();
        e(b2.g.k(pointFB.x, pointFB2.x, f), b2.g.k(pointFB.y, pointFB2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            U1.a aVar = mVar.a().get(size3);
            U1.a aVar2 = mVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.a.get(size3).d(b2.g.k(pointFA.x, pointFA2.x, f), b2.g.k(pointFA.y, pointFA2.y, f));
            this.a.get(size3).e(b2.g.k(pointFB3.x, pointFB4.x, f), b2.g.k(pointFB3.y, pointFB4.y, f));
            this.a.get(size3).f(b2.g.k(pointFC.x, pointFC2.x, f), b2.g.k(pointFC.y, pointFC2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public m() {
        this.a = new ArrayList();
    }
}
