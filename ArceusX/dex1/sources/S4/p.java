package S4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class p {

    private static class b {

        private final C1529d<?> f7367a;

        private final Set<b> f7368b = new HashSet();

        private final Set<b> f7369c = new HashSet();

        b(C1529d<?> c1529d) {
            this.f7367a = c1529d;
        }

        void a(b bVar) {
            this.f7368b.add(bVar);
        }

        void b(b bVar) {
            this.f7369c.add(bVar);
        }

        C1529d<?> c() {
            return this.f7367a;
        }

        Set<b> d() {
            return this.f7368b;
        }

        boolean e() {
            return this.f7368b.isEmpty();
        }

        boolean f() {
            return this.f7369c.isEmpty();
        }

        void g(b bVar) {
            this.f7369c.remove(bVar);
        }
    }

    private static class c {

        private final Class<?> f7370a;

        private final boolean f7371b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f7370a.equals(this.f7370a) && cVar.f7371b == this.f7371b;
        }

        public int hashCode() {
            return ((this.f7370a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7371b).hashCode();
        }

        private c(Class<?> cls, boolean z7) {
            this.f7370a = cls;
            this.f7371b = z7;
        }
    }

    static void a(List<C1529d<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i7 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i7++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<C1529d<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<C1529d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().e()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C1529d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.g()) {
                c cVar = new c(cls, !next.m());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f7371b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
