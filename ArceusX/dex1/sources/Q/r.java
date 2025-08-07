package Q;

import C.C0342n0;
import C.I;
import java.util.UUID;

public class r extends C0342n0 {

    private final String f3787b;

    private int f3788c;

    r(I i7) {
        super(i7);
        this.f3787b = "virtual-" + i7.d() + "-" + UUID.randomUUID().toString();
    }

    @Override
    public int a() {
        return l(0);
    }

    @Override
    public String d() {
        return this.f3787b;
    }

    @Override
    public int l(int i7) {
        return E.q.w(super.l(i7) - this.f3788c);
    }

    void r(int i7) {
        this.f3788c = i7;
    }
}
