package Q3;

import java.util.NoSuchElementException;

abstract class I2 extends AbstractC0861d {

    private final int f4059d;

    private int f4060e;

    protected I2(int i7, int i8) {
        G1.b(i8, i7, "index");
        this.f4059d = i7;
        this.f4060e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f4060e < this.f4059d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f4060e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4060e;
        this.f4060e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f4060e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4060e - 1;
        this.f4060e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f4060e - 1;
    }
}
