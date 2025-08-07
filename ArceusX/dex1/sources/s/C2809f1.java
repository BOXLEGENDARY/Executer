package s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import s.C2809f1;

class C2809f1 {

    final Executor f23332a;

    final Object f23333b = new Object();

    final Set<P1> f23334c = new LinkedHashSet();

    final Set<P1> f23335d = new LinkedHashSet();

    final Set<P1> f23336e = new LinkedHashSet();

    private final CameraDevice.StateCallback f23337f = new a();

    class a extends CameraDevice.StateCallback {
        a() {
        }

        private void c() {
            List<P1> listF;
            synchronized (C2809f1.this.f23333b) {
                listF = C2809f1.this.f();
                C2809f1.this.f23336e.clear();
                C2809f1.this.f23334c.clear();
                C2809f1.this.f23335d.clear();
            }
            Iterator<P1> it = listF.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }

        private void d(final int i7) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2809f1.this.f23333b) {
                linkedHashSet.addAll(C2809f1.this.f23336e);
                linkedHashSet.addAll(C2809f1.this.f23334c);
            }
            C2809f1.this.f23332a.execute(new Runnable() {
                @Override
                public final void run() {
                    C2809f1.a.f(linkedHashSet, i7);
                }
            });
        }

        private void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2809f1.this.f23333b) {
                linkedHashSet.addAll(C2809f1.this.f23336e);
                linkedHashSet.addAll(C2809f1.this.f23334c);
            }
            C2809f1.this.f23332a.execute(new Runnable() {
                @Override
                public final void run() {
                    C2809f1.b(linkedHashSet);
                }
            });
        }

        public static void f(LinkedHashSet linkedHashSet, int i7) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((P1) it.next()).i(i7);
            }
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i7) {
            e();
            d(i7);
            c();
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    C2809f1(Executor executor) {
        this.f23332a = executor;
    }

    private void a(P1 p1) {
        P1 next;
        Iterator<P1> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != p1) {
            next.d();
        }
    }

    public static void b(Set<P1> set) {
        for (P1 p1 : set) {
            p1.c().q(p1);
        }
    }

    CameraDevice.StateCallback c() {
        return this.f23337f;
    }

    List<P1> d() {
        ArrayList arrayList;
        synchronized (this.f23333b) {
            arrayList = new ArrayList(this.f23334c);
        }
        return arrayList;
    }

    List<P1> e() {
        ArrayList arrayList;
        synchronized (this.f23333b) {
            arrayList = new ArrayList(this.f23336e);
        }
        return arrayList;
    }

    List<P1> f() {
        ArrayList arrayList;
        synchronized (this.f23333b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    void g(P1 p1) {
        synchronized (this.f23333b) {
            this.f23334c.remove(p1);
            this.f23335d.remove(p1);
        }
    }

    void h(P1 p1) {
        synchronized (this.f23333b) {
            this.f23335d.add(p1);
        }
    }

    void i(P1 p1) {
        a(p1);
        synchronized (this.f23333b) {
            this.f23336e.remove(p1);
        }
    }

    void j(P1 p1) {
        synchronized (this.f23333b) {
            this.f23334c.add(p1);
            this.f23336e.remove(p1);
        }
        a(p1);
    }

    void k(P1 p1) {
        synchronized (this.f23333b) {
            this.f23336e.add(p1);
        }
    }
}
