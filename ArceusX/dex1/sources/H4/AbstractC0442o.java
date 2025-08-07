package H4;

import java.util.NoSuchElementException;

abstract class AbstractC0442o extends AbstractC0450x {

    private final int f1613d;

    private int f1614e;

    protected AbstractC0442o(int i7, int i8) {
        C0440m.b(i8, i7, "index");
        this.f1613d = i7;
        this.f1614e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f1614e < this.f1613d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f1614e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1614e;
        this.f1614e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f1614e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1614e - 1;
        this.f1614e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f1614e - 1;
    }
}
