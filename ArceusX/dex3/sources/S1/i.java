package S1;

import android.graphics.Path;
import android.graphics.PointF;

public class i extends c2.a<PointF> {
    private Path q;
    private final c2.a<PointF> r;

    public i(P1.d dVar, c2.a<PointF> aVar) {
        super(dVar, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
        this.r = aVar;
        i();
    }

    public void i() {
        T t;
        T t2;
        T t3 = this.c;
        boolean z = (t3 == 0 || (t2 = this.b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.b;
        if (t4 == 0 || (t = this.c) == 0 || z) {
            return;
        }
        c2.a<PointF> aVar = this.r;
        this.q = b2.h.d((PointF) t4, (PointF) t, aVar.o, aVar.p);
    }

    Path j() {
        return this.q;
    }
}
