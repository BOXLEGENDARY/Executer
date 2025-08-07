package S1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

public class j extends g<PointF> {
    private final PointF i;
    private final float[] j;
    private final PathMeasure k;
    private i l;

    public j(List<? extends c2.a<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override
    public PointF i(c2.a<PointF> aVar, float f) {
        PointF pointF;
        i iVar = (i) aVar;
        Path pathJ = iVar.j();
        if (pathJ == null) {
            return aVar.b;
        }
        c2.c<A> cVar = this.e;
        if (cVar != 0 && (pointF = (PointF) cVar.b(iVar.g, iVar.h.floatValue(), (PointF) iVar.b, (PointF) iVar.c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.l != iVar) {
            this.k.setPath(pathJ, false);
            this.l = iVar;
        }
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
