package E4;

final class w0 extends s0 {

    final C0401g f1172e;

    w0(C0401g c0401g) {
        this.f1172e = c0401g;
    }

    @Override
    public final void c() {
        synchronized (this.f1172e.f1126f) {
            try {
                if (this.f1172e.f1131k.get() > 0 && this.f1172e.f1131k.decrementAndGet() > 0) {
                    this.f1172e.f1122b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C0401g c0401g = this.f1172e;
                if (c0401g.f1133m != null) {
                    c0401g.f1122b.d("Unbind from service.", new Object[0]);
                    C0401g c0401g2 = this.f1172e;
                    c0401g2.f1121a.unbindService(c0401g2.f1132l);
                    this.f1172e.f1127g = false;
                    this.f1172e.f1133m = null;
                    this.f1172e.f1132l = null;
                }
                this.f1172e.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
