package H4;

import a4.C1574k;

public abstract class V implements Runnable {

    private final C1574k f1583d;

    V() {
        this.f1583d = null;
    }

    public void a(Exception exc) {
        C1574k c1574k = this.f1583d;
        if (c1574k != null) {
            c1574k.d(exc);
        }
    }

    protected abstract void b();

    final C1574k c() {
        return this.f1583d;
    }

    @Override
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public V(C1574k c1574k) {
        this.f1583d = c1574k;
    }
}
