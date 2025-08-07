package S3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractC1496x implements Iterator {

    int f7287d;

    int f7288e;

    int f7289i = -1;

    final C f7290v;

    AbstractC1496x(C c2, C1485w c1485w) {
        this.f7290v = c2;
        this.f7287d = c2.f6410w;
        this.f7288e = c2.i();
    }

    private final void b() {
        if (this.f7290v.f6410w != this.f7287d) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f7288e >= 0;
    }

    @Override
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7288e;
        this.f7289i = i7;
        Object objA = a(i7);
        this.f7288e = this.f7290v.j(this.f7288e);
        return objA;
    }

    @Override
    public final void remove() {
        b();
        U9.d(this.f7289i >= 0, "no calls to next() since the last call to remove()");
        this.f7287d += 32;
        int i7 = this.f7289i;
        C c2 = this.f7290v;
        c2.remove(C.k(c2, i7));
        this.f7288e--;
        this.f7289i = -1;
    }
}
