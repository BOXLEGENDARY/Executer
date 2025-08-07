package I0;

import android.os.SystemClock;
import android.view.Choreographer;
import g0.k;
import java.util.ArrayList;

class a {

    public static final ThreadLocal<a> f1632g = new ThreadLocal<>();

    private c f1636d;

    private final k<b, Long> f1633a = new k<>();

    final ArrayList<b> f1634b = new ArrayList<>();

    private final C0024a f1635c = new C0024a();

    long f1637e = 0;

    private boolean f1638f = false;

    class C0024a {
        C0024a() {
        }

        void a() {
            a.this.f1637e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f1637e);
            if (a.this.f1634b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j7);
    }

    static abstract class c {

        final C0024a f1640a;

        c(C0024a c0024a) {
            this.f1640a = c0024a;
        }

        abstract void a();
    }

    private static class d extends c {

        private final Choreographer f1641b;

        private final Choreographer.FrameCallback f1642c;

        class ChoreographerFrameCallbackC0025a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0025a() {
            }

            @Override
            public void doFrame(long j7) {
                d.this.f1640a.a();
            }
        }

        d(C0024a c0024a) {
            super(c0024a);
            this.f1641b = Choreographer.getInstance();
            this.f1642c = new ChoreographerFrameCallbackC0025a();
        }

        @Override
        void a() {
            this.f1641b.postFrameCallback(this.f1642c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f1638f) {
            for (int size = this.f1634b.size() - 1; size >= 0; size--) {
                if (this.f1634b.get(size) == null) {
                    this.f1634b.remove(size);
                }
            }
            this.f1638f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f1632g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j7) {
        Long l7 = this.f1633a.get(bVar);
        if (l7 == null) {
            return true;
        }
        if (l7.longValue() >= j7) {
            return false;
        }
        this.f1633a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j7) {
        if (this.f1634b.size() == 0) {
            e().a();
        }
        if (!this.f1634b.contains(bVar)) {
            this.f1634b.add(bVar);
        }
        if (j7 > 0) {
            this.f1633a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j7));
        }
    }

    void c(long j7) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i7 = 0; i7 < this.f1634b.size(); i7++) {
            b bVar = this.f1634b.get(i7);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j7);
            }
        }
        b();
    }

    c e() {
        if (this.f1636d == null) {
            this.f1636d = new d(this.f1635c);
        }
        return this.f1636d;
    }

    public void g(b bVar) {
        this.f1633a.remove(bVar);
        int iIndexOf = this.f1634b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f1634b.set(iIndexOf, null);
            this.f1638f = true;
        }
    }
}
