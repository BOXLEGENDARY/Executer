package D4;

import java.util.concurrent.atomic.AtomicReference;

public final class X {

    private static final AtomicReference f924a = new AtomicReference(null);

    static W a() {
        return (W) f924a.get();
    }

    public static void b(W w8) {
        AtomicReference atomicReference = f924a;
        while (!a0.g.a(atomicReference, null, w8) && atomicReference.get() == null) {
        }
    }
}
