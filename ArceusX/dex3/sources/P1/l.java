package P1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class l {
    private boolean a = false;
    private final Set<b> b = new g0.b();
    private final Map<String, b2.f> c = new HashMap();
    private final Comparator<x0.c<String, Float>> d = new a();

    class a implements Comparator<x0.c<String, Float>> {
        a() {
        }

        @Override
        public int compare(x0.c<String, Float> cVar, x0.c<String, Float> cVar2) {
            float fFloatValue = ((Float) cVar.b).floatValue();
            float fFloatValue2 = ((Float) cVar2.b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.a) {
            b2.f fVar = this.c.get(str);
            if (fVar == null) {
                fVar = new b2.f();
                this.c.put(str, fVar);
            }
            fVar.a(f);
            if (str.equals("__container")) {
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f);
                }
            }
        }
    }

    void b(boolean z) {
        this.a = z;
    }
}
