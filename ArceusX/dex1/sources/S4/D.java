package S4;

import f6.ck.ZJZXBWla;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class D extends AbstractC1526a {

    private final Set<Class<?>> f7323a;

    private final Set<Class<?>> f7324b;

    private final Set<Class<?>> f7325c;

    private final Set<Class<?>> f7326d;

    private final Set<Class<?>> f7327e;

    private final Set<Class<?>> f7328f;

    private final e f7329g;

    private static class a implements Y4.c {

        private final Set<Class<?>> f7330a;

        private final Y4.c f7331b;

        public a(Set<Class<?>> set, Y4.c cVar) {
            this.f7330a = set;
            this.f7331b = cVar;
        }
    }

    D(C1529d<?> c1529d, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c1529d.e()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c1529d.h().isEmpty()) {
            hashSet.add(Y4.c.class);
        }
        this.f7323a = Collections.unmodifiableSet(hashSet);
        this.f7324b = Collections.unmodifiableSet(hashSet2);
        this.f7325c = Collections.unmodifiableSet(hashSet3);
        this.f7326d = Collections.unmodifiableSet(hashSet4);
        this.f7327e = Collections.unmodifiableSet(hashSet5);
        this.f7328f = c1529d.h();
        this.f7329g = eVar;
    }

    @Override
    public <T> T a(Class<T> cls) {
        if (!this.f7323a.contains(cls)) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t7 = (T) this.f7329g.a(cls);
        return !cls.equals(Y4.c.class) ? t7 : (T) new a(this.f7328f, (Y4.c) t7);
    }

    @Override
    public <T> c5.b<T> b(Class<T> cls) {
        if (this.f7324b.contains(cls)) {
            return this.f7329g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override
    public <T> c5.b<Set<T>> c(Class<T> cls) {
        if (this.f7327e.contains(cls)) {
            return this.f7329g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override
    public <T> Set<T> d(Class<T> cls) {
        if (this.f7326d.contains(cls)) {
            return this.f7329g.d(cls);
        }
        throw new s(String.format(ZJZXBWla.BpRVOWwCIjR, cls));
    }
}
