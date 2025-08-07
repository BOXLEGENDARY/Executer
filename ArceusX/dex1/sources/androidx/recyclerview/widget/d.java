package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class d<T> {

    private static final Executor f11837h = new c();

    private final n f11838a;

    final androidx.recyclerview.widget.c<T> f11839b;

    Executor f11840c;

    private final List<b<T>> f11841d;

    private List<T> f11842e;

    private List<T> f11843f;

    int f11844g;

    class a implements Runnable {

        final List f11845d;

        final List f11846e;

        final int f11847i;

        final Runnable f11848v;

        class C0111a extends h.b {
            C0111a() {
            }

            @Override
            public boolean a(int i7, int i8) {
                Object obj = a.this.f11845d.get(i7);
                Object obj2 = a.this.f11846e.get(i8);
                if (obj != null && obj2 != null) {
                    return d.this.f11839b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override
            public boolean b(int i7, int i8) {
                Object obj = a.this.f11845d.get(i7);
                Object obj2 = a.this.f11846e.get(i8);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f11839b.b().b(obj, obj2);
            }

            @Override
            public Object c(int i7, int i8) {
                Object obj = a.this.f11845d.get(i7);
                Object obj2 = a.this.f11846e.get(i8);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f11839b.b().c(obj, obj2);
            }

            @Override
            public int d() {
                return a.this.f11846e.size();
            }

            @Override
            public int e() {
                return a.this.f11845d.size();
            }
        }

        class b implements Runnable {

            final h.e f11851d;

            b(h.e eVar) {
                this.f11851d = eVar;
            }

            @Override
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f11844g == aVar.f11847i) {
                    dVar.b(aVar.f11846e, this.f11851d, aVar.f11848v);
                }
            }
        }

        a(List list, List list2, int i7, Runnable runnable) {
            this.f11845d = list;
            this.f11846e = list2;
            this.f11847i = i7;
            this.f11848v = runnable;
        }

        @Override
        public void run() {
            d.this.f11840c.execute(new b(h.b(new C0111a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {

        final Handler f11853d = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override
        public void execute(Runnable runnable) {
            this.f11853d.post(runnable);
        }
    }

    public d(RecyclerView.h hVar, h.f<T> fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new c.a(fVar).a());
    }

    private void c(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f11841d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f11843f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public List<T> a() {
        return this.f11843f;
    }

    void b(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f11843f;
        this.f11842e = list;
        this.f11843f = Collections.unmodifiableList(list);
        eVar.b(this.f11838a);
        c(list2, runnable);
    }

    public void d(List<T> list) {
        e(list, null);
    }

    public void e(List<T> list, Runnable runnable) {
        int i7 = this.f11844g + 1;
        this.f11844g = i7;
        List<T> list2 = this.f11842e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f11843f;
        if (list == null) {
            int size = list2.size();
            this.f11842e = null;
            this.f11843f = Collections.emptyList();
            this.f11838a.c(0, size);
            c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f11839b.a().execute(new a(list2, list, i7, runnable));
            return;
        }
        this.f11842e = list;
        this.f11843f = Collections.unmodifiableList(list);
        this.f11838a.b(0, list.size());
        c(list3, runnable);
    }

    public d(n nVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f11841d = new CopyOnWriteArrayList();
        this.f11843f = Collections.emptyList();
        this.f11838a = nVar;
        this.f11839b = cVar;
        if (cVar.c() != null) {
            this.f11840c = cVar.c();
        } else {
            this.f11840c = f11837h;
        }
    }
}
