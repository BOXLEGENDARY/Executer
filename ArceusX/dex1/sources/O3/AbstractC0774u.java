package O3;

import java.util.NoSuchElementException;

abstract class AbstractC0774u extends G0 {

    private final int f3593d;

    private int f3594e;

    protected AbstractC0774u(int i7, int i8) {
        r.b(i8, i7, "index");
        this.f3593d = i7;
        this.f3594e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f3594e < this.f3593d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f3594e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3594e;
        this.f3594e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f3594e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3594e - 1;
        this.f3594e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f3594e - 1;
    }
}
