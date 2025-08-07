package K3;

import java.util.NoSuchElementException;

final class C0489s0 extends AbstractC0493u0 {

    private int f1895d = 0;

    private final int f1896e;

    final B0 f1897i;

    C0489s0(B0 b02) {
        this.f1897i = b02;
        this.f1896e = b02.g();
    }

    @Override
    public final boolean hasNext() {
        return this.f1895d < this.f1896e;
    }

    @Override
    public final byte zza() {
        int i7 = this.f1895d;
        if (i7 >= this.f1896e) {
            throw new NoSuchElementException();
        }
        this.f1895d = i7 + 1;
        return this.f1897i.e(i7);
    }
}
