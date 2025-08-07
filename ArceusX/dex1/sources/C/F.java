package C;

import B.InterfaceC0275k;
import C.X0;
import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import z.C3032B;
import z.C3033C;
import z.InterfaceC3054j;
import z.T;

public interface F extends InterfaceC3054j {

    public static final F f386a = new b();

    class a implements InterfaceC0275k {
        a() {
        }

        @Override
        public com.google.common.util.concurrent.p<Void> a() {
            return G.n.p(null);
        }

        @Override
        public com.google.common.util.concurrent.p<Void> b() {
            return G.n.p(null);
        }
    }

    class b implements F {
        b() {
        }

        @Override
        public com.google.common.util.concurrent.p<Void> a(boolean z7) {
            return G.n.p(null);
        }

        @Override
        public void b(X0.b bVar) {
        }

        @Override
        public void c(X x7) {
        }

        @Override
        public com.google.common.util.concurrent.p<Void> e(float f7) {
            return G.n.p(null);
        }

        @Override
        public com.google.common.util.concurrent.p<List<Void>> f(List<V> list, int i7, int i8) {
            return G.n.p(Collections.emptyList());
        }

        @Override
        public com.google.common.util.concurrent.p<Void> g(float f7) {
            return G.n.p(null);
        }

        @Override
        public Rect h() {
            return new Rect();
        }

        @Override
        public void i(int i7) {
        }

        @Override
        public X k() {
            return null;
        }

        @Override
        public com.google.common.util.concurrent.p<C3033C> l(C3032B c3032b) {
            return G.n.p(C3033C.b());
        }

        @Override
        public void m() {
        }
    }

    public static final class c extends Exception {

        private r f388d;

        public c(r rVar) {
            this.f388d = rVar;
        }
    }

    public interface d {
        void a();

        void b(List<V> list);
    }

    void b(X0.b bVar);

    void c(X x7);

    default void d() {
    }

    com.google.common.util.concurrent.p<List<Void>> f(List<V> list, int i7, int i8);

    Rect h();

    void i(int i7);

    default com.google.common.util.concurrent.p<InterfaceC0275k> j(int i7, int i8) {
        return G.n.p(new a());
    }

    X k();

    void m();

    default void n(T.i iVar) {
    }

    default void o() {
    }
}
