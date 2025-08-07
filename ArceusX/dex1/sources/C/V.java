package C;

import C.X;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class V {

    public static final X.a<Integer> f441i = X.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    public static final X.a<Integer> f442j = X.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    private static final X.a<Range<Integer>> f443k = X.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    final List<AbstractC0324e0> f444a;

    final X f445b;

    final int f446c;

    final boolean f447d;

    final List<AbstractC0345p> f448e;

    private final boolean f449f;

    private final g1 f450g;

    private final InterfaceC0364z f451h;

    public interface b {
        void a(o1<?> o1Var, a aVar);
    }

    V(List<AbstractC0324e0> list, X x7, int i7, boolean z7, List<AbstractC0345p> list2, boolean z8, g1 g1Var, InterfaceC0364z interfaceC0364z) {
        this.f444a = list;
        this.f445b = x7;
        this.f446c = i7;
        this.f448e = Collections.unmodifiableList(list2);
        this.f449f = z8;
        this.f450g = g1Var;
        this.f451h = interfaceC0364z;
        this.f447d = z7;
    }

    public static V b() {
        return new a().h();
    }

    public List<AbstractC0345p> c() {
        return this.f448e;
    }

    public InterfaceC0364z d() {
        return this.f451h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.f445b.a(f443k, c1.f534a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f450g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public X g() {
        return this.f445b;
    }

    public int h() {
        Integer num = (Integer) this.f445b.a(o1.f664C, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<AbstractC0324e0> i() {
        return Collections.unmodifiableList(this.f444a);
    }

    public g1 j() {
        return this.f450g;
    }

    public int k() {
        return this.f446c;
    }

    public int l() {
        Integer num = (Integer) this.f445b.a(o1.f665D, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f447d;
    }

    public boolean n() {
        return this.f449f;
    }

    public static final class a {

        private final Set<AbstractC0324e0> f452a;

        private D0 f453b;

        private int f454c;

        private boolean f455d;

        private List<AbstractC0345p> f456e;

        private boolean f457f;

        private G0 f458g;

        private InterfaceC0364z f459h;

        public a() {
            this.f452a = new HashSet();
            this.f453b = E0.d0();
            this.f454c = -1;
            this.f455d = false;
            this.f456e = new ArrayList();
            this.f457f = false;
            this.f458g = G0.g();
        }

        public static a j(o1<?> o1Var) {
            b bVarR = o1Var.r(null);
            if (bVarR != null) {
                a aVar = new a();
                bVarR.a(o1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.D(o1Var.toString()));
        }

        public static a k(V v7) {
            return new a(v7);
        }

        public void a(Collection<AbstractC0345p> collection) {
            Iterator<AbstractC0345p> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(g1 g1Var) {
            this.f458g.f(g1Var);
        }

        public void c(AbstractC0345p abstractC0345p) {
            if (this.f456e.contains(abstractC0345p)) {
                return;
            }
            this.f456e.add(abstractC0345p);
        }

        public <T> void d(X.a<T> aVar, T t7) {
            this.f453b.l(aVar, t7);
        }

        public void e(X x7) {
            for (X.a<?> aVar : x7.c()) {
                Object objA = this.f453b.a(aVar, null);
                Object objF = x7.f(aVar);
                if (objA instanceof C0) {
                    ((C0) objA).a(((C0) objF).c());
                } else {
                    if (objF instanceof C0) {
                        objF = ((C0) objF).clone();
                    }
                    this.f453b.T(aVar, x7.g(aVar), objF);
                }
            }
        }

        public void f(AbstractC0324e0 abstractC0324e0) {
            this.f452a.add(abstractC0324e0);
        }

        public void g(String str, Object obj) {
            this.f458g.i(str, obj);
        }

        public V h() {
            return new V(new ArrayList(this.f452a), J0.b0(this.f453b), this.f454c, this.f455d, new ArrayList(this.f456e), this.f457f, g1.c(this.f458g), this.f459h);
        }

        public void i() {
            this.f452a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.f453b.a(V.f443k, c1.f534a);
        }

        public Set<AbstractC0324e0> m() {
            return this.f452a;
        }

        public int n() {
            return this.f454c;
        }

        public boolean o(AbstractC0345p abstractC0345p) {
            return this.f456e.remove(abstractC0345p);
        }

        public void p(InterfaceC0364z interfaceC0364z) {
            this.f459h = interfaceC0364z;
        }

        public void q(Range<Integer> range) {
            d(V.f443k, range);
        }

        public void r(int i7) {
            this.f458g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i7));
        }

        public void s(X x7) {
            this.f453b = E0.e0(x7);
        }

        public void t(boolean z7) {
            this.f455d = z7;
        }

        public void u(int i7) {
            if (i7 != 0) {
                d(o1.f664C, Integer.valueOf(i7));
            }
        }

        public void v(int i7) {
            this.f454c = i7;
        }

        public void w(boolean z7) {
            this.f457f = z7;
        }

        public void x(int i7) {
            if (i7 != 0) {
                d(o1.f665D, Integer.valueOf(i7));
            }
        }

        private a(V v7) {
            HashSet hashSet = new HashSet();
            this.f452a = hashSet;
            this.f453b = E0.d0();
            this.f454c = -1;
            this.f455d = false;
            this.f456e = new ArrayList();
            this.f457f = false;
            this.f458g = G0.g();
            hashSet.addAll(v7.f444a);
            this.f453b = E0.e0(v7.f445b);
            this.f454c = v7.f446c;
            this.f456e.addAll(v7.c());
            this.f457f = v7.n();
            this.f458g = G0.h(v7.j());
            this.f455d = v7.f447d;
        }
    }
}
