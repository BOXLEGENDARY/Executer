package a4;

import java.util.concurrent.Callable;

final class N implements Runnable {

    final M f8313d;

    final Callable f8314e;

    N(M m7, Callable callable) {
        this.f8313d = m7;
        this.f8314e = callable;
    }

    @Override
    public final void run() {
        try {
            this.f8313d.s(this.f8314e.call());
        } catch (Exception e7) {
            this.f8313d.r(e7);
        } catch (Throwable th) {
            this.f8313d.r(new RuntimeException(th));
        }
    }
}
