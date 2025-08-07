package O3;

import android.graphics.Point;
import java.util.Iterator;

public abstract class O9 {
    public static O9 f(Iterable iterable, int i7, int i8, float f7) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i7;
        int iMin2 = i8;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f8 = i7;
        float f9 = i8;
        return new M9((iMin + 0.0f) / f8, (iMin2 + 0.0f) / f9, (iMax + 0.0f) / f8, (iMax2 + 0.0f) / f9, 0.0f);
    }

    abstract float a();

    abstract float b();

    abstract float c();

    abstract float d();

    abstract float e();
}
