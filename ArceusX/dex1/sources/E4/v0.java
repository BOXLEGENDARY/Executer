package E4;

import a4.C1574k;

final class v0 extends s0 {

    final C1574k f1169e;

    final s0 f1170i;

    final C0401g f1171v;

    v0(C0401g c0401g, C1574k c1574k, C1574k c1574k2, s0 s0Var) {
        super(c1574k);
        this.f1171v = c0401g;
        this.f1169e = c1574k2;
        this.f1170i = s0Var;
    }

    @Override
    public final void c() {
        synchronized (this.f1171v.f1126f) {
            try {
                C0401g.n(this.f1171v, this.f1169e);
                if (this.f1171v.f1131k.getAndIncrement() > 0) {
                    this.f1171v.f1122b.d("Already connected to the service.", new Object[0]);
                }
                C0401g.p(this.f1171v, this.f1170i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
