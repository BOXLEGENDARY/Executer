package E4;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

final class RunnableC0405k implements Runnable {

    final List f1138d;

    final D4.K f1139e;

    final C0406l f1140i;

    RunnableC0405k(C0406l c0406l, List list, D4.K k7) {
        this.f1140i = c0406l;
        this.f1138d = list;
        this.f1139e = k7;
    }

    @Override
    public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f1140i.f1144c.b(this.f1138d)) {
                C0406l.d(this.f1140i, this.f1139e);
            } else {
                C0406l.c(this.f1140i, this.f1138d, this.f1139e);
            }
        } catch (Exception e7) {
            Log.e("SplitCompat", "Error checking verified files.", e7);
            this.f1139e.A(-11);
        }
    }
}
