package E4;

import a4.C1574k;

public abstract class s0 implements Runnable {

    private final C1574k f1165d;

    s0() {
        this.f1165d = null;
    }

    final C1574k a() {
        return this.f1165d;
    }

    public final void b(Exception exc) {
        C1574k c1574k = this.f1165d;
        if (c1574k != null) {
            c1574k.d(exc);
        }
    }

    protected abstract void c();

    @Override
    public final void run() {
        try {
            c();
        } catch (Exception e7) {
            b(e7);
        }
    }

    public s0(C1574k c1574k) {
        this.f1165d = c1574k;
    }
}
