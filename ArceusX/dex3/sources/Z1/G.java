package Z1;

import a2.c;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class G implements M<W1.m> {
    public static final G a = new G();
    private static final c.a b = c.a.a("c", "v", "i", "o");

    private G() {
    }

    @Override
    public W1.m a(a2.c cVar, float f) throws IOException {
        if (cVar.h0() == c.b.BEGIN_ARRAY) {
            cVar.e();
        }
        cVar.f();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zY = false;
        while (cVar.u()) {
            int iN0 = cVar.n0(b);
            if (iN0 == 0) {
                zY = cVar.y();
            } else if (iN0 == 1) {
                listF = s.f(cVar, f);
            } else if (iN0 == 2) {
                listF2 = s.f(cVar, f);
            } else if (iN0 != 3) {
                cVar.t0();
                cVar.H0();
            } else {
                listF3 = s.f(cVar, f);
            }
        }
        cVar.m();
        if (cVar.h0() == c.b.END_ARRAY) {
            cVar.j();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new W1.m(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listF.get(i);
            int i2 = i - 1;
            arrayList.add(new U1.a(b2.g.a(listF.get(i2), listF3.get(i2)), b2.g.a(pointF2, listF2.get(i)), pointF2));
        }
        if (zY) {
            PointF pointF3 = listF.get(0);
            int i3 = size - 1;
            arrayList.add(new U1.a(b2.g.a(listF.get(i3), listF3.get(i3)), b2.g.a(pointF3, listF2.get(0)), pointF3));
        }
        return new W1.m(pointF, zY, arrayList);
    }
}
