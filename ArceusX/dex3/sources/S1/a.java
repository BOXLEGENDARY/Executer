package S1;

import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {
    private final d<K> c;
    protected c2.c<A> e;
    final List<b> a = new ArrayList(1);
    private boolean b = false;
    protected float d = 0.0f;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public interface b {
        void a();
    }

    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override
        public c2.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override
        public boolean c(float f) {
            return false;
        }

        @Override
        public float d() {
            return 1.0f;
        }

        @Override
        public float e() {
            return 0.0f;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d<T> {
        boolean a(float f);

        c2.a<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    private static final class e<T> implements d<T> {
        private final List<? extends c2.a<T>> a;
        private c2.a<T> c = null;
        private float d = -1.0f;

        @NonNull
        private c2.a<T> b = f(0.0f);

        e(List<? extends c2.a<T>> list) {
            this.a = list;
        }

        private c2.a<T> f(float f) {
            List<? extends c2.a<T>> list = this.a;
            c2.a<T> aVar = list.get(list.size() - 1);
            if (f >= aVar.e()) {
                return aVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                c2.a<T> aVar2 = this.a.get(size);
                if (this.b != aVar2 && aVar2.a(f)) {
                    return aVar2;
                }
            }
            return this.a.get(0);
        }

        @Override
        public boolean a(float f) {
            c2.a<T> aVar = this.c;
            c2.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.d == f) {
                return true;
            }
            this.c = aVar2;
            this.d = f;
            return false;
        }

        @Override
        @NonNull
        public c2.a<T> b() {
            return this.b;
        }

        @Override
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override
        public float d() {
            return this.a.get(r0.size() - 1).b();
        }

        @Override
        public float e() {
            return this.a.get(0).e();
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f<T> implements d<T> {

        @NonNull
        private final c2.a<T> a;
        private float b = -1.0f;

        f(List<? extends c2.a<T>> list) {
            this.a = list.get(0);
        }

        @Override
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override
        public c2.a<T> b() {
            return this.a;
        }

        @Override
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override
        public float d() {
            return this.a.b();
        }

        @Override
        public float e() {
            return this.a.e();
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends c2.a<K>> list) {
        this.c = o(list);
    }

    private float g() {
        if (this.g == -1.0f) {
            this.g = this.c.e();
        }
        return this.g;
    }

    private static <T> d<T> o(List<? extends c2.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    protected c2.a<K> b() {
        P1.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        c2.a<K> aVarB = this.c.b();
        P1.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return aVarB;
    }

    float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    protected float d() {
        c2.a<K> aVarB = b();
        if (aVarB.h()) {
            return 0.0f;
        }
        return aVarB.d.getInterpolation(e());
    }

    float e() {
        if (this.b) {
            return 0.0f;
        }
        c2.a<K> aVarB = b();
        if (aVarB.h()) {
            return 0.0f;
        }
        return (this.d - aVarB.e()) / (aVarB.b() - aVarB.e());
    }

    public float f() {
        return this.d;
    }

    public A h() {
        float fE = e();
        if (this.e == null && this.c.a(fE)) {
            return this.f;
        }
        c2.a<K> aVarB = b();
        Interpolator interpolator = aVarB.e;
        A aI = (interpolator == null || aVarB.f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f.getInterpolation(fE));
        this.f = aI;
        return aI;
    }

    abstract A i(c2.a<K> aVar, float f2);

    protected A j(c2.a<K> aVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            k();
        }
    }

    public void n(c2.c<A> cVar) {
        c2.c<A> cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
