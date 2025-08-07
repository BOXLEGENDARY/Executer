package K3;

import java.util.NoSuchElementException;

abstract class AbstractC0488s extends AbstractC0462e0 {

    private final int f1893d;

    private int f1894e;

    protected AbstractC0488s(int i7, int i8) {
        C0485q.b(i8, i7, "index");
        this.f1893d = i7;
        this.f1894e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f1894e < this.f1893d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f1894e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1894e;
        this.f1894e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f1894e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1894e - 1;
        this.f1894e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f1894e - 1;
    }
}
