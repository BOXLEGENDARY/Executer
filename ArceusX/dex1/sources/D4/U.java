package D4;

import java.util.concurrent.atomic.AtomicReference;

public enum U implements L {
    INSTANCE;


    private static final AtomicReference f922e = new AtomicReference(null);

    public final void c(M m7) {
        f922e.set(m7);
    }

    @Override
    public final M zza() {
        return (M) f922e.get();
    }
}
