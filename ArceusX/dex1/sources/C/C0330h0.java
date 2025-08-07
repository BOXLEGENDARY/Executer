package C;

import C.AbstractC0324e0;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

public final class C0330h0 {

    class a implements G.c<List<Surface>> {

        final boolean f600a;

        final c.a f601b;

        a(boolean z7, c.a aVar) {
            this.f600a = z7;
            this.f601b = aVar;
        }

        @Override
        public void onSuccess(List<Surface> list) {
            x0.g.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f600a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f601b.c(arrayList);
        }

        @Override
        public void onFailure(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f601b.f(th);
            } else {
                this.f601b.c(Collections.emptyList());
            }
        }
    }

    public static void c(List<AbstractC0324e0> list) {
        Iterator<AbstractC0324e0> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void d(List<AbstractC0324e0> list) throws AbstractC0324e0.a {
        if (list.isEmpty()) {
            return;
        }
        int i7 = 0;
        do {
            try {
                list.get(i7).l();
                i7++;
            } catch (AbstractC0324e0.a e7) {
                for (int i8 = i7 - 1; i8 >= 0; i8--) {
                    list.get(i8).e();
                }
                throw e7;
            }
        } while (i7 < list.size());
    }

    public static Object f(final com.google.common.util.concurrent.p pVar, Executor executor, boolean z7, Collection collection, c.a aVar) throws Exception {
        aVar.a(new Runnable() {
            @Override
            public final void run() {
                pVar.cancel(true);
            }
        }, executor);
        G.n.j(pVar, new a(z7, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static com.google.common.util.concurrent.p<List<Surface>> g(final Collection<AbstractC0324e0> collection, final boolean z7, long j7, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0324e0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(G.n.B(it.next().j()));
        }
        final com.google.common.util.concurrent.p pVarZ = G.n.z(j7, scheduledExecutorService, G.n.F(arrayList));
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return C0330h0.f(pVarZ, executor, z7, collection, aVar);
            }
        });
    }
}
