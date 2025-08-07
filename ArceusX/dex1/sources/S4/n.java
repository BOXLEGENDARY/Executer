package S4;

import S4.n;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class n extends AbstractC1526a implements T4.a {

    private static final c5.b<Set<Object>> f7356g = new c5.b() {
        @Override
        public final Object get() {
            return Collections.emptySet();
        }
    };

    private final Map<C1529d<?>, c5.b<?>> f7357a;

    private final Map<Class<?>, c5.b<?>> f7358b;

    private final Map<Class<?>, x<?>> f7359c;

    private final List<c5.b<i>> f7360d;

    private final u f7361e;

    private final AtomicReference<Boolean> f7362f;

    public static final class b {

        private final Executor f7363a;

        private final List<c5.b<i>> f7364b = new ArrayList();

        private final List<C1529d<?>> f7365c = new ArrayList();

        b(Executor executor) {
            this.f7363a = executor;
        }

        public static i f(i iVar) {
            return iVar;
        }

        public b b(C1529d<?> c1529d) {
            this.f7365c.add(c1529d);
            return this;
        }

        public b c(final i iVar) {
            this.f7364b.add(new c5.b() {
                @Override
                public final Object get() {
                    return n.b.f(iVar);
                }
            });
            return this;
        }

        public b d(Collection<c5.b<i>> collection) {
            this.f7364b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f7363a, this.f7364b, this.f7365c);
        }
    }

    public static b h(Executor executor) {
        return new b(executor);
    }

    private void i(List<C1529d<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<c5.b<i>> it = this.f7360d.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            if (this.f7357a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f7357a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final C1529d<?> c1529d : list) {
                this.f7357a.put(c1529d, new w(new c5.b() {
                    @Override
                    public final Object get() {
                        return this.f7350a.m(c1529d);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        p();
    }

    private void j(Map<C1529d<?>, c5.b<?>> map, boolean z7) {
        for (Map.Entry<C1529d<?>, c5.b<?>> entry : map.entrySet()) {
            C1529d<?> key = entry.getKey();
            c5.b<?> value = entry.getValue();
            if (key.k() || (key.l() && z7)) {
                value.get();
            }
        }
        this.f7361e.d();
    }

    private static <T> List<T> l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public Object m(C1529d c1529d) {
        return c1529d.f().a(new D(c1529d, this));
    }

    private void p() {
        Boolean bool = this.f7362f.get();
        if (bool != null) {
            j(this.f7357a, bool.booleanValue());
        }
    }

    private void q() {
        for (C1529d<?> c1529d : this.f7357a.keySet()) {
            for (q qVar : c1529d.e()) {
                if (qVar.f() && !this.f7359c.containsKey(qVar.b())) {
                    this.f7359c.put(qVar.b(), x.b(Collections.emptySet()));
                } else if (this.f7358b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c1529d, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f7358b.put(qVar.b(), B.c());
                    }
                }
            }
        }
    }

    private List<Runnable> r(List<C1529d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C1529d<?> c1529d : list) {
            if (c1529d.m()) {
                final c5.b<?> bVar = this.f7357a.get(c1529d);
                for (Class<? super Object> cls : c1529d.g()) {
                    if (this.f7358b.containsKey(cls)) {
                        final B b2 = (B) this.f7358b.get(cls);
                        arrayList.add(new Runnable() {
                            @Override
                            public final void run() {
                                b2.f(bVar);
                            }
                        });
                    } else {
                        this.f7358b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<C1529d<?>, c5.b<?>> entry : this.f7357a.entrySet()) {
            C1529d<?> key = entry.getKey();
            if (!key.m()) {
                c5.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.g()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f7359c.containsKey(entry2.getKey())) {
                final x<?> xVar = this.f7359c.get(entry2.getKey());
                for (final c5.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            xVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f7359c.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override
    public Object a(Class cls) {
        return super.a(cls);
    }

    @Override
    public synchronized <T> c5.b<T> b(Class<T> cls) {
        C.c(cls, "Null interface requested.");
        return (c5.b) this.f7358b.get(cls);
    }

    @Override
    public synchronized <T> c5.b<Set<T>> c(Class<T> cls) {
        x<?> xVar = this.f7359c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (c5.b<Set<T>>) f7356g;
    }

    @Override
    public Set d(Class cls) {
        return super.d(cls);
    }

    public void k(boolean z7) {
        HashMap map;
        if (a0.g.a(this.f7362f, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                map = new HashMap(this.f7357a);
            }
            j(map, z7);
        }
    }

    private n(Executor executor, Iterable<c5.b<i>> iterable, Collection<C1529d<?>> collection) {
        this.f7357a = new HashMap();
        this.f7358b = new HashMap();
        this.f7359c = new HashMap();
        this.f7362f = new AtomicReference<>();
        u uVar = new u(executor);
        this.f7361e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1529d.p(uVar, u.class, Y4.d.class, Y4.c.class));
        arrayList.add(C1529d.p(this, T4.a.class, new Class[0]));
        for (C1529d<?> c1529d : collection) {
            if (c1529d != null) {
                arrayList.add(c1529d);
            }
        }
        this.f7360d = l(iterable);
        i(arrayList);
    }
}
