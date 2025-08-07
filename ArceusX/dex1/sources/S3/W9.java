package S3;

import java.util.NoSuchElementException;

abstract class W9 extends AbstractC1442s0 {

    private final int f6861d;

    private int f6862e;

    protected W9(int i7, int i8) {
        U9.b(i8, i7, "index");
        this.f6861d = i7;
        this.f6862e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f6862e < this.f6861d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f6862e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6862e;
        this.f6862e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f6862e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f6862e - 1;
        this.f6862e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f6862e - 1;
    }
}
