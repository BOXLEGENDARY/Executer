package K3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class I extends J implements NavigableMap {

    public static final int f1786A = 0;

    private static final Comparator f1787y;

    private static final I f1788z;

    private final transient V f1789i;

    private final transient A f1790v;

    private final transient I f1791w;

    static {
        P p7 = P.f1801d;
        f1787y = p7;
        V vX = K.x(p7);
        int i7 = A.f1764i;
        f1788z = new I(vX, T.f1807y, null);
    }

    I(V v7, A a2, I i7) {
        this.f1789i = v7;
        this.f1790v = a2;
        this.f1791w = i7;
    }

    public static I f(Map map) {
        final Comparator comparator = f1787y;
        Comparator comparator2 = map.comparator();
        int i7 = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection collectionEntrySet = map.entrySet();
        Map.Entry[] entryArr = C.f1769e;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            Collection arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return g(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            entry.getClass();
            return new I(new V(A.p(entry.getKey()), comparator), A.p(entry.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i8 = 0; i8 < length; i8++) {
                Map.Entry entry2 = entryArr2[i8];
                entry2.getClass();
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                C0490t.a(key, value);
                objArr[i8] = key;
                objArr2[i8] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    Comparator comparator3 = comparator;
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    int i9 = I.f1786A;
                    entry3.getClass();
                    entry4.getClass();
                    return comparator3.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr2[0];
            entry3.getClass();
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            C0490t.a(objArr[0], value2);
            while (i7 < length) {
                Map.Entry entry4 = entryArr2[i7 - 1];
                entry4.getClass();
                Map.Entry entry5 = entryArr2[i7];
                entry5.getClass();
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                C0490t.a(key3, value3);
                objArr[i7] = key3;
                objArr2[i7] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry4) + " and " + String.valueOf(entry5));
                }
                i7++;
                key2 = key3;
            }
        }
        return new I(new V(A.n(objArr, length), comparator), A.n(objArr2, length), null);
    }

    static I g(Comparator comparator) {
        if (P.f1801d.equals(comparator)) {
            return f1788z;
        }
        V vX = K.x(comparator);
        int i7 = A.f1764i;
        return new I(vX, T.f1807y, null);
    }

    private final I l(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == this.f1790v.size()) {
                return this;
            }
            i7 = 0;
        }
        return i7 == i8 ? g(this.f1789i.f1792i) : new I(this.f1789i.E(i7, i8), this.f1790v.subList(i7, i8), null);
    }

    @Override
    public final AbstractC0496w a() {
        return this.f1790v;
    }

    @Override
    final E b() {
        return isEmpty() ? U.f1811B : new H(this);
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return N.a(ceilingEntry(obj));
    }

    @Override
    public final Comparator comparator() {
        return this.f1789i.f1792i;
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f1789i.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        I i7 = this.f1791w;
        if (i7 != null) {
            return i7;
        }
        if (!isEmpty()) {
            return new I((V) this.f1789i.descendingSet(), this.f1790v.l(), this);
        }
        Comparator comparator = this.f1789i.f1792i;
        return g((comparator instanceof S ? (S) comparator : new C0492u(comparator)).a());
    }

    @Override
    public final Set entrySet() {
        return c();
    }

    @Override
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) c().o().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.f1789i.first();
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object obj) {
        return N.a(floorEntry(obj));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: K3.I.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final I headMap(Object obj, boolean z7) {
        V v7 = this.f1789i;
        obj.getClass();
        return l(0, v7.C(obj, z7));
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object obj) {
        return N.a(higherEntry(obj));
    }

    @Override
    public final I subMap(Object obj, boolean z7, Object obj2, boolean z8) {
        obj.getClass();
        obj2.getClass();
        if (this.f1789i.f1792i.compare(obj, obj2) <= 0) {
            return headMap(obj2, z8).tailMap(obj, z7);
        }
        throw new IllegalArgumentException(r.a("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final I tailMap(Object obj, boolean z7) {
        V v7 = this.f1789i;
        obj.getClass();
        return l(v7.D(obj, z7), this.f1790v.size());
    }

    @Override
    public final Set keySet() {
        return this.f1789i;
    }

    @Override
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) c().o().get(this.f1790v.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.f1789i.last();
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object obj) {
        return N.a(lowerEntry(obj));
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.f1789i;
    }

    @Override
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f1790v.size();
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override
    public final Collection values() {
        return this.f1790v;
    }
}
