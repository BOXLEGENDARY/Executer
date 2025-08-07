package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class C2556b<K, V> implements Iterable<Map.Entry<K, V>> {

    c<K, V> f21878d;

    private c<K, V> f21879e;

    private final WeakHashMap<f<K, V>, Boolean> f21880i = new WeakHashMap<>();

    private int f21881v = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        c<K, V> b(c<K, V> cVar) {
            return cVar.f21885v;
        }

        @Override
        c<K, V> c(c<K, V> cVar) {
            return cVar.f21884i;
        }
    }

    private static class C0208b<K, V> extends e<K, V> {
        C0208b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        c<K, V> b(c<K, V> cVar) {
            return cVar.f21884i;
        }

        @Override
        c<K, V> c(c<K, V> cVar) {
            return cVar.f21885v;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        final K f21882d;

        final V f21883e;

        c<K, V> f21884i;

        c<K, V> f21885v;

        c(K k7, V v7) {
            this.f21882d = k7;
            this.f21883e = v7;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21882d.equals(cVar.f21882d) && this.f21883e.equals(cVar.f21883e);
        }

        @Override
        public K getKey() {
            return this.f21882d;
        }

        @Override
        public V getValue() {
            return this.f21883e;
        }

        @Override
        public int hashCode() {
            return this.f21882d.hashCode() ^ this.f21883e.hashCode();
        }

        @Override
        public V setValue(V v7) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f21882d + "=" + this.f21883e;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        private c<K, V> f21886d;

        private boolean f21887e = true;

        d() {
        }

        @Override
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f21886d;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f21885v;
                this.f21886d = cVar3;
                this.f21887e = cVar3 == null;
            }
        }

        @Override
        public Map.Entry<K, V> next() {
            if (this.f21887e) {
                this.f21887e = false;
                this.f21886d = C2556b.this.f21878d;
            } else {
                c<K, V> cVar = this.f21886d;
                this.f21886d = cVar != null ? cVar.f21884i : null;
            }
            return this.f21886d;
        }

        @Override
        public boolean hasNext() {
            if (this.f21887e) {
                return C2556b.this.f21878d != null;
            }
            c<K, V> cVar = this.f21886d;
            return (cVar == null || cVar.f21884i == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        c<K, V> f21889d;

        c<K, V> f21890e;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f21889d = cVar2;
            this.f21890e = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f21890e;
            c<K, V> cVar2 = this.f21889d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override
        public void a(c<K, V> cVar) {
            if (this.f21889d == cVar && cVar == this.f21890e) {
                this.f21890e = null;
                this.f21889d = null;
            }
            c<K, V> cVar2 = this.f21889d;
            if (cVar2 == cVar) {
                this.f21889d = b(cVar2);
            }
            if (this.f21890e == cVar) {
                this.f21890e = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f21890e;
            this.f21890e = e();
            return cVar;
        }

        @Override
        public boolean hasNext() {
            return this.f21890e != null;
        }
    }

    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.f21878d;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0208b c0208b = new C0208b(this.f21879e, this.f21878d);
        this.f21880i.put(c0208b, Boolean.FALSE);
        return c0208b;
    }

    protected c<K, V> e(K k7) {
        c<K, V> cVar = this.f21878d;
        while (cVar != null && !cVar.f21882d.equals(k7)) {
            cVar = cVar.f21884i;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2556b)) {
            return false;
        }
        C2556b c2556b = (C2556b) obj;
        if (size() != c2556b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c2556b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public C2556b<K, V>.d g() {
        C2556b<K, V>.d dVar = new d();
        this.f21880i.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f21878d, this.f21879e);
        this.f21880i.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry<K, V> j() {
        return this.f21879e;
    }

    c<K, V> k(K k7, V v7) {
        c<K, V> cVar = new c<>(k7, v7);
        this.f21881v++;
        c<K, V> cVar2 = this.f21879e;
        if (cVar2 == null) {
            this.f21878d = cVar;
            this.f21879e = cVar;
            return cVar;
        }
        cVar2.f21884i = cVar;
        cVar.f21885v = cVar2;
        this.f21879e = cVar;
        return cVar;
    }

    public V l(K k7, V v7) {
        c<K, V> cVarE = e(k7);
        if (cVarE != null) {
            return cVarE.f21883e;
        }
        k(k7, v7);
        return null;
    }

    public V m(K k7) {
        c<K, V> cVarE = e(k7);
        if (cVarE == null) {
            return null;
        }
        this.f21881v--;
        if (!this.f21880i.isEmpty()) {
            Iterator<f<K, V>> it = this.f21880i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f21885v;
        if (cVar != null) {
            cVar.f21884i = cVarE.f21884i;
        } else {
            this.f21878d = cVarE.f21884i;
        }
        c<K, V> cVar2 = cVarE.f21884i;
        if (cVar2 != null) {
            cVar2.f21885v = cVar;
        } else {
            this.f21879e = cVar;
        }
        cVarE.f21884i = null;
        cVarE.f21885v = null;
        return cVarE.f21883e;
    }

    public int size() {
        return this.f21881v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
