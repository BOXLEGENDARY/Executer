package L4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class c<E> extends L4.b<E> implements List<E>, RandomAccess {

    private static final k<Object> f2064e = new a(h.f2069w, 0);

    static class a<E> extends L4.a<E> {

        private final c<E> f2065i;

        a(c<E> cVar, int i7) {
            super(cVar.size(), i7);
            this.f2065i = cVar;
        }

        @Override
        protected E a(int i7) {
            return this.f2065i.get(i7);
        }
    }

    class b extends c<E> {

        final transient int f2066i;

        final transient int f2067v;

        b(int i7, int i8) {
            this.f2066i = i7;
            this.f2067v = i8;
        }

        @Override
        Object[] e() {
            return c.this.e();
        }

        @Override
        int g() {
            return c.this.j() + this.f2066i + this.f2067v;
        }

        @Override
        public E get(int i7) {
            K4.g.e(i7, this.f2067v);
            return c.this.get(i7 + this.f2066i);
        }

        @Override
        public Iterator iterator() {
            return super.iterator();
        }

        @Override
        int j() {
            return c.this.j() + this.f2066i;
        }

        @Override
        public ListIterator listIterator() {
            return super.listIterator();
        }

        @Override
        public c<E> subList(int i7, int i8) {
            K4.g.l(i7, i8, this.f2067v);
            c cVar = c.this;
            int i9 = this.f2066i;
            return cVar.subList(i7 + i9, i8 + i9);
        }

        @Override
        public int size() {
            return this.f2067v;
        }

        @Override
        public ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    c() {
    }

    static <E> c<E> l(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    static <E> c<E> m(Object[] objArr, int i7) {
        return i7 == 0 ? r() : new h(objArr, i7);
    }

    private static <E> c<E> n(Object... objArr) {
        return l(f.b(objArr));
    }

    public static <E> c<E> o(E[] eArr) {
        return eArr.length == 0 ? r() : n((Object[]) eArr.clone());
    }

    public static <E> c<E> r() {
        return (c<E>) h.f2069w;
    }

    @Override
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    int d(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override
    public boolean equals(Object obj) {
        return e.a(this, obj);
    }

    @Override
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return e.b(this, obj);
    }

    @Override
    public j<E> iterator() {
        return listIterator();
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return e.d(this, obj);
    }

    @Override
    public k<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public k<E> listIterator(int i7) {
        K4.g.j(i7, size());
        return isEmpty() ? (k<E>) f2064e : new a(this, i7);
    }

    @Override
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public c<E> subList(int i7, int i8) {
        K4.g.l(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? r() : t(i7, i8);
    }

    @Override
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    c<E> t(int i7, int i8) {
        return new b(i7, i8 - i7);
    }
}
