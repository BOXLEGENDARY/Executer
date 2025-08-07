package R;

import E.q;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e0.C2409a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import n3.C2651i;
import x0.InterfaceC2984a;
import y5.InterfaceC3029a;
import z.C3043d0;

public class c implements f.a {

    private static final Size f4909z = new Size(480, 360);

    private final List<InterfaceC3029a<?>> f4910d;

    private final int f4911e;

    final InterfaceC2984a<a> f4912i;

    final C2409a f4913v;

    private final Executor f4914w;

    private Matrix f4915y;

    public static final class a {

        private final Map<InterfaceC3029a<?>, Object> f4916a;

        private final Map<InterfaceC3029a<?>, Throwable> f4917b;

        private final long f4918c;

        public a(Map<InterfaceC3029a<?>, Object> map, long j7, Map<InterfaceC3029a<?>, Throwable> map2) {
            this.f4916a = map;
            this.f4917b = map2;
            this.f4918c = j7;
        }

        private void a(InterfaceC3029a<?> interfaceC3029a) {
            C2651i.b(this.f4916a.containsKey(interfaceC3029a) || this.f4917b.containsKey(interfaceC3029a), "The detector does not exist");
        }

        public Throwable b(InterfaceC3029a<?> interfaceC3029a) {
            a(interfaceC3029a);
            return this.f4917b.get(interfaceC3029a);
        }

        public <T> T c(InterfaceC3029a<T> interfaceC3029a) {
            a(interfaceC3029a);
            return (T) this.f4916a.get(interfaceC3029a);
        }
    }

    public c(List<InterfaceC3029a<?>> list, int i7, Executor executor, InterfaceC2984a<a> interfaceC2984a) {
        if (i7 != 0) {
            Iterator<InterfaceC3029a<?>> it = list.iterator();
            while (it.hasNext()) {
                C2651i.b(it.next().H() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f4910d = new ArrayList(list);
        this.f4911e = i7;
        this.f4912i = interfaceC2984a;
        this.f4914w = executor;
        C2409a c2409a = new C2409a();
        this.f4913v = c2409a;
        c2409a.a(true);
    }

    private void d(final n nVar, final int i7, final Matrix matrix, final Map<InterfaceC3029a<?>, Object> map, final Map<InterfaceC3029a<?>, Throwable> map2) {
        Image imageL = nVar.l();
        if (imageL == null) {
            C3043d0.c("MlKitAnalyzer", "Image is null.");
            nVar.close();
            return;
        }
        if (i7 > this.f4910d.size() - 1) {
            nVar.close();
            this.f4914w.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f4898d.f(map, nVar, map2);
                }
            });
            return;
        }
        final InterfaceC3029a<?> interfaceC3029a = this.f4910d.get(i7);
        try {
            interfaceC3029a.E(imageL, nVar.D0().c(), matrix).b(this.f4914w, new OnCompleteListener() {
                @Override
                public final void onComplete(Task task) {
                    this.f4902a.g(map2, interfaceC3029a, map, nVar, i7, matrix, task);
                }
            });
        } catch (Exception e7) {
            map2.put(interfaceC3029a, new RuntimeException("Failed to process the image.", e7));
            d(nVar, i7 + 1, matrix, map, map2);
        }
    }

    private Size e(int i7) {
        return (i7 == 1 || i7 == 4) ? new Size(1280, 720) : f4909z;
    }

    public void f(Map map, n nVar, Map map2) {
        this.f4912i.accept(new a(map, nVar.D0().d(), map2));
    }

    public void g(Map map, InterfaceC3029a interfaceC3029a, Map map2, n nVar, int i7, Matrix matrix, Task task) {
        if (task.m()) {
            map.put(interfaceC3029a, new CancellationException("The task is canceled."));
        } else if (task.o()) {
            map2.put(interfaceC3029a, task.k());
        } else {
            map.put(interfaceC3029a, task.j());
        }
        d(nVar, i7 + 1, matrix, map2, map);
    }

    @Override
    public final void b(Matrix matrix) {
        if (matrix == null) {
            this.f4915y = null;
        } else {
            this.f4915y = new Matrix(matrix);
        }
    }

    @Override
    public final Size h() {
        Size size = f4909z;
        Iterator<InterfaceC3029a<?>> it = this.f4910d.iterator();
        while (it.hasNext()) {
            Size sizeE = e(it.next().H());
            if (sizeE.getHeight() * sizeE.getWidth() > size.getWidth() * size.getHeight()) {
                size = sizeE;
            }
        }
        return size;
    }

    @Override
    public final int i() {
        return this.f4911e;
    }

    @Override
    public final void k(n nVar) {
        Matrix matrix = new Matrix();
        int i7 = this.f4911e;
        if (i7 != 0) {
            Matrix matrix2 = this.f4915y;
            if (i7 != 2 && matrix2 == null) {
                C3043d0.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                nVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(nVar.D0().e());
            RectF rectF = new RectF(0.0f, 0.0f, nVar.getWidth(), nVar.getHeight());
            matrix3.postConcat(q.d(rectF, q.p(rectF, nVar.D0().c()), nVar.D0().c()));
            matrix3.invert(matrix);
            if (this.f4911e != 2) {
                matrix.postConcat(matrix2);
            }
        }
        d(nVar, 0, matrix, new HashMap(), new HashMap());
    }
}
