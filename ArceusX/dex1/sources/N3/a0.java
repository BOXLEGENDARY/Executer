package N3;

import java.util.NoSuchElementException;

abstract class a0 extends AbstractC0548t {

    private final int f2600d;

    private int f2601e;

    protected a0(int i7, int i8) {
        Y.b(i8, i7, "index");
        this.f2600d = i7;
        this.f2601e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f2601e < this.f2600d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f2601e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2601e;
        this.f2601e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f2601e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2601e - 1;
        this.f2601e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f2601e - 1;
    }
}
