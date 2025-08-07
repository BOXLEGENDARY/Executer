package C;

import C.C0335k;
import C.V;
import C.X0;
import W0.JWp.kNUgEaOjcPdX;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import z.C3043d0;
import z.C3070z;

public final class X0 {

    private static final List<Integer> f471j = Arrays.asList(1, 5, 3);

    private final List<f> f472a;

    private final f f473b;

    private final List<CameraDevice.StateCallback> f474c;

    private final List<CameraCaptureSession.StateCallback> f475d;

    private final List<AbstractC0345p> f476e;

    private final d f477f;

    private final V f478g;

    private final int f479h;

    private InputConfiguration f480i;

    static class a {

        d f486f;

        InputConfiguration f487g;

        f f489i;

        final Set<f> f481a = new LinkedHashSet();

        final V.a f482b = new V.a();

        final List<CameraDevice.StateCallback> f483c = new ArrayList();

        final List<CameraCaptureSession.StateCallback> f484d = new ArrayList();

        final List<AbstractC0345p> f485e = new ArrayList();

        int f488h = 0;

        a() {
        }
    }

    public static class b extends a {
        public static b q(o1<?> o1Var, Size size) {
            e eVarW = o1Var.w(null);
            if (eVarW != null) {
                b bVar = new b();
                eVarW.a(size, o1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.D(o1Var.toString()));
        }

        public b A(int i7) {
            if (i7 != 0) {
                this.f482b.x(i7);
            }
            return this;
        }

        public b a(Collection<AbstractC0345p> collection) {
            for (AbstractC0345p abstractC0345p : collection) {
                this.f482b.c(abstractC0345p);
                if (!this.f485e.contains(abstractC0345p)) {
                    this.f485e.add(abstractC0345p);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        public b c(Collection<AbstractC0345p> collection) {
            this.f482b.a(collection);
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            return this;
        }

        public b e(AbstractC0345p abstractC0345p) {
            this.f482b.c(abstractC0345p);
            if (!this.f485e.contains(abstractC0345p)) {
                this.f485e.add(abstractC0345p);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f483c.contains(stateCallback)) {
                return this;
            }
            this.f483c.add(stateCallback);
            return this;
        }

        public b g(X x7) {
            this.f482b.e(x7);
            return this;
        }

        public b h(AbstractC0324e0 abstractC0324e0) {
            return i(abstractC0324e0, C3070z.f24773d);
        }

        public b i(AbstractC0324e0 abstractC0324e0, C3070z c3070z) {
            this.f481a.add(f.a(abstractC0324e0).b(c3070z).a());
            return this;
        }

        public b j(AbstractC0345p abstractC0345p) {
            this.f482b.c(abstractC0345p);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f484d.contains(stateCallback)) {
                return this;
            }
            this.f484d.add(stateCallback);
            return this;
        }

        public b l(AbstractC0324e0 abstractC0324e0) {
            return m(abstractC0324e0, C3070z.f24773d, null, -1);
        }

        public b m(AbstractC0324e0 abstractC0324e0, C3070z c3070z, String str, int i7) {
            this.f481a.add(f.a(abstractC0324e0).d(str).b(c3070z).c(i7).a());
            this.f482b.f(abstractC0324e0);
            return this;
        }

        public b n(String str, Object obj) {
            this.f482b.g(str, obj);
            return this;
        }

        public X0 o() {
            return new X0(new ArrayList(this.f481a), new ArrayList(this.f483c), new ArrayList(this.f484d), new ArrayList(this.f485e), this.f482b.h(), this.f486f, this.f487g, this.f488h, this.f489i);
        }

        public b p() {
            this.f481a.clear();
            this.f482b.i();
            return this;
        }

        public List<AbstractC0345p> r() {
            return Collections.unmodifiableList(this.f485e);
        }

        public boolean s(AbstractC0345p abstractC0345p) {
            return this.f482b.o(abstractC0345p) || this.f485e.remove(abstractC0345p);
        }

        public b t(d dVar) {
            this.f486f = dVar;
            return this;
        }

        public b u(Range<Integer> range) {
            this.f482b.q(range);
            return this;
        }

        public b v(X x7) {
            this.f482b.s(x7);
            return this;
        }

        public b w(InputConfiguration inputConfiguration) {
            this.f487g = inputConfiguration;
            return this;
        }

        public b x(AbstractC0324e0 abstractC0324e0) {
            this.f489i = f.a(abstractC0324e0).a();
            return this;
        }

        public b y(int i7) {
            if (i7 != 0) {
                this.f482b.u(i7);
            }
            return this;
        }

        public b z(int i7) {
            this.f482b.v(i7);
            return this;
        }
    }

    public static final class c implements d {

        private final AtomicBoolean f490a = new AtomicBoolean(false);

        private final d f491b;

        public c(d dVar) {
            this.f491b = dVar;
        }

        @Override
        public void a(X0 x02, g gVar) {
            if (this.f490a.get()) {
                return;
            }
            this.f491b.a(x02, gVar);
        }

        public void b() {
            this.f490a.set(true);
        }
    }

    public interface d {
        void a(X0 x02, g gVar);
    }

    public interface e {
        void a(Size size, o1<?> o1Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(C3070z c3070z);

            public abstract a c(int i7);

            public abstract a d(String str);

            public abstract a e(List<AbstractC0324e0> list);

            public abstract a f(int i7);
        }

        public static a a(AbstractC0324e0 abstractC0324e0) {
            return new C0335k.b().g(abstractC0324e0).e(Collections.emptyList()).d(null).c(-1).f(-1).b(C3070z.f24773d);
        }

        public abstract C3070z b();

        public abstract int c();

        public abstract String d();

        public abstract List<AbstractC0324e0> e();

        public abstract AbstractC0324e0 f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        private final K.f f495j = new K.f();

        private boolean f496k = true;

        private boolean f497l = false;

        private List<d> f498m = new ArrayList();

        private List<AbstractC0324e0> e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f481a) {
                arrayList.add(fVar.f());
                Iterator<AbstractC0324e0> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        public void g(X0 x02, g gVar) {
            Iterator<d> it = this.f498m.iterator();
            while (it.hasNext()) {
                it.next().a(x02, gVar);
            }
        }

        private void h(Range<Integer> range) {
            Range<Integer> range2 = c1.f534a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f482b.l().equals(range2)) {
                this.f482b.q(range);
            } else {
                if (this.f482b.l().equals(range)) {
                    return;
                }
                this.f496k = false;
                C3043d0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        private void i(int i7) {
            if (i7 != 0) {
                this.f482b.u(i7);
            }
        }

        private void j(int i7) {
            if (i7 != 0) {
                this.f482b.x(i7);
            }
        }

        public void b(X0 x02) {
            V vK = x02.k();
            if (vK.k() != -1) {
                this.f497l = true;
                this.f482b.v(X0.e(vK.k(), this.f482b.n()));
            }
            h(vK.e());
            i(vK.h());
            j(vK.l());
            this.f482b.b(x02.k().j());
            this.f483c.addAll(x02.c());
            this.f484d.addAll(x02.l());
            this.f482b.a(x02.j());
            this.f485e.addAll(x02.n());
            if (x02.d() != null) {
                this.f498m.add(x02.d());
            }
            if (x02.g() != null) {
                this.f487g = x02.g();
            }
            this.f481a.addAll(x02.h());
            this.f482b.m().addAll(vK.i());
            boolean zContainsAll = e().containsAll(this.f482b.m());
            String str = kNUgEaOjcPdX.qAXPSc;
            if (!zContainsAll) {
                C3043d0.a(str, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f496k = false;
            }
            if (x02.m() != this.f488h && x02.m() != 0 && this.f488h != 0) {
                C3043d0.a(str, "Invalid configuration due to that two non-default session types are set");
                this.f496k = false;
            } else if (x02.m() != 0) {
                this.f488h = x02.m();
            }
            if (x02.f473b != null) {
                if (this.f489i == x02.f473b || this.f489i == null) {
                    this.f489i = x02.f473b;
                } else {
                    C3043d0.a(str, "Invalid configuration due to that two different postview output configs are set");
                    this.f496k = false;
                }
            }
            this.f482b.e(vK.g());
        }

        public X0 c() {
            if (!this.f496k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f481a);
            this.f495j.d(arrayList);
            return new X0(arrayList, new ArrayList(this.f483c), new ArrayList(this.f484d), new ArrayList(this.f485e), this.f482b.h(), !this.f498m.isEmpty() ? new d() {
                @Override
                public final void a(X0 x02, X0.g gVar) {
                    this.f501a.g(x02, gVar);
                }
            } : null, this.f487g, this.f488h, this.f489i);
        }

        public void d() {
            this.f481a.clear();
            this.f482b.i();
        }

        public boolean f() {
            return this.f497l && this.f496k;
        }
    }

    X0(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC0345p> list4, V v7, d dVar, InputConfiguration inputConfiguration, int i7, f fVar) {
        this.f472a = list;
        this.f474c = Collections.unmodifiableList(list2);
        this.f475d = Collections.unmodifiableList(list3);
        this.f476e = Collections.unmodifiableList(list4);
        this.f477f = dVar;
        this.f478g = v7;
        this.f480i = inputConfiguration;
        this.f479h = i7;
        this.f473b = fVar;
    }

    public static X0 b() {
        return new X0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new V.a().h(), null, null, 0, null);
    }

    public static int e(int i7, int i8) {
        List<Integer> list = f471j;
        return list.indexOf(Integer.valueOf(i7)) >= list.indexOf(Integer.valueOf(i8)) ? i7 : i8;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f474c;
    }

    public d d() {
        return this.f477f;
    }

    public X f() {
        return this.f478g.g();
    }

    public InputConfiguration g() {
        return this.f480i;
    }

    public List<f> h() {
        return this.f472a;
    }

    public f i() {
        return this.f473b;
    }

    public List<AbstractC0345p> j() {
        return this.f478g.c();
    }

    public V k() {
        return this.f478g;
    }

    public List<CameraCaptureSession.StateCallback> l() {
        return this.f475d;
    }

    public int m() {
        return this.f479h;
    }

    public List<AbstractC0345p> n() {
        return this.f476e;
    }

    public List<AbstractC0324e0> o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f472a) {
            arrayList.add(fVar.f());
            Iterator<AbstractC0324e0> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f478g.k();
    }
}
