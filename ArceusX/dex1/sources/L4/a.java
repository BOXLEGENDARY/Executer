package L4;

import java.util.NoSuchElementException;

abstract class a<E> extends k<E> {

    private final int f2061d;

    private int f2062e;

    protected a(int i7, int i8) {
        K4.g.j(i8, i7);
        this.f2061d = i7;
        this.f2062e = i8;
    }

    protected abstract E a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f2062e < this.f2061d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f2062e > 0;
    }

    @Override
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2062e;
        this.f2062e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f2062e;
    }

    @Override
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2062e - 1;
        this.f2062e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f2062e - 1;
    }
}
