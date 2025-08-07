package R3;

import java.util.NoSuchElementException;

abstract class AbstractC1051e extends AbstractC1140p0 {

    private final int f5505d;

    private int f5506e;

    protected AbstractC1051e(int i7, int i8) {
        C1035c.b(i8, i7, "index");
        this.f5505d = i7;
        this.f5506e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f5506e < this.f5505d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f5506e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5506e;
        this.f5506e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f5506e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5506e - 1;
        this.f5506e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f5506e - 1;
    }
}
