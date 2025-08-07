package s;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import w.C2959d;

public class C2815h1 {

    private static final Size f23358e = new Size(1920, 1080);

    private static final Size f23359f = new Size(320, 240);

    private static final Size f23360g = new Size(640, 480);

    private static final Object f23361h = new Object();

    private static volatile C2815h1 f23362i;

    private final DisplayManager f23363a;

    private volatile Size f23364b = null;

    private final w.k f23365c = new w.k();

    private final C2959d f23366d = new C2959d();

    private C2815h1(Context context) {
        this.f23363a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f23358e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f23365c.a(sizeB);
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (L.d.d(size, f23359f) && (size = this.f23366d.a()) == null) {
            size = f23360g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C2815h1 c(Context context) {
        if (f23362i == null) {
            synchronized (f23361h) {
                try {
                    if (f23362i == null) {
                        f23362i = new C2815h1(context);
                    }
                } finally {
                }
            }
        }
        return f23362i;
    }

    private Display e(Display[] displayArr, boolean z7) {
        Display display = null;
        int i7 = -1;
        for (Display display2 : displayArr) {
            if (!z7 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i8 = point.x;
                int i9 = point.y;
                if (i8 * i9 > i7) {
                    display = display2;
                    i7 = i8 * i9;
                }
            }
        }
        return display;
    }

    public Display d(boolean z7) {
        Display[] displays = this.f23363a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z7);
        if (displayE == null && z7) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    Size f() {
        if (this.f23364b != null) {
            return this.f23364b;
        }
        this.f23364b = a();
        return this.f23364b;
    }

    void g() {
        this.f23364b = a();
    }
}
