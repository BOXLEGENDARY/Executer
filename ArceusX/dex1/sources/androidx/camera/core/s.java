package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

final class s extends e {

    private final AtomicBoolean f9521v;

    s(n nVar) {
        super(nVar);
        this.f9521v = new AtomicBoolean(false);
    }

    @Override
    public void close() {
        if (this.f9521v.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
