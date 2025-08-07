package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class u {

    final OrientationEventListener f9709b;

    final Object f9708a = new Object();

    final Map<b, c> f9710c = new HashMap();

    boolean f9711d = false;

    class a extends OrientationEventListener {

        private int f9712a;

        a(Context context) {
            super(context);
            this.f9712a = -1;
        }

        @Override
        public void onOrientationChanged(int i7) {
            int iB;
            ArrayList arrayList;
            if (i7 == -1 || this.f9712a == (iB = u.b(i7))) {
                return;
            }
            this.f9712a = iB;
            synchronized (u.this.f9708a) {
                arrayList = new ArrayList(u.this.f9710c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(iB);
            }
        }
    }

    public interface b {
        void a(int i7);
    }

    static class c {

        private final b f9714a;

        private final Executor f9715b;

        private final AtomicBoolean f9716c = new AtomicBoolean(true);

        c(b bVar, Executor executor) {
            this.f9714a = bVar;
            this.f9715b = executor;
        }

        public void c(int i7) {
            if (this.f9716c.get()) {
                this.f9714a.a(i7);
            }
        }

        void b() {
            this.f9716c.set(false);
        }

        void d(final int i7) {
            this.f9715b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f9717d.c(i7);
                }
            });
        }
    }

    public u(Context context) {
        this.f9709b = new a(context);
    }

    static int b(int i7) {
        if (i7 >= 315 || i7 < 45) {
            return 0;
        }
        if (i7 >= 225) {
            return 1;
        }
        return i7 >= 135 ? 2 : 3;
    }

    public boolean a(Executor executor, b bVar) {
        synchronized (this.f9708a) {
            try {
                if (!this.f9709b.canDetectOrientation() && !this.f9711d) {
                    return false;
                }
                this.f9710c.put(bVar, new c(bVar, executor));
                this.f9709b.enable();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f9708a) {
            try {
                c cVar = this.f9710c.get(bVar);
                if (cVar != null) {
                    cVar.b();
                    this.f9710c.remove(bVar);
                }
                if (this.f9710c.isEmpty()) {
                    this.f9709b.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
