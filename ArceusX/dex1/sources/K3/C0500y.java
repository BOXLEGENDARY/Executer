package K3;

import java.util.List;

final class C0500y extends A {

    private final transient A f1903v;

    C0500y(A a2) {
        this.f1903v = a2;
    }

    private final int r(int i7) {
        return (this.f1903v.size() - 1) - i7;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f1903v.contains(obj);
    }

    @Override
    public final Object get(int i7) {
        C0485q.a(i7, this.f1903v.size(), "index");
        return this.f1903v.get(r(i7));
    }

    @Override
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f1903v.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return r(iLastIndexOf);
        }
        return -1;
    }

    @Override
    public final A l() {
        return this.f1903v;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f1903v.indexOf(obj);
        if (iIndexOf >= 0) {
            return r(iIndexOf);
        }
        return -1;
    }

    @Override
    public final A subList(int i7, int i8) {
        C0485q.e(i7, i8, this.f1903v.size());
        A a2 = this.f1903v;
        return a2.subList(a2.size() - i8, this.f1903v.size() - i7).l();
    }

    @Override
    public final int size() {
        return this.f1903v.size();
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
