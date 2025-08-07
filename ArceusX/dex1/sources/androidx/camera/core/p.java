package androidx.camera.core;

import C.AbstractC0345p;
import C.InterfaceC0353t0;
import C.InterfaceC0364z;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import z.C3043d0;
import z.V;

public class p implements InterfaceC0353t0, e.a {

    private final Object f9495a;

    private AbstractC0345p f9496b;

    private int f9497c;

    private InterfaceC0353t0.a f9498d;

    private boolean f9499e;

    private final InterfaceC0353t0 f9500f;

    InterfaceC0353t0.a f9501g;

    private Executor f9502h;

    private final LongSparseArray<V> f9503i;

    private final LongSparseArray<n> f9504j;

    private int f9505k;

    private final List<n> f9506l;

    private final List<n> f9507m;

    class a extends AbstractC0345p {
        a() {
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            super.b(i7, interfaceC0364z);
            p.this.t(interfaceC0364z);
        }
    }

    public p(int i7, int i8, int i9, int i10) {
        this(k(i7, i8, i9, i10));
    }

    private static InterfaceC0353t0 k(int i7, int i8, int i9, int i10) {
        return new d(ImageReader.newInstance(i7, i8, i9, i10));
    }

    private void l(n nVar) {
        synchronized (this.f9495a) {
            try {
                int iIndexOf = this.f9506l.indexOf(nVar);
                if (iIndexOf >= 0) {
                    this.f9506l.remove(iIndexOf);
                    int i7 = this.f9505k;
                    if (iIndexOf <= i7) {
                        this.f9505k = i7 - 1;
                    }
                }
                this.f9507m.remove(nVar);
                if (this.f9497c > 0) {
                    o(this.f9500f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(r rVar) {
        final InterfaceC0353t0.a aVar;
        Executor executor;
        synchronized (this.f9495a) {
            try {
                if (this.f9506l.size() < g()) {
                    rVar.b(this);
                    this.f9506l.add(rVar);
                    aVar = this.f9501g;
                    executor = this.f9502h;
                } else {
                    C3043d0.a("TAG", "Maximum image number reached.");
                    rVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        this.f24637d.p(aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public void p(InterfaceC0353t0.a aVar) {
        aVar.a(this);
    }

    public void q(InterfaceC0353t0 interfaceC0353t0) {
        synchronized (this.f9495a) {
            this.f9497c++;
        }
        o(interfaceC0353t0);
    }

    private void r() {
        synchronized (this.f9495a) {
            try {
                for (int size = this.f9503i.size() - 1; size >= 0; size--) {
                    V vValueAt = this.f9503i.valueAt(size);
                    long jD = vValueAt.d();
                    n nVar = this.f9504j.get(jD);
                    if (nVar != null) {
                        this.f9504j.remove(jD);
                        this.f9503i.removeAt(size);
                        m(new r(nVar, vValueAt));
                    }
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s() {
        synchronized (this.f9495a) {
            try {
                if (this.f9504j.size() != 0 && this.f9503i.size() != 0) {
                    long jKeyAt = this.f9504j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f9503i.keyAt(0);
                    x0.g.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f9504j.size() - 1; size >= 0; size--) {
                            if (this.f9504j.keyAt(size) < jKeyAt2) {
                                this.f9504j.valueAt(size).close();
                                this.f9504j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f9503i.size() - 1; size2 >= 0; size2--) {
                            if (this.f9503i.keyAt(size2) < jKeyAt) {
                                this.f9503i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public Surface a() {
        Surface surfaceA;
        synchronized (this.f9495a) {
            surfaceA = this.f9500f.a();
        }
        return surfaceA;
    }

    @Override
    public void b(n nVar) {
        synchronized (this.f9495a) {
            l(nVar);
        }
    }

    @Override
    public n c() {
        synchronized (this.f9495a) {
            try {
                if (this.f9506l.isEmpty()) {
                    return null;
                }
                if (this.f9505k >= this.f9506l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.f9506l.size() - 1; i7++) {
                    if (!this.f9507m.contains(this.f9506l.get(i7))) {
                        arrayList.add(this.f9506l.get(i7));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                int size = this.f9506l.size();
                List<n> list = this.f9506l;
                this.f9505k = size;
                n nVar = list.get(size - 1);
                this.f9507m.add(nVar);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void close() {
        synchronized (this.f9495a) {
            try {
                if (this.f9499e) {
                    return;
                }
                Iterator it = new ArrayList(this.f9506l).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                this.f9506l.clear();
                this.f9500f.close();
                this.f9499e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public int d() {
        int iD;
        synchronized (this.f9495a) {
            iD = this.f9500f.d();
        }
        return iD;
    }

    @Override
    public void e(InterfaceC0353t0.a aVar, Executor executor) {
        synchronized (this.f9495a) {
            this.f9501g = (InterfaceC0353t0.a) x0.g.g(aVar);
            this.f9502h = (Executor) x0.g.g(executor);
            this.f9500f.e(this.f9498d, executor);
        }
    }

    @Override
    public void f() {
        synchronized (this.f9495a) {
            this.f9500f.f();
            this.f9501g = null;
            this.f9502h = null;
            this.f9497c = 0;
        }
    }

    @Override
    public int g() {
        int iG;
        synchronized (this.f9495a) {
            iG = this.f9500f.g();
        }
        return iG;
    }

    @Override
    public int getHeight() {
        int height;
        synchronized (this.f9495a) {
            height = this.f9500f.getHeight();
        }
        return height;
    }

    @Override
    public int getWidth() {
        int width;
        synchronized (this.f9495a) {
            width = this.f9500f.getWidth();
        }
        return width;
    }

    @Override
    public n h() {
        synchronized (this.f9495a) {
            try {
                if (this.f9506l.isEmpty()) {
                    return null;
                }
                if (this.f9505k >= this.f9506l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<n> list = this.f9506l;
                int i7 = this.f9505k;
                this.f9505k = i7 + 1;
                n nVar = list.get(i7);
                this.f9507m.add(nVar);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC0345p n() {
        return this.f9496b;
    }

    void o(InterfaceC0353t0 interfaceC0353t0) {
        n nVarH;
        synchronized (this.f9495a) {
            try {
                if (this.f9499e) {
                    return;
                }
                int size = this.f9504j.size() + this.f9506l.size();
                if (size >= interfaceC0353t0.g()) {
                    C3043d0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        nVarH = interfaceC0353t0.h();
                        if (nVarH != null) {
                            this.f9497c--;
                            size++;
                            this.f9504j.put(nVarH.D0().d(), nVarH);
                            r();
                        }
                    } catch (IllegalStateException e7) {
                        C3043d0.b("MetadataImageReader", "Failed to acquire next image.", e7);
                        nVarH = null;
                    }
                    if (nVarH == null || this.f9497c <= 0) {
                        break;
                    }
                } while (size < interfaceC0353t0.g());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void t(InterfaceC0364z interfaceC0364z) {
        synchronized (this.f9495a) {
            try {
                if (this.f9499e) {
                    return;
                }
                this.f9503i.put(interfaceC0364z.d(), new H.c(interfaceC0364z));
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    p(InterfaceC0353t0 interfaceC0353t0) {
        this.f9495a = new Object();
        this.f9496b = new a();
        this.f9497c = 0;
        this.f9498d = new InterfaceC0353t0.a() {
            @Override
            public final void a(InterfaceC0353t0 interfaceC0353t02) {
                this.f24634a.q(interfaceC0353t02);
            }
        };
        this.f9499e = false;
        this.f9503i = new LongSparseArray<>();
        this.f9504j = new LongSparseArray<>();
        this.f9507m = new ArrayList();
        this.f9500f = interfaceC0353t0;
        this.f9505k = 0;
        this.f9506l = new ArrayList(g());
    }
}
