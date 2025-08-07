package J9;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

abstract class g {
    private static final Rect a = new Rect();
    private static final RectF b = new RectF();
    private static final Paint c = new Paint(1);

    static Paint a() {
        return c;
    }

    static Rect b() {
        return a;
    }

    static RectF c() {
        return b;
    }
}
