package H4;

import a4.C1574k;

final class Y extends V {

    final C1574k f1587e;

    final V f1588i;

    final C0433f f1589v;

    Y(C0433f c0433f, C1574k c1574k, C1574k c1574k2, V v7) {
        super(c1574k);
        this.f1587e = c1574k2;
        this.f1588i = v7;
        this.f1589v = c0433f;
    }

    @Override
    public final void b() {
        synchronized (this.f1589v.f1603f) {
            try {
                C0433f.o(this.f1589v, this.f1587e);
                if (this.f1589v.f1609l.getAndIncrement() > 0) {
                    this.f1589v.f1599b.c("Already connected to the service.", new Object[0]);
                }
                C0433f.q(this.f1589v, this.f1588i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
