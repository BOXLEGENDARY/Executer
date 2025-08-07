package C;

import C.X0;
import C.n1;
import C.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z.C3043d0;

public final class n1 {

    private final String f647a;

    private final Map<String, b> f648b = new LinkedHashMap();

    interface a {
        boolean a(b bVar);
    }

    public static final class b {

        private final X0 f649a;

        private final o1<?> f650b;

        private final c1 f651c;

        private final List<p1.b> f652d;

        private boolean f653e = false;

        private boolean f654f = false;

        b(X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
            this.f649a = x02;
            this.f650b = o1Var;
            this.f651c = c1Var;
            this.f652d = list;
        }

        boolean a() {
            return this.f654f;
        }

        public boolean b() {
            return this.f653e;
        }

        public List<p1.b> c() {
            return this.f652d;
        }

        public X0 d() {
            return this.f649a;
        }

        public c1 e() {
            return this.f651c;
        }

        public o1<?> f() {
            return this.f650b;
        }

        void g(boolean z7) {
            this.f654f = z7;
        }

        void h(boolean z7) {
            this.f653e = z7;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f649a + ", mUseCaseConfig=" + this.f650b + ", mStreamSpec=" + this.f651c + ", mCaptureTypes=" + this.f652d + ", mAttached=" + this.f653e + ", mActive=" + this.f654f + '}';
        }
    }

    public n1(String str) {
        this.f647a = str;
    }

    private b k(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        b bVar = this.f648b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(x02, o1Var, c1Var, list);
        this.f648b.put(str, bVar2);
        return bVar2;
    }

    private Collection<X0> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f648b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    private Collection<o1<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f648b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    private Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f648b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public static boolean p(b bVar) {
        return bVar.a() && bVar.b();
    }

    public X0.h e() {
        X0.h hVar = new X0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f648b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        C3043d0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f647a);
        return hVar;
    }

    public Collection<X0> f() {
        return Collections.unmodifiableCollection(l(new a() {
            @Override
            public final boolean a(n1.b bVar) {
                return n1.p(bVar);
            }
        }));
    }

    public X0.h g() {
        X0.h hVar = new X0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f648b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        C3043d0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f647a);
        return hVar;
    }

    public Collection<X0> h() {
        return Collections.unmodifiableCollection(l(new a() {
            @Override
            public final boolean a(n1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<o1<?>> i() {
        return Collections.unmodifiableCollection(m(new a() {
            @Override
            public final boolean a(n1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new a() {
            @Override
            public final boolean a(n1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public boolean o(String str) {
        if (this.f648b.containsKey(str)) {
            return this.f648b.get(str).b();
        }
        return false;
    }

    public void t(String str) {
        this.f648b.remove(str);
    }

    public void u(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        k(str, x02, o1Var, c1Var, list).g(true);
    }

    public void v(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        k(str, x02, o1Var, c1Var, list).h(true);
        y(str, x02, o1Var, c1Var, list);
    }

    public void w(String str) {
        if (this.f648b.containsKey(str)) {
            b bVar = this.f648b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f648b.remove(str);
        }
    }

    public void x(String str) {
        if (this.f648b.containsKey(str)) {
            b bVar = this.f648b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f648b.remove(str);
        }
    }

    public void y(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        if (this.f648b.containsKey(str)) {
            b bVar = new b(x02, o1Var, c1Var, list);
            b bVar2 = this.f648b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f648b.put(str, bVar);
        }
    }
}
