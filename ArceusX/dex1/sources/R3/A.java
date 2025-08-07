package R3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class A implements Iterator {

    int f4926d;

    int f4927e;

    int f4928i = -1;

    final F f4929v;

    A(F f7, C1191w c1191w) {
        this.f4929v = f7;
        this.f4926d = f7.f5201w;
        this.f4927e = f7.h();
    }

    private final void b() {
        if (this.f4929v.f5201w != this.f4926d) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f4927e >= 0;
    }

    @Override
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4927e;
        this.f4928i = i7;
        Object objA = a(i7);
        this.f4927e = this.f4929v.i(this.f4927e);
        return objA;
    }

    @Override
    public final void remove() {
        b();
        C1035c.d(this.f4928i >= 0, "no calls to next() since the last call to remove()");
        this.f4926d += 32;
        F f7 = this.f4929v;
        f7.remove(F.j(f7, this.f4928i));
        this.f4927e--;
        this.f4928i = -1;
    }
}
