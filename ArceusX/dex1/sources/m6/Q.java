package m6;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1710x;
import android.view.LiveData;

public class Q {

    private final Context f22156a;

    class a implements InterfaceC1710x<Rect> {
        a() {
        }

        @Override
        public void a(Rect rect) {
            h7.l.a("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                Y7.a.b().a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Rect rectD = Q.this.d(new RectF(rect), B7.a.c(Q.this.f22156a));
            Y7.a.b().a(rectD.left, rectD.top, rectD.right, rectD.bottom);
        }
    }

    public Q(Context context) {
        this.f22156a = context;
    }

    private int c(float f7, float f8) {
        return (int) ((f7 / f8) + 0.5d);
    }

    public Rect d(RectF rectF, float f7) {
        return new Rect(c(rectF.left, f7), c(rectF.top, f7), c(rectF.right, f7), c(rectF.bottom, f7));
    }

    public void e(InterfaceC1701o interfaceC1701o, LiveData<Rect> liveData) {
        liveData.i(interfaceC1701o, new a());
    }
}
