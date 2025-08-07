package O3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class T implements Iterator {

    int f3284d;

    int f3285e;

    int f3286i = -1;

    final X f3287v;

    T(X x7, S s7) {
        this.f3287v = x7;
        this.f3284d = x7.f3333w;
        this.f3285e = x7.i();
    }

    private final void b() {
        if (this.f3287v.f3333w != this.f3284d) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f3285e >= 0;
    }

    @Override
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3285e;
        this.f3286i = i7;
        Object objA = a(i7);
        this.f3285e = this.f3287v.j(this.f3285e);
        return objA;
    }

    @Override
    public final void remove() {
        b();
        r.e(this.f3286i >= 0, "no calls to next() since the last call to remove()");
        this.f3284d += 32;
        int i7 = this.f3286i;
        X x7 = this.f3287v;
        x7.remove(X.k(x7, i7));
        this.f3285e--;
        this.f3286i = -1;
    }
}
