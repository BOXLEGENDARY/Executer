package H4;

final class Z extends V {

    final C0433f f1590e;

    Z(C0433f c0433f) {
        this.f1590e = c0433f;
    }

    @Override
    public final void b() {
        synchronized (this.f1590e.f1603f) {
            try {
                if (this.f1590e.f1609l.get() > 0 && this.f1590e.f1609l.decrementAndGet() > 0) {
                    this.f1590e.f1599b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C0433f c0433f = this.f1590e;
                if (c0433f.f1611n != null) {
                    c0433f.f1599b.c("Unbind from service.", new Object[0]);
                    C0433f c0433f2 = this.f1590e;
                    c0433f2.f1598a.unbindService(c0433f2.f1610m);
                    this.f1590e.f1604g = false;
                    this.f1590e.f1611n = null;
                    this.f1590e.f1610m = null;
                }
                this.f1590e.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
