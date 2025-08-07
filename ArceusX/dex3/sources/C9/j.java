package C9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class j<T> implements d<Set<T>> {
    private static final d<Set<Object>> c = e.a(Collections.emptySet());
    private final List<h<T>> a;
    private final List<h<Collection<T>>> b;

    public static final class b<T> {
        private final List<h<T>> a;
        private final List<h<Collection<T>>> b;

        public b<T> a(h<? extends Collection<? extends T>> hVar) {
            this.b.add(hVar);
            return this;
        }

        public b<T> b(h<? extends T> hVar) {
            this.a.add(hVar);
            return this;
        }

        public j<T> c() {
            return new j<>(this.a, this.b);
        }

        private b(int i, int i2) {
            this.a = C9.b.d(i);
            this.b = C9.b.d(i2);
        }
    }

    public static <T> b<T> a(int i, int i2) {
        return new b<>(i, i2);
    }

    public Set<T> get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = C9.b.b(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSetB.add(g.b(this.a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Iterator it = ((Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSetB.add(g.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }

    private j(List<h<T>> list, List<h<Collection<T>>> list2) {
        this.a = list;
        this.b = list2;
    }
}
