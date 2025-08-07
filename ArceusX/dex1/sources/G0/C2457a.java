package g0;

import h0.C2474a;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class C2457a<K, V> extends k<K, V> implements Map<K, V> {

    C2457a<K, V>.C0190a f20902v;

    C2457a<K, V>.c f20903w;

    C2457a<K, V>.e f20904y;

    final class C0190a extends AbstractSet<Map.Entry<K, V>> {
        C0190a() {
        }

        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override
        public int size() {
            return C2457a.this.getSize();
        }
    }

    final class b extends g<K> {
        b() {
            super(C2457a.this.getSize());
        }

        @Override
        protected K a(int i7) {
            return C2457a.this.g(i7);
        }

        @Override
        protected void b(int i7) {
            C2457a.this.i(i7);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        int f20908d;

        int f20909e = -1;

        boolean f20910i;

        d() {
            this.f20908d = C2457a.this.getSize() - 1;
        }

        @Override
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f20909e++;
            this.f20910i = true;
            return this;
        }

        @Override
        public boolean equals(Object obj) {
            if (!this.f20910i) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C2474a.c(entry.getKey(), C2457a.this.g(this.f20909e)) && C2474a.c(entry.getValue(), C2457a.this.k(this.f20909e));
        }

        @Override
        public K getKey() {
            if (this.f20910i) {
                return C2457a.this.g(this.f20909e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public V getValue() {
            if (this.f20910i) {
                return C2457a.this.k(this.f20909e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public boolean hasNext() {
            return this.f20909e < this.f20908d;
        }

        @Override
        public int hashCode() {
            if (!this.f20910i) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kG = C2457a.this.g(this.f20909e);
            V vK = C2457a.this.k(this.f20909e);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override
        public void remove() {
            if (!this.f20910i) {
                throw new IllegalStateException();
            }
            C2457a.this.i(this.f20909e);
            this.f20909e--;
            this.f20908d--;
            this.f20910i = false;
        }

        @Override
        public V setValue(V v7) {
            if (this.f20910i) {
                return C2457a.this.j(this.f20909e, v7);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends g<V> {
        f() {
            super(C2457a.this.getSize());
        }

        @Override
        protected V a(int i7) {
            return C2457a.this.k(i7);
        }

        @Override
        protected void b(int i7) {
            C2457a.this.i(i7);
        }
    }

    public C2457a() {
    }

    static <T> boolean m(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        C2457a<K, V>.C0190a c0190a = this.f20902v;
        if (c0190a != null) {
            return c0190a;
        }
        C2457a<K, V>.C0190a c0190a2 = new C0190a();
        this.f20902v = c0190a2;
        return c0190a2;
    }

    @Override
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override
    public Set<K> keySet() {
        C2457a<K, V>.c cVar = this.f20903w;
        if (cVar != null) {
            return cVar;
        }
        C2457a<K, V>.c cVar2 = new c();
        this.f20903w = cVar2;
        return cVar2;
    }

    public boolean l(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean o(Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != getSize();
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        b(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override
    public Collection<V> values() {
        C2457a<K, V>.e eVar = this.f20904y;
        if (eVar != null) {
            return eVar;
        }
        C2457a<K, V>.e eVar2 = new e();
        this.f20904y = eVar2;
        return eVar2;
    }

    public C2457a(int i7) {
        super(i7);
    }

    final class c implements Set<K> {
        c() {
        }

        @Override
        public boolean add(K k7) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            C2457a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return C2457a.this.containsKey(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return C2457a.this.l(collection);
        }

        @Override
        public boolean equals(Object obj) {
            return C2457a.m(this, obj);
        }

        @Override
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C2457a.this.getSize() - 1; size >= 0; size--) {
                K kG = C2457a.this.g(size);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override
        public boolean isEmpty() {
            return C2457a.this.isEmpty();
        }

        @Override
        public Iterator<K> iterator() {
            return new b();
        }

        @Override
        public boolean remove(Object obj) {
            int iD = C2457a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            C2457a.this.i(iD);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return C2457a.this.n(collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return C2457a.this.o(collection);
        }

        @Override
        public int size() {
            return C2457a.this.getSize();
        }

        @Override
        public Object[] toArray() {
            int size = C2457a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2457a.this.g(i7);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i7 = 0; i7 < size; i7++) {
                tArr[i7] = C2457a.this.g(i7);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override
        public boolean add(V v7) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            C2457a.this.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return C2457a.this.a(obj) >= 0;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return C2457a.this.isEmpty();
        }

        @Override
        public Iterator<V> iterator() {
            return new f();
        }

        @Override
        public boolean remove(Object obj) {
            int iA = C2457a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C2457a.this.i(iA);
            return true;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            int size = C2457a.this.getSize();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < size) {
                if (collection.contains(C2457a.this.k(i7))) {
                    C2457a.this.i(i7);
                    i7--;
                    size--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            int size = C2457a.this.getSize();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < size) {
                if (!collection.contains(C2457a.this.k(i7))) {
                    C2457a.this.i(i7);
                    i7--;
                    size--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override
        public int size() {
            return C2457a.this.getSize();
        }

        @Override
        public Object[] toArray() {
            int size = C2457a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C2457a.this.k(i7);
            }
            return objArr;
        }

        @Override
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i7 = 0; i7 < size; i7++) {
                tArr[i7] = C2457a.this.k(i7);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public C2457a(k kVar) {
        super(kVar);
    }
}
