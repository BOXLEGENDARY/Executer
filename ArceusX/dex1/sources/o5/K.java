package o5;

import java.io.Closeable;
import n3.C2651i;

final class K implements Closeable {

    final o f22431d;

    K(o oVar, J j7) {
        this.f22431d = oVar;
        C2651i.p(((Thread) oVar.f22492d.getAndSet(Thread.currentThread())) == null);
    }

    @Override
    public final void close() {
        this.f22431d.f22492d.set(null);
        this.f22431d.d();
    }
}
